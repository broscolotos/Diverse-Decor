package me.broscolotos.diversedecor.render;

import ddfexcraft.fvtm.BlockModel;
import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTileEntity extends TileEntitySpecialRenderer {
    public ResourceLocation texture;
    public BlockModel model = new BlockModel();
    @Override
    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_) {
    }

    public void setTexture(String texture) {
        this.texture = new ResourceLocation(DiverseDecor.MODID, "textures/blocks/" + texture + ".png");
    }
}
