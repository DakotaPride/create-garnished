package net.dakotapride.garnished.block.sepia;

import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.resources.ResourceLocation;

public class SepiaWallSignBlock extends TerraformWallSignBlock {
    public SepiaWallSignBlock(Properties properties) {
		super(new ResourceLocation(CreateGarnished.ID, "entity/signs/sepia"), properties);
    }

}
