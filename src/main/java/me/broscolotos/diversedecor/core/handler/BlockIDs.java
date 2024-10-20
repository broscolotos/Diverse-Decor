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

import me.broscolotos.diversedecor.blocks.normal.itemblocks.GenericItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public enum BlockIDs
{
    //concreteBrick(true, ItemBlockconcreteBrick.class, "concreteBrick", 6),
    picnicTable(false,null,"picnic_table", -1),
    fancyWallLight(false,null,"fancy_wall_light", -1),
    fancyWallLightDiagonal(false,null,"fancy_wall_light_diagonal", -1),
    postTopper(false,null,"post_topper", -1),
    postCurve(false,null,"post_curve", -1),
    postLight(false,null,"post_light", -1),
    blockBrickOrange(true, GenericItemBlock.class, "blockBrickOrange", 2),
    blockBrickBrown(true, GenericItemBlock.class, "blockBrickBrown", 1),
    blockBrickBlueGray(true, GenericItemBlock.class, "blockBrickBlueGray", 1),
    blockBrickLightGray(true, GenericItemBlock.class, "blockBrickLightGray", 1),
    blockBrickNeutral(true, GenericItemBlock.class, "blockBrickNeutral", 1),
    blockBrickMessyTan(true, GenericItemBlock.class, "blockBrickMessyTan", 1),
    blockBrickPale(true, GenericItemBlock.class, "blockBrickPale", 1),
    blockBrickRose(true, GenericItemBlock.class, "blockBrickRose",1),
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
    }
}
