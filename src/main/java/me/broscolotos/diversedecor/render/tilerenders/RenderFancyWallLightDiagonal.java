package me.broscolotos.diversedecor.render.tilerenders;

import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelFancyWallLight;
import me.broscolotos.diversedecor.tiles.TileFancyWallLightDiagonal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockWall;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderFancyWallLightDiagonal extends RenderTileEntity {
    public RenderFancyWallLightDiagonal(String texture) {
        setTexture(texture);
        this.model = new ModelFancyWallLight();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileFancyWallLightDiagonal)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x-0.0625, y+.625, z-0.0625);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        int dir = ((TileFancyWallLightDiagonal)tileEntity).dir;
        Block block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord-1);
        switch(dir) {
            case 0:{// north
                GL11.glRotated(45,0,1,0);
                break;
            }
            case 3: {//west
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord+1);
                GL11.glTranslated(0, 0, -1.125);
                GL11.glRotated(-45,0,1,0);
                break;
            }
            case 1: {//east
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord-1);
                GL11.glTranslated(1.125, 0, 0.0);
                GL11.glRotated(135,0,1,0);
                break;
            }
            case 2: {//south
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord+1);
                GL11.glTranslated(1.125, 0, -1.125);
                GL11.glRotated(225,0,1,0);
                break;
            }
        }
        if (block instanceof BlockFence) {
            GL11.glTranslatef(-0.5f,0,0);
        }
        if (block instanceof BlockWall) {
            GL11.glTranslatef(-0.3125f,0,0);
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
