package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelTrashCanSquare;
import net.minecraft.util.AxisAlignedBB;

public class TileTrashCanSquare extends BaseTileEntity {
    public TileTrashCanSquare(int dir) {
        super(dir);
        model = new ModelTrashCanSquare();
        setTexture("trash can/square/spruce");
    }

    public TileTrashCanSquare() {
        model = new ModelTrashCanSquare();
        setTexture("trash can/square/spruce");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
