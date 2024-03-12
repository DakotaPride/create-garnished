package net.dakotapride.garnished.registry.JEI;

import static com.simibubi.create.compat.jei.CreateJEI.consumeTypedRecipes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.AllItems;
import com.simibubi.create.compat.jei.BlueprintTransferHandler;
import com.simibubi.create.compat.jei.CreateJEI;
import com.simibubi.create.compat.jei.DoubleItemIcon;
import com.simibubi.create.compat.jei.EmptyBackground;
import com.simibubi.create.compat.jei.ItemIcon;
import com.simibubi.create.compat.jei.category.CreateRecipeCategory;
import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;
import com.simibubi.create.foundation.recipe.IRecipeTypeInfo;
import com.simibubi.create.foundation.utility.Lang;
import com.simibubi.create.infrastructure.config.AllConfigs;
import com.simibubi.create.infrastructure.config.CRecipes;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeTransferRegistration;
import mezz.jei.api.runtime.IIngredientManager;
import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.FreezingFanRecipe;
import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.OrangeDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.PurpleDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.YellowDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedRecipeTypes;
import net.dakotapride.garnished.registry.JEI.add.RecipeCategoryBuilder;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.ItemLike;

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
						.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.RED_MASTIC_RESIN.get().getBucket())
						.emptyBackground(178, 72)
						.build("red_dye_blowing", RedDyeBlowingFanCategory::new));
		allCategories.add(builder(OrangeDyeBlowingFanRecipe.class)
				.addTypedRecipes(GarnishedRecipeTypes.ORANGE_DYE_BLOWING::getType)
				.catalystStack(ProcessingViaFanCategory.getFan("garnished.orange_dye_blowing"))
				.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.ORANGE_MASTIC_RESIN.get().getBucket())
				.emptyBackground(178, 72)
				.build("orange_dye_blowing", OrangeDyeBlowingFanCategory::new));
		allCategories.add(builder(YellowDyeBlowingFanRecipe.class)
				.addTypedRecipes(GarnishedRecipeTypes.YELLOW_DYE_BLOWING::getType)
				.catalystStack(ProcessingViaFanCategory.getFan("garnished.yellow_dye_blowing"))
				.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.YELLOW_MASTIC_RESIN.get().getBucket())
				.emptyBackground(178, 72)
				.build("yellow_dye_blowing", YellowDyeBlowingFanCategory::new));
		allCategories.add(builder(GreenDyeBlowingFanRecipe.class)
				.addTypedRecipes(GarnishedRecipeTypes.GREEN_DYE_BLOWING::getType)
				.catalystStack(ProcessingViaFanCategory.getFan("garnished.green_dye_blowing"))
				.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.GREEN_MASTIC_RESIN.get().getBucket())
				.emptyBackground(178, 72)
				.build("green_dye_blowing", GreenDyeBlowingFanCategory::new));
		allCategories.add(builder(BlueDyeBlowingFanRecipe.class)
				.addTypedRecipes(GarnishedRecipeTypes.BLUE_DYE_BLOWING::getType)
				.catalystStack(ProcessingViaFanCategory.getFan("garnished.blue_dye_blowing"))
				.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.BLUE_MASTIC_RESIN.get().getBucket())
				.emptyBackground(178, 72)
				.build("blue_dye_blowing", BlueDyeBlowingFanCategory::new));
		allCategories.add(builder(PurpleDyeBlowingFanRecipe.class)
				.addTypedRecipes(GarnishedRecipeTypes.PURPLE_DYE_BLOWING::getType)
				.catalystStack(ProcessingViaFanCategory.getFan("garnished.purple_dye_blowing"))
				.doubleItemIcon(AllItems.PROPELLER.get(), GarnishedFluids.PURPLE_MASTIC_RESIN.get().getBucket())
				.emptyBackground(178, 72)
				.build("purple_dye_blowing", PurpleDyeBlowingFanCategory::new));
	}
}
