package com.avalon.farmadditions.client.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;

public class FATags {
	
	public static class Items {
		@SuppressWarnings("unused")
		private static ITag.INamedTag<Item> createTag(String name) {
			return ItemTags.makeWrapperTag("farmadditions:" + name);
		}
	}

	public static class Blocks {
		public static final ITag.INamedTag<Block> GALIMEA_PLANTABLE = createTag("galimea_plantable");

		private static ITag.INamedTag<Block> createTag(String name) {
			return BlockTags.makeWrapperTag("farmadditions:" + name);
		}
	}


}
