//FMT-Marker DFM-1.0
//Creator: sokejoke

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelBearHat extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 32;

	public ModelBearHat(){
		headModel = new ModelRendererTurbo[10];
		//
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(-5, -10, -5, 10, 5, 10, 0f);
		headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY);
		headModel[1].addBox(-3, -7, -4, 4, 0, 8, 0f);
		headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
		headModel[1].rotateAngleZ = -0.7853982f;

		headModel[2] = new ModelRendererTurbo(this, 55, 2, textureX, textureY);
		headModel[2].addBox(-8, -2.8f, -1, 2, 2, 2, 0f);
		headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[3] = new ModelRendererTurbo(this, 31, 4, textureX, textureY);
		headModel[3].addBox(0, 0, 0, 2, 2, 1, 0f);
		headModel[3].setRotationPoint(-6.5f, -11.5f, -1.0f);

		headModel[4] = new ModelRendererTurbo(this, 48, 0, textureX, textureY);
		headModel[4].addBox(-1.5f, -8, -6, 3, 2, 1, 0f);
		headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[5] = new ModelRendererTurbo(this, 31, 0, textureX, textureY);
		headModel[5].addBox(-1, -7, -4, 4, 0, 8, 0f);
		headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
		headModel[5].rotateAngleZ = 0.7853982f;

		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[6].addBox(6, -2.8f, -1, 2, 2, 2, 0f);
		headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[7] = new ModelRendererTurbo(this, 31, 0, textureX, textureY);
		headModel[7].addBox(0, 0, 0, 2, 2, 1, 0f);
		headModel[7].setRotationPoint(4.5f, -11.5f, -1.0f);

		headModel[8] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		headModel[8].addBox(-2.5f, -9, -5.5f, 1, 1, 1, 0f);
		headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[9] = new ModelRendererTurbo(this, 48, 4, textureX, textureY);
		headModel[9].addBox(1.5f, -9, -5.5f, 1, 1, 1, 0f);
		headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);

		cacheRotations();
	}

}
