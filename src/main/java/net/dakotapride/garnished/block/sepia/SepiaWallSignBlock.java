package net.dakotapride.garnished.block.sepia;

import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;

import net.dakotapride.garnished.CreateGarnishedClient;

public class SepiaWallSignBlock extends TerraformWallSignBlock {
    public SepiaWallSignBlock(Properties properties) {
		super(CreateGarnishedClient.signResourceLocation(CreateGarnishedClient.sepia), properties);
    }

}
