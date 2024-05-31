package net.dakotapride.garnished.block.sepia;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.resources.ResourceLocation;

public class SepiaSignBlock extends TerraformSignBlock {
	public SepiaSignBlock(Properties properties) {
		super(new ResourceLocation(CreateGarnished.ID, "entity/signs/sepia"), properties);
	}
}
