package net.dakotapride.garnished.registry;

import com.google.common.collect.ImmutableList;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.content.fluids.tank.FluidTankBlockEntity;
import com.simibubi.create.content.kinetics.crafter.MechanicalCrafterBlockEntity;
import com.simibubi.create.content.kinetics.deployer.DeployerBlockEntity;
import com.simibubi.create.content.kinetics.millstone.MillstoneBlockEntity;
import com.simibubi.create.content.kinetics.mixer.MechanicalMixerBlockEntity;
import com.simibubi.create.content.kinetics.press.MechanicalPressBlockEntity;
import com.simibubi.create.content.kinetics.press.PressingBehaviour;
import com.simibubi.create.content.processing.basin.BasinBlockEntity;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import com.simibubi.create.foundation.ponder.ElementLink;
import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import com.simibubi.create.foundation.ponder.PonderRegistry;
import com.simibubi.create.foundation.ponder.PonderTag;
import com.simibubi.create.foundation.ponder.SceneBuilder;
import com.simibubi.create.foundation.ponder.SceneBuildingUtil;
import com.simibubi.create.foundation.ponder.element.BeltItemElement;
import com.simibubi.create.foundation.ponder.element.EntityElement;
import com.simibubi.create.foundation.ponder.element.InputWindowElement;
import com.simibubi.create.foundation.ponder.instruction.EmitParticlesInstruction;
import com.simibubi.create.foundation.utility.IntAttached;
import com.simibubi.create.foundation.utility.NBTHelper;
import com.simibubi.create.foundation.utility.Pointing;

import io.github.fabricators_of_create.porting_lib.transfer.TransferUtil;
import io.github.fabricators_of_create.porting_lib.util.FluidStack;
import io.github.fabricators_of_create.porting_lib.util.NBTSerializer;
import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.phys.Vec3;

public class GarnishedPonderIndex {

	static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(CreateGarnished.ID);

	public static void index() {
		// HELPER.forComponents(GarnishedBlocks.DRIED_DULSE_KELP_BLOCK, GarnishedBlocks.DRIED_VERMILION_KELP_BLOCK)
		//         .addStoryBoard("boundless_sea/dried_kelp_blocks", ScenesAndInteractions::driedKelpBlocks);
		HELPER.forComponents(GarnishedBlocks.DULSE_KELP, GarnishedBlocks.VERMILION_KELP,
						GarnishedItems.DRIED_DULSE_KELP, GarnishedItems.DRIED_VERMILION_KELP,
						GarnishedBlocks.DRIED_DULSE_KELP_BLOCK, GarnishedBlocks.DRIED_VERMILION_KELP_BLOCK)
				.addStoryBoard("boundless_sea/kelp_garnished", ScenesAndInteractions::kelpInWaterBlocks)
				.addStoryBoard("boundless_sea/dulse_kelp", ScenesAndInteractions::dulseKelp)
				.addStoryBoard("boundless_sea/vermilion_kelp", ScenesAndInteractions::vermilionKelp);
		HELPER.forComponents(GarnishedItems.MASTIC_RESIN, GarnishedItems.MASTIC_RESIN_RED, GarnishedItems.MASTIC_RESIN_ORANGE,
						GarnishedItems.MASTIC_RESIN_YELLOW, GarnishedItems.MASTIC_RESIN_GREEN, GarnishedItems.MASTIC_RESIN_BLUE, GarnishedItems.MASTIC_RESIN_PURPLE,
						GarnishedItems.MASTIC_PASTE, GarnishedItems.MASTIC_PASTE_RED, GarnishedItems.MASTIC_PASTE_ORANGE,
						GarnishedItems.MASTIC_PASTE_YELLOW, GarnishedItems.MASTIC_PASTE_GREEN, GarnishedItems.MASTIC_PASTE_BLUE, GarnishedItems.MASTIC_PASTE_PURPLE)
				.addStoryBoard("sugarcoated/mastic_resin", ScenesAndInteractions::masticResinRecipe)
				.addStoryBoard("sugarcoated/coloured_mastic_resin", ScenesAndInteractions::colouredMasticResin)
				.addStoryBoard("sugarcoated/mastic_paste", ScenesAndInteractions::masticPaste)
				.addStoryBoard("sugarcoated/mastic_fluid", ScenesAndInteractions::masticFluid)
				.addStoryBoard("sugarcoated/mastic_fluid_interactions_1", ScenesAndInteractions::createStoneInteractions)
				.addStoryBoard("sugarcoated/mastic_fluid_interactions_2", ScenesAndInteractions::vanillaStoneInteractions)
				.addStoryBoard("sugarcoated/mastic_fluid_interactions_3", ScenesAndInteractions::garnishedStoneInteractions);
		// .addStoryBoard("sugarcoated/liquid_mastic_resin_interaction/regular", ScenesAndInteractions::regularLiquidMasticResinInteraction)
		// .addStoryBoard("sugarcoated/liquid_mastic_resin_interaction/red", ScenesAndInteractions::redLiquidMasticResinInteraction)
		// .addStoryBoard("sugarcoated/liquid_mastic_resin_interaction/orange", ScenesAndInteractions::orangeLiquidMasticResinInteraction)
		// .addStoryBoard("sugarcoated/liquid_mastic_resin_interaction/yellow", ScenesAndInteractions::yellowLiquidMasticResinInteraction)
		// .addStoryBoard("sugarcoated/liquid_mastic_resin_interaction/green", ScenesAndInteractions::greenLiquidMasticResinInteraction)
		// .addStoryBoard("sugarcoated/liquid_mastic_resin_interaction/blue", ScenesAndInteractions::blueLiquidMasticResinInteraction)
		// .addStoryBoard("sugarcoated/liquid_mastic_resin_interaction/purple", ScenesAndInteractions::purpleLiquidMasticResinInteraction);
		HELPER.forComponents(GarnishedItems.CRACKED_WALNUT, GarnishedItems.CRACKED_ALMOND, GarnishedItems.CRACKED_BUHG, GarnishedItems.CRACKED_CASHEW,
						GarnishedItems.CRACKED_CHESTNUT, GarnishedItems.CRACKED_HAZELNUT, GarnishedItems.CRACKED_MACADAMIA, GarnishedItems.CRACKED_PECAN, GarnishedItems.CRACKED_PISTACHIO)
				.addStoryBoard("general/cracked_nut_grown", ScenesAndInteractions::grownNutTree)
				// .addStoryBoard("general/nut_wood", ScenesAndInteractions::nutWood)
				.addStoryBoard("general/milling_nuts", ScenesAndInteractions::millingNuts)
				.addStoryBoard("general/cracked_nut_plant", ScenesAndInteractions::crackedNuts);
		HELPER.forComponents(GarnishedItems.WOODEN_HATCHET, GarnishedItems.STONE_HATCHET, GarnishedItems.IRON_HATCHET, GarnishedItems.GOLDEN_HATCHET,
						GarnishedItems.DIAMOND_HATCHET, GarnishedItems.NETHERITE_HATCHET)
				.addStoryBoard("general/hatchets_showcase", ScenesAndInteractions::hatchets)
				.addStoryBoard("general/hatchet_attacking", ScenesAndInteractions::hatchetAttacking);
		//.addStoryBoard("integration/integrated_hatchets", ScenesAndInteractions::integratedHatchets);
		HELPER.forComponents(GarnishedItems.BOTTLED_PEANUT_OIL)
				.addStoryBoard("general/bottled_peanut_oil", ScenesAndInteractions::bottledPeanutOil)
				.addStoryBoard("general/blaze_burner_additional_heat_sources", ScenesAndInteractions::additionalHeatSources);
		HELPER.forComponents(GarnishedItems.APPLE_CIDER, GarnishedItems.CRYPTIC_APPLE_CIDER, GarnishedItems.BITTER_APPLE_CIDER)
				.addStoryBoard("general/apple_cider_creation", ScenesAndInteractions::appleCiderCreation)
				.addStoryBoard("general/apple_cider_fluid", ScenesAndInteractions::bottledAppleCider)
				.addStoryBoard("general/other_apple_cider_items", ScenesAndInteractions::appleCiderMisc);
		HELPER.forComponents(GarnishedItems.FERMENTED_CASHEW_MIXTURE, GarnishedItems.CASHEW_SORBET_SCOOP)
				.addStoryBoard("general/cashew_mixture_fluid", ScenesAndInteractions::cashewMixtureFluid)
				.addStoryBoard("general/cashew_sorbet_scoop_creation", ScenesAndInteractions::cashewSorbetScoopCreation);
		HELPER.forComponents(GarnishedItems.BRITTLE_DUST, GarnishedItems.SENILE_DUST, GarnishedItems.SENILE_SPREAD)
				.addStoryBoard("incineration/brittle_dust", ScenesAndInteractions::brittleDust)
				.addStoryBoard("incineration/senile_dust", ScenesAndInteractions::senileDust)
				.addStoryBoard("incineration/senile_spread", ScenesAndInteractions::senileSpread);
		HELPER.forComponents(GarnishedItems.CRUSHED_SEPIA_FUNGUS, GarnishedBlocks.SEPIA_FUNGUS);
		//.addStoryBoard("incineration/sepia_fungus_plant", ScenesAndInteractions::sepiaFungusPlant)
		//.addStoryBoard("incineration/sepia_fungus_tree_mini", ScenesAndInteractions::sepiaFungusGrown);
		HELPER.forComponents(GarnishedItems.CRUSHED_CRIMSON_FUNGUS, GarnishedItems.CRUSHED_WARPED_FUNGUS,
						GarnishedItems.CRUSHED_SEPIA_FUNGUS, GarnishedItems.CRUSHED_SHROOMLIGHT)
				.addStoryBoard("incineration/crushing_fungus", ScenesAndInteractions::crushingFungus);
		HELPER.forComponents(GarnishedItems.BOTTLED_PEANUT_OIL, GarnishedItems.APPLE_CIDER, GarnishedItems.FERMENTED_CASHEW_MIXTURE,
						GarnishedItems.CRYPTIC_APPLE_CIDER, GarnishedItems.BITTER_APPLE_CIDER)
				.addStoryBoard("general/basic_fluid_interactions", ScenesAndInteractions::basicFluidInteractions)
				.addStoryBoard("sugarcoated/mastic_fluid_interactions_1", ScenesAndInteractions::createStoneInteractions)
				.addStoryBoard("sugarcoated/mastic_fluid_interactions_2", ScenesAndInteractions::vanillaStoneInteractions)
				.addStoryBoard("sugarcoated/mastic_fluid_interactions_3", ScenesAndInteractions::garnishedStoneInteractions);
	}

