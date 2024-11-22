package me.broscolotos.diversedecor.blocks.normal.blocks.standard;

import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicPillarBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BaseStairBlock extends BlockStairs {

    public Block type;
    public byte meta;

    public BaseStairBlock(Block block) {
        super(block, 3);
        this.type = block;
        this.meta = 0;
    }

    public BaseStairBlock (String name, Material mat, Block type) {
        super(type, 3);
        this.type = type;
        this.meta = 0;
        standardRegister();
        setBlockName(name);
    }

    public BaseStairBlock (String name, Material mat, Block type, String tool) {
        super(type, 3);
        this.type = type;
        this.meta = 0;
        standardRegister(tool);
        setBlockName(name);
    }

    public BaseStairBlock (String name, Material mat, Block type, String tool, byte meta) {
        super(type, 3);
        this.type = type;
        this.meta = meta;
        standardRegister(tool);
        setBlockName(name);
    }

    public void standardRegister() {
        setHardness(2F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
        setStepSound(soundTypeStone);
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
        useNeighborBrightness = true;
    }

    public void standardRegister(String tool) {
        setHardness(2F);
        setResistance(10.0F);
        setHarvestLevel(tool, 1);
        setStepSound(soundTypeWood);
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
        useNeighborBrightness = true;
    }

    @Override
    public IIcon getIcon (IBlockAccess world, int x, int y, int z, int side) {

        if (type instanceof DynamicPillarBlock) {
            return ((DynamicPillarBlock) type).getIcon(world, x, y, z, side);
        }
        if (type instanceof DynamicBlock) {
            return ((DynamicBlock) type).getIcon(world, x, y, z, side);
        }
        return type.getIcon(side,this.meta);
    }

    @Override
    public IIcon getIcon ( int side, int meta){
        return type.getIcon(side,this.meta);
    }
}
