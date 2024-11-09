package me.broscolotos.diversedecor.core.handler;

import me.broscolotos.diversedecor.blocks.normal.itemblocks.GenericItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public enum StairBlockIDs {
    stairBrickOrange(true, GenericItemBlock.class, "stairBrickOrange"),
    stairBrickBrown(true, GenericItemBlock.class, "stairBrickBrown"),
    stairBrickBlueGray(true, GenericItemBlock.class, "stairBrickBlueGray"),
    stairBrickLightGray(true, GenericItemBlock.class, "stairBrickLightGray"),
    stairBrickNeutral(true, GenericItemBlock.class, "stairBrickNeutral"),
    stairBrickMessyTan(true, GenericItemBlock.class, "stairBrickMessyTan"),
    stairBrickPale(true, GenericItemBlock.class, "stairBrickPale"),
    stairBrickRose(true, GenericItemBlock.class, "stairBrickRose"),
    stairAgedStucco(true, GenericItemBlock.class, "stairAgedStucco"),
    stairWoodPanel0(true, GenericItemBlock.class, "stairWoodPanel", 0),
    stairWoodPanel1(true, GenericItemBlock.class, "stairWoodPanel", 1),
    stairWoodPanel2(true, GenericItemBlock.class, "stairWoodPanel", 2),
    stairWoodPanel3(true, GenericItemBlock.class, "stairWoodPanel", 3),
    stairWoodPanel4(true, GenericItemBlock.class, "stairWoodPanel", 4),
    stairWoodPanel5(true, GenericItemBlock.class, "stairWoodPanel", 5),
    stairWoodPanel6(true, GenericItemBlock.class, "stairWoodPanel", 6),
    stairWoodPanel7(true, GenericItemBlock.class, "stairWoodPanel", 7),
    stairCement0(true, GenericItemBlock.class, "stairCement",0),
    stairCement1(true, GenericItemBlock.class, "stairCement",1),
    stairCement2(true, GenericItemBlock.class, "stairCement",2),
    stairPolishedStone(true, GenericItemBlock.class, "stairPolishedStone"),
    stairVerticalBrickPale(true, GenericItemBlock.class, "stairVerticalBrickPale"),
    stairBrickBlack(true, GenericItemBlock.class, "stairBrickBlack"),
    stairBrickWhite(true, GenericItemBlock.class, "stairBrickWhite"),
    stairLargeBrickGranite(true, GenericItemBlock.class, "stairLargeBrickGranite"),
    ;



    public Block block;
    public boolean hasItemBlock;
    public Class itemBlockClass;
    public String blockName;
    public byte metaData;


    /**
     * Construct a BlockID that does not have metaData
     * @param hasItemBlock
     * @param itemBlockClass
     * @param blockName
     */
    StairBlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName) {
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
    StairBlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName, int metaData) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.metaData = (byte)metaData;
    }
}
