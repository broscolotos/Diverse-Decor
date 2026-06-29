package me.broscolotos.diversedecor.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class GenericItem extends Item {

    public String itemName;
    public String[] subNames;
    public IIcon[] icons;

    public GenericItem(String name, String... subNames) {
        this.setUnlocalizedName(DiverseDecor.MODID + "." + name);
        this.setHasSubtypes(subNames!=null&& subNames.length>0);
        this.setCreativeTab(DiverseDecor.diverseDecorItemTab);
        this.itemName = name;
        this.subNames = subNames!=null&&subNames.length<1?null:subNames;
        this.icons = new IIcon[this.subNames!=null?this.subNames.length:1];

        GameRegistry.registerItem(this, name);
    }

    public String[] getSubNames() { return subNames; }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister registry) {
        if (getSubNames() != null) {
            for (int i=0; i<icons.length; i++) {
                this.icons[i] = registry.registerIcon(DiverseDecor.MODID + ":" + itemName + "_" + getSubNames()[i]);
            }
        } else {
            this.icons[0] = registry.registerIcon(DiverseDecor.MODID + ":" + itemName);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        if (getSubNames() != null) {
            if (meta >= 0 && meta < icons.length) {
                return this.icons[meta];
            }
        }
        return this.icons[0];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        if (getSubNames() != null) {
            for(int i=0; i<getSubNames().length; i++) {
                list.add(new ItemStack(this,1,i));
            }
        } else {
            list.add(new ItemStack(this));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        if (getSubNames() != null) {
            String subName = stack.getItemDamage() < getSubNames().length ? getSubNames()[stack.getItemDamage()] : "";
            return this.getUnlocalizedName() + "." + subName;
        }
        return this.getUnlocalizedName();
    }
}
