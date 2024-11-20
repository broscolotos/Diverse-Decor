package me.broscolotos.diversedecor.render;

import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.blocks.decoration.BlockPostCurve;
import me.broscolotos.diversedecor.render.models.TopPostLight;
import me.broscolotos.diversedecor.tiles.TilePostCurve;
import me.broscolotos.diversedecor.tiles.TileTopPostLight;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderTopPostLight extends RenderTileEntity {

    public RenderTopPostLight(String texture) {
        setTexture(texture);
        this.model = new TopPostLight();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileTopPostLight)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+.5, y+.625, z+0.5);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        Block block1 = tileEntity.getWorldObj().getBlock(tileEntity.xCoord,tileEntity.yCoord-1,tileEntity.zCoord);
       if (block1 instanceof BlockPostCurve) {
            TilePostCurve tile = (TilePostCurve) tileEntity.getWorldObj().getTileEntity(tileEntity.xCoord,tileEntity.yCoord-1,tileEntity.zCoord);
            if (tile.dir == 0) {
                GL11.glTranslated(0, 0, tile.offset);
            }
            else if (tile.dir == 1) {
                GL11.glTranslated(tile.offset, 0, 0);
            }
            else if (tile.dir == 3) {
                GL11.glTranslated(-tile.offset, 0, 0);
            }
            else {
                GL11.glTranslated(0, 0, -tile.offset);
            }
        }

        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
