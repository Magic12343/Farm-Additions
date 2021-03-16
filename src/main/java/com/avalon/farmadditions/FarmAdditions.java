package com.avalon.farmadditions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.avalon.farmadditions.core.init.BlockInit;
import com.avalon.farmadditions.core.init.ItemInit;
import com.avalon.farmadditions.world.OreGeneration;

import net.minecraft.entity.item.PaintingType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(FarmAdditions.MOD_ID)
public class FarmAdditions 
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "farmadditions";

	public FarmAdditions() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
		
	}

	private void setup(final FMLCommonSetupEvent event) {

	}
	
	{

        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(PaintingType.class, this::registerPaintings);
    }

		
		 private void registerPaintings (Register<PaintingType> event) {
		        
		        final IForgeRegistry<PaintingType> registry = event.getRegistry();
		        
		        

		    }
		    
		    private PaintingType createPainting (String id, int width, int height) {
		        
		        final PaintingType type = new PaintingType(width, height);
		        type.setRegistryName("glasscraftery", id);
		        return type;
		    }
	}

