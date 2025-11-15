package me.broscolotos.diversedecor.core;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import me.broscolotos.diversedecor.core.handler.ItemHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler {

    public void handleRegistry(FMLInitializationEvent event) {
        ItemHandler.initItemRegisterServer(event);
    }
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    public boolean isClient() {
        return false;
    }

    public void loadConfig(FMLPreInitializationEvent event) {

    }
}
