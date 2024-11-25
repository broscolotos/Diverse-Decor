package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.Model2x1FlatTV;
import net.minecraft.util.AxisAlignedBB;

public class Tile2x1FlatTV extends BaseTileEntity {
    public Tile2x1FlatTV(int dir) {
        super(dir);
        model = new Model2x1FlatTV();
        setTexture("2x1 flat tv");
    }

    public Tile2x1FlatTV() {
        model = new Model2x1FlatTV();
        setTexture("2x1 flat tv");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
