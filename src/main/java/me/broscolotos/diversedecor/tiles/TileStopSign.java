package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelStopSign;
import net.minecraft.util.AxisAlignedBB;

public class TileStopSign extends BaseTileEntity {
    public TileStopSign(int dir) {
        super(dir);
        model = new ModelStopSign();
        setTexture("street signs/stop sign");
    }

    public TileStopSign() {
        model = new ModelStopSign();
        setTexture("street signs/stop sign");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