	public static class Tags {
		public static PonderTag
				RECENT_CHANGES = create("recent_changes").item(GarnishedItems.BUHG.get(), true, false)
				.defaultLang("recent_changes", "recent_changes_description")
				.addToIndex(),
				KELP_RELATED = create("kelp_related").item(GarnishedItems.DRIED_VERMILION_KELP.get(), true, false)
						.defaultLang("kelp_entries", "kelp_entries_description")
						.addToIndex(),
				MASTIC_RESIN = create("mastic_resin").item(GarnishedItems.MASTIC_RESIN.get(), true, true)
						.defaultLang("mastic_resin", "mastic_resin_description")
						.addToIndex(),
				CRACKED_NUTS = create("cracked_nuts").item(GarnishedItems.CRACKED_WALNUT.get(), true, false)
						.defaultLang("cracked_nuts", "cracked_nuts_description")
						.addToIndex(),
				HATCHETS = create("hatchets").item(GarnishedItems.IRON_HATCHET.get(), true, true)
						.defaultLang("hatchets", "hatchets_description")
						.addToIndex(),
				CRUSHED_NETHER_INGREDIENTS = create("crushed_nether_ingredients").item(GarnishedItems.BRITTLE_DUST.get(), true, true)
						.defaultLang("crushed_nether_ingredients", "crushed_nether_ingredients_description")
						.addToIndex(),
				FLUIDS = create("fluids").item(GarnishedItems.BOTTLED_PEANUT_OIL.get(), true, false)
						.defaultLang("fluids", "fluids_description")
						.addToIndex();

		private static PonderTag create(String id) {
			return new PonderTag(CreateGarnished.asResource(id));
		}

		public static void fillPonderTags() {
			PonderRegistry.TAGS.forTag(RECENT_CHANGES)
					.add(GarnishedBlocks.DULSE_KELP)
					.add(GarnishedBlocks.DRIED_DULSE_KELP_BLOCK)
					.add(GarnishedItems.DRIED_DULSE_KELP)
					.add(GarnishedBlocks.VERMILION_KELP)
					.add(GarnishedBlocks.DRIED_VERMILION_KELP_BLOCK)
					.add(GarnishedItems.DRIED_VERMILION_KELP);
			PonderRegistry.TAGS.forTag(CRACKED_NUTS)
					.add(GarnishedItems.CRACKED_WALNUT)
					.add(GarnishedItems.CRACKED_ALMOND)
					.add(GarnishedItems.CRACKED_BUHG)
					.add(GarnishedItems.CRACKED_CASHEW)
					.add(GarnishedItems.CRACKED_CHESTNUT)
					.add(GarnishedItems.CRACKED_HAZELNUT)
					.add(GarnishedItems.CRACKED_MACADAMIA)
					.add(GarnishedItems.CRACKED_PECAN)
					.add(GarnishedItems.CRACKED_PISTACHIO);
			PonderRegistry.TAGS.forTag(HATCHETS)
					.add(GarnishedItems.WOODEN_HATCHET)
					.add(GarnishedItems.STONE_HATCHET)
					.add(GarnishedItems.IRON_HATCHET)
					.add(GarnishedItems.GOLDEN_HATCHET)
					.add(GarnishedItems.DIAMOND_HATCHET)
					.add(GarnishedItems.NETHERITE_HATCHET);
			PonderRegistry.TAGS.forTag(KELP_RELATED)
					.add(GarnishedBlocks.DULSE_KELP)
					.add(GarnishedBlocks.DRIED_DULSE_KELP_BLOCK)
					.add(GarnishedItems.DRIED_DULSE_KELP)
					.add(GarnishedBlocks.VERMILION_KELP)
					.add(GarnishedBlocks.DRIED_VERMILION_KELP_BLOCK)
					.add(GarnishedItems.DRIED_VERMILION_KELP);
			PonderRegistry.TAGS.forTag(MASTIC_RESIN)
					.add(GarnishedItems.MASTIC_RESIN)
					.add(GarnishedItems.MASTIC_RESIN_RED)
					.add(GarnishedItems.MASTIC_RESIN_ORANGE)
					.add(GarnishedItems.MASTIC_RESIN_YELLOW)
					.add(GarnishedItems.MASTIC_RESIN_GREEN)
					.add(GarnishedItems.MASTIC_RESIN_BLUE)
					.add(GarnishedItems.MASTIC_RESIN_PURPLE)
					.add(GarnishedItems.MASTIC_PASTE)
					.add(GarnishedItems.MASTIC_PASTE_RED)
					.add(GarnishedItems.MASTIC_PASTE_ORANGE)
					.add(GarnishedItems.MASTIC_PASTE_YELLOW)
					.add(GarnishedItems.MASTIC_PASTE_GREEN)
					.add(GarnishedItems.MASTIC_PASTE_BLUE)
					.add(GarnishedItems.MASTIC_PASTE_PURPLE);
			PonderRegistry.TAGS.forTag(CRUSHED_NETHER_INGREDIENTS)
					.add(GarnishedItems.CRUSHED_CRIMSON_FUNGUS)
					.add(GarnishedItems.CRUSHED_WARPED_FUNGUS)
					.add(GarnishedItems.CRUSHED_SEPIA_FUNGUS)
					.add(GarnishedItems.CRUSHED_SHROOMLIGHT)
					.add(GarnishedItems.BRITTLE_DUST)
					.add(GarnishedItems.SENILE_DUST);
			PonderRegistry.TAGS.forTag(FLUIDS)
					.add(GarnishedItems.BOTTLED_PEANUT_OIL)
					.add(GarnishedItems.APPLE_CIDER)
					.add(GarnishedItems.BITTER_APPLE_CIDER)
					.add(GarnishedItems.CRYPTIC_APPLE_CIDER)
					.add(GarnishedItems.FERMENTED_CASHEW_MIXTURE)
					.add(GarnishedFluids.GARNISH.get().getBucket())
					.add(GarnishedFluids.APPLE_CIDER.get().getBucket())
					.add(GarnishedFluids.PEANUT_OIL.get().getBucket())
					.add(GarnishedFluids.CASHEW_MIXTURE.get().getBucket())
					.add(GarnishedFluids.MASTIC_RESIN.get().getBucket())
					.add(GarnishedFluids.RED_MASTIC_RESIN.get().getBucket())
					.add(GarnishedFluids.ORANGE_MASTIC_RESIN.get().getBucket())
					.add(GarnishedFluids.YELLOW_MASTIC_RESIN.get().getBucket())
					.add(GarnishedFluids.GREEN_MASTIC_RESIN.get().getBucket())
					.add(GarnishedFluids.BLUE_MASTIC_RESIN.get().getBucket())
					.add(GarnishedFluids.PURPLE_MASTIC_RESIN.get().getBucket());
		}
	}

