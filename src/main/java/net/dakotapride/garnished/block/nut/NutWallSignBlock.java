package net.dakotapride.garnished.block.nut;

import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.resources.ResourceLocation;

public class NutWallSignBlock extends TerraformWallSignBlock {
    public NutWallSignBlock(Properties properties) {
		super(new ResourceLocation(CreateGarnished.ID, "entity/signs/nut"), properties);
    }

}
