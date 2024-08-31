package net.dakotapride.garnished.registry;

import static com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures;

import java.util.function.Supplier;

import com.simibubi.create.content.decoration.palettes.ConnectedGlassPaneBlock;
import com.simibubi.create.content.decoration.palettes.WindowBlock;
import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import com.simibubi.create.foundation.block.connected.CTType;
import com.simibubi.create.foundation.block.connected.HorizontalCTBehaviour;
import com.simibubi.create.foundation.block.render.SpriteShiftEntry;
import com.simibubi.create.foundation.block.render.SpriteShifter;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;


public class GarnishedCT {
    private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate();

    public static void setRegister() {}


    /* Custom Window Gen */


    private static BlockBehaviour.Properties glassProperties(BlockBehaviour.Properties p) {
        return p.isValidSpawn(GarnishedCT::never)
                .isRedstoneConductor(GarnishedCT::never)
                .isSuffocating(GarnishedCT::never)
                .isViewBlocking(GarnishedCT::never);
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos,
                                 EntityType<?> entityType) {
        return false;
    }

    public static BlockEntry<WindowBlock> woodenWindowBlock(String name, Supplier<CTSpriteShiftEntry> entry, Supplier<Block> planksBlock) {
        return woodenWindowBlock(name, entry, planksBlock, () -> RenderType::cutout, true);
    }

    public static BlockEntry<WindowBlock> woodenWindowBlock(String name, Supplier<CTSpriteShiftEntry> entry, Supplier<Block> planksBlock,
                                                            Supplier<Supplier<RenderType>> renderType, boolean translucent) {
        return windowBlock(name, entry, renderType,
                translucent, () -> planksBlock.get().defaultMapColor());
    }

    public static BlockEntry<WindowBlock> windowBlock(String name,
                                                      Supplier<CTSpriteShiftEntry> ct, Supplier<Supplier<RenderType>> renderType, boolean translucent,
                                                      Supplier<MapColor> color) {
        return REGISTRATE.block(name + "_window", p -> new WindowBlock(p, translucent))
                .onRegister(connectedTextures(() -> new HorizontalCTBehaviour(ct.get())))
                .addLayer(renderType)
                .initialProperties(() -> Blocks.GLASS)
                .properties(p -> p.mapColor(color.get()).noOcclusion())
                .simpleItem()
                .register();
    }


    public static BlockEntry<ConnectedGlassPaneBlock> woodenWindowPaneBlock(String name, Supplier<CTSpriteShiftEntry> entry, Supplier<? extends Block> windowsBlock) {
        return woodenWindowPaneBlock(name, entry, windowsBlock, () -> RenderType::cutout);
    }

    public static BlockEntry<ConnectedGlassPaneBlock> woodenWindowPaneBlock(String name, Supplier<CTSpriteShiftEntry> entry, Supplier<? extends Block> windowsBlock,
                                                            Supplier<Supplier<RenderType>> renderType) {
        return windowPaneBlock(name, entry, renderType, () -> windowsBlock.get().defaultMapColor());
    }

    public static BlockEntry<ConnectedGlassPaneBlock> windowPaneBlock(String name,
                                                      Supplier<CTSpriteShiftEntry> ct, Supplier<Supplier<RenderType>> renderType,
                                                      Supplier<MapColor> color) {
        return REGISTRATE.block(name + "_window_pane", ConnectedGlassPaneBlock::new)
                .onRegister(connectedTextures(() -> new HorizontalCTBehaviour(ct.get())))
                .addLayer(renderType)
                .initialProperties(() -> Blocks.GLASS_PANE)
                .properties(p -> p.mapColor(color.get()).noOcclusion())
                .simpleItem()
                .register();
    }



    private static CTSpriteShiftEntry omni(String name) {
        return getCT(AllCTTypes.OMNIDIRECTIONAL, name);
    }

    private static CTSpriteShiftEntry horizontal(String name) {
        return getCT(AllCTTypes.HORIZONTAL, name);
    }

    private static CTSpriteShiftEntry vertical(String name) {
        return getCT(AllCTTypes.VERTICAL, name);
    }

    public static final CTSpriteShiftEntry NUT_WINDOW = vertical("nut_window");
    public static final CTSpriteShiftEntry SEPIA_WINDOW = vertical("sepia_window");
    public static final CTSpriteShiftEntry NUT_WINDOW_PANE = vertical("nut_window");
    public static final CTSpriteShiftEntry SEPIA_WINDOW_PANE = vertical("sepia_window");
    //public static final CTSpriteShiftEntry NUMBING_PARCHMENT = omni("numbing_parchment_block");

    private static SpriteShiftEntry get(String originalLocation, String targetLocation) {
        return SpriteShifter.get(CreateGarnished.asResource(originalLocation), CreateGarnished.asResource(targetLocation));
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName, String connectedTextureName) {
        return CTSpriteShifter.getCT(type, CreateGarnished.asResource("block/" + blockTextureName),
                CreateGarnished.asResource("block/" + connectedTextureName + "_connected"));
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName) {
        return getCT(type, blockTextureName, blockTextureName);
    }

}