	static class ScenesAndInteractions {

		public static void driedKelpBlocks(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("dried_kelp_blocks", "Dried Kelp Blocks from Garnished");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
		}

		public static void kelpInWaterBlocks(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("kelp_garnished", "kelp_blocks_from_garnished");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.overlay.showText(180)
					.attachKeyFrame()
					.placeNearTarget()
					.text("worldgen_certain_biomes")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(30);
			scene.markAsFinished();
		}

		public static void dulseKelp (SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("dulse_kelp", "dulse_kelp");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack itemStack = new ItemStack(GarnishedBlocks.DULSE_KELP.get().asItem());
			ItemStack itemStack1 = new ItemStack(GarnishedItems.DRIED_DULSE_KELP.get());
			Vec3 entitySpawn = util.vector.centerOf(3, 1, 1);
			Vec3 entitySpawn1 = util.vector.centerOf(3, 2, 3);

			// ElementLink<EntityElement> dulseKelp = scene.world.createItemEntity(entitySpawn, util.vector.of(0, 0, 0), itemStack);


			ElementLink<EntityElement> entity = scene.world.createItemEntity(entitySpawn, util.vector.of(0, 0, 0), itemStack);
			scene.idle(10);
			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("frozen_ocean_kelp")
					.pointAt(util.vector.centerOf(3, 1, 1));
			scene.idle(110);
			scene.world.modifyEntity(entity, Entity::discard);
			scene.idle(10);
			ElementLink<EntityElement> entity1 = scene.world.createItemEntity(entitySpawn1, util.vector.of(0, 0, 0), itemStack1);
			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("dried_dulse_kelp")
					.pointAt(util.vector.centerOf(3, 2, 3));
			scene.idle(110);
			scene.world.modifyEntity(entity1, Entity::discard);
			scene.idle(10);
			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("dried_dulse_kelp_block")
					.pointAt(util.vector.centerOf(3, 1, 3));
			scene.idle(120);
		}

		public static void vermilionKelp (SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("vermilion_kelp", "vermilion_kelp");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack itemStack = new ItemStack(GarnishedBlocks.VERMILION_KELP.get().asItem());
			ItemStack itemStack1 = new ItemStack(GarnishedItems.DRIED_VERMILION_KELP.get());
			Vec3 entitySpawn = util.vector.centerOf(3, 1, 1);
			Vec3 entitySpawn1 = util.vector.centerOf(3, 2, 3);

			// ElementLink<EntityElement> vermilionKelp = scene.world.createItemEntity(entitySpawn, util.vector.of(0, 0, 0), itemStack);


			ElementLink<EntityElement> entity = scene.world.createItemEntity(entitySpawn, util.vector.of(0, 0, 0), itemStack);
			scene.idle(10);
			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("cold_ocean_kelp")
					.pointAt(util.vector.centerOf(3, 1, 1));
			scene.idle(110);
			scene.world.modifyEntity(entity, Entity::discard);
			scene.idle(10);
			ElementLink<EntityElement> entity1 = scene.world.createItemEntity(entitySpawn1, util.vector.of(0, 0, 0), itemStack1);
			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("dried_vermilion_kelp")
					.pointAt(util.vector.centerOf(3, 2, 3));
			scene.idle(110);
			scene.world.modifyEntity(entity1, Entity::discard);
			scene.idle(10);
			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("dried_vermilion_kelp_block")
					.pointAt(util.vector.centerOf(1, 1, 3));
			scene.idle(120);
		}

		public static void masticResinRecipe(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("mastic_resin_recipe", "mastic_resin_recipe");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.world.showSection(util.select.layer(0), Direction.UP);
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(40);

			BlockPos basin = util.grid.at(2, 2, 2);
			BlockPos pressPos = util.grid.at(2, 4, 2);
			// Vec3 basinSide = util.vector.blockSurface(basin, Direction.WEST);

			ItemStack slimeBall = new ItemStack(Items.SLIME_BALL);
			ItemStack wheatSeeds = new ItemStack(Items.WHEAT_SEEDS);
			ItemStack masticResin = new ItemStack(GarnishedItems.MASTIC_RESIN.get());

			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_resin_recipe_ingredients")
					.pointAt(util.vector.centerOf(2, 2, 2));
			scene.idle(10);

			scene.overlay.showControls(new InputWindowElement(util.vector.topOf(basin), Pointing.LEFT).withItem(slimeBall), 30);
			scene.overlay.showControls(new InputWindowElement(util.vector.topOf(basin), Pointing.RIGHT).withItem(wheatSeeds), 30);
			scene.idle(30);
			Class<MechanicalPressBlockEntity> type = MechanicalPressBlockEntity.class;
			scene.world.modifyBlockEntity(pressPos, type, pte -> pte.getPressingBehaviour().start(PressingBehaviour.Mode.BASIN));
			scene.world.createItemOnBeltLike(basin, Direction.UP, wheatSeeds);
			scene.world.createItemOnBeltLike(basin, Direction.UP, wheatSeeds);
			scene.world.createItemOnBeltLike(basin, Direction.UP, wheatSeeds);
			scene.world.createItemOnBeltLike(basin, Direction.UP, slimeBall);
			scene.idle(80);
			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_resin_recipe_result")
					.pointAt(util.vector.centerOf(1, 2, 1));
			scene.idle(10);
			scene.world.modifyBlockEntityNBT(util.select.position(basin), BasinBlockEntity.class, nbt -> {
				nbt.put("VisualizedItems",
						NBTHelper.writeCompoundList(ImmutableList.of(IntAttached.with(1, masticResin)), ia -> NBTSerializer.serializeNBTCompound(ia.getValue())));
			});
			scene.idle(4);
			scene.world.createItemOnBelt(util.grid.at(2, 1, 1), Direction.UP, masticResin);
			scene.idle(30);

			scene.markAsFinished();
		}

		public static void colouredMasticResin(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("coloured_mastic_resin", "coloured_mastic_resin");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.world.showSection(util.select.layer(0), Direction.UP);
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);

			scene.overlay.showText(120)
					.attachKeyFrame()
					.placeNearTarget()
					.text("coloured_mastic_resin_basic")
					.pointAt(util.vector.centerOf(3, 2, 3));

			scene.idle(40);

			Class<MechanicalCrafterBlockEntity> type = MechanicalCrafterBlockEntity.class;

			ItemStack masticResin = new ItemStack(GarnishedItems.MASTIC_RESIN.get());
			ItemStack redDye = new ItemStack(Items.RED_DYE);

			scene.world.setCraftingResult(util.grid.at(3, 1, 3), new ItemStack(GarnishedItems.MASTIC_RESIN_RED.get()));

