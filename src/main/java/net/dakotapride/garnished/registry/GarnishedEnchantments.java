package net.dakotapride.garnished.registry;

import com.tterrag.registrate.util.entry.RegistryEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.enchantment.CurseOfTheLeechEnchantment;
import net.dakotapride.garnished.enchantment.QuickStepEnchantment;
import net.dakotapride.garnished.enchantment.RavagingEnchantment;
import net.dakotapride.garnished.enchantment.RejuvenateEnchantment;
import net.dakotapride.garnished.enchantment.SalvagingEnchantment;
import net.dakotapride.garnished.enchantment.StrikingEnchantment;
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

	public static final RegistryEntry<StrikingEnchantment> STRIKING = CreateGarnished.registrate()
			.object("striking")
			.enchantment(EnchantmentCategory.WEAPON, StrikingEnchantment::new)
			.addSlots(EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND)
			.rarity(Enchantment.Rarity.RARE)
			.register();

	public static final RegistryEntry<QuickStepEnchantment> QUICK_STEP = CreateGarnished.registrate()
			.object("quick_step")
			.enchantment(EnchantmentCategory.WEAPON, QuickStepEnchantment::new)
			.addSlots(EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND)
			.rarity(Enchantment.Rarity.VERY_RARE)
			.register();

	public static final RegistryEntry<RejuvenateEnchantment> REJUVENATE = CreateGarnished.registrate()
			.object("rejuvenate")
			.enchantment(EnchantmentCategory.WEAPON, RejuvenateEnchantment::new)
			.addSlots(EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND)
			.rarity(Enchantment.Rarity.VERY_RARE)
			.register();

	public static final RegistryEntry<CurseOfTheLeechEnchantment> LEECHING_CURSE = CreateGarnished.registrate()
			.object("leeching_curse")
			.enchantment(EnchantmentCategory.WEAPON, CurseOfTheLeechEnchantment::new)
			.addSlots(EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND)
			.rarity(Enchantment.Rarity.VERY_RARE)
			.register();

	public static void setRegister() {}

}
