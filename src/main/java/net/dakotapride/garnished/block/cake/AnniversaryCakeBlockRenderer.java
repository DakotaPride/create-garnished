package net.dakotapride.garnished.block.cake;

import org.jetbrains.annotations.NotNull;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class AnniversaryCakeBlockRenderer implements BlockEntityRenderer<AnniversaryCakeBlockEntity> {
    public AnniversaryCakeBlockRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(AnniversaryCakeBlockEntity blockEntity, float tick, @NotNull PoseStack poseStack,
                       @NotNull MultiBufferSource buffer, int light, int overlay) {
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

        ItemStack topper = GarnishedItems.NUT_MIX.get().asItem().getDefaultInstance();
        ItemStack cashew = GarnishedItems.CASHEW.get().asItem().getDefaultInstance();
        ItemStack walnut = GarnishedItems.WALNUT.get().asItem().getDefaultInstance();
        ItemStack almond = GarnishedItems.ALMOND.get().asItem().getDefaultInstance();
        ItemStack pistachio = GarnishedItems.PISTACHIO.get().asItem().getDefaultInstance();
        ItemStack pecan = GarnishedItems.PECAN.get().asItem().getDefaultInstance();
        ItemStack macadamia = GarnishedItems.MACADAMIA.get().asItem().getDefaultInstance();
        ItemStack peanut = GarnishedItems.BUHG.get().asItem().getDefaultInstance();
        ItemStack chestnut = GarnishedItems.CHESTNUT.get().asItem().getDefaultInstance();
        ItemStack hazelnut = GarnishedItems.HAZELNUT.get().asItem().getDefaultInstance();
        // ItemStack garnishCompound = GarnishedItems.GARNISH_COMPOUND.get().asItem().getDefaultInstance();

        if (blockEntity.getBlockState().getValue(AnniversaryCakeBlock.BITES_PROPERTY) != 7) {
            int bites = blockEntity.getBlockState().getValue(AnniversaryCakeBlock.BITES_PROPERTY);
            boolean hasLessThanOneBite = bites < 1;
            boolean hasLessThanTwoBites = bites < 2;
            boolean hasLessthanThreeBites = bites < 3;
            boolean hasLessThanFourBites = bites < 4;
            boolean hasLessThanFiveBits = bites < 5;
            // Should never be under 0 bites, if it is, something has gotten horribly fucked up
            boolean hasLessThanOrEqualToZeroBites = bites <= 0;

            if (hasLessThanOneBite) {
                poseStack.pushPose();
                poseStack.translate(0.5f, 1.375f + 0.05 * Math.cos(2 * Math.PI / 180), 0.5f);
                poseStack.scale(0.45f, 0.45f, 0.45f);
                poseStack.mulPose(Axis.XP.rotationDegrees(25));
                poseStack.mulPose(Axis.YP.rotationDegrees(135));
                itemRenderer.renderStatic(topper, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();

                poseStack.pushPose();
                poseStack.translate(0.20f, 1.05f, 0.55f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                poseStack.mulPose(Axis.YP.rotationDegrees(90));
                poseStack.mulPose(Axis.XP.rotationDegrees(10));
                itemRenderer.renderStatic(pistachio, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();
            }

            if (hasLessThanTwoBites) {
                poseStack.pushPose();
                poseStack.translate(0.80f, 1.025f, 0.275f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                poseStack.mulPose(Axis.YP.rotationDegrees(-45));
                poseStack.mulPose(Axis.XP.rotationDegrees(10));
                itemRenderer.renderStatic(hazelnut, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();

                poseStack.pushPose();
                poseStack.translate(0.525f, 1.05f, 0.80f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                // poseStack.mulPose(Axis.YP.rotationDegrees(0));
                poseStack.mulPose(Axis.XP.rotationDegrees(-10));
                itemRenderer.renderStatic(peanut, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();
            }

            if (hasLessthanThreeBites) {
                poseStack.pushPose();
                poseStack.translate(0.25f, 0.55f, 0.10f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                poseStack.mulPose(Axis.YP.rotationDegrees(10));
                poseStack.mulPose(Axis.XP.rotationDegrees(15));
                itemRenderer.renderStatic(cashew, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();

                poseStack.pushPose();
                poseStack.translate(0.45f, 0.55f, 0.90f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                // poseStack.mulPose(Axis.YP.rotationDegrees(0));
                poseStack.mulPose(Axis.XP.rotationDegrees(-10));
                itemRenderer.renderStatic(pecan, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();

                poseStack.pushPose();
                poseStack.translate(0.10f, 0.575f, 0.35f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                poseStack.mulPose(Axis.YP.rotationDegrees(90));
                poseStack.mulPose(Axis.XP.rotationDegrees(10));
                itemRenderer.renderStatic(macadamia, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();
            }

            if (hasLessThanFourBites) {
                poseStack.pushPose();
                poseStack.translate(0.90f, 0.55f, 0.875f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                poseStack.mulPose(Axis.YP.rotationDegrees(45));
                poseStack.mulPose(Axis.XP.rotationDegrees(-10));
                itemRenderer.renderStatic(walnut, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();

                poseStack.pushPose();
                poseStack.translate(0.90f, 0.55f, 0.125f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                poseStack.mulPose(Axis.YP.rotationDegrees(-45));
                poseStack.mulPose(Axis.XP.rotationDegrees(10));
                itemRenderer.renderStatic(almond, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();

                poseStack.pushPose();
                poseStack.translate(0.90f, 0.575f, 0.45f);
                poseStack.scale(0.35f, 0.35f, 0.35f);
                poseStack.mulPose(Axis.YP.rotationDegrees(90));
                poseStack.mulPose(Axis.XP.rotationDegrees(-10));
                itemRenderer.renderStatic(chestnut, ItemDisplayContext.NONE, light, overlay, poseStack, buffer, blockEntity.getLevel(), 1);
                poseStack.popPose();
            }
        }
    }
}
