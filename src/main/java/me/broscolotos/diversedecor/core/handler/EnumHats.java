package me.broscolotos.diversedecor.core.handler;

import ddfexcraft.fvtm.ModelCustomArmor;
import me.broscolotos.diversedecor.render.models.armor.*;

public enum EnumHats {
    testHat(new ModelHatTest()),
    coneHat(new ModelTrafficConeHat()),
    umbrella(new ModelUmbrella()),
    ashBaseballHat(new ModelBaseballHat()),
    foxyGrandpaBaseballHat(new ModelBaseballHat()),
    strawHat(new ModelStrawHat()),
    vrGoggles(new ModelVRGoggles())

    ;

    public ModelCustomArmor model;

    EnumHats(ModelCustomArmor model) {
        this.model = model;
    }
}
