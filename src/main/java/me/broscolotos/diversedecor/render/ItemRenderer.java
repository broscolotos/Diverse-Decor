package me.broscolotos.diversedecor.render;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.tmt.slim.Tessellator;
import ddfexcraft.tmt.slim.Vec3f;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRenderer implements IItemRenderer {

    private BlockModel model;
    private ResourceLocation texture;
    private Vec3f position;
    private Vec3f scale;

    public ItemRenderer(BlockModel model, ResourceLocation texture, Vec3f position, Vec3f scale) {
        try {
            this.model = model.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        this.texture = texture;
        this.position = position;
        this.scale = scale;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY: {
                render(position.x, position.y, position.z, this.scale); //default 0,0,0, 0.5;
                return;
            }
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON: {
                render(position.x, position.y, position.z, this.scale); //default 0,0.5, 0.5, 0.4;
                return;
            }
            case INVENTORY: {
                render(position.x, position.y, position.z, this.scale); //default 0, -0.34, 0, 0.4;
                return;
            }
            default:
                break;
        }
    }

    private void render(float x, float y, float z, Vec3f scale) {
        GL11.glPushMatrix();

        GL11.glTranslatef(x,y,z);
        GL11.glScalef(scale.x,scale.y,scale.z);

        Tessellator.bindTexture(texture);
        model.render();
        GL11.glPopMatrix();
    }
}
