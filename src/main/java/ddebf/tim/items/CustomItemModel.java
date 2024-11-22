package ddebf.tim.items;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.Tessellator;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.core.ClientProxy;
import me.broscolotos.diversedecor.core.handler.ItemIDs;
import me.broscolotos.diversedecor.items.armor.GenericArmor;
import me.broscolotos.diversedecor.tiles.BaseTileEntity;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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

        if(blockTextures.containsKey(item.getItem())) {

            GL11.glPushMatrix();
            GL11.glScalef(0.95f,0.95f,0.95f);
            GL11.glTranslatef(0,-0.1f,0);
            blockTextures.get(item.getItem()).func_145828_a(null);

            GL11.glPopMatrix();

        }
        else if (item.getItem() instanceof GenericArmor) {
            GL11.glPushMatrix();
            scaleVec = ((GenericArmor)item.getItem()).scale;
            offsetVec = ((GenericArmor)item.getItem()).offset;
            GL11.glScalef(scaleVec.xCoord,scaleVec.yCoord,scaleVec.zCoord);
            GL11.glTranslatef(offsetVec.xCoord,offsetVec.yCoord,offsetVec.zCoord);
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
    }
}
