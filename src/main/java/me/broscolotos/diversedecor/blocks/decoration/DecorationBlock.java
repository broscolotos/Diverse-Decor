package me.broscolotos.diversedecor.blocks.decoration;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.entities.EntityChair;
import me.broscolotos.diversedecor.tiles.BaseTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;

public class DecorationBlock extends BlockContainer {
    public boolean opaque;
    public int renderType;
    public boolean normalBlock;
    public BaseTileEntity tileEntity;
    public boolean hasSeat = false;
    public Vec3f seatPos;

    public Vec3f offset = new Vec3f(0,0,0);
    public Vec3f scale = new Vec3f(1,1,1);
    public Vec3f rotation = new Vec3f(0, 0, 0);

    public DecorationBlock(Material material) {
        super(material);
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
    }

    public DecorationBlock(String name, float hardness, float resistance, String tool, int toolLevel, SoundType soundType, Material material, Vec3f scale, Vec3f offset, BaseTileEntity tileEntity) {
        super(material);
        setBlockName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool,toolLevel);
        setStepSound(soundType);
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
        this.offset = offset;
        this.scale = scale;
        this.tileEntity = tileEntity;
        opaque = false; //may need an option for
        renderType = -1; //may need an option for
        normalBlock = false; //may need an option for
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
        this.setBlockBounds(0F, 0.0F, 0F, 1F, 1F, 1F);
    }


    public DecorationBlock(String name, float hardness, float resistance, String tool, int toolLevel, SoundType soundType, Material material, Vec3f scale, Vec3f offset, Vec3f rotation, BaseTileEntity tileEntity, Vec3f seatPos) {
        super(material);
        setBlockName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool,toolLevel);
        setStepSound(soundType);
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
        this.offset = offset!=null?offset:this.offset;
        this.scale = scale!=null?scale:this.scale;
        this.rotation = rotation!=null?rotation:this.rotation;
        try {
            this.tileEntity = tileEntity.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        this.hasSeat = true;
        this.seatPos = seatPos;
        opaque = false; //may need an option for
        renderType = -1; //may need an option for
        normalBlock = false; //may need an option for
    }

    public DecorationBlock(String name, float hardness, float resistance, String tool, int toolLevel, SoundType soundType, Material material, Vec3f scale, Vec3f offset, Vec3f rotation, BaseTileEntity tileEntity, Vec3f seatPos, float lightLevel) {
        super(material);
        setBlockName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool,toolLevel);
        setStepSound(soundType);
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
        this.offset = offset!=null?offset:this.offset;
        this.scale = scale!=null?scale:this.scale;
        this.rotation = rotation!=null?rotation:this.rotation;
        try {
            this.tileEntity = tileEntity.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        this.hasSeat = true;
        this.seatPos = seatPos;
        opaque = false; //may need an option for
        renderType = -1; //may need an option for
        normalBlock = false; //may need an option for
        setLightLevel(lightLevel);
    }

    @Override
    public TileEntity createTileEntity(World world, int meta) {
        return createNewTileEntity(world, meta);
    }

    @Override
    public boolean canCollideCheck(int p_149678_1_, boolean p_149678_2_)
    {
        return true;
    }


    @Override
    public int getRenderType(){
        return renderType;
    }
    @Override
    public boolean isOpaqueCube(){
        return opaque;
    }
    @Override
    public boolean renderAsNormalBlock(){
        return normalBlock;
    }



    // Helper to get the Direction
    protected int getDir(EntityLivingBase entity)
    {
        return MathHelper.floor_double((entity.rotationYaw / 90.0F) + 2.5D) & 3;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        try {
            return tileEntity.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        try {
            BaseTileEntity t = tileEntity.getClass().newInstance();
            t.dir = getDir(entity);
            //force tile spawn manually and override any existing tile at the space
            world.setTileEntity(x,y,z, t);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
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
