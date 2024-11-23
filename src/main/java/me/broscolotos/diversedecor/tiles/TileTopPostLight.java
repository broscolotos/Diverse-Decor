package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.TopPostLight;
import net.minecraft.util.AxisAlignedBB;

public class TileTopPostLight extends BaseTileEntity {
    public TileTopPostLight(int dir) {
        super(dir);
        model = new TopPostLight();
    }

    public TileTopPostLight() {
        model = new TopPostLight();

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
