package me.broscolotos.diversedecor.render.tilerenders;

import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelPicnicTable;
import me.broscolotos.diversedecor.tiles.TilePicnicTable;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderPicnicTable extends RenderTileEntity {
    public RenderPicnicTable(String texture) {
        setTexture(texture);
        this.model = new ModelPicnicTable();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TilePicnicTable)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x + 0.5, y + 0.625, z + 0.5);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        int dir = ((TilePicnicTable)tileEntity).dir;
        switch(dir) {
            case 0:{// north
                GL11.glRotated(180,0,1,0);
                break;
            }
            case 3: {//west
                GL11.glRotated(90,0,1,0);
                break;
            }
            case 1: {//east
                GL11.glRotated(270,0,1,0);
                break;
            }
            case 2: {//south
                break;
            }
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
