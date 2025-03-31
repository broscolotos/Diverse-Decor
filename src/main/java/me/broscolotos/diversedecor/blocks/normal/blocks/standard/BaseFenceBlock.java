package me.broscolotos.diversedecor.blocks.normal.blocks.standard;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicPillarBlock;
import me.broscolotos.diversedecor.core.handler.BlockIDs;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import java.util.List;

public class BaseFenceBlock extends BlockFence {

    public BlockIDs host;
    public byte meta;
    public final String blockName;

    public BaseFenceBlock(String icon, Material mat, float resistance, float hardness, String name, BlockIDs block) {
        super(icon, mat);
        this.useNeighborBrightness = true;
        this.setStepSound(soundTypeStone);
        this.setResistance(resistance);
        this.setHardness(hardness);
        blockName = name;
        this.setBlockName(name);
        this.host = block;
        this.meta = 0;
    }

    public BaseFenceBlock(String icon, Material mat, float resistance, float hardness, String name, BlockIDs block, byte meta) {
        super(icon, mat);
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
        list.add(new ItemStack(item, 1, 0));
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
}
