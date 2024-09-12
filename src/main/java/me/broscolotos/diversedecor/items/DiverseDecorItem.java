package me.broscolotos.diversedecor.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class DiverseDecorItem extends Item {

    String iconName;

    public DiverseDecorItem() {
        super();
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(DiverseDecor.MODID + ":" + iconName);
    }
}
