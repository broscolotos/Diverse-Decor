package me.broscolotos.diversedecor.core;

import me.broscolotos.diversedecor.core.handler.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.world.World;

public class Utility {

    public static BlockIDs getBlockFromString(String name) {
        if (name.contains("_doubleslab")) {
            name = name.replace("_doubleslab","");
        }
        if (name.contains("_slab")) {
            name = name.replace("_slab","");
        }
        if (name.contains("_stair")) {
            name = name.replace("_stair","");
        }
        if (name.contains("tile.")) {
            name = name.replace("tile.","");
        }
        name = name.replaceAll("[0-9]","");
        for (BlockIDs block : BlockIDs.values()) {
            if (name.equalsIgnoreCase(block.blockName)) {
                return block;
            }
        }
        return null;
    }

    public static boolean isFence(World worldObj, int x, int y, int z, Block block) {
        int damage = block.getDamageValue(worldObj, x, y, z);
        return block instanceof BlockFence
                || (block.getUnlocalizedName().equalsIgnoreCase("tile.immersiveEngineering.metalDecoration") && damage == 0)
                || (block.getUnlocalizedName().equalsIgnoreCase("tile.immersiveEngineering.woodenDecoration") && damage == 1)
                || block.getUnlocalizedName().equalsIgnoreCase("tile.blockCarpentersBarrier")
                || block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post.metal")
                || block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post.metal.platform")
                || (block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post")) && (damage == 0 || damage == 2 || damage == 4 || damage == 6);
    }

    public static int getColorFromString(String name) {
        return parseAndNormalizeColor(name);
    }

    public static float[] hexToRGB(int hex) {
        float r = ((hex >> 16) & 0xFF) / 255.0F;
        float g = ((hex >> 8) & 0xFF) / 255.0F;
        float b = (hex & 0xFF) / 255.0F;
        return new float[]{r, g, b};
    }

    //TODO: fix r0 g0 b0
    public static int parseAndNormalizeColor(String input) {
        input = input.trim().toLowerCase();

        String rStr = null, gStr = null, bStr = null;
        int r = 0, g = 0, b = 0;
        // --- HEX MODE (5-digit, pad with leading zero) ---
        if (input.matches("^#?[0-9a-f]{4,5}$") || input.matches("^0x[0-9a-f]{4,5}$")) {
            String hexStr = input.replace("#", "").replace("0x", "");
            // pad to 6 digits on the left
            while (hexStr.length() < 6) {
                hexStr = "0" + hexStr;
            }
            //replace "#" so 6-digit catches it
            input = "#" + hexStr;
        }
        // --- HEX MODE (6-digit) ---
        if (input.matches("^#?[0-9a-f]{6}$") || input.matches("^0x[0-9a-f]{6}$")) {
            String hexStr = input.replace("#", "").replace("0x", "");
            int value = Integer.parseInt(hexStr, 16);
            r = (value >> 16) & 0xFF;
            g = (value >> 8) & 0xFF;
            b = value & 0xFF;
            return normalizeColor(r, g, b);
        }

        // --- HEX MODE (3-digit) ---
        if (input.matches("^#?[0-9a-f]{3}$") || input.matches("^0x[0-9a-f]{3}$")) {
            String hexStr = input.replace("#", "").replace("0x", "");
            char rc = hexStr.charAt(0), gc = hexStr.charAt(1), bc = hexStr.charAt(2);
            r = Integer.parseInt("" + rc + rc, 16);
            g = Integer.parseInt("" + gc + gc, 16);
            b = Integer.parseInt("" + bc + bc, 16);
            return normalizeColor(r, g, b);
        }

        // --- MARKED MODE (number before or after the marker) ---
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(
                "(?:(?<r>[0-9]+(?:\\.[0-9]+)?)r)|" +  // number before r
                        "(?:r(?<r2>[0-9]+(?:\\.[0-9]+)?))|" + // number after r
                        "(?:(?<g>[0-9]+(?:\\.[0-9]+)?)g)|" +
                        "(?:g(?<g2>[0-9]+(?:\\.[0-9]+)?))|" +
                        "(?:(?<b>[0-9]+(?:\\.[0-9]+)?)b)|" +
                        "(?:b(?<b2>[0-9]+(?:\\.[0-9]+)?))"
        );

        java.util.regex.Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            if (matcher.group("r") != null) rStr = matcher.group("r");
            if (matcher.group("r2") != null) rStr = matcher.group("r2");
            if (matcher.group("g") != null) gStr = matcher.group("g");
            if (matcher.group("g2") != null) gStr = matcher.group("g2");
            if (matcher.group("b") != null) bStr = matcher.group("b");
            if (matcher.group("b2") != null) bStr = matcher.group("b2");
        }

        // --- FALLBACK: comma/space-separated ---
        if (rStr == null || gStr == null || bStr == null) {
            String[] parts = input.split("[,\\s]+"); // split on commas or whitespace
            if (parts.length == 3) {
                if (rStr == null) rStr = parts[0];
                if (gStr == null) gStr = parts[1];
                if (bStr == null) bStr = parts[2];
            }
        }

        if (rStr == null || gStr == null || bStr == null) {
            return 0xFFFFFF;
        }

        // --- CONVERT and NORMALIZE ---
        if (rStr.contains(".") || gStr.contains(".") || bStr.contains(".")) {
            float rf = Float.parseFloat(rStr);
            float gf = Float.parseFloat(gStr);
            float bf = Float.parseFloat(bStr);
            return normalizeColor(rf, gf, bf);
        } else {
            try {
                r = Integer.parseInt(rStr);
                g = Integer.parseInt(gStr);
                b = Integer.parseInt(bStr);
                return normalizeColor(r, g, b);
            } catch (NumberFormatException e) {
                return 0xFFFFFF;
            }
        }
    }

    // --- Normalization methods ---
    public static int normalizeColor(int r, int g, int b) {
        r = Math.max(0, Math.min(255, r));
        g = Math.max(0, Math.min(255, g));
        b = Math.max(0, Math.min(255, b));
        return (r << 16) | (g << 8) | b;
    }

    public static int normalizeColor(float r, float g, float b) {
        int ri = Math.round(r * 255.0F);
        int gi = Math.round(g * 255.0F);
        int bi = Math.round(b * 255.0F);
        return normalizeColor(ri, gi, bi);
    }
}
