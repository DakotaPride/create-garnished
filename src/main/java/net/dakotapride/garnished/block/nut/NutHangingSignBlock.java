package net.dakotapride.garnished.block.nut;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;

import net.dakotapride.garnished.CreateGarnishedClient;

public class NutHangingSignBlock extends TerraformHangingSignBlock {
    public NutHangingSignBlock(Properties properties) {
        super(CreateGarnishedClient.hangingSignResourceLocation(CreateGarnishedClient.nut),
				CreateGarnishedClient.hangingSignGUIResourceLocation(CreateGarnishedClient.nut), properties);
    }

}
