package com.avalon.farmadditions.client.util;

import com.avalon.farmadditions.FarmAdditions;
import com.avalon.farmadditions.core.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FarmAdditions.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {


		RenderTypeLookup.setRenderLayer(BlockInit.PALM_TOP.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.ROSE.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.COTTON_CROP.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BOUGAINVILLEA.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GRAPES_VINE.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.TALL_GALIMEA.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OPUNTIA_CACTUS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GLOW_WORMS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.STARDROP.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.TALL_STARDROP.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GALIMEA_SPROUTS.get(), RenderType.getCutout());
		

;
		
	}
}