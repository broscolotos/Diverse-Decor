//FMT-Marker DFM-1.0

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelTrafficConeHat extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 16;

	public ModelTrafficConeHat(){
		headModel = new ModelRendererTurbo[2];
		//
		headModel[0] = new ModelRendererTurbo("box1", 0, 0, textureX, textureY);
		headModel[0].addShapeBox(-5f, -9, -5f, 10, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[1] = new ModelRendererTurbo("box2", 41, 0, textureX, textureY);
		headModel[1].addShapeBox(-1f, -20, -1f, 2, 11, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3, 0, 3);
		headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);

		cacheRotations();
	}

}
