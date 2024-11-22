package me.broscolotos.diversedecor.items.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.DiverseDecor;
import ddfexcraft.fvtm.ModelCustomArmor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;


public class GenericArmor extends ItemArmor {


    private IIcon iconOverlay;
    private ModelCustomArmor model;
    private String texture = "";
    public Vec3f scale = new Vec3f(1,1,1);
    public Vec3f offset = new Vec3f(0,0,0);

    public GenericArmor(ArmorMaterial material, int par3, int par4) {
        super(material, par3, par4);
        setCreativeTab(DiverseDecor.diverseDecorCosmeticsTab);
        setMaxDamage(-1);
    }
    @SideOnly(Side.CLIENT)
    public GenericArmor(ArmorMaterial material, int par3, int par4, ModelCustomArmor hat, String texture) {
        super(material, par3, par4);
        setCreativeTab(DiverseDecor.diverseDecorCosmeticsTab);
        setMaxDamage(-1);
        this.model = hat;
        this.texture = texture;
    }
    @SideOnly(Side.CLIENT)
    public GenericArmor(ArmorMaterial material, int par3, int par4, ModelCustomArmor hat, String texture, Vec3f scale) {
        super(material, par3, par4);
        setCreativeTab(DiverseDecor.diverseDecorCosmeticsTab);
        setMaxDamage(-1);
        this.model = hat;
        this.texture = texture;
        this.scale = scale;
    }
    @SideOnly(Side.CLIENT)
    public GenericArmor(ArmorMaterial material, int par3, int par4, ModelCustomArmor hat, String texture, Vec3f scale, Vec3f offset) {
        super(material, par3, par4);
        setCreativeTab(DiverseDecor.diverseDecorCosmeticsTab);
        setMaxDamage(-1);
        this.model = hat;
        this.texture = texture;
        this.scale = scale;
        this.offset = offset;
    }

    @SideOnly(Side.SERVER)
    public GenericArmor(ArmorMaterial material, int par3, int par4, String texture) {
        super(material, par3, par4);
        setCreativeTab(DiverseDecor.diverseDecorCosmeticsTab);
        setMaxDamage(-1);
        this.model = null;
        this.texture = texture;
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
