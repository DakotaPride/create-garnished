package net.dakotapride.garnished.block.nut;

import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;

import net.dakotapride.garnished.CreateGarnishedClient;

public class NutWallHangingSignBlock extends TerraformWallHangingSignBlock {
    public NutWallHangingSignBlock(Properties properties) {
		super(CreateGarnishedClient.hangingSignResourceLocation(CreateGarnishedClient.nut),
				CreateGarnishedClient.hangingSignGUIResourceLocation(CreateGarnishedClient.nut), properties);
    }

}
