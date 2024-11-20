package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.decoration.*;
import me.broscolotos.diversedecor.blocks.itemblocks.GenericItemBlock;
import me.broscolotos.diversedecor.blocks.itemblocks.GenericSlabItemBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.DynamicPillarBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.BaseStairBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.BaseSlabBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.StandardBlock;
import me.broscolotos.diversedecor.tiles.*;
import net.minecraft.block.material.Material;


public class BlockHandler {

    public static void initBlockRegister(FMLInitializationEvent e){


        BlockIDs.picnicTable.block = new BlockPicnicTable(Material.wood);
        GameRegistry.registerTileEntity(TilePicnicTable.class, "picnictable.tile");

        BlockIDs.fancyWallLight.block = new BlockFancyWallLight(Material.iron);
        GameRegistry.registerTileEntity(TileFancyWallLight.class, "fancywalllight.tile");

        BlockIDs.fancyWallLightDiagonal.block = new BlockFancyWallLightDiagonal(Material.iron);
        GameRegistry.registerTileEntity(TileFancyWallLightDiagonal.class, "fancywalllightdiagonal.tile");

        BlockIDs.postLight.block = new BlockTopPostLight(Material.iron);
        GameRegistry.registerTileEntity(TileTopPostLight.class, "toppostlight.tile");

        BlockIDs.postCurve.block = new BlockPostCurve(Material.iron);
        GameRegistry.registerTileEntity(TilePostCurve.class, "postcurve.tile");

        BlockIDs.postTopper.block = new BlockPostTopper(Material.iron);
        GameRegistry.registerTileEntity(TilePostTopper.class, "posttopper.tile");

        //dynamic
        BlockIDs.blockBrickOrange.block = new DynamicBlock(Material.rock, "orange_brick", DiverseDecor.MODID+":bricks/orange/orange_brick", 3);
        BlockIDs.blockBrickBrown.block = new DynamicBlock(Material.rock, "brown_brick", DiverseDecor.MODID+":bricks/brown/brown_brick", 4);
        BlockIDs.blockBrickBlueGray.block = new DynamicBlock(Material.rock, "blue_gray_brick", DiverseDecor.MODID+":bricks/blue gray/bluegray_brick", 3);
        BlockIDs.blockBrickLightGray.block = new DynamicBlock(Material.rock, "light_gray_brick", DiverseDecor.MODID+":bricks/light gray/lightgray_brick", 2);
        BlockIDs.blockBrickNeutral.block = new DynamicBlock(Material.rock, "neutral_brick", DiverseDecor.MODID+":bricks/neutral/neutral_brick", 4);

        //pillar
        BlockIDs.blockBrickWhite.block = new DynamicPillarBlock(Material.rock, "white_brick", DiverseDecor.MODID + ":bricks/white/white_brick", 2);

        //normal
        BlockIDs.blockBrickMessyTan.block = new StandardBlock(Material.rock, "dirtytanbrick", DiverseDecor.MODID+":bricks/tan/dirty_tan_brick", 1);
        BlockIDs.blockBrickPale.block = new StandardBlock(Material.rock, "palebrick", DiverseDecor.MODID+":bricks/pale/pale_brick", 1);
        BlockIDs.blockBrickRose.block = new StandardBlock(Material.rock, "rosebrick", DiverseDecor.MODID + ":bricks/rose/rose_brick", 1);
        BlockIDs.blockAgedStucco.block = new StandardBlock(Material.rock, "aged_stucco", DiverseDecor.MODID + ":aged_stucco",1);
        BlockIDs.blockWoodPanel.block = new StandardBlock(Material.wood, "wood_panel", DiverseDecor.MODID + ":woods/wood panels/wood_panel", 8, "axe");
        BlockIDs.blockCement.block = new StandardBlock(Material.rock, "cement", DiverseDecor.MODID + ":stones/cement/cement",3);
        BlockIDs.blockPolishedStone.block = new StandardBlock(Material.rock, "polished_stone", DiverseDecor.MODID + ":stones/polished_stone",1);
        BlockIDs.blockVerticalBrickPale.block = new StandardBlock(Material.rock, "pale_vertical_brick", DiverseDecor.MODID + ":bricks/vertical/pale_vertical_brick", 1);
        BlockIDs.blockBrickBlack.block = new StandardBlock(Material.rock, "black_brick", DiverseDecor.MODID + ":bricks/black/black_brick",1);
        BlockIDs.blockLargeBrickGranite.block = new StandardBlock(Material.rock, "granite_large_brick", DiverseDecor.MODID + ":bricks/large/granite_large_brick", 3);
        BlockIDs.blockSlate.block = new StandardBlock(Material.rock, "slate", DiverseDecor.MODID + ":stones/slate/slate", 2);
        BlockIDs.blockStone.block = new StandardBlock(Material.rock, "colored_block", DiverseDecor.MODID + ":generic/colored/colored_block",10);

/*        BlockIDs.slabBrick1.block = new SlabBrick1Block(false).setCreativeTab(DiverseDecor.diverseDecorBlockTab);
        BlockIDs.slabDoubleBrick1.block = new SlabBrick1Block(true);*/


        for (BlockIDs block : BlockIDs.values()) {

            if (!block.hasItemBlock) {
                GameRegistry.registerBlock(block.block, block.blockName);
            } else {
                GameRegistry.registerBlock(block.block, block.itemBlockClass, block.blockName);
            }
            if (block.hasSlabStair) {
                //register slabs & stairs
                for (int i=0; i<block.MaxMetadata; i++) {
                    GameRegistry.registerBlock(new BaseSlabBlock(true, block.block.getMaterial(), 10f, 2f, block.blockName.toLowerCase() + (byte)(i) + "_doubleslab", block, (byte)(i)), GenericSlabItemBlock.class,  block.blockName.toLowerCase() + (byte)(i) + "_doubleslab"); //register the doubleslab first because the slab needs to reference it when registering.
                    GameRegistry.registerBlock(new BaseSlabBlock(false, block.block.getMaterial(), 10f, 2f, block.blockName.toLowerCase() + (byte)(i) + "_slab", block, (byte)(i)).setCreativeTab(DiverseDecor.diverseDecorBlockTab), GenericSlabItemBlock.class, block.blockName.toLowerCase() + (byte)(i) + "_slab");
                    GameRegistry.registerBlock(new BaseStairBlock(block.blockName.toLowerCase() + i + "_stair", block.block.getMaterial(), block.block, block.tool, (byte)(i)), GenericItemBlock.class, block.blockName.toLowerCase() + i + "_stair");
                }
            }
        }
        if(e.getSide().isClient()) {
            RenderBlockHandler.initializeCustomModels();

        }

        //FoxBlocks.blockLogger.info("BlockRegister Post Init at com.bidahochi.BlockMod.core.handler.blockHandler");
    }

}
