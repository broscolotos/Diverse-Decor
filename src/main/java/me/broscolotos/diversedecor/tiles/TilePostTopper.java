package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.PostTopper;
import net.minecraft.util.AxisAlignedBB;

public class TilePostTopper extends BaseTileEntity {
    public TilePostTopper(int dir) {
        super(dir);
        model = new PostTopper();
        setTexture("posts/topper/metal_topper");
    }

    public TilePostTopper() {
        model = new PostTopper();
        setTexture("posts/topper/metal_topper");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
