package me.broscolotos.diversedecor.registry;

import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.StandardBlock;
import net.minecraft.block.material.Material;

public class BlockRegistry {

    public static StandardBlock roseBrick;
    public static StandardBlock paleBrick;
    public static StandardBlock dirtyTanBrick;

    public static DynamicBlock blueGrayBrick;
    public static DynamicBlock brownBrick;
    public static DynamicBlock lightGrayBrick;
    public static DynamicBlock neutralBrick;
    public static DynamicBlock orangeBrick;

    public static void registerBlocks () {
        //standard blocks
        roseBrick = new StandardBlock(Material.rock, "rosebricks", DiverseDecor.MODID + ":bricks/rose/rose_brick", 1);
        paleBrick = new StandardBlock(Material.rock, "palebricks", DiverseDecor.MODID+":bricks/pale/pale_brick", 1);
        dirtyTanBrick = new StandardBlock(Material.rock, "dirtytanbricks", DiverseDecor.MODID+":bricks/tan/dirty_tan_brick", 1);

        //dynamic blocks
        blueGrayBrick = new DynamicBlock(Material.rock, "blue_gray_bricks", DiverseDecor.MODID+":bricks/blue gray/bluegray_brick", 3);
        brownBrick = new DynamicBlock(Material.rock, "brown_bricks", DiverseDecor.MODID+":bricks/brown/brown_brick", 4);
        lightGrayBrick = new DynamicBlock(Material.rock, "light_gray_bricks", DiverseDecor.MODID+":bricks/light gray/lightgray_brick", 2);
        neutralBrick = new DynamicBlock(Material.rock, "neutral_bricks", DiverseDecor.MODID+":bricks/neutral/neutral_brick", 4);
        orangeBrick = new DynamicBlock(Material.rock, "orange_bricks", DiverseDecor.MODID+":bricks/orange/orange_brick", 3);
    }
}
