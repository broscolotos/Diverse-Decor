package me.broscolotos.diversedecor.blocks.decoration;

import ddfexcraft.tmt.slim.Vec3d;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.core.ChairUtility;
import me.broscolotos.diversedecor.tiles.BaseTileEntity;
import me.broscolotos.diversedecor.tiles.ExtendedTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class ExtendedDecorationBlock extends DecorationBlock {

    public ExtendedDecorationBlock(Material material) {
        super(material);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        handleBounds(world, x, y, z, entity);
        try {
            ExtendedTileEntity t = (ExtendedTileEntity) tileEntity.getClass().newInstance();
            t.dir = getDir(entity);
            t.altMode = entity.isSneaking();
            //force tile spawn manually and override any existing tile at the space
            world.setTileEntity(x,y,z, t);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
