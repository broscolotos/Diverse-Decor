package me.broscolotos.diversedecor.blocks.normal.blocks.standard;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicPillarBlock;
import me.broscolotos.diversedecor.core.handler.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BaseSlabBlock extends BlockSlab {

    public BlockIDs host;
    public byte meta;
    public final String blockName;

    public BaseSlabBlock(boolean par2, Material mat, float resistance, float hardness, String name, BlockIDs block) {
        super(par2, mat);
        this.useNeighborBrightness = true;
        this.setStepSound(soundTypeStone);
        this.setResistance(resistance);
        this.setHardness(hardness);
        blockName = name;
        this.setBlockName(name);
        this.host = block;
        this.meta = 0;
    }

    public BaseSlabBlock(boolean par2, Material mat, float resistance, float hardness, String name, BlockIDs block, byte meta) {
        super(par2, mat);
        this.useNeighborBrightness = true;
        if (block.tool.equalsIgnoreCase("axe")) {
            this.setStepSound(soundTypeWood);
        } else {
            this.setStepSound(soundTypeStone);
        }
        this.setResistance(resistance);
        this.setHardness(hardness);
        blockName = name;
        this.setBlockName(name);
        this.setHarvestLevel(block.tool, 1);
        this.host = block;
        this.meta = meta;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        if (item != Item.getItemFromBlock(GameRegistry.findBlock(
                DiverseDecor.MODID, host.blockName.toLowerCase()+"_doubleslab"))) {
            list.add(new ItemStack(item, 1, 0));
        }
    }

    @Override
    public String func_150002_b(int par1) {
        return super.getUnlocalizedName();
    }

    private boolean isBlockSingleSlab(Block block) {
        return block.getBlockBoundsMaxY() <= 0.5f;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World par1World, int par2, int par3, int par4) {
        if (isBlockSingleSlab(this)) {
            return Item.getItemFromBlock(GameRegistry.findBlock(DiverseDecor.MODID, host.blockName.toLowerCase()+"_slab"));
        }
        return Item.getItemFromBlock(host.block);
    }

    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        if (isBlockSingleSlab(this)) {
            return Item.getItemFromBlock(this);
        } else {
            return Item.getItemFromBlock(GameRegistry.findBlock(DiverseDecor.MODID, host.blockName.toLowerCase()+"_slab"));
        }
    }

    protected ItemStack createStackedBlock(int par1) {
        return new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, this.getUnlocalizedName()), 2, 0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return host.block.getIcon(side, this.meta);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (IBlockAccess world, int x, int y, int z, int side) {
        if (host.block instanceof DynamicPillarBlock) {
            return ((DynamicPillarBlock) host.block).getIcon(world, x, y, z, side);
        }
        if (host.block instanceof DynamicBlock) {
            return ((DynamicBlock) host.block).getIcon(world, x, y, z, side);
        }
        return host.block.getIcon(side,this.meta);
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player)
    {
        if (world.getBlock(x,y,z) == this) {
            if (isBlockSingleSlab(this)) {
                return new ItemStack(this, 1);
            }
            else {
                return new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, this.getUnlocalizedName().substring(5,this.getUnlocalizedName().lastIndexOf("_"))+"_slab"));
            }
        }
        return getPickBlock(target, world, x, y, z);
    }


}
