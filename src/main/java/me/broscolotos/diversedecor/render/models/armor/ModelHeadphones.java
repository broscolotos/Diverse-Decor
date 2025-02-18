//FMT-Marker DFM-1.0
//Creator: sokejoke

package me.broscolotos.diversedecor.render.models.armor;

import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelHeadphones extends ModelCustomArmor {

	private int textureX = 32;
	private int textureY = 16;

	public ModelHeadphones(){
		headModel = new ModelRendererTurbo[7];
		//
		headModel[0] = new ModelRendererTurbo(this, 8, 8, textureX, textureY);
		headModel[0].addBox(-6, -5, -1.5f, 2, 3, 3, 0f);
		headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[1] = new ModelRendererTurbo(this, 27, 7, textureX, textureY);
		headModel[1].addBox(4, -9, -0.5f, 1, 4, 1, 0f);
		headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[2].addBox(-4, -9, -0.5f, 8, 1, 1, 0f);
		headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[3] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		headModel[3].addBox(0, 0, 0, 1, 1, 6, 0f);
		headModel[3].setRotationPoint(4.5f, -2.5f, -6.5f);
		headModel[3].rotateAngleX = 0.17453292f;

		headModel[4] = new ModelRendererTurbo(this, 27, 0, textureX, textureY);
		headModel[4].addBox(0, 0, 0, 1, 1, 1, 0f);
		headModel[4].setRotationPoint(3.5f, -2.5f, -6.5f);
		headModel[4].rotateAngleX = 0.17453292f;

		headModel[5] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		headModel[5].addBox(4, -5, -1.5f, 2, 3, 3, 0f);
		headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[6] = new ModelRendererTurbo(this, 22, 0, textureX, textureY);
		headModel[6].addBox(-5, -9, -0.5f, 1, 4, 1, 0f);
		headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);

		cacheRotations();
	}

}
