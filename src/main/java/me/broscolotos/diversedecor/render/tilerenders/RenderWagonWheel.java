package me.broscolotos.diversedecor.render.tilerenders;

import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelWagonWheel;
import me.broscolotos.diversedecor.tiles.TileWagonWheel;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderWagonWheel extends RenderTileEntity {

    public RenderWagonWheel(String texture) {
        setTexture(texture);
        this.model = new ModelWagonWheel();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileWagonWheel)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+0.5, y+.625, z+0.5);
        GL11.glRotatef(180F, 1F, 0F, 1F);
        int dir = ((TileWagonWheel)tileEntity).dir;
        switch(dir) {
            case 0:{// north
                GL11.glRotated(90,0,1,0);
                break;
            }
            case 1: {//east
                GL11.glRotated(180,0,1,0);
                break;
            }
            case 2: {//south
                GL11.glRotated(270,0,1,0);
                break;
            }
        }
        GL11.glTranslatef(0f,0,-0.4375f);
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
