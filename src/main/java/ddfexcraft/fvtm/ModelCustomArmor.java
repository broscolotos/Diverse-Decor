package ddfexcraft.fvtm;

import ddfexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ModelCustomArmor extends ModelBiped {

    public float scale = 1f;

    public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] skirtFrontModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the maximum of the two legs
    public ModelRendererTurbo[] skirtRearModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the minimum of the two legs

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        GL11.glPushMatrix();
        GL11.glScalef(scale,scale,scale);
        //GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
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
        render(headModel, bipedHead, f5, scale);/*
        render(bodyModel, bipedBody, f5, scale);
        render(leftArmModel, bipedLeftArm, f5, scale);
        render(rightArmModel, bipedRightArm, f5, scale);
        render(leftLegModel, bipedLeftLeg, f5, scale);
        render(rightLegModel, bipedRightLeg, f5, scale);*/
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

    public void render(ModelRendererTurbo[] models, ModelRenderer bodyPart, float f5, float scale)
    {
        setBodyPart(models, bodyPart, scale);
        for(ModelRendererTurbo part : models)
        {
            part.rotateAngleX = (float)Math.toDegrees(bodyPart.rotateAngleX);
            part.rotateAngleY = (float)Math.toDegrees(bodyPart.rotateAngleY);
            part.rotateAngleZ = (float)Math.toDegrees(bodyPart.rotateAngleZ);
            part.render(f5);
        }
    }

    public void setBodyPart(ModelRendererTurbo[] models, ModelRenderer bodyPart, float scale)
    {
        for(ModelRendererTurbo mod : models)
        {/*
            GL11.glTranslatef(mod.rotationPointX/16,mod.rotationPointY/16,mod.rotationPointZ/16);
            System.out.println(mod.rotationPointX);*/
            mod.rotationPointX = bodyPart.rotationPointX / scale;
            mod.rotationPointY = bodyPart.rotationPointY / scale;
            mod.rotationPointZ = bodyPart.rotationPointZ / scale;
        }
    }

}