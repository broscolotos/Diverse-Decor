package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import me.broscolotos.diversedecor.render.BlockRenderTransparent;

public class RenderBlockHandler {
    public static int transparentRenderID = RenderingRegistry.getNextAvailableRenderId();
    public static void initializeCustomModels() {
        //ClientRegistry.bindTileEntitySpecialRenderer(TileBreakerBox.class, new RenderBreakerBox());

        //RenderingRegistry.registerBlockHandler(transparentRenderID, new BlockRenderTransparent(transparentRenderID));
    }
}
