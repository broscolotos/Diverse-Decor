package me.broscolotos.diversedecor.core.handler;

import ddfexcraft.fvtm.ModelCustomArmor;
import me.broscolotos.diversedecor.render.models.armor.*;

public enum EnumCosmetics {
    capotain(new ModelCapotain()),
    coneHat(new ModelTrafficConeHat()),
    umbrella(new ModelUmbrella()),
    ashBaseballHat(new ModelBaseballHat()),
    foxyGrandpaBaseballHat(new ModelBaseballHat()),
    strawHat(new ModelStrawHat()),
    vrGoggles(new ModelVRGoggles()),
    bearHat(new ModelBearHat()),
    shoulderTrain(new ModelWoodenTrain()),
    cowboyHat(new ModelCowboyHat()),
    santaHat(new ModelSantaHat()),
    ;

    public ModelCustomArmor model;

    EnumCosmetics(ModelCustomArmor model) {
        this.model = model;
    }
}
