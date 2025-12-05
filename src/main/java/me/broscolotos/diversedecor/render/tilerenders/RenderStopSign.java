package me.broscolotos.diversedecor.render.tilerenders;

import ddfexcraft.tmt.slim.Tessellator;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.core.Utility;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelStopSign;
import me.broscolotos.diversedecor.tiles.TileStopSign;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderStopSign extends RenderTileEntity {

    public RenderStopSign(String texture) {
        setTexture(texture);
        this.model = new ModelStopSign();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TileStopSign)) { return; }
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+.5, y+1, z+.5);
        GL11.glRotatef(180, 0, 0, 1);
        int dir = ((TileStopSign) tileEntity).dir;
        Block block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord-1);
        Vec3f blockPos = new Vec3f(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord-1);
        switch(dir) {
            case 0:{// north
                GL11.glRotated(90,0,1,0);
                GL11.glTranslatef(1, 0, 0);
                break;
            }
            case 3: {//west
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord);
                blockPos = new Vec3f(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord);
                GL11.glTranslated(1, 0, 0);
                break;
            }
            case 1: {//east
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord);
                blockPos = new Vec3f(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord);
                GL11.glTranslated(-1, 0, 0);
                GL11.glRotated(180,0,1,0);
                break;
            }
            case 2: {//south
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord+1);
                blockPos = new Vec3f(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord+1);
                GL11.glTranslated(0, 0, 1);
                GL11.glRotated(270,0,1,0);
                break;
            }
        }
        if (Utility.isFence(tileEntity.getWorldObj(), (int) blockPos.x, (int) blockPos.y, (int) blockPos.z, block)) {
            GL11.glTranslatef(0.375f,0,0);
        }
        if (block instanceof BlockWall) {
            GL11.glTranslatef(0.25f,0,0);
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