			scene.world.modifyBlockEntity(util.grid.at(3, 3, 3), type, mct ->
					TransferUtil.insertItem(mct.getInventory(), masticResin.copy()));
			scene.world.modifyBlockEntity(util.grid.at(3, 3, 2), type, mct ->
					TransferUtil.insertItem(mct.getInventory(), masticResin.copy()));
			scene.idle(5);
			scene.world.modifyBlockEntity(util.grid.at(3, 3, 1), type, mct ->
					TransferUtil.insertItem(mct.getInventory(), masticResin.copy()));
			scene.idle(5);
			scene.world.modifyBlockEntity(util.grid.at(3, 2, 1), type, mct -> TransferUtil.insertItem(mct.getInventory(), masticResin.copy()));
			scene.idle(5);
			scene.world.modifyBlockEntity(util.grid.at(3, 2, 2), type, mct -> TransferUtil.insertItem(mct.getInventory(), redDye.copy()));
			scene.idle(5);
			scene.world.modifyBlockEntity(util.grid.at(3, 2, 3), type, mct -> TransferUtil.insertItem(mct.getInventory(), masticResin.copy()));
			scene.idle(5);
			scene.world.modifyBlockEntity(util.grid.at(3, 1, 3), type, mct -> TransferUtil.insertItem(mct.getInventory(), masticResin.copy()));
			scene.idle(5);
			scene.world.modifyBlockEntity(util.grid.at(3, 1, 2), type, mct -> TransferUtil.insertItem(mct.getInventory(), masticResin.copy()));
			scene.idle(5);
			scene.world.modifyBlockEntity(util.grid.at(3, 1, 1), type, mct -> TransferUtil.insertItem(mct.getInventory(), masticResin.copy()));
			scene.idle(70);
			scene.rotateCameraY(-60);
			scene.idle(30);
			scene.overlay.showText(120)
					.attachKeyFrame()
					.placeNearTarget()
					.text("red_mastic_resin_result")
					.pointAt(util.vector.centerOf(3, 1, 4));
			scene.idle(140);
			scene.overlay.showText(120)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_resin_recoloured")
					.pointAt(util.vector.centerOf(3, 1, 4));
			scene.idle(140);
			scene.overlay.showText(60)
					.placeNearTarget()
					.text("mastic_resin_colour_wheel")
					.pointAt(util.vector.centerOf(3, 1, 4));
			scene.idle(80);

			scene.markAsFinished();
		}

		public static void masticPaste(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("mastic_paste", "mastic_paste");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.world.showSection(util.select.fromTo(4, 0, 5, 0, 0, 5), Direction.NORTH);
			scene.idle(10);
			// scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.world.showSection(util.select.fromTo(0, 1, 3, 4, 4, 5), Direction.NORTH);
			scene.idle(10);

			ItemStack redMasticResin = new ItemStack(GarnishedItems.MASTIC_RESIN_RED.get());
			ItemStack redMasticPaste = new ItemStack(GarnishedItems.MASTIC_PASTE_RED.get());

			scene.overlay.showText(120)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_paste_creation")
					.pointAt(util.vector.centerOf(2, 3, 3));
			scene.idle(60);
			ElementLink<BeltItemElement> redMasticResinEntity = scene.world.createItemOnBelt(util.grid.at(4, 1, 3), Direction.SOUTH, redMasticResin);
			scene.idle(30);
			scene.world.stallBeltItem(redMasticResinEntity, true);
			scene.idle(5);
			Class<MechanicalPressBlockEntity> type = MechanicalPressBlockEntity.class;
			scene.world.modifyBlockEntity(util.grid.at(2, 3, 3), type, pte -> pte.getPressingBehaviour()
					.start(PressingBehaviour.Mode.BELT));

			scene.idle(30);
			scene.world.modifyBlockEntity(util.grid.at(2, 3, 3), type, pte -> pte.getPressingBehaviour()
					.makePressingParticleEffect(util.vector.centerOf(2, 2, 3).add(0, 8 / 16f, 0), redMasticResin));
			scene.world.removeItemsFromBelt(util.grid.at(2, 3, 3).below(2));
			redMasticResinEntity = scene.world.createItemOnBelt(util.grid.at(2, 3, 3).below(2), Direction.UP, redMasticPaste);
			scene.world.stallBeltItem(redMasticResinEntity, true);
			scene.idle(15);
			scene.world.stallBeltItem(redMasticResinEntity, false);
			scene.idle(60);

			// scene.world.hideSection(util.select.fromTo(0, 1, 3, 4, 4, 5), Direction.SOUTH);
			// scene.idle(10);

			ItemStack redMasticResinBlock = new ItemStack(GarnishedBlocks.RED_MASTIC_BLOCK.get());

			scene.world.showSection(util.select.fromTo(0, 1, 0, 4, 4, 2), Direction.SOUTH);
			scene.idle(30);
			scene.overlay.showText(120)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_block")
					.pointAt(util.vector.of(2, 3.5, 1));
			scene.idle(10);
			scene.overlay.showControls(new InputWindowElement(util.vector.topOf(util.grid.at(2, 2, 1)), Pointing.RIGHT).withItem(redMasticPaste), 30);
			scene.idle(30);
			Class<MechanicalPressBlockEntity> type1 = MechanicalPressBlockEntity.class;
			scene.world.modifyBlockEntity(util.grid.at(2, 4, 1), type1, pte -> pte.getPressingBehaviour().start(PressingBehaviour.Mode.BASIN));
			scene.world.createItemOnBeltLike(util.grid.at(2, 2, 1), Direction.UP, redMasticPaste);
			scene.idle(80);
			scene.overlay.showText(60)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_block_result")
					.pointAt(util.vector.centerOf(1, 2, 1));
			scene.idle(10);
			scene.world.modifyBlockEntityNBT(util.select.position(util.grid.at(2, 2, 1)), BasinBlockEntity.class, nbt -> {
				nbt.put("VisualizedItems",
						NBTHelper.writeCompoundList(ImmutableList.of(IntAttached.with(1, redMasticResinBlock)), ia -> NBTSerializer.serializeNBTCompound(ia.getValue())));
			});
			scene.idle(4);
			scene.world.createItemOnBeltLike(util.grid.at(1, 1, 1), Direction.UP, redMasticResinBlock);
			scene.idle(60);


			scene.markAsFinished();
		}

		public static void masticFluid(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("mastic_fluid", "mastic_fluid");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.world.showSection(util.select.fromTo(4, 0, 5, 0, 0, 5), Direction.NORTH);
			scene.idle(10);
			scene.world.showSection(util.select.fromTo(1, 1, 3, 4, 4, 5), Direction.NORTH);
			scene.idle(10);

			ItemStack redMasticResinBlock = new ItemStack(GarnishedBlocks.RED_MASTIC_BLOCK.get());

			scene.overlay.showControls(new InputWindowElement(util.vector.topOf(util.grid.at(3, 2, 3)), Pointing.RIGHT).withItem(redMasticResinBlock), 30);
			scene.idle(20);
			scene.overlay.showText(60)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_fluid_input")
					.pointAt(util.vector.of(3, 3, 3));
			scene.idle(80);

			Class<MechanicalMixerBlockEntity> type = MechanicalMixerBlockEntity.class;
			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, redMasticResinBlock);
			scene.idle(15);

