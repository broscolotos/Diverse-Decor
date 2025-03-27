package me.broscolotos.diversedecor.core.handler;

/***************************
 *
 *  BlockIDs
 *
 *  This Folder is to register Blocks to DiverseDecor
 *  MAKE SURE YOU REGISTER BLOCKS TO MINECRAFT IN blockHandler at me.broscolotos.diversedecor.core.handler;
 *
 *  This file allows you to set if the block has an itemBlockversion, where it is and the name of the block!
 *
 *  Under BlockIDs{} use this format:
 *
 *  blockname(false,null,"finalblockname"),
 *
 *  The finalblockname will stop you from having to write an en_US.lang file for the block as it will be already written through this file!
 *
 *  This file is also used to pull into many other files, dont screw this one up!
 *
 *  Any questions just ping or dm me on the discord!
 *
 *  IT IS HIGHLY IMPORTANT THAT MaxMetatData is correct this can cause game crashing in the creative menu if wrong when not in a Dev Environment
 *
 ****************************/

import me.broscolotos.diversedecor.blocks.itemblocks.GenericItemBlock;
//import me.broscolotos.diversedecor.blocks.itemblocks.ItemBrickSlab;
import me.broscolotos.diversedecor.blocks.itemblocks.GenericPropItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public enum BlockIDs
{
    picnicTable(true, GenericPropItemBlock.class,"picnic_table", -1),
    fancyWallLight(false, GenericPropItemBlock.class,"fancy_wall_light", -1),
    fancyWallLightDiagonal(false, GenericPropItemBlock.class,"fancy_wall_light_diagonal", -1),
    postTopper(false, GenericPropItemBlock.class,"post_topper", -1),
    postCurve(false, GenericPropItemBlock.class,"post_curve", -1),
    postLight(false, GenericPropItemBlock.class,"post_light", -1),
    cashRegister(false, GenericPropItemBlock.class,"cash_register", -1),
    flatTV2x1(false, GenericPropItemBlock.class, "flat_tv2x1", -1),
    logChair(true, GenericPropItemBlock.class, "log_chair", -1),
    monitor(false, GenericPropItemBlock.class, "monitor", -1),
    trafficCone(false,GenericPropItemBlock.class, "traffic_cone", -1),


    blockBrickOrange(true, GenericItemBlock.class, "blockBrickOrange", 1, true),
    blockBrickBrown(true, GenericItemBlock.class, "blockBrickBrown", 1, true),
    blockBrickBlueGray(true, GenericItemBlock.class, "blockBrickBlueGray", 1, true),
    blockBrickLightGray(true, GenericItemBlock.class, "blockBrickLightGray", 1, true),
    blockBrickNeutral(true, GenericItemBlock.class, "blockBrickNeutral", 1, true),
    blockBrickMessyTan(true, GenericItemBlock.class, "blockBrickMessyTan", 1, true),
    blockBrickPale(true, GenericItemBlock.class, "blockBrickPale", 1, true),
    blockBrickRose(true, GenericItemBlock.class, "blockBrickRose",1, true),
    blockAgedStucco(true, GenericItemBlock.class, "blockAgedStucco",1, true),
    blockWoodPanel(true, GenericItemBlock.class, "blockWoodPanel",8, true, "axe"),
    blockCement(true, GenericItemBlock.class, "blockCement",3, true),
    blockPolishedStone(true, GenericItemBlock.class, "blockPolishedStone",1, true),
    blockVerticalBrickPale(true, GenericItemBlock.class, "blockVerticalBrickPale",1, true),
    blockBrickBlack(true, GenericItemBlock.class, "blockBrickBlack",1, true),
    blockBrickWhite(true, GenericItemBlock.class, "blockBrickWhite",1, true),
    blockLargeBrickGranite(true, GenericItemBlock.class, "blockLargeBrickGranite", 3, true),
    blockSlate(true, GenericItemBlock.class, "blockSlate", 10, true),
    blockStone(true, GenericItemBlock.class, "blockColored",10,true),
    blockTurf(true, GenericItemBlock.class, "blockTurf", 1, true),
    blockBrickNormal(true, GenericItemBlock.class, "blockBrickNormal", 1, true),
    blockBrickInlay(true, GenericItemBlock.class, "blockBrickInlay", 1, true),
    blockColoredSteel(true, GenericItemBlock.class, "blockColoredSteel", 1, true),
    blockDirt(true, GenericItemBlock.class, "blockDirt", 2, true),
    blockGlass(true, GenericItemBlock.class, "blockGlass", 4, false),
    ;


    public Block block;
    public boolean hasItemBlock;
    public Class itemBlockClass;
    public String blockName;
    /** MaxMetaData for Multipart
     * -1 Disables the use of Multipart on the block
     * 0 Enabled the use of multipart on the block and will allow for only the base block to use Multipart
     */
    public byte MaxMetadata;
    public boolean hasSlabStair;
    public String tool;

    /**
     * Construct a BlockID that has metaData
     * @param hasItemBlock
     * @param itemBlockClass Class
     * @param blockName name of the block
     * @param maxMetadata how many blocks with the same baseID should be generated for Forge Multipart
     */
    BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName, int maxMetadata, boolean hasSlabStair, String tool) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = ((byte) maxMetadata);
        this.hasSlabStair = hasSlabStair;
        this.tool = tool;
    }


    /**
     * Construct a BlockID that has metaData
     * @param hasItemBlock
     * @param itemBlockClass Class
     * @param blockName name of the block
     * @param maxMetadata how many blocks with the same baseID should be generated for Forge Multipart
     */
    BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName, int maxMetadata, boolean hasSlabStair) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = ((byte) maxMetadata);
        this.hasSlabStair = hasSlabStair;
        this.tool = "pickaxe";
    }


    /**
     * Construct a BlockID that has metaData
     * @param hasItemBlock
     * @param itemBlockClass Class
     * @param blockName name of the block
     * @param maxMetadata how many blocks with the same baseID should be generated for Forge Multipart
     */
    BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName, int maxMetadata) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = ((byte) maxMetadata);
        this.hasItemBlock = false;
        this.tool = "pickaxe";
    }

    /**
     * Construct a BlockID that does not have metaData
     * @param hasItemBlock
     * @param itemBlockClass
     * @param blockName
     */
    BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = 0;
        this.hasSlabStair = false;
        this.tool = "pickaxe";
    }
}
