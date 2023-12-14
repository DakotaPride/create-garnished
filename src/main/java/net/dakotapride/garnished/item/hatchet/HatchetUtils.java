package net.dakotapride.garnished.item.hatchet;

import org.spongepowered.asm.mixin.Unique;

import net.dakotapride.garnished.registry.GarnishedEnchantments;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

@SuppressWarnings("unused")
public class HatchetUtils {
    // Information
    // Maximum Level: 2
    // Minimum Level: 1
    //
    // Grants additional drops depending on the level
    static Enchantment salvaging = GarnishedEnchantments.SALVAGING.get();
    // Information
    // Maximum Level: 1
    // Minimum Level: 1
    //
    // Grants the player PVE/PVP benefits depending on the situation
    static Enchantment ravaging = GarnishedEnchantments.RAVAGING.get();
    // random shit
    public static final RandomSource random = RandomSource.create();

    public HatchetUtils() {}

    public static void getDrops(LivingEntity entity, LivingEntity attacker) {
        int singleCount = 1;
        int count = singleCount + random.nextInt(2);
        String mob = "Unavailable";
        String enchant = "Unavailable";

        // Salvaging Loot Drops
        if (hasSalvaging(attacker)) {
            enchant = "Salvaging";

            if (MobHelper.isFish(entity)) {
                mob = "Fish";

                int fishBoneDropChance = 0;
                int additionalDropChance = 0;

                if (isCorrectEnchantmentLevel(salvaging, attacker, 1)) {
                    fishBoneDropChance = random.nextInt(6);
                    additionalDropChance = random.nextInt(20);
                } else if (isCorrectEnchantmentLevel(salvaging, attacker, 2)) {
                    fishBoneDropChance = random.nextInt(3);
                    additionalDropChance = random.nextInt(8);
                }

                if (fishBoneDropChance == 1) {
                    entity.spawnAtLocation(new ItemStack(Items.BONE, count));
                } else if (additionalDropChance == 1 && isCorrectEnchantmentLevel(salvaging, attacker, 2)) {
                    int fishCount = singleCount + random.nextInt(2);
                    int tropicalFishCount = singleCount + random.nextInt(3);

                    if (MobHelper.isSalmon(entity)) {
                        entity.spawnAtLocation(new ItemStack(Items.SALMON, fishCount));
                    } else if (MobHelper.isCod(entity)) {
                        entity.spawnAtLocation(new ItemStack(Items.COD, fishCount));
                    } else if (MobHelper.isPufferfish(entity)) {
                        entity.spawnAtLocation(new ItemStack(Items.PUFFERFISH, singleCount));
                    } else if (MobHelper.isTropicalFish(entity)) {
                        entity.spawnAtLocation(new ItemStack(Items.TROPICAL_FISH, tropicalFishCount));
                    }
                }
            }

            if (MobHelper.isSquidOrSimilar(entity)) {
                mob = "SquidOrSimilar";

                int additionalDropChance = 0;
                int lichenDropChance = 0;

                if (isCorrectEnchantmentLevel(salvaging, attacker, 1)) {
                    additionalDropChance = random.nextInt(6);
                    lichenDropChance = random.nextInt(8);
                } else if (isCorrectEnchantmentLevel(salvaging, attacker, 2)) {
                    additionalDropChance = random.nextInt(4);
                    lichenDropChance = random.nextInt(6);
                }

                if (additionalDropChance == 1) {
                    int sacCount = singleCount + random.nextInt(3);

                    if (MobHelper.isSquid(entity)) {
                        entity.spawnAtLocation(new ItemStack(Items.INK_SAC, sacCount));
                    } else if (MobHelper.isGlowSquid(entity)) {
                        entity.spawnAtLocation(new ItemStack(Items.GLOW_INK_SAC, sacCount));
                    }
                } else if (lichenDropChance == 1 && MobHelper.isGlowSquid(entity)) {
                    int lichenDropCount = singleCount + random.nextInt(2);

                    entity.spawnAtLocation(new ItemStack(Items.GLOW_LICHEN, lichenDropCount));
                }
            }

            if (MobHelper.isFrog(entity)) {
                mob = "Frog";

                int magmaCreamDropChance = random.nextInt(28);
                int moltenRemnantDropChance = 0;

                if (isCorrectEnchantmentLevel(salvaging, attacker, 1)) {
                    moltenRemnantDropChance = random.nextInt(60);
                } else if (isCorrectEnchantmentLevel(salvaging, attacker, 2)) {
                    moltenRemnantDropChance = random.nextInt(40);
                }

                if (magmaCreamDropChance == 1) {
                    int magmaCreamCount = singleCount + random.nextInt(2);

                    entity.spawnAtLocation(new ItemStack(Items.MAGMA_CREAM, magmaCreamCount));
                }

                if (moltenRemnantDropChance == 1) {
                    int moltenRemnantCount = singleCount + random.nextInt(1);

                    entity.spawnAtLocation(new ItemStack(GarnishedItems.MOLTEN_REMNANT.get(), moltenRemnantCount));
                }
            }
        }

        // Ravaging Loot Drops
        if (hasRavaging(attacker)) {
            enchant = "Ravaging";

            if (MobHelper.isMagmaCube(entity)) {
                mob = "MagmaCube";

                int additionalDropChance = random.nextInt(8);
                int additionalDropCount = singleCount + random.nextInt(3);
                int moltenRemnantDropChance = random.nextInt(12);
                int moltenRemnantDropCount = singleCount + random.nextInt(2);
                int froglightDropChance = random.nextInt(16);
                int froglightVariant = random.nextInt(3);

                if (additionalDropChance == 1) {
                    entity.spawnAtLocation(new ItemStack(Items.MAGMA_CREAM, additionalDropCount));
                } else if (moltenRemnantDropChance == 1) {
                    entity.spawnAtLocation(new ItemStack(GarnishedItems.MOLTEN_REMNANT.get(), moltenRemnantDropCount));
                }

                if (froglightDropChance == 1) {
                    if (froglightVariant == 0) {
                        entity.spawnAtLocation(new ItemStack(Items.OCHRE_FROGLIGHT, singleCount));
                    } else if (froglightVariant == 1) {
                        entity.spawnAtLocation(new ItemStack(Items.VERDANT_FROGLIGHT, singleCount));
                    } else if (froglightVariant == 2) {
                        entity.spawnAtLocation(new ItemStack(Items.PEARLESCENT_FROGLIGHT, singleCount));
                    }
                }
            }

            if (MobHelper.isBlaze(entity)) {
                mob = "Blaze";

                int additionalDropChance = random.nextInt(6);
                int additionalDropCount = singleCount + random.nextInt(3);
                int powderDropChance = random.nextInt(10);
                int powderDropCount = singleCount + random.nextInt(2);
                int mandibleDropChance = random.nextInt(16);

                if (additionalDropChance == 1) {
                    entity.spawnAtLocation(new ItemStack(Items.BLAZE_ROD, additionalDropCount));
                } else if (powderDropChance == 1) {
                    entity.spawnAtLocation(new ItemStack(Items.BLAZE_POWDER, powderDropCount));
                }

                if (mandibleDropChance == 1) {
                    entity.spawnAtLocation(new ItemStack(GarnishedItems.ENFLAMED_MANDIBLE.get(), singleCount));
                }
            }

            if (MobHelper.isGhast(entity)) {
                mob = "Ghast";

                int additionalDropChance = random.nextInt(8);
                int additionalDropCount = singleCount + random.nextInt(3);
                int ghastTearDropChance = random.nextInt(12);
                int ghastTearDropCount = singleCount + random.nextInt(2);
				int ghastTendrilDropChance = random.nextInt(8);
				int ghastTendrilDropCount = singleCount + random.nextInt(2);

                if (additionalDropChance == 1) {
                    entity.spawnAtLocation(new ItemStack(Items.GUNPOWDER, additionalDropCount));
                } else if (ghastTearDropChance == 1) {
                    entity.spawnAtLocation(new ItemStack(Items.GHAST_TEAR, ghastTearDropCount));
                }

				if (ghastTendrilDropChance == 1) {
					entity.spawnAtLocation(new ItemStack(GarnishedItems.GHAST_TENDRIL.get(), ghastTendrilDropCount));
				}
            }
        }

        DevAssistance.printLootTableToConsole(enchant, mob);
    }


