package net.dakotapride.garnished.block.sepia;

import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.resources.ResourceLocation;

public class SepiaWallHangingSignBlock extends TerraformWallHangingSignBlock {
    public SepiaWallHangingSignBlock(Properties properties) {
		super(new ResourceLocation(CreateGarnished.ID, "entity/signs/hanging/sepia"),
				new ResourceLocation(CreateGarnished.ID, "textures/gui/hanging_signs/sepia"), properties);
    }

}
