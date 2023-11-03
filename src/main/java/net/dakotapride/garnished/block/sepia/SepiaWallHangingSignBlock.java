package net.dakotapride.garnished.block.sepia;

import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;

import net.dakotapride.garnished.CreateGarnishedClient;

public class SepiaWallHangingSignBlock extends TerraformWallHangingSignBlock {
    public SepiaWallHangingSignBlock(Properties properties) {
		super(CreateGarnishedClient.hangingSignResourceLocation(CreateGarnishedClient.sepia),
				CreateGarnishedClient.hangingSignGUIResourceLocation(CreateGarnishedClient.sepia), properties);
    }

}
