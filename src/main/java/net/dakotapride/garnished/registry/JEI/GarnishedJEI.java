package net.dakotapride.garnished.registry.JEI;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.AllItems;
import com.simibubi.create.compat.jei.category.CreateRecipeCategory;
import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;

import com.tterrag.registrate.fabric.SimpleFlowableFluid;
import com.tterrag.registrate.util.entry.FluidEntry;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IIngredientManager;
import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.recipe.BlackDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.BrownDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.CyanDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.FreezingFanRecipe;
import net.dakotapride.garnished.recipe.GrayDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.LightBlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.LightGrayDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.LimeDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.MagentaDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.OrangeDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.PinkDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.PurpleDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.WhiteDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.YellowDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.dakotapride.garnished.registry.GarnishedRecipeTypes;
import net.dakotapride.garnished.registry.JEI.add.RecipeCategoryBuilder;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;

// @JeiPlugin Annotation is for forge so check mod.json for the entrypoint
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
@JeiPlugin
public class GarnishedJEI implements IModPlugin {
	private static final ResourceLocation ID = CreateGarnished.asResource("jei_plugin");

	protected final List<CreateRecipeCategory<?>> allCategories = new ArrayList<>();
	protected IIngredientManager ingredientManager;

	@Override
	public ResourceLocation getPluginUid() {
		return ID;
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		loadCategories();
		registration.addRecipeCategories(allCategories.toArray(IRecipeCategory[]::new));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		ingredientManager = registration.getIngredientManager();
		allCategories.forEach(c -> c.registerRecipes(registration));

		// fabric: hide flowing fluids
		// registration.getIngredientManager().removeIngredientsAtRuntime(
		//				FabricTypes.FLUID_STACK,
		//				List.of(
		//						new JeiFluidIngredient(GarnishedFluids.GARNISH.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.APPLE_CIDER.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.PEANUT_OIL.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.CASHEW_MIXTURE.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.MASTIC_RESIN.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.RED_MASTIC_RESIN.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.ORANGE_MASTIC_RESIN.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.YELLOW_MASTIC_RESIN.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.GREEN_MASTIC_RESIN.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.BLUE_MASTIC_RESIN.get().getFlowing(), 1),
		//						new JeiFluidIngredient(GarnishedFluids.PURPLE_MASTIC_RESIN.get().getFlowing(), 1)
		//				)
		//		);

		registration.addIngredientInfo(new ItemStack(GarnishedItems.ENFLAMED_MANDIBLE.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.enflamed_mandible.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.GHAST_TENDRIL.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.ghast_tendril.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.MOLTEN_REMNANT.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.molten_remnant.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.RAW_POLAR_BEAR_MEAT.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.polar_bear_meat.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.POLAR_BEAR_HIDE.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.polar_bear_hide.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.NUMBING_PARCHMENT.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.stray_parchment.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.RAW_TENEBROUS_MEAT.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.tenebrous_meat.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.TUSK.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.tusk.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.IRATE_TUSK.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.irate_tusk.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.DIMMED_SCALE.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.ender_scale.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.PRELIMINARY_NUCLEUS.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.endermite_heart.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.MEAT_SCRAPS.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.ravager_meat.information"));
		registration.addIngredientInfo(new ItemStack(GarnishedItems.VEX_WING.get()), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.garnished.vex_wing.information"));
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		allCategories.forEach(c -> c.registerCatalysts(registration));
	}

	private static <T extends Recipe<?>> RecipeCategoryBuilder<T> builder(Class<T> cls) {
		return new RecipeCategoryBuilder<>(CreateGarnished.ID, cls);
	}

	private void loadCategories() {
		allCategories.clear();
		allCategories.add(
				builder(FreezingFanRecipe.class).addTypedRecipes(GarnishedRecipeTypes.FREEZING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.fan_freezing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), Items.POWDER_SNOW_BUCKET)
						.emptyBackground(178, 72)
						.build("fan_freezing", FreezingFanCategory::new));
		allCategories.add(
				builder(RedDyeBlowingFanRecipe.class).addTypedRecipes(GarnishedRecipeTypes.RED_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.red_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.RED_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("red_dye_blowing", RedDyeBlowingFanCategory::new));
		allCategories.add(
				builder(OrangeDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.ORANGE_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.orange_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.ORANGE_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("orange_dye_blowing", OrangeDyeBlowingFanCategory::new));
		allCategories.add(
				builder(YellowDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.YELLOW_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.yellow_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.YELLOW_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("yellow_dye_blowing", YellowDyeBlowingFanCategory::new));
		allCategories.add(
				builder(GreenDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.GREEN_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.green_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.GREEN_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("green_dye_blowing", GreenDyeBlowingFanCategory::new));
		allCategories.add(
				builder(LimeDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.LIME_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.lime_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.LIME_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("lime_dye_blowing", LimeDyeBlowingFanCategory::new));
		allCategories.add(
				builder(BlueDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.BLUE_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.blue_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.BLUE_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("blue_dye_blowing", BlueDyeBlowingFanCategory::new));
		allCategories.add(
				builder(LightBlueDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.LIGHT_BLUE_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.light_blue_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.LIGHT_BLUE_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("light_blue_dye_blowing", LightBlueDyeBlowingFanCategory::new));
		allCategories.add(
				builder(CyanDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.CYAN_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.cyan_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.CYAN_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("cyan_dye_blowing", CyanDyeBlowingFanCategory::new));
		allCategories.add(
				builder(PurpleDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.PURPLE_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.purple_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.PURPLE_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("purple_dye_blowing", PurpleDyeBlowingFanCategory::new));
		allCategories.add(
				builder(MagentaDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.MAGENTA_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.magenta_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.MAGENTA_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("magenta_dye_blowing", MagentaDyeBlowingFanCategory::new));
		allCategories.add(
				builder(PinkDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.PINK_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.pink_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.PINK_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("pink_dye_blowing", PinkDyeBlowingFanCategory::new));
		allCategories.add(
				builder(BlackDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.BLACK_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.black_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.BLACK_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("black_dye_blowing", BlackDyeBlowingFanCategory::new));
		allCategories.add(
				builder(GrayDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.GRAY_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.gray_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.GRAY_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("gray_dye_blowing", GrayDyeBlowingFanCategory::new));
		allCategories.add(
				builder(LightGrayDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.LIGHT_GRAY_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.light_gray_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.LIGHT_GRAY_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("light_gray_dye_blowing", LightGrayDyeBlowingFanCategory::new));
		allCategories.add(
				builder(WhiteDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.WHITE_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.white_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.WHITE_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("white_dye_blowing", WhiteDyeBlowingFanCategory::new));
		allCategories.add(
				builder(BrownDyeBlowingFanRecipe.class)
						.addTypedRecipes(GarnishedRecipeTypes.BROWN_DYE_BLOWING::getType)
						.catalystStack(ProcessingViaFanCategory.getFan("garnished.brown_dye_blowing"))
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.BROWN_MASTIC_RESIN.getBucket().get())
						.emptyBackground(178, 72)
						.build("brown_dye_blowing", BrownDyeBlowingFanCategory::new));
	}
}
