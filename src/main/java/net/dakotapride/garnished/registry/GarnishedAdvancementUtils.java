package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.advancements.AnniversaryCakeTrigger;
import net.dakotapride.garnished.advancements.DejojoTheAwsomeTrigger;
import net.minecraft.advancements.CriteriaTriggers;

public class GarnishedAdvancementUtils {
    public static AnniversaryCakeTrigger CONSUME_ANNIVERSARY_CAKE_SLICE = new AnniversaryCakeTrigger();
	public static DejojoTheAwsomeTrigger DEJOJO = new DejojoTheAwsomeTrigger();

    public static void register() {
        CriteriaTriggers.register(CONSUME_ANNIVERSARY_CAKE_SLICE);
        CriteriaTriggers.register(DEJOJO);
    }
}
