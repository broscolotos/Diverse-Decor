package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.render.models.CashRegister;
import net.minecraft.util.AxisAlignedBB;

public class TileCashRegister extends BaseTileEntity {
    public TileCashRegister(int dir) {
        super(dir);
        model = new CashRegister();
        setTexture("cash-register");
    }

    public TileCashRegister() {
        model = new CashRegister();
        setTexture("cash-register");

    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 1, yCoord + 1, zCoord + 1);
    }
}
