package me.broscolotos.diversedecor.core.handler;

import me.broscolotos.diversedecor.blocks.normal.itemblocks.GenericItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public enum SlabBlockIDs {
    slabBrickOrange(true, GenericItemBlock.class, "slabBrickOrange"),
    slabBrickBrown(true, GenericItemBlock.class, "slabBrickBrown"),
    slabBrickBlueGray(true, GenericItemBlock.class, "slabBrickBlueGray"),
    slabBrickLightGray(true, GenericItemBlock.class, "slabBrickLightGray"),
    slabBrickNeutral(true, GenericItemBlock.class, "slabBrickNeutral"),
    slabBrickMessyTan(true, GenericItemBlock.class, "slabBrickMessyTan"),
    slabBrickPale(true, GenericItemBlock.class, "slabBrickPale"),
    slabBrickRose(true, GenericItemBlock.class, "slabBrickRose"),
    slabAgedStucco(true, GenericItemBlock.class, "slabAgedStucco"),
    slabWoodPanel0(true, GenericItemBlock.class, "slabWoodPanel",0),
    slabWoodPanel1(true, GenericItemBlock.class, "slabWoodPanel",1),
    slabWoodPanel2(true, GenericItemBlock.class, "slabWoodPanel",2),
    slabWoodPanel3(true, GenericItemBlock.class, "slabWoodPanel",3),
    slabWoodPanel4(true, GenericItemBlock.class, "slabWoodPanel",4),
    slabWoodPanel5(true, GenericItemBlock.class, "slabWoodPanel",5),
    slabWoodPanel6(true, GenericItemBlock.class, "slabWoodPanel",6),
    slabWoodPanel7(true, GenericItemBlock.class, "slabWoodPanel",7),
    slabCement0(true, GenericItemBlock.class, "slabCement",0),
    slabCement1(true, GenericItemBlock.class, "slabCement",1),
    slabCement2(true, GenericItemBlock.class, "slabCement",2),
    slabPolishedStone(true, GenericItemBlock.class, "slabPolishedStone"),
    slabVerticalBrickPale(true, GenericItemBlock.class, "slabVerticalBrickPale"),
    slabBrickBlack(true, GenericItemBlock.class, "slabBrickBlack"),
    slabBrickWhite(true, GenericItemBlock.class, "slabBrickWhite"),
    slabLargeBrickGranite(true, GenericItemBlock.class, "slabLargeBrickGranite"),
    ;



    public Block block;
    public boolean hasItemBlock;
    public Class itemBlockClass;
    public String blockName;
    /** MaxMetaData for Multipart
     * -1 Disables the use of Multipart on the block
     * 0 Enabled the use of multipart on the block and will allow for only the base block to use Multipart
     */
    public byte metaData;


    /**
     * Construct a BlockID that does not have metaData
     * @param hasItemBlock
     * @param itemBlockClass
     * @param blockName
     */
    SlabBlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.metaData = 0;
    }

    /**
     * Construct a BlockID that does not have metaData
     * @param hasItemBlock
     * @param itemBlockClass
     * @param blockName
     */
    SlabBlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName, int metaData) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.metaData = (byte)metaData;
    }
}
