package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import com.simibubi.create.foundation.ponder.PonderRegistry;
import com.simibubi.create.foundation.ponder.PonderTag;
import com.simibubi.create.foundation.ponder.SceneBuilder;
import com.simibubi.create.foundation.ponder.SceneBuildingUtil;
import com.tterrag.registrate.util.entry.ItemProviderEntry;

import io.github.fabricators_of_create.porting_lib.fluids.FluidStack;
import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class NewIndex {
    static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(CreateGarnished.ID);

    public static void index() {
        forComponents(GarnishedItems.CRACKED_ALMOND, GarnishedItems.CRACKED_BUHG, GarnishedItems.CRACKED_CASHEW,
                GarnishedItems.CRACKED_CHESTNUT, GarnishedItems.CRACKED_HAZELNUT, GarnishedItems.CRACKED_MACADAMIA,
                GarnishedItems.CRACKED_PECAN, GarnishedItems.CRACKED_PISTACHIO, GarnishedItems.CRACKED_WALNUT)
                .addStoryBoard(IndexUtils.TUTORIAL + "/nut_tree", ScenesAndInteractions::nutTreeScene)
                .addStoryBoard(IndexUtils.TUTORIAL + "/garnished_nut_blocks", ScenesAndInteractions::garnishedNutBlockScene)
                .addStoryBoard(IndexUtils.TUTORIAL + "/ungarnished_nut_blocks", ScenesAndInteractions::ungarnishedNutBlockScene);
        forComponents(GarnishedBlocks.GARNISHED_NUT_BLOCK, GarnishedBlocks.UNGARNISHED_NUT_BLOCK)
                .addStoryBoard(IndexUtils.TUTORIAL + "/garnished_nut_blocks", ScenesAndInteractions::garnishedNutBlockScene)
                .addStoryBoard(IndexUtils.TUTORIAL + "/ungarnished_nut_blocks", ScenesAndInteractions::ungarnishedNutBlockScene);
    }

    public static PonderRegistrationHelper.MultiSceneBuilder forComponents(ItemProviderEntry<?>... entries) {
        return HELPER.forComponents(entries);
    }

    public static class ScenesAndInteractions {
        public static void nutTreeScene(SceneBuilder scene, SceneBuildingUtil util) {
            showBaseArea("nut_tree", scene, util);
            markFinished(scene);
        }

        public static void garnishedNutBlockScene(SceneBuilder scene, SceneBuildingUtil util) {
            showBaseArea("garnished_nut_block", scene, util);
            markFinished(scene);
        }

        public static void ungarnishedNutBlockScene(SceneBuilder scene, SceneBuildingUtil util) {
            showBaseArea("ungarnished_nut_block", scene, util);
            markFinished(scene);
        }

        public static void markFinished(SceneBuilder scene) {
            scene.idle(sec(6));
            scene.markAsFinished();
        }

        public static void showBaseArea(String title, SceneBuilder scene, SceneBuildingUtil util) {
            scene.title(title, title);
            scene.showBasePlate();
            scene.idle(10);
            scene.world.showSection(util.select.layersFrom(1), Direction.DOWN);
            scene.idle(10);
        }

        private static int sec(int seconds) {
            return 20 * seconds;
        }

        private static FluidStack fluid(Fluid source, int mb) {
            return new FluidStack(source, mb);
        }
    }

    public static class PonderIndexTags {
        public static PonderTag
                CRACKED_NUTS = create("cracked_nuts", "cracked_nuts_description", GarnishedItems.CRACKED_WALNUT.get());

        private static PonderTag create(String id, String desc, Item representedItem) {
            return new PonderTag(CreateGarnished.asResource(id)).item(representedItem).defaultLang(id, desc).addToIndex();
        }

        public static void tags() {
            PonderRegistry.TAGS.forTag(CRACKED_NUTS).add(GarnishedItems.CRACKED_ALMOND).add(GarnishedItems.CRACKED_BUHG)
                    .add(GarnishedItems.CRACKED_CASHEW).add(GarnishedItems.CRACKED_CHESTNUT).add(GarnishedItems.CRACKED_HAZELNUT)
                    .add(GarnishedItems.CRACKED_MACADAMIA).add(GarnishedItems.CRACKED_PECAN).add(GarnishedItems.CRACKED_PISTACHIO)
                    .add(GarnishedItems.CRACKED_WALNUT);
        }
    }

    public static class IndexUtils {
        public static String INCINERATION = "incineration", DESOLATION = "desolation", SNARE_TEAR = "snare_tear", NUT_TYPING = "nut_typing",
                SUGARCOATED = "sugarcoated", GLOOMY_MEATS = "gloomy_meats", BOUNDLESS_SEA = "boundless_sea", BEFOULED = "befouled",
                GLACIAL_EDGE = "glacial_edge", TUTORIAL = "tutorial";
    }
}
