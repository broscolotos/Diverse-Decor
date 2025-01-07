package me.broscolotos.diversedecor.render;

import blusunrize.immersiveengineering.common.blocks.metal.BlockMetalDecoration;
import ddfexcraft.tmt.slim.Tessellator;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.render.models.ParkPostCurve;
import me.broscolotos.diversedecor.tiles.TilePostCurve;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockWall;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderParkPostCurve extends RenderTileEntity {

    Block block = null;

    public RenderParkPostCurve(String texture) {
        setTexture(texture);
        this.model = new ParkPostCurve();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TilePostCurve)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x, y, z);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        int dir = ((TilePostCurve)tileEntity).dir;
        Block block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord-1);
        Vec3f blockPos = new Vec3f(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord-1);
        switch(dir) {
            case 0:{// north
                //GL11.glTranslated(0, 0, 0.25);
                GL11.glTranslated(.5, -.625, 0.5);
                GL11.glRotated(90,0,1,0);
                break;
            }
            case 3: {//west
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord);
                blockPos = new Vec3f(tileEntity.xCoord-1, tileEntity.yCoord, tileEntity.zCoord);
                GL11.glTranslated(-.5, -.625, -.5);
                //GL11.glTranslated(-0.625, 0, -0.375);
                break;
            }
            case 1: {//east
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord);
                blockPos = new Vec3f(tileEntity.xCoord+1, tileEntity.yCoord, tileEntity.zCoord);
                GL11.glTranslated(1.5, -.625, -.5);
                GL11.glRotated(180,0,1,0);
                break;
            }
            case 2: {//south
                block = tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord+1);
                blockPos = new Vec3f(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord+1);
                GL11.glTranslated(0.5, -.625, -1.5);
                GL11.glRotated(270,0,1,0);
                break;
            }
        }
        if (this.block == null || this.block != block) {
            this.block = block;
            int damage = block.getDamageValue(tileEntity.getWorldObj(), (int) blockPos.x, (int) blockPos.y, (int) blockPos.z);
            if (block instanceof BlockWall) {
                GL11.glTranslatef(0.125f, 0, 0);
                ((TilePostCurve) tileEntity).offset = -0.125f;
            } else if (block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post") && (damage == 1 || damage == 5)) {
                GL11.glTranslatef(0.0625f, 0, 0);
                ((TilePostCurve) tileEntity).offset = -0.0625f;
            } else if (!(block instanceof BlockAir) && !(block instanceof BlockFence
                    || (block.getUnlocalizedName().equalsIgnoreCase("tile.immersiveEngineering.metalDecoration") && damage == 0)
                    || (block.getUnlocalizedName().equalsIgnoreCase("tile.immersiveEngineering.woodenDecoration") && damage == 1)
                    || block.getUnlocalizedName().equalsIgnoreCase("tile.blockCarpentersBarrier")
                    || block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post.metal")
                    || block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post.metal.platform")
                    || (block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post")) && (damage == 0 || damage == 2 || damage == 4 || damage == 6))) {
                GL11.glTranslatef(0.375f, 0, 0);
                ((TilePostCurve) tileEntity).offset = -0.375f;
            } else {
                ((TilePostCurve) tileEntity).offset = 0f;
            }
        } else {
            GL11.glTranslatef(-((TilePostCurve) tileEntity).offset, 0, 0);
        }
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
