package me.broscolotos.diversedecor.render.tilerenders;

import ddfexcraft.tmt.slim.Tessellator;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.core.Utility;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelYieldSign;
import me.broscolotos.diversedecor.tiles.TileYieldSign;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderYieldSign extends RenderTileEntity {

    public RenderYieldSign(String texture) {
        setTexture(texture);
        this.model = new ModelYieldSign();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileYieldSign)) { return; }
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+.5, y+1, z+.5);
        GL11.glRotatef(180, 0, 0, 1);
        int dir = ((TileYieldSign) tileEntity).dir;
        Block block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord-1);
        Vec3f blockPos = new Vec3f(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord-1);
        switch(dir) {
            case 0:{// north
                GL11.glRotated(180,0,1,0);
                GL11.glTranslatef(0, 0, 1);
                break;
            }
            case 3: {//west
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord);
                blockPos = new Vec3f(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord);
                GL11.glTranslated(1, 0, 0);
                GL11.glRotated(90,0,1,0);
                break;
            }
            case 1: {//east
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord);
                blockPos = new Vec3f(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord);
                GL11.glTranslated(-1, 0, 0);
                GL11.glRotated(90,0,-1,0);
                break;
            }
            case 2: {//south
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord+1);
                blockPos = new Vec3f(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord+1);
                GL11.glTranslated(0, 0, 1);
                break;
            }
        }
        if (Utility.isFence(tileEntity.getWorldObj(), (int) blockPos.x, (int) blockPos.y, (int) blockPos.z, block)) {
            GL11.glTranslatef(0,0,0.375f);
        }
        if (block instanceof BlockWall) {
            GL11.glTranslatef(0,0,0.25f);
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
