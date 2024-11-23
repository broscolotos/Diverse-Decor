package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ParkPostCurve;
import net.minecraft.util.AxisAlignedBB;

public class TilePostCurve extends BaseTileEntity {

    public float offset;
    public TilePostCurve(int dir) {
        super(dir);
        model = new ParkPostCurve();
    }

    public TilePostCurve() {
        model = new ParkPostCurve();

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
