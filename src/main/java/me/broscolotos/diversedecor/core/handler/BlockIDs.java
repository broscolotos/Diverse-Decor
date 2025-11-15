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
import me.broscolotos.diversedecor.blocks.itemblocks.Recolorable.RecolorableItemBlock;
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
    trashCanSquare(false, GenericPropItemBlock.class, "trashcan_square", -1),
    trashCanCurved(false, GenericPropItemBlock.class, "trashcan_curved", -1),
    wagonWheel(false, GenericPropItemBlock.class, "wagon_wheel", -1),
    barrel(false, GenericPropItemBlock.class, "barrel", -1),

    //gag for multiblocks
    //decorationGag(false,GenericPropItemBlock.class, "decoration_gag",-1),

    //normal blocks; if you pass the boolean array it NEEDS to have 5 arguments. Stairs, Slabs, Walls, Fences, Fence Gates; in that order.
    blockBrickOrange(true, GenericItemBlock.class, "blockBrickOrange", 1, new boolean[]{true,true,true,true,true}),
    blockBrickBrown(true, GenericItemBlock.class, "blockBrickBrown", 1, new boolean[]{true,true,true,true,true}),
    blockBrickBlueGray(true, GenericItemBlock.class, "blockBrickBlueGray", 1, new boolean[]{true,true,true,true,true}),
    blockBrickLightGray(true, GenericItemBlock.class, "blockBrickLightGray", 1, new boolean[]{true,true,true,true,true}),
    blockBrickNeutral(true, GenericItemBlock.class, "blockBrickNeutral", 1, new boolean[]{true,true,true,true,true}),
    blockBrickMessyTan(true, GenericItemBlock.class, "blockBrickMessyTan", 1, new boolean[]{true,true,true,true,true}),
    blockBrickPale(true, GenericItemBlock.class, "blockBrickPale", 1, new boolean[]{true,true,true,true,true}),
    blockBrickRose(true, GenericItemBlock.class, "blockBrickRose",1, new boolean[]{true,true,true,true,true}),
    blockAgedStucco(true, GenericItemBlock.class, "blockAgedStucco",1, new boolean[]{true,true,true,true,true}),
    blockWoodPanel(true, GenericItemBlock.class, "blockWoodPanel",10, new boolean[]{true,true,true,true,true}, "axe"),
    blockCement(true, GenericItemBlock.class, "blockCement",3, new boolean[]{true,true,true,true,true}),
    blockPolishedStone(true, GenericItemBlock.class, "blockPolishedStone",1, new boolean[]{true,true,true,true,true}),
    blockVerticalBrickPale(true, GenericItemBlock.class, "blockVerticalBrickPale",1, new boolean[]{true,true,true,true,true}),
    blockBrickBlack(true, GenericItemBlock.class, "blockBrickBlack",1, new boolean[]{true,true,true,true,true}),
    blockBrickWhite(true, GenericItemBlock.class, "blockBrickWhite",1, new boolean[]{true,true,true,true,true}),
    blockLargeBrickGranite(true, GenericItemBlock.class, "blockLargeBrickGranite", 3, new boolean[]{true,true,true,true,true}),
    blockSlate(true, GenericItemBlock.class, "blockSlate", 10, new boolean[]{true,true,true,true,true}),
    blockStone(true, GenericItemBlock.class, "blockColored",10,new boolean[]{true,true,true,true,true}),
    blockTurf(true, GenericItemBlock.class, "blockTurf", 1, new boolean[]{true,true,false,false,false}),
    blockBrickNormal(true, GenericItemBlock.class, "blockBrickNormal", 1, new boolean[]{true,true,true,true,true}),
    blockBrickInlay(true, GenericItemBlock.class, "blockBrickInlay", 1, new boolean[]{true,true,true,true,true}),
    blockColoredSteel(true, GenericItemBlock.class, "blockColoredSteel", 2, new boolean[]{true,true,true,true,true}),
    blockDirt(true, GenericItemBlock.class, "blockDirt", 2, new boolean[]{true,true,true,true,true}),
    blockGlass(true, GenericItemBlock.class, "blockGlass", 4, new boolean[]{false,false,false,false,false}),
    blockBrickStucco(true, GenericItemBlock.class, "blockBrickStucco", 6, new boolean[]{true,true,true,true,true}),
    blockMixedBrick(true, GenericItemBlock.class, "blockMixedBrick", 1, new boolean[]{true,true,true,true,true}),
    blockRecolorable(true, RecolorableItemBlock.class, "blockRecolorable", -1),
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
    public boolean[] hasBools = new boolean[]{false, false, false, false, false};
    public String tool;

    /**
     * Construct a BlockID that has metaData
     * @param hasItemBlock
     * @param itemBlockClass Class
     * @param blockName name of the block
     * @param maxMetadata how many blocks with the same baseID should be generated for Forge Multipart
     */
    BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName, int maxMetadata, boolean[] bools, String tool) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = ((byte) maxMetadata);
        this.hasBools = bools;
        this.tool = tool;
    }


    /**
     * Construct a BlockID that has metaData
     * @param hasItemBlock
     * @param itemBlockClass Class
     * @param blockName name of the block
     * @param maxMetadata how many blocks with the same baseID should be generated for Forge Multipart
     */
    BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName, int maxMetadata, boolean[] bools) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = ((byte) maxMetadata);
        this.hasBools = bools;
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
        this.tool = "pickaxe";
    }
}
