package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelAFrameBarricade;
import net.minecraft.util.AxisAlignedBB;

public class TileTrafficBarricade extends BaseTileEntity {
    public TileTrafficBarricade(int dir) {
        super(dir);
        model = new ModelAFrameBarricade();
        setTexture("traffic barricade");
    }

    public TileTrafficBarricade() {
        model = new ModelAFrameBarricade();
        setTexture("traffic barricade");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
