package com.avalon.farmadditions.core.init;

import com.avalon.farmadditions.FarmAdditions;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			FarmAdditions.MOD_ID);


	// Block Items
	public static final RegistryObject<BlockItem> GLASS_CHAIN = ITEMS.register("glass_chain",
			() -> new BlockItem(BlockInit.GLASS_CHAIN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	


}
