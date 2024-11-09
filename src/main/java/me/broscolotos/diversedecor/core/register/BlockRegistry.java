package me.broscolotos.diversedecor.core.register;

import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicPillarBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.StandardBlock;
import net.minecraft.block.material.Material;

public class BlockRegistry {

    public static StandardBlock roseBrick;
    public static StandardBlock paleBrick;
    public static StandardBlock dirtyTanBrick;
    public static StandardBlock agedStucco;
    public static StandardBlock woodPanel;
    public static StandardBlock cement;
    public static StandardBlock polishedStone;
    public static StandardBlock paleVerticalBrick;
    public static StandardBlock blackBrick;
    public static StandardBlock graniteLargeBrick;

    public static DynamicBlock blueGrayBrick;
    public static DynamicBlock brownBrick;
    public static DynamicBlock lightGrayBrick;
    public static DynamicBlock neutralBrick;
    public static DynamicBlock orangeBrick;

    public static DynamicPillarBlock whiteBrick;

    public static void registerBlocks () {
        //standard blocks
        roseBrick = new StandardBlock(Material.rock, "rosebrick", DiverseDecor.MODID + ":bricks/rose/rose_brick", 1);
        paleBrick = new StandardBlock(Material.rock, "palebrick", DiverseDecor.MODID+":bricks/pale/pale_brick", 1);
        dirtyTanBrick = new StandardBlock(Material.rock, "dirtytanbrick", DiverseDecor.MODID+":bricks/tan/dirty_tan_brick", 1);
        agedStucco = new StandardBlock(Material.rock, "aged_stucco", DiverseDecor.MODID + ":aged_stucco",1);
        woodPanel = new StandardBlock(Material.wood, "wood_panel", DiverseDecor.MODID + ":woods/wood panels/wood_panel", 8, "axe");
        cement = new StandardBlock(Material.rock, "cement", DiverseDecor.MODID + ":stones/cement/cement",3);
        polishedStone = new StandardBlock(Material.rock, "polished_stone", DiverseDecor.MODID + ":stones/polished_stone",1);
        paleVerticalBrick = new StandardBlock(Material.rock, "pale_vertical_brick", DiverseDecor.MODID + ":bricks/vertical/pale_vertical_brick", 1);
        blackBrick = new StandardBlock(Material.rock, "black_brick", DiverseDecor.MODID + ":bricks/black/black_brick",1);
        graniteLargeBrick = new StandardBlock(Material.rock, "granite_large_brick", DiverseDecor.MODID + ":bricks/large/granite_large_brick", 1);
        //dynamic blocks
        blueGrayBrick = new DynamicBlock(Material.rock, "blue_gray_brick", DiverseDecor.MODID+":bricks/blue gray/bluegray_brick", 3);
        brownBrick = new DynamicBlock(Material.rock, "brown_brick", DiverseDecor.MODID+":bricks/brown/brown_brick", 4);
        lightGrayBrick = new DynamicBlock(Material.rock, "light_gray_brick", DiverseDecor.MODID+":bricks/light gray/lightgray_brick", 2);
        neutralBrick = new DynamicBlock(Material.rock, "neutral_brick", DiverseDecor.MODID+":bricks/neutral/neutral_brick", 4);
        orangeBrick = new DynamicBlock(Material.rock, "orange_brick", DiverseDecor.MODID+":bricks/orange/orange_brick", 3);

        //dynamic pillar blocks
        whiteBrick = new DynamicPillarBlock(Material.rock, "white_brick", DiverseDecor.MODID + ":bricks/white/white_brick", 2);

        
    }
}
