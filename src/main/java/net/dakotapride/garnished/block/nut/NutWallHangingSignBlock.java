package net.dakotapride.garnished.block.nut;

import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.resources.ResourceLocation;

public class NutWallHangingSignBlock extends TerraformWallHangingSignBlock {
    public NutWallHangingSignBlock(Properties properties) {
		super(new ResourceLocation(CreateGarnished.ID, "entity/signs/hanging/nut"),
				new ResourceLocation(CreateGarnished.ID, "textures/gui/hanging_signs/nut"), properties);
    }

}
