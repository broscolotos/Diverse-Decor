//FMT-Marker DFM-1.0
//Creator: broscolotos

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelBaseballHat extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 64;

	public ModelBaseballHat(){
		headModel = new ModelRendererTurbo[7];
		//
		headModel[0] = new ModelRendererTurbo(this, 34, 0, textureX, textureY);
		headModel[0].addShapeBox(-4, -6, -9, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[1] = new ModelRendererTurbo(this, 0, 41, textureX, textureY);
		headModel[1].addShapeBox(-4, -10, -4, 8, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[2] = new ModelRendererTurbo(this, 23, 29, textureX, textureY);
		headModel[2].addShapeBox(-3, -9, -5, 6, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[3] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		headModel[3].addShapeBox(-5, -9, -3, 10, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[4] = new ModelRendererTurbo(this, 27, 16, textureX, textureY);
		headModel[4].addShapeBox(-4, -8, -5, 8, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[5] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		headModel[5].addShapeBox(-5, -8, -4, 10, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[6].addShapeBox(-5, -6, -8, 10, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);

		cacheRotations();
	}

}
