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
import me.broscolotos.diversedecor.core.handler.BlockIDs;
import me.broscolotos.diversedecor.core.handler.BlockProperties;
import me.broscolotos.diversedecor.core.handler.RenderBlockHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class BlockHandler {
    public static CreativeTabs diverseDecorCreativeTab;

    public static void initBlockRegister(FMLInitializationEvent e){


        //BlockIDs.rpb_cw.block = new RPBWhite(Material.rock);
        //GameRegistry.registerTileEntity(TileBreakerBox.class, "breakerbox.tile");


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
