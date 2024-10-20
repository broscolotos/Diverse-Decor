package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.AxisAlignedBB;

public class TilePostCurve extends BaseTileEntity {

    public float offset;
    public TilePostCurve(int dir) {
        super(dir);
    }

    public TilePostCurve() {

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