    public static boolean isAffectedByRavaging(Entity entity) {
        return entity.getType().is(GarnishedTags.IS_AFFECTED_BY_RAVAGING);
    }

    public static boolean isAffectedBySalvaging(Entity entity) {
        return entity.getType().is(GarnishedTags.IS_AFFECTED_BY_SALVAGING);
    }

    public static boolean hasRavaging(LivingEntity entity) {
        return hasEnchantment(ravaging, entity);
    }

    public static boolean hasSalvaging(LivingEntity entity) {
        return hasEnchantment(salvaging, entity);
    }

    public static boolean canApplyRavagingEffects(LivingEntity entity) {
        return entity.getMainHandItem().is(GarnishedTags.HATCHETS_TAG) && hasEnchantment(ravaging, entity) && entity.getHealth() <= 10;
    }



    @Unique
    private static boolean hasEnchantment(Enchantment enchantment, LivingEntity entity) {
        return EnchantmentHelper.getEnchantmentLevel(enchantment, entity) > 0;
    }

    @Unique
    private static boolean isCorrectEnchantmentLevel(Enchantment enchantment, LivingEntity entity, int level) {
        return EnchantmentHelper.getEnchantmentLevel(enchantment, entity) == level;
    }


    public static class MobHelper {
        public MobHelper() {}

