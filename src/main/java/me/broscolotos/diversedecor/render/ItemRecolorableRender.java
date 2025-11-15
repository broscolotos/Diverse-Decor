package me.broscolotos.diversedecor.render;

import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.RecolorableBlock;
import me.broscolotos.diversedecor.core.Utility;
import me.broscolotos.diversedecor.core.handler.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRecolorableRender implements IItemRenderer {

    public static RenderBlocks renderBlocks = RenderBlocks.getInstance();
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack stack, Object... data) {
        GL11.glPushMatrix();
        if (type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON)
            GL11.glTranslatef(0.5f,0.5f,0.5f);
        float[] color;
        if (stack.hasDisplayName()) {
            color = Utility.hexToRGB(Utility.getColorFromString(stack.getDisplayName()));
        }
        else if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Color")) {
            color = Utility.hexToRGB(Utility.getColorFromString(stack.getTagCompound().getString("Color")));
        } else {
            color = Utility.hexToRGB(0xFFFFFF);
        }
        GL11.glColor4f(color[0], color[1], color[2], 1.0f);
        renderBlocks.useInventoryTint = false;
        if (stack.hasDisplayName() && stack.getDisplayName().toLowerCase().contains("pat")) {
            try {
                int index = Integer.parseInt(stack.getDisplayName().toLowerCase().substring(stack.getDisplayName().indexOf("pat") + 3));
                renderBlocks.setOverrideBlockTexture(RecolorableBlock.overlays[index < RecolorableBlock.overlays.length ? index : 0]);
            } catch (Exception ignored) {}
        } else if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Base")) {
            int index = stack.getTagCompound().getInteger("Base");
            renderBlocks.setOverrideBlockTexture(RecolorableBlock.overlays[index < RecolorableBlock.overlays.length ? index : 0]);
        }
        if (stack.getItem() == Item.getItemFromBlock(BlockIDs.blockRecolorable.block)) {
            renderBlocks.overrideBlockBounds(0,0,0,1,1,1);
        }
       /* if (Block.getBlockFromItem(stack.getItem()) instanceof RecolorableSlabBlock) {
            renderBlocks.overrideBlockBounds(0,0,0,1,0.5,1);
        }*/
        renderBlocks.renderBlockAsItem(Block.getBlockFromItem(stack.getItem()), 0, 1);
        renderBlocks.clearOverrideBlockTexture();
        renderBlocks.setRenderBounds(0,0,0,1,1,1);
        renderBlocks.useInventoryTint = true;
        GL11.glPopMatrix();
    }
}
