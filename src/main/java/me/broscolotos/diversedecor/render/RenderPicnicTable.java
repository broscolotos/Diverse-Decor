package me.broscolotos.diversedecor.render;

import fexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.render.models.PicnicTable;
import me.broscolotos.diversedecor.tiles.TilePicnicTable;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderPicnicTable extends TileEntitySpecialRenderer {
    private ResourceLocation texture1 = new ResourceLocation(DiverseDecor.MODID, "textures/blocks/picnic table/picnic table spruce.png");
    private PicnicTable model = new PicnicTable();
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TilePicnicTable)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture1);
        GL11.glTranslated(x + 0.5, y + 0.62, z + 0.5);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        GL11.glRotatef(90F, 0F, 1F, 0F);
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
