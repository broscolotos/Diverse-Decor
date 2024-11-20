package me.broscolotos.diversedecor.core.handler;

import ddfexcraft.fvtm.ModelCustomArmor;
import me.broscolotos.diversedecor.render.models.armor.ModelHatTest;
import me.broscolotos.diversedecor.render.models.armor.ModelTrafficConeHat;

public enum EnumHats {
    testHat(new ModelHatTest()),
    coneHat(new ModelTrafficConeHat()),

    ;

    public ModelCustomArmor model;

    EnumHats(ModelCustomArmor model) {
        this.model = model;
    }
}
