/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.greenhouse;

import forestry.api.climate.IClimateInfo;
import net.minecraft.block.state.IBlockState;

public interface ITerrainRecipe {
	
	boolean matches(IBlockState blockState);
	
	IBlockState getResult();
	
	IClimateInfo getMinClimate();
	
	IClimateInfo getMaxClimate();
	
	float getChance();

}