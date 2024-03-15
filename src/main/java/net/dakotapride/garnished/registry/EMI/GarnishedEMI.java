package net.dakotapride.garnished.registry.EMI;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.simibubi.create.compat.emi.GhostIngredientHandler;
import com.simibubi.create.content.equipment.blueprint.BlueprintScreen;
import com.simibubi.create.content.logistics.filter.AttributeFilterScreen;
import com.simibubi.create.content.logistics.filter.FilterScreen;
import com.simibubi.create.content.redstone.link.controller.LinkedControllerScreen;
import com.simibubi.create.content.trains.schedule.ScheduleScreen;

import net.dakotapride.garnished.registry.GarnishedBlocks;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.AllFluids;
import com.simibubi.create.AllItems;
import com.simibubi.create.AllMenuTypes;
import com.simibubi.create.compat.emi.BlueprintTransferHandler;
import com.simibubi.create.compat.emi.DoubleItemIcon;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.simibubi.create.foundation.gui.menu.AbstractSimiContainerScreen;
import com.simibubi.create.foundation.item.TagDependentIngredientItem;
import com.tterrag.registrate.fabric.SimpleFlowableFluid;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.recipe.EmiWorldInteractionRecipe;
import dev.emi.emi.api.render.EmiRenderable;
import dev.emi.emi.api.stack.Comparison;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.Bounds;
import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedRecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

public class GarnishedEMI implements EmiPlugin {
	public static final Map<ResourceLocation, EmiRecipeCategory> ALL = new LinkedHashMap<>();

	public static final EmiRecipeCategory FAN_FREEZING = register("fan_freezing", DoubleItemIcon.of(AllItems.PROPELLER.get(), Items.POWDER_SNOW_BUCKET));
	public static final EmiRecipeCategory FAN_RED_DYEING = register("fan_red_dyeing", DoubleItemIcon.of(AllItems.PROPELLER.get(), GarnishedFluids.RED_MASTIC_RESIN.get().getBucket()));
	public static final EmiRecipeCategory FAN_ORANGE_DYEING = register("fan_orange_dyeing", DoubleItemIcon.of(AllItems.PROPELLER.get(), GarnishedFluids.ORANGE_MASTIC_RESIN.get().getBucket()));
	public static final EmiRecipeCategory FAN_YELLOW_DYEING = register("fan_yellow_dyeing", DoubleItemIcon.of(AllItems.PROPELLER.get(), GarnishedFluids.YELLOW_MASTIC_RESIN.get().getBucket()));
	public static final EmiRecipeCategory FAN_GREEN_DYEING = register("fan_green_dyeing", DoubleItemIcon.of(AllItems.PROPELLER.get(), GarnishedFluids.GREEN_MASTIC_RESIN.get().getBucket()));
	public static final EmiRecipeCategory FAN_BLUE_DYEING = register("fan_blue_dyeing", DoubleItemIcon.of(AllItems.PROPELLER.get(), GarnishedFluids.BLUE_MASTIC_RESIN.get().getBucket()));
	public static final EmiRecipeCategory FAN_PURPLE_DYEING = register("fan_purple_dyeing", DoubleItemIcon.of(AllItems.PROPELLER.get(), GarnishedFluids.PURPLE_MASTIC_RESIN.get().getBucket()));

	private static EmiRecipeCategory register(String name, EmiRenderable icon) {
		ResourceLocation id = CreateGarnished.asResource(name);
		EmiRecipeCategory category = new EmiRecipeCategory(id, icon);
		ALL.put(id, category);
		return category;
	}

