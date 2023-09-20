package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class GarnishedTags {

	public static TagKey<Item> NUTS_TAG = itemTag("nuts");

	private static TagKey<Item> itemTag(String name) {
		return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CreateGarnished.ID, name));
	}

	public static void setRegister() {}

}
