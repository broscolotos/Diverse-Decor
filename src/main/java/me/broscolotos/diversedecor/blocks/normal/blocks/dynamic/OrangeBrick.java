package me.broscolotos.diversedecor.blocks.normal.blocks.dynamic;

import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class OrangeBrick extends DynamicBlock {

    public OrangeBrick(Material material) {
        super(material);
        setBlockName("orange_bricks");
        setBlockTextureName(DiverseDecor.MODID+":bricks/orange/orange_brick");
        setTextAmt(3);
    }

}
