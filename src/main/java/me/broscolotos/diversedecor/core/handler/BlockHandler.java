package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.blocks.*;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.BaseSlabBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.BaseStairBlock;
import me.broscolotos.diversedecor.core.register.BlockRegistry;
import me.broscolotos.diversedecor.tiles.*;
import net.minecraft.block.Block;
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

        BlockIDs.blockBrickOrange.block = BlockRegistry.orangeBrick;
        BlockIDs.blockBrickBrown.block = BlockRegistry.brownBrick;
        BlockIDs.blockBrickBlueGray.block = BlockRegistry.blueGrayBrick;
        BlockIDs.blockBrickLightGray.block = BlockRegistry.lightGrayBrick;
        BlockIDs.blockBrickNeutral.block = BlockRegistry.neutralBrick;
        BlockIDs.blockBrickMessyTan.block = BlockRegistry.dirtyTanBrick;
        BlockIDs.blockBrickPale.block = BlockRegistry.paleBrick;;
        BlockIDs.blockBrickRose.block = BlockRegistry.roseBrick;
        BlockIDs.blockAgedStucco.block = BlockRegistry.agedStucco;
        BlockIDs.blockWoodPanel.block = BlockRegistry.woodPanel;
        BlockIDs.blockCement.block = BlockRegistry.cement;
        BlockIDs.blockPolishedStone.block = BlockRegistry.polishedStone;
        BlockIDs.blockVerticalBrickPale.block = BlockRegistry.paleVerticalBrick;
        BlockIDs.blockBrickBlack.block = BlockRegistry.blackBrick;
        BlockIDs.blockBrickWhite.block = BlockRegistry.whiteBrick;
        BlockIDs.blockLargeBrickGranite.block = BlockRegistry.graniteLargeBrick;
        //SlabBlockIDs.slabBrickOrange.block = new BaseSlabBlock(false, SlabBlockIDs.slabBrickOrange.blockName, BlockIDs.blockBrickOrange.block.getMaterial(), BlockIDs.blockBrickOrange.block, BlockIDs.blockBrickOrange.tool);

        //BlockIDs.slabBrickOrange.block = new BaseSlabBlock(false, BlockIDs.blockBrickOrange.blockName + "Slab", Material.rock, BlockIDs.blockBrickOrange.block);
        for (BlockIDs block : BlockIDs.values()) {

            if (!block.hasItemBlock) {
                GameRegistry.registerBlock(block.block, block.blockName);
            } else {
                GameRegistry.registerBlock(block.block, block.itemBlockClass, block.blockName);
            }
        }
        for (SlabBlockIDs id : SlabBlockIDs.values()) {
            String name = id.blockName;
            name = name.replace("slab","block");
            BlockIDs blockID = null;
            for (BlockIDs block : BlockIDs.values()) { //feels inefficient
                if (block.blockName.equalsIgnoreCase(name)) {
                    blockID = block;
                    break;
                }
            }
            if (blockID == null || !blockID.hasSlabStair) {
                continue;
            }
            id.block = new BaseSlabBlock(false, id.blockName + id.metaData, blockID.block.getMaterial(), blockID.block, blockID.tool, id.metaData);
            if (!id.hasItemBlock) {
                GameRegistry.registerBlock(id.block, id.blockName + id.metaData);
            } else {
                GameRegistry.registerBlock(id.block, id.itemBlockClass, id.blockName + id.metaData);
            }
        }


        for (StairBlockIDs id : StairBlockIDs.values()) {
            String name = id.blockName;
            name = name.replace("stair","block");
            BlockIDs blockID = null;
            for (BlockIDs block : BlockIDs.values()) { //feels inefficient
                if (block.blockName.equalsIgnoreCase(name)) {
                    blockID = block;
                    break;
                }
            }
            if (blockID == null || !blockID.hasSlabStair) {
                continue;
            }
            id.block = new BaseStairBlock(id.blockName + id.metaData, blockID.block.getMaterial(), blockID.block, blockID.tool, id.metaData);
            if (!id.hasItemBlock) {
                GameRegistry.registerBlock(id.block, id.blockName + id.metaData);
            } else {
                GameRegistry.registerBlock(id.block, id.itemBlockClass, id.blockName + id.metaData);
            }
        }
        if(e.getSide().isClient()) {
            RenderBlockHandler.initializeCustomModels();

        }

        //FoxBlocks.blockLogger.info("BlockRegister Post Init at com.bidahochi.BlockMod.core.handler.blockHandler");
    }

}
