package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import me.broscolotos.diversedecor.render.BlockRenderTransparent;
import me.broscolotos.diversedecor.render.RenderPicnicTable;
import me.broscolotos.diversedecor.tiles.TilePicnicTable;

public class RenderBlockHandler {
    public static int transparentRenderID = RenderingRegistry.getNextAvailableRenderId();
    public static void initializeCustomModels() {
        ClientRegistry.bindTileEntitySpecialRenderer(TilePicnicTable.class, new RenderPicnicTable());

        //RenderingRegistry.registerBlockHandler(transparentRenderID, new BlockRenderTransparent(transparentRenderID));
    }
}
