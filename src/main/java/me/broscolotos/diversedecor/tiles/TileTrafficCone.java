package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelTrafficCone;
import net.minecraft.util.AxisAlignedBB;

public class TileTrafficCone extends BaseTileEntity {
    public TileTrafficCone(int dir) {
        super(dir);
        model = new ModelTrafficCone();
        setTexture("traffic cone");
    }

    public TileTrafficCone() {
        model = new ModelTrafficCone();
        setTexture("traffic cone");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
