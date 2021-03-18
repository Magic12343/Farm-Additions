package com.avalon.farmadditions.client.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;

import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraft.advancements.PlayerAdvancements;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.loot.ConditionArrayParser;
import net.minecraft.loot.ConditionArraySerializer;
import net.minecraft.util.ResourceLocation;

/**
 * @author - SmellyModder(Luke Tonon)
 */
public final class EmptyTrigger implements ICriterionTrigger<EmptyTrigger.Instance> {
	private final Map<PlayerAdvancements, Listeners> listeners = Maps.newHashMap();
	private final ResourceLocation id;

	public EmptyTrigger(ResourceLocation id) {
		this.id = id;
	}

	@Override
	public ResourceLocation getId() {
		return this.id;
	}

	@Override
	public void addListener(PlayerAdvancements playerAdvancements, Listener<Instance> listener) {
		Listeners listeners = this.listeners.computeIfAbsent(playerAdvancements, Listeners::new);
		listeners.add(listener);
	}

	@Override
	public void removeListener(PlayerAdvancements playerAdvancements, Listener<Instance> listener) {
		Listeners listeners = this.listeners.get(playerAdvancements);
		if (listeners != null) {
			listeners.remove(listener);
			if (listeners.isEmpty()) {
				this.listeners.remove(playerAdvancements);
			}
		}
	}

	@Override
	public void removeAllListeners(PlayerAdvancements playerAdvancements) {
		this.listeners.remove(playerAdvancements);
	}

	public Instance deserialize(JsonObject object, ConditionArrayParser conditions) {
		return new Instance(this.id);
	}

	public void trigger(ServerPlayerEntity player) {
		Listeners listeners = this.listeners.get(player.getAdvancements());
		if (listeners != null) {
			listeners.trigger();
		}
	}

	public static class Instance implements ICriterionInstance {
		private final ResourceLocation id;

		Instance(ResourceLocation id) {
			super();
			this.id = id;
		}

		@Override
		public ResourceLocation getId() {
			return this.id;
		}

		public JsonObject serialize(ConditionArraySerializer conditions) {
			return new JsonObject();
		}

		public JsonObject func_230240_a_(ConditionArraySerializer p_230240_1_) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	static class Listeners {
		private final Set<Listener<Instance>> listeners = new HashSet<>();
		private final PlayerAdvancements advancements;

		public Listeners(PlayerAdvancements advancements) {
			this.advancements = advancements;
		}

		public void add(Listener<Instance> listener) {
			this.listeners.add(listener);
		}

		public void remove(Listener<Instance> listener) {
			this.listeners.remove(listener);
		}

		public boolean isEmpty() {
			return this.listeners.isEmpty();
		}

		public void trigger() {
			List<Listener<Instance>> listenerList = new ArrayList<>(this.listeners);
			for (Listener<Instance> instanceListener : listenerList) {
				instanceListener.grantCriterion(this.advancements);
			}
		}
	}

	public Instance func_230307_a_(JsonObject p_230307_1_, ConditionArrayParser p_230307_2_) {
		// TODO Auto-generated method stub
		return null;
	}
}