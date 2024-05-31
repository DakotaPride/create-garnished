package net.dakotapride.garnished.block.nut;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.resources.ResourceLocation;

public class NutSignBlock extends TerraformSignBlock {
	public NutSignBlock(Properties properties) {
		super(new ResourceLocation(CreateGarnished.ID, "entity/signs/nut"), properties);
	}
}
