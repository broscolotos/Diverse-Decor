package me.broscolotos.diversedecor.blocks.normal.blocks.mono;

import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.OrangeBrick;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class MessyTanBrick extends RoseBrick {
    public MessyTanBrick(Material material) {
        super(material);
        setBlockName("dirtytanbricks");
        setBlockTextureName(DiverseDecor.MODID+":bricks/tan/dirty_tan_brick");
        setTextureAmt(1);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
            this.textures[0] = reg.registerIcon(this.textureName);
    }
    @Override
    public IIcon getIcon ( int side, int meta){
        if (meta != 0) meta = 0;
        return this.textures[meta];
    }
}
