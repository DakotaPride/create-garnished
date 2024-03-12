package net.dakotapride.garnished.registry.utility;

import com.simibubi.create.foundation.utility.LangBuilder;
import joptsimple.internal.Strings;
import net.minecraft.network.chat.MutableComponent;

import java.util.List;

public class GarnishedLangBuilder extends LangBuilder {
	public GarnishedLangBuilder(String namespace) {
		super(namespace);
	}

	@Override
	public void forGoggles(List<? super MutableComponent> tooltip, int indents) {
		tooltip.add(GarnishedLang.builder()
				.text(Strings.repeat(' ', 4 + indents))
				.add(this)
				.component());
	}
}
