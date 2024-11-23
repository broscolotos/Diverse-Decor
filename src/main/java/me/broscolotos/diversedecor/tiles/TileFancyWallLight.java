package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.FancyWallLight;
import net.minecraft.util.AxisAlignedBB;

public class TileFancyWallLight extends BaseTileEntity {
    public TileFancyWallLight(int dir) {
        super(dir);
        model = new FancyWallLight();
    }

    public TileFancyWallLight() {
        model = new FancyWallLight();

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
