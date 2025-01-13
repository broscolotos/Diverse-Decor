package me.broscolotos.diversedecor.render.tilerenders;

import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.Model2x1FlatTV;
import me.broscolotos.diversedecor.tiles.Tile2x1FlatTV;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class Render2x1FlatTV extends RenderTileEntity {

    public Render2x1FlatTV(String texture) {
        setTexture(texture);
        this.model = new Model2x1FlatTV();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof Tile2x1FlatTV)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+1, y, z+0.5);
        GL11.glRotatef(180F, 1F, 0F, 1F);
        int dir = ((Tile2x1FlatTV)tileEntity).dir;
        switch(dir) {
            case 0:{// north
                GL11.glRotated(90,0,1,0);
                GL11.glTranslatef(0.5f,0,-0.5f);
                break;
            }
            case 3: {//west
                GL11.glTranslatef(0,0,-1);
                break;
            }
            case 1: {//east
                GL11.glRotated(180,0,1,0);
                break;
            }
            case 2: {//south
                GL11.glRotated(270,0,1,0);
                GL11.glTranslatef(-0.5f,0,-0.5f);
                break;
            }
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
