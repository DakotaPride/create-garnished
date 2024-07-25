package net.dakotapride.garnished.registry;

import java.util.Optional;
import java.util.function.Supplier;

import net.dakotapride.garnished.recipe.BlackDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.BrownDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.CyanDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.GrayDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.LightBlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.LightGrayDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.LimeDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.MagentaDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.PinkDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.WhiteDyeBlowingFanRecipe;

import org.jetbrains.annotations.Nullable;

import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeSerializer;
import com.simibubi.create.foundation.recipe.IRecipeTypeInfo;

import io.github.fabricators_of_create.porting_lib.util.ShapedRecipeUtil;
import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.FreezingFanRecipe;
import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.OrangeDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.PurpleDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.YellowDyeBlowingFanRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public enum GarnishedRecipeTypes implements IRecipeTypeInfo {
	FREEZING(FreezingFanRecipe::new),
	RED_DYE_BLOWING(RedDyeBlowingFanRecipe::new),
	ORANGE_DYE_BLOWING(OrangeDyeBlowingFanRecipe::new),
	YELLOW_DYE_BLOWING(YellowDyeBlowingFanRecipe::new),
	GREEN_DYE_BLOWING(GreenDyeBlowingFanRecipe::new),
	LIME_DYE_BLOWING(LimeDyeBlowingFanRecipe::new),
	BLUE_DYE_BLOWING(BlueDyeBlowingFanRecipe::new),
	LIGHT_BLUE_DYE_BLOWING(LightBlueDyeBlowingFanRecipe::new),
	CYAN_DYE_BLOWING(CyanDyeBlowingFanRecipe::new),
	PURPLE_DYE_BLOWING(PurpleDyeBlowingFanRecipe::new),
	MAGENTA_DYE_BLOWING(MagentaDyeBlowingFanRecipe::new),
	PINK_DYE_BLOWING(PinkDyeBlowingFanRecipe::new),
	BLACK_DYE_BLOWING(BlackDyeBlowingFanRecipe::new),
	GRAY_DYE_BLOWING(GrayDyeBlowingFanRecipe::new),
	LIGHT_GRAY_DYE_BLOWING(LightGrayDyeBlowingFanRecipe::new),
	WHITE_DYE_BLOWING(WhiteDyeBlowingFanRecipe::new),
	BROWN_DYE_BLOWING(BrownDyeBlowingFanRecipe::new);

	private final ResourceLocation id;
	private final RecipeSerializer<?> serializerObject;
	@Nullable
	private final RecipeType<?> typeObject;
	private final Supplier<RecipeType<?>> type;

	GarnishedRecipeTypes(Supplier<RecipeSerializer<?>> serializerSupplier) {
		String name = CreateGarnished.LANG.asId(name());
		id = CreateGarnished.asResource(name);
		serializerObject = Registry.register(Registry.RECIPE_SERIALIZER, id, serializerSupplier.get());
		typeObject = simpleType(id);
		Registry.register(Registry.RECIPE_TYPE, id, typeObject);
		type = () -> typeObject;
	}

	GarnishedRecipeTypes(ProcessingRecipeBuilder.ProcessingRecipeFactory<?> processingFactory) {
		this(() -> new ProcessingRecipeSerializer<>(processingFactory));
	}

	public static <T extends Recipe<?>> RecipeType<T> simpleType(ResourceLocation id) {
		String stringId = id.toString();
		return new RecipeType<T>() {
			@Override
			public String toString() {
				return stringId;
			}
		};
	}

	public static void register() {
		ShapedRecipeUtil.setCraftingSize(9, 9);
		// fabric: just load the class
	}

	public <C extends Container, T extends Recipe<C>> Optional<T> find(C inv, Level world) {
		return world.getRecipeManager().getRecipeFor(this.getType(), inv, world);
	}

	@Override
	public ResourceLocation getId() {
		return id;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends RecipeSerializer<?>> T getSerializer() {
		return (T) serializerObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends RecipeType<?>> T getType() {
		return (T) type.get();
	}

}
