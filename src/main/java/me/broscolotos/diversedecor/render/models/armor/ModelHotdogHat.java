//FMT-Marker DFM-1.0
//Creator: broscolotos

package me.broscolotos.diversedecor.render.models.armor;

import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelHotdogHat extends ModelCustomArmor {

	private int textureX = 32;
	private int textureY = 16;

	public ModelHotdogHat(){
		headModel = new ModelRendererTurbo[4];
		//

		headModel[0] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		headModel[0].addBox(0, 0, 0, 3, 2, 3, 0f);
		headModel[0].setRotationPoint(3.5f, -3.5f, -1.5f);

		headModel[1] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		headModel[1].addBox(0, 0, 0, 3, 2, 2, 0f);
		headModel[1].setRotationPoint(-7.0f, -4.0f, -1.0f);

		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[2].addBox(0, 0, 0, 3, 2, 3, 0f);
		headModel[2].setRotationPoint(-6.5f, -3.5f, -1.5f);

		headModel[3] = new ModelRendererTurbo(this, 11, 6, textureX, textureY);
		headModel[3].addBox(0, 0, 0, 3, 2, 2, 0f);
		headModel[3].setRotationPoint(4.0f, -4.0f, -1.0f);

		cacheRotations();
	}

}
