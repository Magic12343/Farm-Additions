package com.avalon.farmadditions.client.util;

import com.avalon.farmadditions.FarmAdditions;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = FarmAdditions.MOD_ID)
public class FAAdvancements {
	public static final EmptyTrigger PICK_GRAPES = CriteriaTriggers.register(new EmptyTrigger(prefix("pick_grapes")));

	private static ResourceLocation prefix(String name) {
		return new ResourceLocation(FarmAdditions.MOD_ID, name);

}}