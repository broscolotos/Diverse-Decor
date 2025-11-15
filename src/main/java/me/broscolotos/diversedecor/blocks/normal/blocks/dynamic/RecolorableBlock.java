package me.broscolotos.diversedecor.blocks.normal.blocks.dynamic;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.core.Utility;
import me.broscolotos.diversedecor.tiles.TileRecolorableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RecolorableBlock extends BlockContainer {

    public IIcon[] textures = new IIcon[16];
    public static IIcon[] overlays = new IIcon[11];
    public int textAmt;

    public RecolorableBlock(Material material, String name, String textName, int textAmt) {
        super(material);
        standardRegister();
        setBlockName(name);
        setBlockTextureName(textName);
        setTextureAmt(textAmt);
    }

    public void standardRegister() {
        setHardness(2F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
        setStepSound(soundTypeWood);
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) { return new TileRecolorableBlock(); }

    @Override
    public void onBlockPlacedBy(World world, int par2, int par3, int par4, EntityLivingBase entity, ItemStack itemStack) {
        TileRecolorableBlock tile = (TileRecolorableBlock) world.getTileEntity(par2, par3, par4);
        if (itemStack.hasTagCompound() && itemStack.getTagCompound().hasKey("Color")) {
            tile.setColor(itemStack.getTagCompound().getString("Color"));
        } else {
            tile.setColor(itemStack.getDisplayName());
        }
        if (itemStack.hasTagCompound() && itemStack.getTagCompound().hasKey("Base")) {
            tile.setPatternIndex(itemStack.getTagCompound().getInteger("Base"));
        } else {
            tile.setPatternIndex(0);
        }
        world.setBlockMetadataWithNotify(par2, par3, par4, itemStack.getItemDamage(), 2);
        world.markBlockForUpdate(par2, par3, par4);
    }

    // World rendering uses colorMultiplier
    @Override
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess world, int x, int y, int z) {
        TileRecolorableBlock te = (TileRecolorableBlock) world.getTileEntity(x, y, z);
        if (te == null) {
            return 0xFFFFFF;
        }
        return te.getColor();
    }

    public void setTextureAmt(int amt) { this.textAmt = amt; }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
        TileRecolorableBlock tile = (TileRecolorableBlock) world.getTileEntity(x, y, z);
        if (tile == null) {
            return this.getIcon(side, world.getBlockMetadata(x, y, z));
        }
        else {
            return overlays[tile.patternIndex() < overlays.length ? tile.patternIndex() : 0];
        }
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
        ItemStack stack = super.getPickBlock(target, world, x, y, z, player);
        Block block = world.getBlock(x,y,z);
        if (block instanceof RecolorableBlock) {
            NBTTagCompound nbt = new NBTTagCompound();
            TileRecolorableBlock te = (TileRecolorableBlock) world.getTileEntity(x,y,z);
            te.writeToNBT(nbt);
            if (nbt.hasKey("Color")) {
                String name = "#" + Integer.toHexString(Utility.getColorFromString("#" + Integer.toHexString(nbt.getInteger("Color"))));
                stack.setTagInfo("Color", new NBTTagString(name));
            }
            if (nbt.hasKey("Base")) {
                stack.setTagInfo("Base", new NBTTagInt(nbt.getInteger("Base")));
            }
        }
        return stack;
    }

    @Override
    public void onBlockHarvested(World world, int x, int y, int z, int meta, EntityPlayer player) {
        if (player.capabilities.isCreativeMode) { return; }
        TileRecolorableBlock tile = (TileRecolorableBlock) world.getTileEntity(x,y,z);
        NBTTagCompound tag = new NBTTagCompound();
        ItemStack drop = new ItemStack(this);
        tile.writeToNBT(tag);
        if (tag.hasKey("Color")) {
            String name = "#" + Integer.toHexString(Utility.getColorFromString("#" + Integer.toHexString(tag.getInteger("Color"))));
            drop.setTagInfo("Color", new NBTTagString(name));
        }
        if (tag.hasKey("Base")) {
            drop.setTagInfo("Base", new NBTTagInt(tag.getInteger("Base")));
        }
        EntityItem entity = new EntityItem(world, x + 0.5, y + 0.5, z + 0.5, drop);
        world.spawnEntityInWorld(entity);
        super.onBlockHarvested(world, x ,y ,z, meta, player);
    }

    @Override
    protected void dropBlockAsItem(World p_149642_1_, int p_149642_2_, int p_149642_3_, int p_149642_4_, ItemStack p_149642_5_) {}

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister registry) {
        super.registerBlockIcons(registry);
        overlays[0] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/normal");
        overlays[1] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/bricks");
        overlays[2] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/block");
        overlays[3] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/bricks vert");
        overlays[4] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/bricks vert 2");
        overlays[5] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/halfnhalf");
        overlays[6] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/large brick");
        overlays[7] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/large brick alt");
        overlays[8] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/mixed brick");
        overlays[9] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/panel");
        overlays[10] = registry.registerIcon(DiverseDecor.MODID + ":generic/templates/steel");
    }
}