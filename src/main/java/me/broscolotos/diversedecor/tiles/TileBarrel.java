package me.broscolotos.diversedecor.tiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.render.models.ModelBarrel;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

public class TileBarrel extends ExtendedTileEntity {


    public TileBarrel(int dir, boolean alt) {
        super(dir, alt);
        model = new ModelBarrel();
        setTexture("barrel");
    }

    public TileBarrel() {
        model = new ModelBarrel();
        setTexture("barrel");
    }
}
