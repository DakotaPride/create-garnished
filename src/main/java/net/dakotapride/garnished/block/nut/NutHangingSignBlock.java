package net.dakotapride.garnished.block.nut;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.resources.ResourceLocation;

public class NutHangingSignBlock extends TerraformHangingSignBlock {
    public NutHangingSignBlock(Properties properties) {
        super(new ResourceLocation(CreateGarnished.ID, "entity/signs/hanging/nut"),
				new ResourceLocation(CreateGarnished.ID, "textures/gui/hanging_signs/nut"), properties);
    }

}
