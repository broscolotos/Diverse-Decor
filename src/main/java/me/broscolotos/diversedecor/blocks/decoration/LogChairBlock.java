package me.broscolotos.diversedecor.blocks.decoration;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.tiles.BaseTileEntity;
import me.broscolotos.diversedecor.tiles.TileLogChair;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

public class LogChairBlock extends DecorationBlock {

    public LinkedList<String> textures = new LinkedList<>();

    public LogChairBlock(Material material) {
        super(material);
        textures.add("log chair/oak_log_chair");
        textures.add("log chair/spruce_log_chair");
        textures.add("log chair/birch_log_chair");
        textures.add("log chair/jungle_log_chair");
        textures.add("log chair/acacia_log_chair");
        textures.add("log chair/dark_oak_log_chair");
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        try {
            Constructor<? extends BaseTileEntity> constructor = tileEntity.getClass().getConstructor(int.class, String.class);
            BaseTileEntity t = constructor.newInstance(getDir(entity),textures.get(stack.getItemDamage()));
            //force tile spawn manually and override any existing tile at the space
            world.setTileEntity(x,y,z, t);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
        for (int i=0;i<textures.size();i++) {

            p_149666_3_.add(new ItemStack(p_149666_1_.setUnlocalizedName(p_149666_1_.getUnlocalizedName() + "." + i), 1, i));
        }
    }

    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        Item item = getItem(world, x, y, z);

        if (item == null) {
            return null;
        }
        String texString = ((TileLogChair)world.getTileEntity(x,y,z)).getTexture().toString();
        texString = texString.substring(29);
        texString = texString.substring(0,texString.length()-4);
        return new ItemStack(item, 1, this.textures.indexOf(texString));
    }
}
