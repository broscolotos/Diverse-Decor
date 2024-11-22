//FMT-Marker DFM-1.0
//Creator: sokejoke

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelStrawHat extends ModelCustomArmor {

	private int textureX = 128;
	private int textureY = 32;

	public ModelStrawHat(){
		headModel = new ModelRendererTurbo[11];
		//
		headModel[0] = new ModelRendererTurbo(this, 61, 0, textureX, textureY);
		headModel[0].addBox(0, -11, -3, 1, 1, 0, 0f);
		headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[1] = new ModelRendererTurbo(this, 58, 0, textureX, textureY);
		headModel[1].addBox(-3, -11, -3, 0, 1, 1, 0f);
		headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[2] = new ModelRendererTurbo(this, 55, 0, textureX, textureY);
		headModel[2].addBox(-3, -11, 3, 1, 1, 0, 0f);
		headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[3] = new ModelRendererTurbo(this, 15, 0, textureX, textureY);
		headModel[3].addBox(-6, -9, 2, 1, 1, 0, 0f);
		headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[4] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);
		headModel[4].addBox(-2, -9, -6, 0, 1, 1, 0f);
		headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[5] = new ModelRendererTurbo(this, 9, 0, textureX, textureY);
		headModel[5].addBox(5, -8, -1, 1, 1, 0, 0f);
		headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[6] = new ModelRendererTurbo(this, 6, 0, textureX, textureY);
		headModel[6].addBox(-2, -9, 5, 0, 1, 1, 0f);
		headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[7] = new ModelRendererTurbo(this, 3, 0, textureX, textureY);
		headModel[7].addBox(3, -10, 5, 0, 1, 1, 0f);
		headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[8] = new ModelRendererTurbo(this, 55, 0, textureX, textureY);
		headModel[8].addBox(-5, -10, -5, 10, 4, 10, 0f);
		headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[9].addBox(-9, -6, -9, 18, 0, 18, 0f);
		headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[10].addBox(4, -11, 0, 0, 1, 1, 0f);
		headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);

		cacheRotations();
	}

}