        public static boolean isPhantom(Entity entity) {
            return entity.getType() == EntityType.PHANTOM;
        }

        public static boolean isWitherBoss(Entity entity) {
            return entity.getType() == EntityType.WITHER;
        }

        public static boolean isWitherSkeleton(Entity entity) {
            return entity.getType() == EntityType.WITHER_SKELETON;
        }

        public static boolean isSkeletonHorse(Entity entity) {
            return entity.getType() == EntityType.SKELETON_HORSE;
        }

        public static boolean isSkeleton(Entity entity) {
            return entity.getType() == EntityType.SKELETON;
        }

        public static boolean isSkeletonOrSimilar(Entity entity) {
            return isWitherBoss(entity) || isWitherSkeleton(entity) || isSkeleton(entity) || isSkeletonHorse(entity) || isPhantom(entity);
        }

        public static boolean isHusk(Entity entity) {
            return entity.getType() == EntityType.HUSK;
        }

        public static boolean isZombie(Entity entity) {
            return entity.getType() == EntityType.ZOMBIE;
        }

        public static boolean isZombieHorse(Entity entity) {
            return entity.getType() == EntityType.ZOMBIE_HORSE;
        }

        public static boolean isZombieOrSimilar(Entity entity) {
            return isZombie(entity) || isHusk(entity) || isZombieHorse(entity);
        }

        public static boolean isUndead(Entity entity) {
            return isZombieOrSimilar(entity) || isSkeletonOrSimilar(entity);
        }

        public static boolean isGhast(Entity entity) {
            return entity.getType() == EntityType.GHAST;
        }

        public static boolean isMagmaCube(Entity entity) {
            return entity.getType() == EntityType.MAGMA_CUBE;
        }

        public static boolean isBlaze(Entity entity) {
            return entity.getType() == EntityType.BLAZE;
        }

        public static boolean isSalmon(Entity entity) {
            return entity.getType() == EntityType.SALMON;
        }

        public static boolean isCod(Entity entity) {
            return entity.getType() == EntityType.COD;
        }

        public static boolean isPufferfish(Entity entity) {
            return entity.getType() == EntityType.PUFFERFISH;
        }

        public static boolean isTropicalFish(Entity entity) {
            return entity.getType() == EntityType.TROPICAL_FISH;
        }

        public static boolean isFish(Entity entity) {
            return isSalmon(entity) || isCod(entity) || isPufferfish(entity) || isTropicalFish(entity);
        }

        public static boolean isSquid(Entity entity) {
            return entity.getType() == EntityType.SQUID;
        }

        public static boolean isGlowSquid(Entity entity) {
            return entity.getType() == EntityType.GLOW_SQUID;
        }

        public static boolean isSquidOrSimilar(Entity entity) {
            return isSquid(entity) || isGlowSquid(entity);
        }

        public static boolean isFrog(Entity entity) {
            return entity.getType() == EntityType.FROG;
        }

        public static boolean isTadpole(Entity entity) {
            return entity.getType() == EntityType.TADPOLE;
        }

        public static boolean isFrogOrSimilar(Entity entity) {
            return isFrog(entity) || isTadpole(entity);
        }

        public static boolean isAllay(Entity entity) {
            return entity.getType() == EntityType.ALLAY;
        }
    }

    public static class DevAssistance {

        public static void printLootTableToConsole(String enchant, String mob) {
            if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
                System.out.println("[Create: Garnished] " + enchant + " Loot Tables Loaded (MobHelper.is" + mob + "(entity))");
            }
        }
    }

}
