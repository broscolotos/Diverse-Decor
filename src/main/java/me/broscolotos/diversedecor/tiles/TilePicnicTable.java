package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelPicnicTable;
import net.minecraft.util.AxisAlignedBB;

public class TilePicnicTable extends BaseTileEntity {
    public TilePicnicTable(int dir) {
        super(dir);
        model = new ModelPicnicTable();
        setTexture("picnic table/picnic table spruce");
    }

    public TilePicnicTable() {
        model = new ModelPicnicTable();
        setTexture("picnic table/picnic table spruce");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-2, yCoord, zCoord-2, xCoord + 2, yCoord + 1, zCoord + 2);
    }
}
