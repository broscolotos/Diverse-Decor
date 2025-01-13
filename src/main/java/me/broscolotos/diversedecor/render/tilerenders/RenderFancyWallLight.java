package me.broscolotos.diversedecor.render.tilerenders;

import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelFancyWallLight;
import me.broscolotos.diversedecor.tiles.TileFancyWallLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockWall;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderFancyWallLight extends RenderTileEntity {
    public RenderFancyWallLight(String texture) {
        setTexture(texture);
        this.model = new ModelFancyWallLight();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileFancyWallLight)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+0.5, y+.625, z);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        int dir = ((TileFancyWallLight)tileEntity).dir;
        Block block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord-1);
        switch(dir) {
            case 0:{// north
                GL11.glRotated(90,0,1,0);
                break;
            }
            case 3: {//west
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord);
                GL11.glTranslated(-0.5, 0, -0.5);
                break;
            }
            case 1: {//east
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord);
                GL11.glTranslated(0.5, 0, -0.5);
                GL11.glRotated(180,0,1,0);
                break;
            }
            case 2: {//south
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord+1);
                GL11.glTranslated(0, 0, -1);
                GL11.glRotated(270,0,1,0);
                break;
            }
        }
        if (block instanceof BlockFence) {
            GL11.glTranslatef(-0.375f,0,0);
        }
        if (block instanceof BlockWall) {
            GL11.glTranslatef(-0.25f,0,0);
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
