package me.broscolotos.diversedecor.render;

import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.blocks.decoration.BlockPostCurve;
import me.broscolotos.diversedecor.render.models.CashRegister;
import me.broscolotos.diversedecor.render.models.TopPostLight;
import me.broscolotos.diversedecor.tiles.TileCashRegister;
import me.broscolotos.diversedecor.tiles.TilePicnicTable;
import me.broscolotos.diversedecor.tiles.TilePostCurve;
import me.broscolotos.diversedecor.tiles.TileTopPostLight;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderCashRegister extends RenderTileEntity {

    public RenderCashRegister(String texture) {
        setTexture(texture);
        this.model = new CashRegister();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileCashRegister)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+.5, y, z+0.5);
        GL11.glRotatef(180F, 1F, 0F, 1F);
        GL11.glRotatef(90F, 0, 1, 0);
        int dir = ((TileCashRegister)tileEntity).dir;
        switch(dir) {
            case 0:{// north
                GL11.glRotated(90,0,1,0);
                break;
            }
            case 3: {//west
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
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
