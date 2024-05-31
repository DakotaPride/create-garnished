package net.dakotapride.garnished.block.sepia;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.resources.ResourceLocation;

public class SepiaHangingSignBlock extends TerraformHangingSignBlock {
    public SepiaHangingSignBlock(Properties properties) {
		super(new ResourceLocation(CreateGarnished.ID, "entity/signs/hanging/sepia"),
				new ResourceLocation(CreateGarnished.ID, "textures/gui/hanging_signs/sepia"), properties);
    }

}
