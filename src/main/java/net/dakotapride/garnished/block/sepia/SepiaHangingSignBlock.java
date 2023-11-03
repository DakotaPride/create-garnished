package net.dakotapride.garnished.block.sepia;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;

import net.dakotapride.garnished.CreateGarnishedClient;

public class SepiaHangingSignBlock extends TerraformHangingSignBlock {
    public SepiaHangingSignBlock(Properties properties) {
        super(CreateGarnishedClient.hangingSignResourceLocation(CreateGarnishedClient.sepia),
				CreateGarnishedClient.hangingSignGUIResourceLocation(CreateGarnishedClient.sepia), properties);
    }

}
