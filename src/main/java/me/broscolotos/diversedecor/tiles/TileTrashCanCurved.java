package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelTrashCanCurved;
import net.minecraft.util.AxisAlignedBB;

public class TileTrashCanCurved extends BaseTileEntity {
    public TileTrashCanCurved(String texture) {
        super();
        model = new ModelTrashCanCurved();
        setTexture(texture);
    }

    public TileTrashCanCurved() {
        model = new ModelTrashCanCurved();
        setTexture("trash can/square/trash_can_curved_green");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