			scene.world.modifyBlockEntity(util.grid.at(1, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.RED_MASTIC_RESIN.get().getSource(), 20250)));

			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, redMasticResinBlock);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(1, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.RED_MASTIC_RESIN.get().getSource(), 40500)));

			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, redMasticResinBlock);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(1, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.RED_MASTIC_RESIN.get().getSource(), 60750)));

			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, redMasticResinBlock);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(1, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.RED_MASTIC_RESIN.get().getSource(), 81000)));

			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, redMasticResinBlock);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(1, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.RED_MASTIC_RESIN.get().getSource(), 101250)));
			scene.idle(20);

			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_fluid_result")
					.pointAt(util.vector.of(1, 2, 3));
			scene.idle(120);

			scene.world.showSection(util.select.fromTo(1, 1, 1, 4, 1, 1), Direction.SOUTH);
			scene.idle(10);
			scene.overlay.showText(120)
					.attachKeyFrame()
					.placeNearTarget()
					.text("mastic_resin_interaction_basics")
					.pointAt(util.vector.of(2, 1.5, 1));
			scene.idle(160);

			scene.markAsFinished();
		}

		public static void createStoneInteractions(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("mastic_resin_create_stone", "mastic_resin_create_stone");
			scene.showBasePlate();
			scene.idle(10);

			scene.world.showSection(util.select.fromTo(1, 1, 1, 4, 1, 1), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("red_fluid_crimsite")
					.pointAt(util.vector.of(2, 1.5, 1));
			scene.idle(90);
			scene.world.showSection(util.select.fromTo(1, 1, 2, 4, 1, 2), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("blue_fluid_asurine")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(90);
			scene.world.showSection(util.select.fromTo(1, 1, 3, 4, 1, 3), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("green_fluid_veridium")
					.pointAt(util.vector.of(2, 1.5, 3));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void vanillaStoneInteractions(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("mastic_resin_vanilla_stone", "mastic_resin_vanilla_stone");
			scene.showBasePlate();
			scene.idle(10);

			scene.world.showSection(util.select.fromTo(1, 1, 1, 4, 1, 1), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("regular_fluid_tuff")
					.pointAt(util.vector.of(2, 1.5, 1));
			scene.idle(90);
			scene.world.showSection(util.select.fromTo(1, 1, 2, 4, 1, 2), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("orange_fluid_terracotta")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void garnishedStoneInteractions(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("mastic_resin_garnished_stone", "mastic_resin_garnished_stone");
			scene.showBasePlate();
			scene.idle(10);

			scene.world.showSection(util.select.fromTo(1, 1, 1, 4, 1, 1), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("yellow_fluid_carnotite")
					.pointAt(util.vector.of(2, 1.5, 1));
			scene.idle(90);
			scene.world.showSection(util.select.fromTo(1, 1, 2, 4, 1, 2), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("purple_fluid_abyssal_stone")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void crackedNuts(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("cracked_nuts", "cracked_nuts");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.fromTo(1, 1, 4, 4, 1, 3), Direction.DOWN);
			scene.world.showSection(util.select.fromTo(4, 1, 0, 3, 1, 0), Direction.DOWN);
			scene.idle(3);
			scene.world.showSection(util.select.position(2, 1, 2), Direction.DOWN);
			scene.idle(15);

			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("cracked_nut_plant")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(100);

			scene.markAsFinished();
		}

		public static void grownNutTree(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("nut_tree", "nut_tree");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("nut_tree_worldgen")
					.pointAt(util.vector.topOf(1, 1, 1));
			scene.idle(90);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("nut_leaves")
					.pointAt(util.vector.of(2, 4, 0));
			scene.idle(90);
			scene.world.hideSection(util.select.fromTo(0, 2, 0, 4, 6, 4), Direction.UP);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("nut_wood")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void millingNuts(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("milling_nuts", "milling_nuts");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.idle(5);
			scene.world.showSection(util.select.position(3, 0, 5), Direction.DOWN);
			scene.world.showSection(util.select.position(4, 1, 5), Direction.DOWN);
			scene.idle(10);
			scene.world.showSection(util.select.fromTo(0, 1, 2, 4, 2, 4), Direction.NORTH);
			scene.idle(5);
			scene.world.showSection(util.select.fromTo(0, 1, 1, 4, 2, 1), Direction.SOUTH);
			scene.idle(10);

			ItemStack itemStack = new ItemStack(GarnishedItems.UNGARNISHED_WALNUT.get());
			Vec3 entitySpawn = util.vector.topOf(util.grid.at(4, 2, 2).above(3));

			ItemStack crackedWalnut = new ItemStack(GarnishedItems.CRACKED_WALNUT.get());

			ElementLink<EntityElement> entity1 = scene.world.createItemEntity(entitySpawn, util.vector.of(0, 0.2, 0), itemStack);
			scene.idle(18);
			scene.world.modifyEntity(entity1, Entity::discard);
			scene.world.modifyBlockEntity(util.grid.at(4, 2, 2), MillstoneBlockEntity.class,
					ms -> ms.inputInv.setStackInSlot(0, itemStack));
			scene.idle(50);
			scene.world.modifyBlockEntity(util.grid.at(4, 2, 2), MillstoneBlockEntity.class,
					ms -> ms.inputInv.setStackInSlot(0, ItemStack.EMPTY));
			scene.idle(5);
			// scene.world.createItemOnBelt(util.grid.at(4, 1, 1), Direction.SOUTH, crackedWalnut);
			ElementLink<BeltItemElement> entity2 = scene.world.createItemOnBelt(util.grid.at(4, 1, 1), Direction.SOUTH, crackedWalnut);
			scene.idle(15);
			scene.world.stallBeltItem(entity2, true);
			scene.overlay.showText(80)
					.placeNearTarget()
					.text("cracked_nuts_additional_value")
					.pointAt(util.vector.topOf(3, 1, 1));
			scene.idle(90);
			scene.world.stallBeltItem(entity2, false);
			scene.idle(40);

			scene.markAsFinished();
		}

		public static void nutWood(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("nut_wood", "nut_wood");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			scene.markAsFinished();
		}

		public static void hatchets(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("hatchets", "hatchets");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack itemStack = new ItemStack(GarnishedItems.IRON_HATCHET.get());
			Vec3 entitySpawn = util.vector.topOf(util.grid.at(2, 1, 2).above(3));

			ElementLink<EntityElement> entity = scene.world.createItemEntity(entitySpawn, util.vector.of(0, 0, 0), itemStack);
			scene.idle(5);
			scene.overlay.showText(100)
					.attachKeyFrame()
					.placeNearTarget()
					.text("hatchet_desc")
					.pointAt(util.vector.topOf(2, 1, 2));
			scene.idle(110);
			scene.world.modifyEntity(entity, Entity::discard);

			scene.markAsFinished();
		}

		public static void hatchetAttacking(SceneBuilder scene, SceneBuildingUtil util) {
			Class<DeployerBlockEntity> teType = DeployerBlockEntity.class;
			ItemStack netheriteHatchet = new ItemStack(GarnishedItems.NETHERITE_HATCHET.get());

			netheriteHatchet.enchant(GarnishedEnchantments.RAVAGING.get(), 0);
			scene.world.modifyBlockEntityNBT(util.select.position(3, 2, 3), teType, nbt -> nbt.put("HeldItem", NBTSerializer.serializeNBTCompound(netheriteHatchet)));

			scene.title("hatchet_attacking", "hatchet_attacking");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.world.showSection(util.select.layer(0), Direction.UP);
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.SOUTH);
			scene.idle(10);

			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("hatchet_enchantment_ravaging")
					.pointAt(util.vector.centerOf(3, 2, 3));
			scene.idle(100);

			ElementLink<EntityElement> blaze = scene.world.createEntity(w -> {
				Blaze entity = EntityType.BLAZE.create(w);
				Vec3 p = util.vector.topOf(util.grid.at(1, 1, 3));
				entity.setPos(p.x, p.y, p.z);
				entity.xo = p.x;
				entity.yo = p.y;
				entity.zo = p.z;
				// WalkAnimationState animation = entity.walkAnimation;
				// animation.update(-animation.position(), 1);
				// animation.setSpeed(1);
				entity.yRotO = 210;
				entity.setYRot(210);
				entity.yHeadRotO = 210;
				entity.yHeadRot = 210;
				return entity;
			});

			scene.idle(30);
			scene.world.moveDeployer(util.grid.at(3, 2, 3), 1, 25);
			scene.idle(26);
			scene.world.modifyEntity(blaze, Entity::animateHurt);
			// scene.world.modifyEntity(blaze, entity -> entity.hurt(entity.damageSources().generic(), 100.0F));
			scene.idle(7);
			scene.world.modifyEntity(blaze, Entity::discard);

			ItemStack itemStack = new ItemStack(GarnishedItems.ENFLAMED_MANDIBLE.get());
			ElementLink<EntityElement> itemEntity = scene.world.createItemEntity(util.vector.centerOf(1, 2, 3), util.vector.of(0, 0.2, 0), itemStack);
			scene.idle(5);
			scene.world.moveDeployer(util.grid.at(3, 2, 3), -1, 25);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("modified_drops_ravaging")
					.pointAt(util.vector.centerOf(1, 2, 3));

			// scene.world.modifyEntity(blaze, Entity::discard);
			scene.idle(100);
			scene.world.modifyEntity(itemEntity, Entity::discard);

			Vec3 frontVec = util.vector.blockSurface(util.grid.at(3, 2, 3), Direction.WEST).add(-.125, 0, 0);

			ItemStack netheriteHatchet1 = new ItemStack(GarnishedItems.NETHERITE_HATCHET.get());

			netheriteHatchet1.enchant(GarnishedEnchantments.SALVAGING.get(), 1);

			scene.overlay.showControls(new InputWindowElement(frontVec, Pointing.DOWN).rightClick().withItem(Items.ENCHANTED_BOOK.getDefaultInstance()), 40);
			scene.world.modifyBlockEntityNBT(util.select.position(3, 2, 3), teType, nbt -> nbt.put("HeldItem", NBTSerializer.serializeNBTCompound(netheriteHatchet)));
			scene.idle(10);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("hatchet_enchantment_salvaging")
					.pointAt(util.vector.centerOf(3, 2, 3));
			scene.idle(100);

			ElementLink<EntityElement> squid = scene.world.createEntity(w -> {
				Squid entity = EntityType.SQUID.create(w);
				Vec3 p = util.vector.topOf(util.grid.at(1, 1, 3));
				entity.setPos(p.x, p.y, p.z);
				entity.xo = p.x;
				entity.yo = p.y;
				entity.zo = p.z;
				// WalkAnimationState animation = entity.walkAnimation;
				// animation.update(-animation.position(), 1);
				// animation.setSpeed(1);
				entity.yRotO = 210;
				entity.setYRot(210);
				entity.yHeadRotO = 210;
				entity.yHeadRot = 210;
				return entity;
			});

			scene.idle(30);
			scene.world.moveDeployer(util.grid.at(3, 2, 3), 1, 25);
			scene.idle(26);
			scene.world.modifyEntity(squid, entity -> entity.animateHurt());
			// scene.world.modifyEntity(blaze, entity -> entity.hurt(entity.damageSources().generic(), 100.0F));
			scene.idle(7);
			scene.world.modifyEntity(squid, Entity::discard);

			ItemStack itemStack1 = new ItemStack(Items.INK_SAC, 7);
			ElementLink<EntityElement> itemEntity1 = scene.world.createItemEntity(util.vector.centerOf(1, 2, 3), util.vector.of(0, 0.2, 0), itemStack1);
			scene.idle(5);
			scene.world.moveDeployer(util.grid.at(3, 2, 3), -1, 25);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("modified_drops_salvaging")
					.pointAt(util.vector.centerOf(1, 2, 3));

			// scene.world.modifyEntity(blaze, Entity::discard);
			scene.idle(100);
			scene.world.modifyEntity(itemEntity, Entity::discard);

			scene.markAsFinished();
		}

		public static void brittleDust(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("brittle_dust", "brittle_dust");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.fromTo(2, 1, 0, 4, 2, 2), Direction.WEST);
			scene.idle(10);

			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("brittle_dust_ingredients")
					.pointAt(util.vector.topOf(3, 1, 1));
			scene.idle(90);

			scene.world.hideSection(util.select.fromTo(2, 1, 0, 4, 2, 2), Direction.EAST);
			scene.idle(10);
			scene.world.showSection(util.select.position(3, 0, 5), Direction.DOWN);
			scene.world.showSection(util.select.fromTo(0, 1, 0, 1, 2, 4), Direction.DOWN);
			scene.world.showSection(util.select.fromTo(2, 1, 2, 2, 2, 4), Direction.DOWN);
			scene.idle(10);

			Vec3 spawnPosition = util.vector.topOf(util.grid.at(1, 2, 4).above(3));

			ItemStack scorchiaStack = new ItemStack(AllPaletteStoneTypes.SCORCHIA.getBaseBlock().get().asItem());
			ItemStack brittleDustStack = new ItemStack(GarnishedItems.BRITTLE_DUST.get(), 2);
			ElementLink<EntityElement> entity = scene.world.createItemEntity(spawnPosition, util.vector.of(0, 0, 0), scorchiaStack);
			scene.idle(26);
			scene.world.modifyEntity(entity, Entity::discard);
			scene.idle(10);
			EmitParticlesInstruction.Emitter blockSpace =
					EmitParticlesInstruction.Emitter.withinBlockSpace(new ItemParticleOption(ParticleTypes.ITEM, scorchiaStack), util.vector.of(0, 0, 0));
			scene.effects.emitParticles(util.vector.centerOf(util.grid.at(1, 2, 3))
					.add(0, -0.2, 0), blockSpace, 3, 40);
			scene.idle(10);
			ElementLink<BeltItemElement> entity1 = scene.world.createItemOnBelt(util.grid.at(1, 1, 2), Direction.SOUTH, brittleDustStack);
			scene.idle(20);
			scene.world.stallBeltItem(entity1, true);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("brittle_dust_result")
					.pointAt(util.vector.topOf(util.grid.at(1, 1, 1)));
			scene.idle(90);
			scene.world.stallBeltItem(entity1, false);
			scene.idle(40);


			scene.markAsFinished();
		}

		public static void senileDust(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("senile_dust", "senile_dust");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.idle(5);
			scene.world.showSection(util.select.position(5, 0, 1), Direction.DOWN);
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack stack = new ItemStack(GarnishedItems.BRITTLE_DUST.get());
			ItemStack output = new ItemStack(GarnishedItems.SENILE_DUST.get());

			ElementLink<BeltItemElement> beltStack = scene.world.createItemOnBelt(util.grid.at(2, 1, 1), Direction.NORTH, stack);

			scene.idle(18);
			scene.world.stallBeltItem(beltStack, true);

			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("senile_dust_creation")
					.pointAt(util.vector.centerOf(2, 1, 2));
			scene.idle(30);
			scene.effects.emitParticles(util.vector.of(2, 2, 2), EmitParticlesInstruction.Emitter.simple(ParticleTypes.SOUL_FIRE_FLAME, Vec3.ZERO), .5f, 25);
			scene.idle(24);
			scene.world.changeBeltItemTo(beltStack, output);
			scene.idle(36);
			scene.world.stallBeltItem(beltStack, false);
			scene.idle(30);

			scene.markAsFinished();
		}

		public static void senileSpread(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("senile_spread", "senile_spread");

			ItemStack senileSpread = new ItemStack(GarnishedItems.SENILE_SPREAD.get());
			ItemStack senileDust = new ItemStack(GarnishedItems.SENILE_DUST.get());
			ItemStack boneMeal = new ItemStack(Items.BONE_MEAL);
			Class<DeployerBlockEntity> teType = DeployerBlockEntity.class;
			scene.world.modifyBlockEntityNBT(util.select.position(3, 3, 2), teType, nbt -> nbt.put("HeldItem", NBTSerializer.serializeNBTCompound(senileDust)));

			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.idle(5);
			scene.world.showSection(util.select.position(5, 0, 1), Direction.DOWN);
			scene.world.showSection(util.select.position(5, 1, 2), Direction.DOWN);
			scene.idle(10);
			scene.world.showSection(util.select.fromTo(3, 1, 0, 4, 4,4), Direction.NORTH);
			scene.idle(40);

			ElementLink<BeltItemElement> beltItem = scene.world.createItemOnBelt(util.grid.at(3, 1, 0), Direction.NORTH, boneMeal);
			scene.idle(36);
			scene.world.stallBeltItem(beltItem, true);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("senile_spread_creation")
					.pointAt(util.vector.of(3, 1.5, 2));
			scene.idle(90);
			scene.world.moveDeployer(util.grid.at(3, 3, 2), 1, 25);
			scene.idle(27);
			scene.world.changeBeltItemTo(beltItem, senileSpread);
			scene.idle(12);
			scene.world.moveDeployer(util.grid.at(3, 3, 2), -1, 25);
			scene.idle(32);

			scene.world.showSection(util.select.fromTo(0, 1, 0, 2, 1, 4), Direction.DOWN);
			scene.idle(20);
			scene.overlay.showControls(new InputWindowElement(util.vector.topOf(1, 1, 1), Pointing.DOWN).withItem(senileSpread).rightClick(), 30);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("senile_spread_usage")
					.pointAt(util.vector.of(0, 2, 2));
			scene.idle(90);
			scene.world.showIndependentSectionImmediately(util.select.fromTo(0, 2, 0, 1, 2, 4));
			scene.idle(30);

			scene.markAsFinished();
		}

		public static void bottledPeanutOil(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("peanut_oil_item", "peanut_oil_item");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack peanutOil = new ItemStack(GarnishedItems.BOTTLED_PEANUT_OIL.get());

			ElementLink<EntityElement> entity = scene.world.createItemEntity(util.vector.topOf(util.grid.at(3,1, 1).above(3)), util.vector.of(0, 0.2F, 0), peanutOil);
			scene.idle(10);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("peanut_oil_bottle")
					.pointAt(util.vector.of(3, 1.5, 1));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void basicFluidInteractions(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("basic_fluid_interactions", "basic_fluid_interactions");
			scene.showBasePlate();
			scene.idle(10);

			scene.world.showSection(util.select.fromTo(1, 1, 1, 4, 1, 1), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("garnish_fluid_calcite")
					.pointAt(util.vector.of(2, 1.5, 1));
			scene.idle(90);
			scene.world.showSection(util.select.fromTo(1, 1, 2, 4, 1, 2), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("apple_cider_fluid_ochrum")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(90);
			scene.world.showSection(util.select.fromTo(1, 1, 3, 4, 1, 3), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("peanut_oil_fluid_dripstone")
					.pointAt(util.vector.of(2, 1.5, 3));
			scene.idle(90);
			scene.world.showSection(util.select.fromTo(1, 1, 4, 4, 1, 4), Direction.NORTH);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("cashew_mixture_fluid_end_stone")
					.pointAt(util.vector.of(2, 1.5, 4));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void additionalHeatSources(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("heat_sources", "heat_sources");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.idle(5);
			scene.world.showSection(util.select.position(1, 0, 5), Direction.DOWN);
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack peanutOilBucket = new ItemStack(GarnishedFluids.PEANUT_OIL.get().getBucket());

			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("peanut_oil_heat_source")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(120);

			scene.overlay.showControls(new InputWindowElement(util.vector.topOf(2, 1, 2), Pointing.RIGHT).rightClick().withItem(peanutOilBucket), 30);
			scene.idle(15);
			scene.world.modifyBlock(util.grid.at(2, 1, 2), s -> s.setValue(BlazeBurnerBlock.HEAT_LEVEL, BlazeBurnerBlock.HeatLevel.SEETHING), false);
			scene.idle(40);
			scene.world.modifyBlock(util.grid.at(2, 1, 2), s -> s.setValue(BlazeBurnerBlock.HEAT_LEVEL, BlazeBurnerBlock.HeatLevel.SMOULDERING), true);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("raw_peanut_heat_source")
					.pointAt(util.vector.of(2, 1.5, 2));
			scene.idle(120);

			scene.overlay.showControls(new InputWindowElement(util.vector.topOf(2, 1, 2), Pointing.RIGHT).rightClick().withItem(new ItemStack(GarnishedItems.UNGARNISHED_BUHG.get())), 30);
			scene.idle(15);
			scene.world.modifyBlock(util.grid.at(2, 1, 2), s -> s.setValue(BlazeBurnerBlock.HEAT_LEVEL, BlazeBurnerBlock.HeatLevel.KINDLED), false);
			scene.idle(30);

			scene.markAsFinished();
		}

		public static void bottledAppleCider(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("apple_cider_item", "apple_cider_item");
			scene.showBasePlate();
			scene.idle(10);

			ItemStack appleCider = new ItemStack(GarnishedItems.APPLE_CIDER.get());
			ElementLink<EntityElement> entity = scene.world.createItemEntity(util.vector.topOf(util.grid.at(2,1, 1).above(2)), util.vector.of(0, 0.2F, 0), appleCider);

			scene.idle(10);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("bottled_apple_cider")
					.pointAt(util.vector.of(2, 1.5, 1));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void appleCiderCreation(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("apple_cider_creation", "apple_cider_creation");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.idle(5);
			scene.world.showSection(util.select.position(1, 0, 5), Direction.DOWN);
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack crackedMacadamia = new ItemStack(GarnishedItems.CRACKED_MACADAMIA.get());
			ItemStack apple = new ItemStack(Items.APPLE);
			ItemStack garnishCompound = new ItemStack(GarnishedItems.GARNISH_COMPOUND.get());

			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("apple_cider_ingredients")
					.pointAt(util.vector.of(3, 2.5, 3));
			scene.idle(100);
			scene.overlay.showControls(new InputWindowElement(util.vector.of(3, 2, 3), Pointing.DOWN).withItem(crackedMacadamia), 20);
			scene.idle(30);
			scene.overlay.showControls(new InputWindowElement(util.vector.of(3, 2, 3), Pointing.DOWN).withItem(apple), 20);
			scene.idle(30);
			scene.overlay.showControls(new InputWindowElement(util.vector.of(3, 2, 3), Pointing.DOWN).withItem(apple), 20);
			scene.idle(30);
			scene.overlay.showControls(new InputWindowElement(util.vector.of(3, 2, 3), Pointing.DOWN).withItem(garnishCompound), 20);
			scene.idle(40);

			Class<MechanicalMixerBlockEntity> type = MechanicalMixerBlockEntity.class;
			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, crackedMacadamia);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, apple);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, apple);
			scene.world.createItemOnBeltLike(util.grid.at(3, 2, 3), Direction.UP, garnishCompound);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(0, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.APPLE_CIDER.get().getSource(), 20250)));

			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(0, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.APPLE_CIDER.get().getSource(), 40500)));

			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(0, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.APPLE_CIDER.get().getSource(), 60750)));

			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(0, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.APPLE_CIDER.get().getSource(), 81000)));

			scene.world.modifyBlockEntity(util.grid.at(3, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.idle(15);
			scene.world.modifyBlockEntity(util.grid.at(0, 1, 3), FluidTankBlockEntity.class, be ->
					TransferUtil.insertFluid(be.getTankInventory(), fluid(GarnishedFluids.APPLE_CIDER.get().getSource(), 101250)));
			scene.idle(15);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("apple_cider_result")
					.pointAt(util.vector.of(0, 1.5, 3));

			scene.markAsFinished();
		}

		public static void appleCiderMisc(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("apple_cider_misc", "apple_cider_misc");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack cryptic = new ItemStack(GarnishedItems.CRYPTIC_APPLE_CIDER.get());
			ItemStack bitter = new ItemStack(GarnishedItems.BITTER_APPLE_CIDER.get());
			ElementLink<EntityElement> entity = scene.world.createItemEntity(util.vector.topOf(util.grid.at(3, 2, 2).above(2)), util.vector.of(0, 0.2F, 0), cryptic);
			scene.idle(5);
			ElementLink<EntityElement> entity1 = scene.world.createItemEntity(util.vector.topOf(util.grid.at(1, 2, 2).above(3)), util.vector.of(0, 0.1F, 0), bitter);
			scene.idle(5);

			scene.idle(10);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("cryptic_apple_cider")
					.pointAt(util.vector.of(3, 2.5, 2));
			scene.idle(90);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("bitter_apple_cider")
					.pointAt(util.vector.of(1, 2.5, 2));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void crushingFungus(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("crushing_fungus", "crushing_fungus");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.idle(5);
			scene.world.showSection(util.select.position(2, 0, 5), Direction.DOWN);
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack crimson = new ItemStack(Items.CRIMSON_FUNGUS);
			ItemStack warped = new ItemStack(Items.WARPED_FUNGUS);
			ItemStack sepia = new ItemStack(GarnishedBlocks.SEPIA_FUNGUS.get());
			ItemStack shroomlight = new ItemStack(Items.SHROOMLIGHT);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("crushing_fungus_basics")
					.pointAt(util.vector.of(1.5, 3.5, 2));
			scene.idle(90);
			ElementLink<EntityElement> crimsonEntity = scene.world.createItemEntity(util.vector.topOf(util.grid.at(2,3, 2).above(2)), util.vector.of(0, 0, 0), crimson);
			scene.idle(24);
			scene.world.modifyEntity(crimsonEntity, Entity::discard);
			EmitParticlesInstruction.Emitter blockSpace =
					EmitParticlesInstruction.Emitter.withinBlockSpace(new ItemParticleOption(ParticleTypes.ITEM, crimson), util.vector.of(0, 0, 0));
			scene.effects.emitParticles(util.vector.centerOf(util.grid.at(2, 3, 2))
					.add(0, -0.2, 0), blockSpace, 3, 40);
			scene.idle(24);
			ItemStack crimson1 = new ItemStack(GarnishedItems.CRUSHED_CRIMSON_FUNGUS.get());
			ItemStack warped1 = new ItemStack(GarnishedItems.CRUSHED_WARPED_FUNGUS.get());
			ItemStack sepia1 = new ItemStack(GarnishedItems.CRUSHED_SEPIA_FUNGUS.get());
			ItemStack shroomlight1 = new ItemStack(GarnishedItems.CRUSHED_SHROOMLIGHT.get());

			ElementLink<EntityElement> crushedCrimsonEntity = scene.world.createItemEntity(util.vector.centerOf(2, 3, 2).add(0, -1.4, 0), util.vector.of(0, 0, 0), crimson1);
			scene.idle(4);
			scene.world.modifyEntity(crushedCrimsonEntity, Entity::discard);
			scene.world.createItemOnBelt(util.grid.at(2, 1, 2), Direction.SOUTH, crimson1);
			scene.idle(50);


			scene.addKeyframe();
			ElementLink<EntityElement> warpedEntity = scene.world.createItemEntity(util.vector.topOf(util.grid.at(2,3, 2).above(2)), util.vector.of(0, 0, 0), warped);
			scene.idle(24);
			scene.world.modifyEntity(warpedEntity, Entity::discard);
			EmitParticlesInstruction.Emitter blockSpace1 =
					EmitParticlesInstruction.Emitter.withinBlockSpace(new ItemParticleOption(ParticleTypes.ITEM, warped), util.vector.of(0, 0, 0));
			scene.effects.emitParticles(util.vector.centerOf(util.grid.at(2, 3, 2))
					.add(0, -0.2, 0), blockSpace1, 3, 40);
			scene.idle(24);

			ElementLink<EntityElement> crushedWarpedEntity = scene.world.createItemEntity(util.vector.centerOf(2, 3, 2).add(0, -1.4, 0), util.vector.of(0, 0, 0), warped1);
			scene.idle(4);
			scene.world.modifyEntity(crushedWarpedEntity, Entity::discard);
			scene.world.createItemOnBelt(util.grid.at(2, 1, 2), Direction.SOUTH, warped1);
			scene.idle(50);


			scene.addKeyframe();
			ElementLink<EntityElement> sepiaEntity = scene.world.createItemEntity(util.vector.topOf(util.grid.at(2,3, 2).above(2)), util.vector.of(0, 0, 0), sepia);
			scene.idle(24);
			scene.world.modifyEntity(sepiaEntity, Entity::discard);
			EmitParticlesInstruction.Emitter blockSpace2 =
					EmitParticlesInstruction.Emitter.withinBlockSpace(new ItemParticleOption(ParticleTypes.ITEM, sepia), util.vector.of(0, 0, 0));
			scene.effects.emitParticles(util.vector.centerOf(util.grid.at(2, 3, 2))
					.add(0, -0.2, 0), blockSpace2, 3, 40);
			scene.idle(24);

			ElementLink<EntityElement> crushedSepiaEntity = scene.world.createItemEntity(util.vector.centerOf(2, 3, 2).add(0, -1.4, 0), util.vector.of(0, 0, 0), sepia1);
			scene.idle(4);
			scene.world.modifyEntity(crushedSepiaEntity, Entity::discard);
			scene.world.createItemOnBelt(util.grid.at(2, 1, 2), Direction.SOUTH, sepia1);
			scene.idle(50);


			scene.addKeyframe();
			ElementLink<EntityElement> shroomlightEntity = scene.world.createItemEntity(util.vector.topOf(util.grid.at(2,3, 2).above(2)), util.vector.of(0, 0, 0), shroomlight);
			scene.idle(24);
			scene.world.modifyEntity(shroomlightEntity, Entity::discard);
			EmitParticlesInstruction.Emitter blockSpace3 =
					EmitParticlesInstruction.Emitter.withinBlockSpace(new ItemParticleOption(ParticleTypes.ITEM, shroomlight), util.vector.of(0, 0, 0));
			scene.effects.emitParticles(util.vector.centerOf(util.grid.at(2, 3, 2))
					.add(0, -0.2, 0), blockSpace3, 3, 40);
			scene.idle(24);

			ElementLink<EntityElement> crushedShroomlightEntity = scene.world.createItemEntity(util.vector.centerOf(2, 3, 2).add(0, -1.4, 0), util.vector.of(0, 0, 0), shroomlight1);
			scene.idle(4);
			scene.world.modifyEntity(crushedShroomlightEntity, Entity::discard);
			scene.world.createItemOnBelt(util.grid.at(2, 1, 2), Direction.SOUTH, shroomlight1);
			scene.idle(50);

			scene.markAsFinished();
		}

		public static void cashewMixtureFluid(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("cashew_mixture", "cashew_mixture");
			scene.showBasePlate();
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack fermentedCashewMixture = new ItemStack(GarnishedItems.FERMENTED_CASHEW_MIXTURE.get());
			ElementLink<EntityElement> entity = scene.world.createItemEntity(util.vector.centerOf(util.grid.at(3, 2, 2).above(2)), util.vector.of(0, 0.2, 0), fermentedCashewMixture);
			scene.idle(5);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("fermented_cashew_mixture")
					.pointAt(util.vector.centerOf(util.grid.at(3, 2, 2)));
			scene.idle(90);

			scene.markAsFinished();
		}

		public static void cashewSorbetScoopCreation(SceneBuilder scene, SceneBuildingUtil util) {
			scene.title("cashew_sorbet", "cashew_sorbet");
			scene.configureBasePlate(0, 0, 5);
			scene.showBasePlate();
			scene.idle(5);
			scene.world.showSection(util.select.position(2, 0, 5), Direction.DOWN);
			scene.idle(10);
			scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
			scene.idle(10);

			ItemStack snowball = new ItemStack(Items.SNOWBALL);
			ItemStack nut = new ItemStack(GarnishedItems.CASHEW.get());

			scene.overlay.showControls(new InputWindowElement(util.vector.centerOf(2, 2, 3), Pointing.RIGHT).withItem(snowball), 30);
			scene.idle(35);
			scene.overlay.showControls(new InputWindowElement(util.vector.centerOf(2, 2, 3), Pointing.RIGHT).withItem(nut), 30);
			scene.idle(35);
			scene.overlay.showControls(new InputWindowElement(util.vector.centerOf(2, 2, 3), Pointing.RIGHT).withItem(nut), 30);
			scene.idle(35);
			scene.overlay.showText(80)
					.attachKeyFrame()
					.placeNearTarget()
					.text("cashew_sorbet_ingredients")
					.pointAt(util.vector.centerOf(util.grid.at(2, 2, 3)));
			scene.idle(90);

			ItemStack cashewSorbetScoop = new ItemStack(GarnishedItems.CASHEW_SORBET_SCOOP.get(), 2);
			Class<MechanicalMixerBlockEntity> type = MechanicalMixerBlockEntity.class;
			scene.world.modifyBlockEntity(util.grid.at(2, 4, 3), type, MechanicalMixerBlockEntity::startProcessingBasin);
			scene.idle(78);
			ElementLink<BeltItemElement> beltItem = scene.world.createItemOnBelt(util.grid.at(2, 1, 2), Direction.SOUTH, cashewSorbetScoop);
			scene.idle(30);

			scene.markAsFinished();
		}

		private static FluidStack fluid(Fluid source, int mb) {
			return new FluidStack(source, mb);
		}

	}

}
