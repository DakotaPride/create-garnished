package net.dakotapride.garnished.advancements;

import com.google.gson.JsonObject;
import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.advancements.critereon.AbstractCriterionTriggerInstance;
import net.minecraft.advancements.critereon.DeserializationContext;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;

public class AnniversaryCakeTrigger extends SimpleCriterionTrigger<AnniversaryCakeTrigger.TriggerInstance> {
    private static final ResourceLocation ID = new ResourceLocation(CreateGarnished.ID, "consume_anniversary_cake_slice");

    @Override
    public @NotNull ResourceLocation getId() {
        return ID;
    }

    public void trigger(@NotNull ServerPlayer player) {
        this.trigger(player, TriggerInstance::test);
    }


	@Override
	protected @NotNull TriggerInstance createInstance(@NotNull JsonObject json, EntityPredicate.@NotNull Composite player, @NotNull DeserializationContext context) {
		return new TriggerInstance(player);
	}

	public static class TriggerInstance extends AbstractCriterionTriggerInstance {
        public TriggerInstance(EntityPredicate.Composite player) {
            super(AnniversaryCakeTrigger.ID, player);
        }

        public static TriggerInstance simple() {
            return new TriggerInstance(EntityPredicate.Composite.ANY);
        }

        public boolean test() {
            return true;
        }
    }
}

