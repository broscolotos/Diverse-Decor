package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelLogChair;
import net.minecraft.util.AxisAlignedBB;

public class TileLogChair extends BaseTileEntity {
    public TileLogChair(int dir, String texture) {
        super(dir);
        model = new ModelLogChair();
        setTexture(texture);
    }

    public TileLogChair() {
        super();
        model = new ModelLogChair();
        setTexture("log chair/oak_log_chair");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-2, yCoord, zCoord-2, xCoord + 2, yCoord + 1, zCoord + 2);
    }
}
