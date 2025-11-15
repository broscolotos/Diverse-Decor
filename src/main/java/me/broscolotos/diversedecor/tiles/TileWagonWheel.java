package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelWagonWheel;
import net.minecraft.util.AxisAlignedBB;

public class TileWagonWheel extends BaseTileEntity {
    public TileWagonWheel(int dir) {
        super(dir);
        model = new ModelWagonWheel();
        setTexture("wagon wheel");
    }

    public TileWagonWheel() {
        model = new ModelWagonWheel();
        setTexture("wagon wheel");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
