package ddfexcraft.fvtm;

import ddfexcraft.tmt.slim.ModelRendererTurbo;
import ddfexcraft.tmt.slim.Vec3f;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class ModelCustomArmor extends ModelBiped {

    public float scale = 1f;
    public HashMap<ModelRendererTurbo, Vec3f> nativeRotations = new HashMap<>();
    public HashMap<ModelRendererTurbo, Vec3f> nativePositions = new HashMap<>();
    public HashMap<ModelRendererTurbo, Vec3f> nativeOffset = new HashMap<>();


    public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] skirtFrontModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the maximum of the two legs
    public ModelRendererTurbo[] skirtRearModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the minimum of the two legs

    public void render(ModelCustomArmor model, float scale) {
        for (ModelRendererTurbo t : model.getParts()) {
            t.setRotationAngle(0,0,0);
            t.render(scale);
        }
    }

    public ModelRendererTurbo[] getParts() {
        LinkedList<ModelRendererTurbo> parts = new LinkedList<>();
        parts.addAll(Arrays.asList(headModel));
        parts.addAll(Arrays.asList(bodyModel));
        parts.addAll(Arrays.asList(leftArmModel));
        parts.addAll(Arrays.asList(rightArmModel));
        parts.addAll(Arrays.asList(leftLegModel));
        parts.addAll(Arrays.asList(rightLegModel));
        parts.addAll(Arrays.asList(skirtFrontModel));
        parts.addAll(Arrays.asList(skirtRearModel));
        return parts.toArray(new ModelRendererTurbo[parts.size()]);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        GL11.glPushMatrix();
        GL11.glScalef(scale,scale,scale);
        isSneak = entity.isSneaking();
        ItemStack itemstack = ((EntityLivingBase)entity).getEquipmentInSlot(0);
        heldItemRight = itemstack != null ? 1 : 0;

        aimedBow = false;
        if (itemstack != null && entity instanceof EntityPlayer && ((EntityPlayer)entity).getItemInUseCount() > 0)
        {
            EnumAction enumaction = itemstack.getItemUseAction();
            if (enumaction == EnumAction.block)
            {
                heldItemRight = 3;
            }
            else if (enumaction == EnumAction.bow)
            {
                aimedBow = true;
            }
        }
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        render(headModel, bipedHead, f5, scale);
        render(bodyModel, bipedBody, f5, scale);
        render(leftArmModel, bipedLeftArm, f5, scale);
        render(rightArmModel, bipedRightArm, f5, scale);
        render(leftLegModel, bipedLeftLeg, f5, scale);
        render(rightLegModel, bipedRightLeg, f5, scale);
        //Skirt front
        {
            for(ModelRendererTurbo mod : skirtFrontModel)
            {
                mod.rotationPointX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F / scale;
                mod.rotationPointY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F / scale;
                mod.rotationPointZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F / scale;
                mod.rotateAngleX = Math.min(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX);
                mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
                mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
                mod.render(f5);
            }
        }
        //Skirt back
        {
            for(ModelRendererTurbo mod : skirtRearModel)
            {
                mod.rotationPointX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F / scale;
                mod.rotationPointY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F / scale;
                mod.rotationPointZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F / scale;
                mod.rotateAngleX = Math.max(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX);
                mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
                mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
                mod.render(f5);
            }
        }
        GL11.glPopMatrix();
    }

    public void render(ModelRendererTurbo[] models, ModelRenderer bodyPart, float f5, float scale) {
        scale = scale * 0.0625f;
        for(ModelRendererTurbo part : models) {

            /**
             * handle body rotations.
             * Because math, we need to offset, then rotate for each axis *SEPARATELY* so we do:
             * (offset Y-axis, rotate Y-axis),
             * (offset X-axis, rotate X-axis),
             * (offset Z-axis, rotate Z-axis),
             */
            GL11.glTranslatef(0, bodyPart.offsetY, 0);
            GL11.glRotatef((float)Math.toDegrees(bodyPart.rotateAngleY), 0, 1, 0);

            GL11.glTranslatef(bodyPart.offsetX,0,0);
            GL11.glRotatef((float)Math.toDegrees(bodyPart.rotateAngleX), 1, 0, 0);

            GL11.glTranslatef(0, 0, bodyPart.offsetZ);
            GL11.glRotatef((float)Math.toDegrees(bodyPart.rotateAngleZ), 0, 0, 1);



            /**
             * handle part rotations.
             * Simply rotate all 3 axis of the part by its rotations.
             * */
            GL11.glRotatef((float)Math.toDegrees(nativeRotations.get(part).xCoord), 1,0,0);
            GL11.glRotatef((float)Math.toDegrees(nativeRotations.get(part).yCoord), 0,1,0);
            GL11.glRotatef((float)Math.toDegrees(nativeRotations.get(part).zCoord), 0,0,1);


            //render
            part.render(scale);


            /**
             * Because of how OpenGL works, we need to undo everything we did previously so the
             * next part can be processed properly.
             * */
            GL11.glRotatef((float)Math.toDegrees(-nativeRotations.get(part).xCoord), 1,0,0);
            GL11.glRotatef((float)Math.toDegrees(-nativeRotations.get(part).yCoord), 0,1,0);
            GL11.glRotatef((float)Math.toDegrees(-nativeRotations.get(part).zCoord), 0,0,1);

            GL11.glRotatef((float)Math.toDegrees(bodyPart.rotateAngleZ), 0, 0, -1);
            GL11.glTranslatef(0,0,-bodyPart.offsetZ);


            GL11.glRotatef((float)Math.toDegrees(bodyPart.rotateAngleX), -1, 0, 0);
            GL11.glTranslatef(-bodyPart.offsetX,0,0);

            GL11.glRotatef((float)Math.toDegrees(bodyPart.rotateAngleY), 0, -1, 0);
            GL11.glTranslatef(0,-bodyPart.offsetY,0);

            GL11.glTranslatef(-bodyPart.offsetX,0,0);


        }
    }


    public void cacheRotations() {
        for(ModelRendererTurbo t: getParts()) {
            nativeRotations.put(t, new Vec3f(t.rotateAngleX, t.rotateAngleY, t.rotateAngleZ));
            nativePositions.put(t, new Vec3f(t.rotationPointX, t.rotationPointY, t.rotationPointZ));
            nativeOffset.put(t, new Vec3f(t.offsetX, t.offsetY, t.offsetZ));
        }
    }

}
