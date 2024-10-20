package me.broscolotos.diversedecor.blocks.normal.blocks.dynamic;

import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.material.Material;

public class BrownBrick extends DynamicBlock {
    public BrownBrick(Material mat) {
        super(mat);
        setBlockName("brown_bricks");
        setBlockTextureName(DiverseDecor.MODID+":bricks/brown/brown_brick");
        setTextAmt(4);
    }

}
