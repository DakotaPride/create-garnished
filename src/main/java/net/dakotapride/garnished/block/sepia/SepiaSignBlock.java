package net.dakotapride.garnished.block.sepia;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;

import net.dakotapride.garnished.CreateGarnishedClient;

public class SepiaSignBlock extends TerraformSignBlock {
	public SepiaSignBlock(Properties settings) {
		super(CreateGarnishedClient.signResourceLocation(CreateGarnishedClient.sepia), settings);
	}
}
