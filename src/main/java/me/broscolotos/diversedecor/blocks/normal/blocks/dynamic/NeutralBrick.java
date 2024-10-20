package me.broscolotos.diversedecor.blocks.normal.blocks.dynamic;

import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.material.Material;

public class NeutralBrick extends DynamicBlock {
    public NeutralBrick(Material mat) {
        super(mat);
        setBlockName("neutral_bricks");
        setBlockTextureName(DiverseDecor.MODID+":bricks/neutral/neutral_brick");
        setTextAmt(4);
    }

}
