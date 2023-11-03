package net.dakotapride.garnished.block.nut;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;

import net.dakotapride.garnished.CreateGarnishedClient;

public class NutSignBlock extends TerraformSignBlock {
	public NutSignBlock(Properties settings) {
		super(CreateGarnishedClient.signResourceLocation(CreateGarnishedClient.nut), settings);
	}
}
