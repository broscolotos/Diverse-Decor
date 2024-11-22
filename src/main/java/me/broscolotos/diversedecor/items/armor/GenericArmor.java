package me.broscolotos.diversedecor.items.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import ddfexcraft.fvtm.ModelCustomArmor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;


public class GenericArmor extends ItemArmor {


    private IIcon iconOverlay;
    private String iconName = "";
    private ModelCustomArmor model;
    private String texture = "";

    public GenericArmor(String icon, ArmorMaterial material, int par3, int par4) {
        super(material, par3, par4);
        setCreativeTab(DiverseDecor.diverseDecorCosmeticsTab);
        iconName = icon;
    }
    @SideOnly(Side.CLIENT)
    public GenericArmor(String icon, ArmorMaterial material, int par3, int par4, ModelCustomArmor hat, String texture) {
        super(material, par3, par4);
        setCreativeTab(DiverseDecor.diverseDecorCosmeticsTab);
        iconName = icon;
        this.model = hat;
        this.texture = texture;
    }

    @SideOnly(Side.SERVER)
    public GenericArmor(String icon, ArmorMaterial material, int par3, int par4, String texture) {
        super(material, par3, par4);
        setCreativeTab(DiverseDecor.diverseDecorCosmeticsTab);
        iconName = icon;
        this.model = null;
        this.texture = texture;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(DiverseDecor.MODID.toLowerCase() + ":armor/" + this.iconName);
    }


    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
        if (texture.equals("")) {
            return null;
        }
        return DiverseDecor.MODID + ":textures/armor/" + texture + ".png";
    }

    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
        return model;
    }

    @SideOnly(Side.CLIENT)
    public ModelCustomArmor getArmorModel() {
        return model;
    }

    public String getTexture() {
        return DiverseDecor.MODID + ":textures/armor/" + texture + ".png";
    }

}
