package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelMonitor;
import net.minecraft.util.AxisAlignedBB;

public class TileMonitor extends BaseTileEntity {
    public TileMonitor(int dir) {
        super(dir);
        model = new ModelMonitor();
        setTexture("monitor");
    }

    public TileMonitor() {
        model = new ModelMonitor();
        setTexture("monitor");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
