package ddebf.tim.items;


import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.tmt.slim.Tessellator;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.blocks.decoration.DecorationBlock;
import me.broscolotos.diversedecor.blocks.itemblocks.GenericPropItemBlock;
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
    public /*IModel*/ void loadModel(ResourceLocation modelLocation) throws Exception {
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
            this.scaleVec = new Vec3f(b.scale.x*0.0625,b.scale.y*0.0625,b.scale.z*0.0625);
            this.offsetVec = new Vec3f(b.offset.x,b.offset.y,b.offset.z);
            GL11.glTranslatef(offsetVec.x,offsetVec.y,offsetVec.z);
            GL11.glScalef(scaleVec.x,scaleVec.y,scaleVec.z);
            GL11.glRotatef(b.rotation.x,1,0,0);
            GL11.glRotatef(b.rotation.y,0,1,0);
            GL11.glRotatef(b.rotation.z,0,0,1);
            switch (type) {
                case EQUIPPED_FIRST_PERSON:{
                    GL11.glRotatef(180,1,0,1);
                    GL11.glTranslatef(0.75f,-0.5f,0.75f);
                    break;
                }
                case INVENTORY: {
                    GL11.glRotatef(180,0,0,1);
                    GL11.glRotatef(180,0,1,0);

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
            ResourceLocation texture = b.tileEntity.getTexture();
            Tessellator.bindTexture(texture);
            ClientProxy.decorationItemRenderer.render(b.tileEntity.model,1);
            GL11.glPopMatrix();

        }
    }

/*    private void render(BlockModel model, ResourceLocation texture, Vec3f pos, Vec3f scale) {
        GL11.glPushMatrix();

        GL11.glTranslatef(pos.x,pos.y,pos.z);
        GL11.glScalef(scale.x,scale.y,scale.z);
        Tessellator.bindTexture(texture);
        model.renderAsItem(1);
        GL11.glPopMatrix();
    }*/
}
