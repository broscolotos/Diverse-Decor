package me.broscolotos.diversedecor.core.handler;

/********************
 *
 *  blockHander
 *
 *  This file allows you to register your blocks to MINECRAFT without cluttering up DiverseDecor.java
 *  MAKE SURE YOU REGISTER THEM TO DIVERSEDECOR IN BlockIDs.java  in me.broscolotos.diversedecor.core.handler;
 *
 *  This file is ONLY for registering blocks to the mod. Do not try to add properties like hardness here
 *
 *  You can set hardness and other properties in the block class file directly. just do set### under the main class in the block file
 *
 *  Use Format:
 *      BlockIDs.blockname.block = new BlockName(materialOfBlock);
 *
 *  Any Questions feel free to DM me or Ping Me in discord!
 ********************/

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.blocks.*;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.BlueGrayBrick;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.BrownBrick;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.LightGrayBrick;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.NeutralBrick;
import me.broscolotos.diversedecor.blocks.normal.blocks.mono.MessyTanBrick;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.OrangeBrick;
import me.broscolotos.diversedecor.blocks.normal.blocks.mono.PaleBrick;
import me.broscolotos.diversedecor.blocks.normal.blocks.mono.RoseBrick;
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

        BlockIDs.blockBrickOrange.block = new OrangeBrick(Material.rock);
        BlockIDs.blockBrickBrown.block = new BrownBrick(Material.rock);
        BlockIDs.blockBrickBlueGray.block = new BlueGrayBrick(Material.rock);
        BlockIDs.blockBrickLightGray.block = new LightGrayBrick(Material.rock);
        BlockIDs.blockBrickNeutral.block = new NeutralBrick(Material.rock);
        BlockIDs.blockBrickMessyTan.block = new MessyTanBrick(Material.rock);
        BlockIDs.blockBrickPale.block = new PaleBrick(Material.rock);
        BlockIDs.blockBrickRose.block = new RoseBrick(Material.rock);


        for (BlockIDs block : BlockIDs.values()) {

            if (!block.hasItemBlock) {
                GameRegistry.registerBlock(block.block, block.blockName);
            } else {
                GameRegistry.registerBlock(block.block, block.itemBlockClass, block.blockName);
            }
        }

        if(e.getSide().isClient()) {
            RenderBlockHandler.initializeCustomModels();

        }

        //FoxBlocks.blockLogger.info("BlockRegister Post Init at com.bidahochi.BlockMod.core.handler.blockHandler");
    }

    //The code below is not active. Do not touch unless you know how to fix and your fix works! -hariesh
    public static void blockpropertyregister() {
        for (BlockProperties blockReg : BlockProperties.values()) {
            String nameOfBlock = blockReg.blockName;
            Block blockOfReg = blockReg.block;
            BlockProperties.valueOf(nameOfBlock).block = new BaseBlock(blockReg.material, blockReg.blockName, blockReg.hardness, blockReg.resistance, blockReg.harvestTool, blockReg.harvestLevel, blockReg.sound, blockReg.textureLocation);
        }

        for (BlockProperties blockReg : BlockProperties.values()){
            GameRegistry.registerBlock(blockReg.block, blockReg.blockName);
        }
    }

}
