package net.dakotapride.garnished.registry;

import com.tterrag.registrate.util.entry.RegistryEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.enchantment.RavagingEnchantment;
import net.dakotapride.garnished.enchantment.SalvagingEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class GarnishedEnchantments {

	public static final RegistryEntry<SalvagingEnchantment> SALVAGING = CreateGarnished.registrate()
			.object("salvaging")
			.enchantment(EnchantmentCategory.DIGGER, SalvagingEnchantment::new)
			.addSlots(EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND)
			.rarity(Enchantment.Rarity.UNCOMMON)
			.register();

	public static final RegistryEntry<RavagingEnchantment> RAVAGING = CreateGarnished.registrate()
			.object("ravaging")
			.enchantment(EnchantmentCategory.DIGGER, RavagingEnchantment::new)
			.addSlots(EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND)
			.rarity(Enchantment.Rarity.UNCOMMON)
			.register();

	public static void setRegister() {}

}
