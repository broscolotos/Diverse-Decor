package me.broscolotos.diversedecor.blocks;

import me.broscolotos.diversedecor.entities.EntityChair;
import me.broscolotos.diversedecor.tiles.TilePicnicTable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;

public class BlockPicnicTable extends DecorationBlock {


    public BlockPicnicTable(Material material) {
        super(material);
        setBlockName("Picnic Table");
        setHardness(1);
        setResistance(2);
        setHarvestLevel("axe",1);
        setStepSound(Block.soundTypeWood);
        icon = "tableIcon";
        opaque = false;
        renderType = -1;
        normalBlock = false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TilePicnicTable();
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        //force tile spawn manually and override any existing tile at the space
        world.setTileEntity(x,y,z, new TilePicnicTable(getDir(entity)));
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
        this.setBlockBounds(0F, 0.0F, 0F, 1F, 1F, 1F);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        return mountBlock(world, x, y, z, player);
    }
    public static boolean mountBlock(World world, int x, int y, int z, EntityPlayer player) {
        if(world.isRemote) {
            return true;
        } else {
            List list = world.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox((double)x-2, (double)y-1, (double)z-2, (double)(x + 2), (double)(y + 2), (double)(z + 2)));
            Iterator mount = list.iterator();

            Entity entity;
            EntityChair mount1 = null;
            boolean t = false;
            do {
                if(!mount.hasNext()) {
                    mount1 = new EntityChair(world);
                    mount1.setPosition((double)((float)x + 0.5F), (double)y, (double)z + 0.5D);
                    world.spawnEntityInWorld(mount1);
                    t = true;
                    break;
                }

                entity = (Entity)mount.next();
            } while(!(entity instanceof EntityChair));
            if (t) {
                player.mountEntity(mount1);
                player.updateRidden();
            }
            return false;
        }
    }
}
