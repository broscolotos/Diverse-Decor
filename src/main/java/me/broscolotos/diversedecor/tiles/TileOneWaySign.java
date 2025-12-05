package me.broscolotos.diversedecor.tiles;

import me.broscolotos.diversedecor.render.models.ModelOneWaySign;

public class TileOneWaySign extends ExtendedTileEntity {


    public TileOneWaySign(int dir, boolean alt) {
        super(dir, alt);
        model = new ModelOneWaySign();
        setTexture("street signs/one way left");

    }

    public TileOneWaySign() {
        model = new ModelOneWaySign();
        setTexture("street signs/one way left");
    }
}
