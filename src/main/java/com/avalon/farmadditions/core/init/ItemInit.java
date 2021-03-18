package com.avalon.farmadditions.core.init;

import com.avalon.farmadditions.FarmAdditions;
import com.avalon.farmadditions.common.blocks.CrateBlockItem;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
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
    //Items
	public static final RegistryObject<BlockItem> COTTON_SEEDS = ITEMS.register("cotton_seeds",
			() -> new BlockItem(BlockInit.COTTON_CROP.get(), new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> COTTON = ITEMS.register("cotton", () -> new Item(new Item.Properties().group(ItemGroup.MISC)))));
	
	public static final RegistryObject<BlockItem> GRAPES = ITEMS.register("grapes",
			() -> new BlockItem(BlockInit.GRAPES_VINE.get(), new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).build())));
	
	public static final RegistryObject<Item> PEAR = ITEMS.register("pear", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7)
			.build())));
	
	public static final RegistryObject<BlockItem> OPUNTIA_FRUIT = ITEMS.register("opuntia_fruit",
			() -> new BlockItem(BlockInit.OPUNTIA_CACTUS.get(), new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3)
					.build())));

	
	// Block Items
	public static final RegistryObject<BlockItem> VINEYARD_WOOD = ITEMS.register("vineyard_wood",
			() -> new BlockItem(BlockInit.VINEYARD_WOOD.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> VINEYARD_LEAVES = ITEMS.register("vineyard_leaves",
			() -> new BlockItem(BlockInit.VINEYARD_LEAVES.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> VINEYARD_PLANKS = ITEMS.register("vineyard_planks",
			() -> new BlockItem(BlockInit.VINEYARD_PLANKS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> VINEYARD_SLAB = ITEMS.register("vineyard_slab",
			() -> new BlockItem(BlockInit.VINEYARD_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> VINEYARD_STAIRS = ITEMS.register("vineyard_stairs",
			() -> new BlockItem(BlockInit.VINEYARD_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> VINEYARD_FENCE = ITEMS.register("vineyard_fence",
			() -> new BlockItem(BlockInit.VINEYARD_FENCE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> VINEYARD_BUTTON = ITEMS.register("vineyard_button",
			() -> new BlockItem(BlockInit.VINEYARD_BUTTON.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> VINEYARD_PRESSURE_PLATE = ITEMS.register("vineyard_pressure_plate",
			() -> new BlockItem(BlockInit.VINEYARD_PRESSURE_PLATE.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> VINEYARD_DOOR = ITEMS.register("vineyard_door",
			() -> new BlockItem(BlockInit.VINEYARD_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> VINEYARD_TRAPDOOR = ITEMS.register("vineyard_trapdoor",
			() -> new BlockItem(BlockInit.VINEYARD_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	
	public static final RegistryObject<BlockItem> PALM_BOT = ITEMS.register("palm_bot",
			() -> new BlockItem(BlockInit.PALM_BOT.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> PALM_MID = ITEMS.register("palm_mid",
			() -> new BlockItem(BlockInit.PALM_MID.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> PALM_TOP = ITEMS.register("palm_top",
			() -> new BlockItem(BlockInit.PALM_TOP.get(),
					new Item.Properties().group(null)));
	
	public static final RegistryObject<BlockItem> ROSE = ITEMS.register("rose",
			() -> new BlockItem(BlockInit.ROSE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> BOUGAINVILLEA = ITEMS.register("bougainvillea",
			() -> new BlockItem(BlockInit.BOUGAINVILLEA.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));

	public static final RegistryObject<BlockItem> WHITE_COTTON_BLOCK = ITEMS.register("white_cotton_block",
			() -> new BlockItem(BlockInit.WHITE_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ORANGE_COTTON_BLOCK = ITEMS.register("orange_cotton_block",
			() -> new BlockItem(BlockInit.ORANGE_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> MAGENTA_COTTON_BLOCK = ITEMS.register("magenta_cotton_block",
			() -> new BlockItem(BlockInit.MAGENTA_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_COTTON_BLOCK = ITEMS.register("light_blue_cotton_block",
			() -> new BlockItem(BlockInit.LIGHT_BLUE_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> YELLOW_COTTON_BLOCK = ITEMS.register("yellow_cotton_block",
			() -> new BlockItem(BlockInit.YELLOW_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> LIME_COTTON_BLOCK = ITEMS.register("lime_cotton_block",
			() -> new BlockItem(BlockInit.LIME_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> PINK_COTTON_BLOCK = ITEMS.register("pink_cotton_block",
			() -> new BlockItem(BlockInit.PINK_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> GREY_COTTON_BLOCK = ITEMS.register("grey_cotton_block",
			() -> new BlockItem(BlockInit.GREY_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> LIGHT_GRAY_COTTON_BLOCK = ITEMS.register("light_gray_cotton_block",
			() -> new BlockItem(BlockInit.LIGHT_GRAY_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CYAN_COTTON_BLOCK = ITEMS.register("cyan_cotton_block",
			() -> new BlockItem(BlockInit.CYAN_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> PURPLE_COTTON_BLOCK = ITEMS.register("purple_cotton_block",
			() -> new BlockItem(BlockInit.PURPLE_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BLUE_COTTON_BLOCK = ITEMS.register("blue_cotton_block",
			() -> new BlockItem(BlockInit.BLUE_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BROWN_COTTON_BLOCK = ITEMS.register("brown_cotton_block",
			() -> new BlockItem(BlockInit.BROWN_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> GREEN_COTTON_BLOCK = ITEMS.register("green_cotton_block",
			() -> new BlockItem(BlockInit.GREEN_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> RED_COTTON_BLOCK = ITEMS.register("red_cotton_block",
			() -> new BlockItem(BlockInit.RED_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BLACK_COTTON_BLOCK = ITEMS.register("black_cotton_block",
			() -> new BlockItem(BlockInit.BLACK_COTTON_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> GALIMEA_MOSS = ITEMS.register("galimea_moss",
			() -> new BlockItem(BlockInit.GALIMEA_MOSS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> GALIAMUS = ITEMS.register("galiamus",
			() -> new BlockItem(BlockInit.GALIAMUS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> GALIAMUS_LEAVES = ITEMS.register("galiamus_leaves",
			() -> new BlockItem(BlockInit.GALIAMUS_LEAVES.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> GALIAMUS_LEAVES_MOLTEN_FRUIT = ITEMS.register("galiamus_leaves_molten_fruit",
			() -> new BlockItem(BlockInit.GALIAMUS_LEAVES_MOLTEN_FRUIT.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> GALIMEA_SPROUTS = ITEMS.register("galimea_sprouts",
			() -> new BlockItem(BlockInit.GALIMEA_SPROUTS.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> TALL_GALIMEA = ITEMS.register("tall_galimea",
			() -> new BlockItem(BlockInit.TALL_GALIMEA.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> GLOW_WORMS = ITEMS.register("glow_worms",
			() -> new BlockItem(BlockInit.GLOW_WORMS.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> CRATE = ITEMS.register("empty_crate",
			() -> new BlockItem(BlockInit.CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> STARDROP = ITEMS.register("stardrop",
			() -> new BlockItem(BlockInit.STARDROP.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> TALL_STARDROP = ITEMS.register("tall_stardrop",
			() -> new BlockItem(BlockInit.TALL_STARDROP.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_APPLE_CRATE = ITEMS.register("low_apple_crate",
			() -> new CrateBlockItem(BlockInit.LOW_APPLE_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_APPLE_CRATE = ITEMS.register("medium_apple_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_APPLE_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_APPLE_CRATE = ITEMS.register("full_apple_crate",
			() -> new CrateBlockItem(BlockInit.FULL_APPLE_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_CARROT_CRATE = ITEMS.register("low_carrot_crate",
			() -> new CrateBlockItem(BlockInit.LOW_CARROT_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_CARROT_CRATE = ITEMS.register("medium_carrot_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_CARROT_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_CARROT_CRATE = ITEMS.register("full_carrot_crate",
			() -> new CrateBlockItem(BlockInit.FULL_CARROT_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_BEETROT_CRATE = ITEMS.register("low_beetrot_crate",
			() -> new CrateBlockItem(BlockInit.LOW_BEETROT_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_BEETROT_CRATE = ITEMS.register("medium_beetrot_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_BEETROT_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_BEETROT_CRATE = ITEMS.register("full_beetrot_crate",
			() -> new CrateBlockItem(BlockInit.FULL_BEETROT_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_POTATO_CRATE = ITEMS.register("low_potato_crate",
			() -> new CrateBlockItem(BlockInit.LOW_POTATO_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_POTATO_CRATE = ITEMS.register("medium_potato_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_POTATO_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_POTATO_CRATE = ITEMS.register("full_potato_crate",
			() -> new CrateBlockItem(BlockInit.FULL_POTATO_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_BERRIES_CRATE = ITEMS.register("low_berries_crate",
			() -> new CrateBlockItem(BlockInit.LOW_BERRIES_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_BERRIES_CRATE = ITEMS.register("medium_berries_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_BERRIES_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_BERRIES_CRATE = ITEMS.register("full_berries_crate",
			() -> new CrateBlockItem(BlockInit.FULL_BERRIES_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_CHORUS_CRATE = ITEMS.register("low_chorus_crate",
			() -> new CrateBlockItem(BlockInit.LOW_CHORUS_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_CHORUS_CRATE = ITEMS.register("medium_chorus_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_CHORUS_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_CHORUS_CRATE = ITEMS.register("full_chorus_crate",
			() -> new CrateBlockItem(BlockInit.FULL_CHORUS_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_COCOA_CRATE = ITEMS.register("low_cocoa_crate",
			() -> new CrateBlockItem(BlockInit.LOW_COCOA_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_COCOA_CRATE = ITEMS.register("medium_cocoa_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_COCOA_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_COCOA_CRATE = ITEMS.register("full_cocoa_crate",
			() -> new CrateBlockItem(BlockInit.FULL_COCOA_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_GOLDEN_APPLE_CRATE = ITEMS.register("low_golden_apple_crate",
			() -> new CrateBlockItem(BlockInit.LOW_GOLDEN_APPLE_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_GOLDEN_APPLE_CRATE = ITEMS.register("medium_golden_apple_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_GOLDEN_APPLE_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_GOLDEN_APPLE_CRATE = ITEMS.register("full_golden_apple_crate",
			() -> new CrateBlockItem(BlockInit.FULL_GOLDEN_APPLE_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_GOLDEN_CARROT_CRATE = ITEMS.register("low_golden_carrot_crate",
			() -> new CrateBlockItem(BlockInit.LOW_GOLDEN_CARROT_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_GOLDEN_CARROT_CRATE = ITEMS.register("medium_golden_carrot_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_GOLDEN_CARROT_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_GOLDEN_CARROT_CRATE = ITEMS.register("full_golden_carrot_crate",
			() -> new CrateBlockItem(BlockInit.FULL_GOLDEN_CARROT_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_KELP_CRATE = ITEMS.register("low_kelp_crate",
			() -> new CrateBlockItem(BlockInit.LOW_KELP_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_KELP_CRATE = ITEMS.register("medium_kelp_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_KELP_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_KELP_CRATE = ITEMS.register("full_kelp_crate",
			() -> new CrateBlockItem(BlockInit.FULL_KELP_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_WART_CRATE = ITEMS.register("low_wart_crate",
			() -> new CrateBlockItem(BlockInit.LOW_WART_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_WART_CRATE = ITEMS.register("medium_wart_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_WART_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_WART_CRATE = ITEMS.register("full_wart_crate",
			() -> new CrateBlockItem(BlockInit.FULL_WART_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_CACTUS_CRATE = ITEMS.register("low_cactus_crate",
			() -> new CrateBlockItem(BlockInit.LOW_CACTUS_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_CACTUS_CRATE = ITEMS.register("medium_cactus_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_CACTUS_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_CACTUS_CRATE = ITEMS.register("full_cactus_crate",
			() -> new CrateBlockItem(BlockInit.FULL_CACTUS_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_PEAR_CRATE = ITEMS.register("low_pear_crate",
			() -> new CrateBlockItem(BlockInit.LOW_PEAR_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_PEAR_CRATE = ITEMS.register("medium_pear_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_PEAR_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_PEAR_CRATE = ITEMS.register("full_pear_crate",
			() -> new CrateBlockItem(BlockInit.FULL_PEAR_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_GRAPES_CRATE = ITEMS.register("low_grapes_crate",
			() -> new CrateBlockItem(BlockInit.LOW_GRAPES_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_GRAPES_CRATE = ITEMS.register("medium_grapes_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_GRAPES_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_GRAPES_CRATE = ITEMS.register("full_grapes_crate",
			() -> new CrateBlockItem(BlockInit.FULL_GRAPES_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_OPUNTIA_CRATE = ITEMS.register("low_opuntia_crate",
			() -> new CrateBlockItem(BlockInit.LOW_OPUNTIA_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_OPUNTIA_CRATE = ITEMS.register("medium_opuntia_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_OPUNTIA_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_OPUNTIA_CRATE = ITEMS.register("full_opuntia_crate",
			() -> new CrateBlockItem(BlockInit.FULL_OPUNTIA_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> LOW_MOLTEN_BERRIES_CRATE = ITEMS.register("low_molten_berries_crate",
			() -> new CrateBlockItem(BlockInit.LOW_MOLTEN_BERRIES_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> MEDIUM_MOLTEN_BERRIES_CRATE = ITEMS.register("medium_molten_berries_crate",
			() -> new CrateBlockItem(BlockInit.MEDIUM_MOLTEN_BERRIES_CRATE.get(),
					new Item.Properties().group(null)));
	public static final RegistryObject<BlockItem> FULL_MOLTEN_BERRIES_CRATE = ITEMS.register("full_molten_berries_crate",
			() -> new CrateBlockItem(BlockInit.FULL_MOLTEN_BERRIES_CRATE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> POTTED_ROSE = ITEMS.register("potted_rose",
			() -> new CrateBlockItem(BlockInit.POTTED_ROSE.get(),
					new Item.Properties().group(null)));
	


}
