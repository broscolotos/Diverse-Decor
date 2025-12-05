package me.broscolotos.diversedecor.render.tilerenders;

import codechicken.multipart.BlockMultipart;
import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelTrafficBarrel;
import me.broscolotos.diversedecor.tiles.TileTrafficBarrel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderTrafficBarrel extends RenderTileEntity {

    public RenderTrafficBarrel(String texture) {
        setTexture(texture);
        this.model = new ModelTrafficBarrel();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileTrafficBarrel)) { return; }
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+.5, y, z+.5);
        switch (((TileTrafficBarrel) tileEntity).dir) {
            case 2:
            case 0: {
                GL11.glRotatef(90, 0, 1, 0);
                break;
            }

        }
        GL11.glRotatef(180F, 1F, 0F, 1F);
        Block block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord,tileEntity.yCoord-1,tileEntity.zCoord);
        if ((block instanceof BlockSlab || block instanceof BlockMultipart) && !block.isNormalCube()) {
            GL11.glTranslatef(0, 0.5f, 0);
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
