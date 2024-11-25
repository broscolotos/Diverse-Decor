//FMT-Marker DFM-1.0

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCowboyHat extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 64;

	public ModelCowboyHat(){
		headModel = new ModelRendererTurbo[8];
		//
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(-5.5f, -6, -5.5f, 11, 1, 11, 0f);
		headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[1] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		headModel[1].addBox(-4.5f, -11, -4.5f, 9, 4, 9, 0f);
		headModel[1].setRotationPoint(0.0f, 1.0f, 0.0f);

		headModel[2] = new ModelRendererTurbo(this, 37, 15, textureX, textureY);
		headModel[2].addBox(-3, -1, -5, 3, 1, 10, 0f);
		headModel[2].setRotationPoint(-5.5f, -5.0f, 0.0f);
		headModel[2].rotateAngleZ = -0.6632251f;

		headModel[3] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);
		headModel[3].addBox(0, 0, 0, 9, 1, 1, 0f);
		headModel[3].setRotationPoint(-4.5f, -6.0f, -6.5f);

		headModel[4] = new ModelRendererTurbo(this, 35, 3, textureX, textureY);
		headModel[4].addBox(0, -1, -5, 3, 1, 10, 0f);
		headModel[4].setRotationPoint(5.5f, -5.0f, 0.0f);
		headModel[4].rotateAngleZ = 0.6632251f;

		headModel[5] = new ModelRendererTurbo(this, 32, 27, textureX, textureY);
		headModel[5].addBox(-4, -1, -5, 1, 1, 8, 0f);
		headModel[5].setRotationPoint(-5.5f, -5.0f, 1.0f);
		headModel[5].rotateAngleZ = -0.6632251f;

		headModel[6] = new ModelRendererTurbo(this, 13, 27, textureX, textureY);
		headModel[6].addBox(3, -1, -4, 1, 1, 8, 0f);
		headModel[6].setRotationPoint(5.5f, -5.0f, 0.0f);
		headModel[6].rotateAngleZ = 0.6632251f;

		headModel[7] = new ModelRendererTurbo(this, 34, 0, textureX, textureY);
		headModel[7].addBox(0, 0, 0, 9, 1, 1, 0f);
		headModel[7].setRotationPoint(-4.5f, -6.0f, 5.5f);

		flipRotations();
		cacheRotations();
	}

}
