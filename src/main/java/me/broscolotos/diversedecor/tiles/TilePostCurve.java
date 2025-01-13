package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelParkPostCurve;
import net.minecraft.util.AxisAlignedBB;

public class TilePostCurve extends BaseTileEntity {

    public float offset;
    public TilePostCurve(int dir) {
        super(dir);
        model = new ModelParkPostCurve();
        setTexture("posts/park_post_curve_metal");
    }

    public TilePostCurve() {
        model = new ModelParkPostCurve();
        setTexture("posts/park_post_curve_metal");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
