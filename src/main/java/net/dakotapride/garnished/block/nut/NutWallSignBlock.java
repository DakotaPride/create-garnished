package net.dakotapride.garnished.block.nut;

import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;

import net.dakotapride.garnished.CreateGarnishedClient;

public class NutWallSignBlock extends TerraformWallSignBlock {
    public NutWallSignBlock(Properties properties) {
		super(CreateGarnishedClient.signResourceLocation(CreateGarnishedClient.nut), properties);
    }

}
