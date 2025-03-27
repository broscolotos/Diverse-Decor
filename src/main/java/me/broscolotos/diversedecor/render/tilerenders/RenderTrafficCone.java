package me.broscolotos.diversedecor.render.tilerenders;

import codechicken.multipart.BlockMultipart;
import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelTrafficCone;
import me.broscolotos.diversedecor.tiles.TileTrafficCone;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderTrafficCone extends RenderTileEntity {

    public RenderTrafficCone(String texture) {
        setTexture(texture);
        this.model = new ModelTrafficCone();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileTrafficCone)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+.5, y, z+.5);
        GL11.glRotatef(180F, 1F, 0F, 1F);
        Block block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord,tileEntity.yCoord-1,tileEntity.zCoord);
        if ((block instanceof BlockSlab || block instanceof BlockMultipart) && !block.isNormalCube()) {
            GL11.glTranslatef(0, 0.5f, 0);
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
