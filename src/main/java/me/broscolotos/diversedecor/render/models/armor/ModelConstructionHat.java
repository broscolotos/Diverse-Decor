//FMT-Marker DFM-1.0
//Creator: sokejoke

package me.broscolotos.diversedecor.render.models.armor;

import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelConstructionHat extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 32;

	public ModelConstructionHat(){
		headModel = new ModelRendererTurbo[6];
		//
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(0, 0, 0, 11, 1, 11, 0f);
		headModel[0].setRotationPoint(-5.5f, -7.0f, -6.0f);

		headModel[1] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		headModel[1].addBox(0, 0, 0, 9, 3, 9, 0f);
		headModel[1].setRotationPoint(-4.5f, -10.0f, -4.5f);

		headModel[2] = new ModelRendererTurbo(this, 35, 3, textureX, textureY);
		headModel[2].addBox(0, 0, 0, 2, 1, 10, 0f);
		headModel[2].setRotationPoint(-1.0f, -11.0f, -5.0f);

		headModel[3] = new ModelRendererTurbo(this, 55, 0, textureX, textureY);
		headModel[3].addBox(0, 0, 0, 2, 3, 1, 0f);
		headModel[3].setRotationPoint(-1.0f, -10.0f, -5.0f);

		headModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[4].addBox(0, 0, 0, 2, 3, 1, 0f);
		headModel[4].setRotationPoint(-1.0f, -10.0f, 4.0f);

		headModel[5] = new ModelRendererTurbo(this, 34, 0, textureX, textureY);
		headModel[5].addBox(0, 0, 0, 9, 1, 1, 0f);
		headModel[5].setRotationPoint(-4.5f, -7.0f, -7.0f);

		cacheRotations();
	}

}
