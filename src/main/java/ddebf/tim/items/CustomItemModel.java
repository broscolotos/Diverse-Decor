package ddebf.tim.items;


import ddfexcraft.tmt.slim.Tessellator;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.blocks.decoration.DecorationBlock;
import me.broscolotos.diversedecor.blocks.decoration.LogChairBlock;
import me.broscolotos.diversedecor.blocks.decoration.TrashCanCurvedBlock;
import me.broscolotos.diversedecor.core.ClientProxy;
import me.broscolotos.diversedecor.items.armor.GenericArmor;
import me.broscolotos.diversedecor.tiles.BaseTileEntity;
import net.minecraft.block.Block;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;

public class CustomItemModel implements IItemRenderer /*ICustomModelLoader*/ {

    public static CustomItemModel instance = new CustomItemModel();

    private static HashMap<ResourceLocation, Item> models = new HashMap<>();

    private static HashMap<Item, BaseTileEntity> blockTextures = new HashMap<>();

    public static void registerBlockTextures(Item itm, TileEntity tile){
        if(tile instanceof BaseTileEntity) {
            blockTextures.put(itm, (BaseTileEntity) tile);
        }
    }

    public static void registerModel(Item itm){
        models.put(new ResourceLocation(itm.getUnlocalizedName()), itm);
    }

    //@Override
    public boolean accepts(ResourceLocation modelLocation) {
        return models.containsKey(modelLocation);
    }

    //@Override
    public /*IModel*/ void loadModel(ResourceLocation modelLocation) {
        renderItem(null, new ItemStack(models.get(modelLocation)), null);
    }



    @Override// generally useless but needs to be here
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    //@Override // generally useless but needs to be here
    public void onResourceManagerReload(IResourceManager resourceManager) {}



    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;//models.containsKey(new ResourceLocation(item.getUnlocalizedName()));
    }
    float scale;

    Vec3f scaleVec;
    Vec3f offsetVec;
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if(item==null){return;}
        if (item.getItem() instanceof GenericArmor) {
            GL11.glPushMatrix();
            this.scaleVec = ((GenericArmor)item.getItem()).scale;
            this.offsetVec = ((GenericArmor)item.getItem()).offset;
            GL11.glScalef(scaleVec.x,scaleVec.y,scaleVec.z);
            GL11.glTranslatef(offsetVec.x,offsetVec.y,offsetVec.z);
            switch (type) {
                case EQUIPPED_FIRST_PERSON:{
                    GL11.glRotatef(180,1,0,1);
                    GL11.glTranslatef(0.75f,-0.5f,0.75f);
                    break;
                }
                case INVENTORY: {
                    GL11.glRotatef(180,0,0,1);
                    GL11.glRotatef(90,0,1,0);

                    GL11.glTranslatef(0,0.5f,0);
                    break;
                }
                case EQUIPPED:{
                    GL11.glRotatef(180,1,0,1);
                    GL11.glRotatef(10,0,0,1);
                    GL11.glTranslatef(0.5f,0,0.5f);
                    break;
                }
                default:{//item frame case
                    GL11.glRotatef(90,0,0,1);
                    GL11.glTranslatef(0f,0.3125f,0);
                }
            }
            ResourceLocation texture = new ResourceLocation(((GenericArmor)item.getItem()).getTexture());
            Tessellator.bindTexture(texture);
            ClientProxy.armorItemRenderer.render(((GenericArmor)item.getItem()).getArmorModel(), 0.0625f);
            GL11.glPopMatrix();
        }
        if (Block.getBlockFromItem(item.getItem()) instanceof DecorationBlock) {
            GL11.glPushMatrix();
            DecorationBlock b = (DecorationBlock)Block.getBlockFromItem(item.getItem());
            this.scaleVec = new Vec3f(b.itemScale.x*0.0625,b.itemScale.y*0.0625,b.itemScale.z*0.0625);
            this.offsetVec = new Vec3f(b.itemOffset.x,b.itemOffset.y,b.itemOffset.z);
            GL11.glTranslatef(offsetVec.x,offsetVec.y,offsetVec.z);
            GL11.glScalef(scaleVec.x,scaleVec.y,scaleVec.z);
            GL11.glRotatef(b.itemRotation.x,1,0,0);
            GL11.glRotatef(b.itemRotation.y,0,1,0);
            GL11.glRotatef(b.itemRotation.z,0,0,1);
            switch (type) {
                case EQUIPPED_FIRST_PERSON:{
                    GL11.glRotatef(180,1,0,1);
                    GL11.glTranslatef(0.75f,-0.5f,0.75f);
                    break;
                }
                case INVENTORY: {
                    GL11.glRotatef(180,0,0,1);
                    GL11.glRotatef(90,0,1,0);

                    GL11.glTranslatef(0,0.5f,0);
                    break;
                }
                case EQUIPPED:{
                    GL11.glRotatef(180,1,0,1);
                    GL11.glRotatef(10,0,0,1);
                    GL11.glTranslatef(0.5f,0,0.5f);
                    break;
                }
                default:{//item frame case
                    GL11.glRotatef(90,0,0,1);
                    GL11.glTranslatef(0f,0.3125f,0);
                }
            }
            if (b instanceof LogChairBlock) { //really need a better solution to this
                b.tileEntity.setTexture(((LogChairBlock) b).textures.get(item.getItemDamage()));
            }
            if (b instanceof TrashCanCurvedBlock) {
                b.tileEntity.setTexture(((TrashCanCurvedBlock) b).textures.get(item.getItemDamage()));
            }

            ResourceLocation texture = b.tileEntity.getTexture();
            Tessellator.bindTexture(texture);
            ClientProxy.decorationItemRenderer.render(b.tileEntity.model,1);
            GL11.glPopMatrix();

        }
    }
}
