package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelTrafficBarrel;
import me.broscolotos.diversedecor.render.models.ModelTrafficCone;
import net.minecraft.util.AxisAlignedBB;

public class TileTrafficBarrel extends BaseTileEntity {
    public TileTrafficBarrel(int dir) {
        super(dir);
        model = new ModelTrafficBarrel();
        setTexture("traffic barrel");
    }

    public TileTrafficBarrel() {
        model = new ModelTrafficBarrel();
        setTexture("traffic barrel");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