	@Override
	public void register(EmiRegistry registry) {
		registry.removeEmiStacks(s -> {
			Object key = s.getKey();
			if (key instanceof TagDependentIngredientItem tagDependent && tagDependent.shouldHide())
				return true;
			return key instanceof VirtualFluid;
		});

		registry.addGenericExclusionArea((screen, consumer) -> {
			if (screen instanceof AbstractSimiContainerScreen<?> simi) {
				simi.getExtraAreas().forEach(r -> consumer.accept(new Bounds(r.getX(), r.getY(), r.getWidth(), r.getHeight())));
			}
		});

		registry.addRecipeHandler(AllMenuTypes.CRAFTING_BLUEPRINT.get(), new BlueprintTransferHandler());

		// registerGeneratedRecipes(registry);

		registry.setDefaultComparison(AllFluids.POTION.get().getSource(), c -> Comparison.compareNbt());

		ALL.forEach((id, category) -> registry.addCategory(category));


		registry.addWorkstation(FAN_FREEZING, FanEmiRecipe.getFan("fan_freezing"));
		registry.addWorkstation(FAN_RED_DYEING, FanEmiRecipe.getFan("fan_red_dyeing"));
		registry.addWorkstation(FAN_ORANGE_DYEING, FanEmiRecipe.getFan("fan_orange_dyeing"));
		registry.addWorkstation(FAN_YELLOW_DYEING, FanEmiRecipe.getFan("fan_yellow_dyeing"));
		registry.addWorkstation(FAN_GREEN_DYEING, FanEmiRecipe.getFan("fan_green_dyeing"));
		registry.addWorkstation(FAN_BLUE_DYEING, FanEmiRecipe.getFan("fan_blue_dyeing"));
		registry.addWorkstation(FAN_PURPLE_DYEING, FanEmiRecipe.getFan("fan_purple_dyeing"));

		// RecipeManager manager = registry.getRecipeManager();

		addAll(registry, GarnishedRecipeTypes.FREEZING, FanFreezingEmiRecipe::new);
		addAll(registry, GarnishedRecipeTypes.RED_DYE_BLOWING, FanRedDyeingEmiRecipe::new);
		addAll(registry, GarnishedRecipeTypes.ORANGE_DYE_BLOWING, FanOrangeDyeingEmiRecipe::new);
		addAll(registry, GarnishedRecipeTypes.YELLOW_DYE_BLOWING, FanYellowDyeingEmiRecipe::new);
		addAll(registry, GarnishedRecipeTypes.GREEN_DYE_BLOWING, FanGreenDyeingEmiRecipe::new);
		addAll(registry, GarnishedRecipeTypes.BLUE_DYE_BLOWING, FanBlueDyeingEmiRecipe::new);
		addAll(registry, GarnishedRecipeTypes.PURPLE_DYE_BLOWING, FanPurpleDyeingEmiRecipe::new);

		// In World Interaction recipes
		addFluidInteractionRecipe(registry, "garnished/calcite", GarnishedFluids.GARNISH.get(),
				Fluids.LAVA, AllPaletteStoneTypes.CALCITE.getBaseBlock().get());
		addFluidInteractionRecipe(registry, "garnished/ochrum", GarnishedFluids.APPLE_CIDER.get(),
				Fluids.LAVA, AllPaletteStoneTypes.OCHRUM.getBaseBlock().get());
		addFluidInteractionRecipe(registry, "garnished/dripstone", GarnishedFluids.PEANUT_OIL.get(),
				Fluids.LAVA, AllPaletteStoneTypes.DRIPSTONE.getBaseBlock().get());
		addFluidInteractionRecipe(registry, "garnished/end_stone", GarnishedFluids.CASHEW_MIXTURE.get(),
				Fluids.LAVA, Blocks.END_STONE);
		addFluidInteractionRecipe(registry, "garnished/tuff", GarnishedFluids.MASTIC_RESIN.get(),
				Fluids.LAVA, AllPaletteStoneTypes.TUFF.getBaseBlock().get());
		addFluidInteractionRecipe(registry, "garnished/crimsite", GarnishedFluids.RED_MASTIC_RESIN.get(),
				Fluids.LAVA, AllPaletteStoneTypes.CRIMSITE.getBaseBlock().get());
		addFluidInteractionRecipe(registry, "garnished/ritualistic_stone", GarnishedFluids.ORANGE_MASTIC_RESIN.get(),
				Fluids.LAVA, GarnishedBlocks.RITUALISTIC_STONE.get());
		addFluidInteractionRecipe(registry, "garnished/carnotite", GarnishedFluids.YELLOW_MASTIC_RESIN.get(),
				Fluids.LAVA, GarnishedBlocks.CARNOTITE.get());
		addFluidInteractionRecipe(registry, "garnished/veridium", GarnishedFluids.GREEN_MASTIC_RESIN.get(),
				Fluids.LAVA, AllPaletteStoneTypes.VERIDIUM.getBaseBlock().get());
		addFluidInteractionRecipe(registry, "garnished/asurine", GarnishedFluids.BLUE_MASTIC_RESIN.get(),
				Fluids.LAVA, AllPaletteStoneTypes.ASURINE.getBaseBlock().get());
		addFluidInteractionRecipe(registry, "garnished/abyssal_stone", GarnishedFluids.PURPLE_MASTIC_RESIN.get(),
				Fluids.LAVA, GarnishedBlocks.ABYSSAL_STONE.get());

		// Introspective recipes based on present stacks need to make sure
		// all stacks are populated by other plugins
		// registry.addDeferredRecipes(this::addDeferredRecipes);
	}

	private void addFluidInteractionRecipe(@NotNull EmiRegistry registry, String outputId, Fluid left, Fluid right, Block output) {
		// EmiStack doesnt accept flowing fluids, must always be a source
		if (left instanceof SimpleFlowableFluid.Flowing flowing)
			left = flowing.getSource();
		if (right instanceof SimpleFlowableFluid.Flowing flowing)
			right = flowing.getSource();

		// fabric: 81000 droplets = 1000 mb
		registry.addRecipe(EmiWorldInteractionRecipe.builder()
				.id(CreateGarnished.asResource("/world/fluid_interaction/" + outputId))
				.leftInput(EmiStack.of(left, 81000))
				.rightInput(EmiStack.of(right, 81000), false)
				.output(EmiStack.of(output))
				.build()
		);
	}

	@SuppressWarnings("unchecked")
	private <T extends Recipe<?>> void addAll(EmiRegistry registry, GarnishedRecipeTypes type, Function<T, EmiRecipe> constructor) {
		for (T recipe : (List<T>) registry.getRecipeManager().getAllRecipesFor(type.getType())) {
			registry.addRecipe(constructor.apply(recipe));
		}
	}
}
