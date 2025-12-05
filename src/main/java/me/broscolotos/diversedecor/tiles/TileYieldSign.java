package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.ModelYieldSign;
import net.minecraft.util.AxisAlignedBB;

public class TileYieldSign extends BaseTileEntity {
    public TileYieldSign(int dir) {
        super(dir);
        model = new ModelYieldSign();
        setTexture("street signs/yield sign");
    }

    public TileYieldSign() {
        model = new ModelYieldSign();
        setTexture("street signs/yield sign");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
