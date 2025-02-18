//FMT-Marker DFM-1.0
//Creator: sokejoke

package me.broscolotos.diversedecor.render.models.armor;

import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelTrafficConeHat extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 32;

	public ModelTrafficConeHat(){
		headModel = new ModelRendererTurbo[4];
		//
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(0, -8.0f, 0, 12, 1, 12, 0f);
		headModel[0].setRotationPoint(-6.0f, 0, -6.0f);

		headModel[1] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		headModel[1].addBox(1, -13.0f, 0, 8, 5, 8, 0f);
		headModel[1].setRotationPoint(-5.0f, 0, -4.0f);

		headModel[2] = new ModelRendererTurbo(this, 37, 0, textureX, textureY);
		headModel[2].addBox(0, -18.0f, 0, 6, 5, 6, 0f);
		headModel[2].setRotationPoint(-3.0f, 0, -3.0f);

		headModel[3] = new ModelRendererTurbo(this, 45, 12, textureX, textureY);
		headModel[3].addBox(0, -23.0f, 0, 4, 5, 4, 0f);
		headModel[3].setRotationPoint(-2.0f, 0, -2.0f);

		cacheRotations();
	}

}
