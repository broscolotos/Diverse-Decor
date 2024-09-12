package me.broscolotos.diversedecor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.tiles.BaseTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class DecorationBlock extends BlockContainer {

    public IIcon texture;
    public String icon;

    public boolean opaque;
    public int renderType;
    public boolean normalBlock;

    public DecorationBlock(Material material) {
        super(material);
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
    }
    @Override
    public TileEntity createTileEntity(World world, int meta) {
        return createNewTileEntity(world, meta);
    }

    @Override
    public boolean canCollideCheck(int p_149678_1_, boolean p_149678_2_)
    {
        return true;
    }


    @Override
    public int getRenderType(){
        return renderType;
    }
    @Override
    public boolean isOpaqueCube(){
        return opaque;
    }
    @Override
    public boolean renderAsNormalBlock(){
        return normalBlock;
    }

    @Override
    public IIcon getIcon(int i, int j) {
        return texture;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        texture = iconRegister.registerIcon(DiverseDecor.MODID + ":items/" + icon);
    }


    // Helper to get the Direction
    protected int getDir(EntityLivingBase entity)
    {
        return MathHelper.floor_double((entity.rotationYaw / 90.0F) + 2.5D) & 3;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}
