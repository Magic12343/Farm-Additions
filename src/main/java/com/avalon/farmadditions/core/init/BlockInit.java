package com.avalon.farmadditions.core.init;

import java.util.function.ToIntFunction;

import com.avalon.farmadditions.FarmAdditions;
import com.avalon.farmadditions.common.blocks.FACropBlock;
import com.avalon.farmadditions.common.blocks.GalimeaBush;
import com.avalon.farmadditions.common.blocks.GalimeaFlower;
import com.avalon.farmadditions.common.blocks.GalimeaTallGrass;
import com.avalon.farmadditions.common.blocks.GlowWorms;
import com.avalon.farmadditions.common.blocks.GrapeVineBlock;
import com.avalon.farmadditions.common.blocks.OpuntiaCactus;
import com.avalon.farmadditions.common.blocks.PressureButtonBlock;
import com.avalon.farmadditions.common.blocks.WoodenButtonBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.NyliumBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			FarmAdditions.MOD_ID);

	//Vineyard
		public static final RegistryObject<Block> VINEYARD_WOOD = BLOCKS.register("vineyard_wood",
				() -> new WallBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> VINEYARD_LEAVES = BLOCKS.register("vineyard_leaves", 
				() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES).harvestLevel(0).harvestTool(ToolType.HOE).hardnessAndResistance(0.0f, 0.0f)));
		public static final RegistryObject<Block> GRAPES_VINE = BLOCKS.register("grapes_vine", 
				() -> new GrapeVineBlock(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly().notSolid()));
		
		  //Vineyard Planks
		
		public static final RegistryObject<Block> VINEYARD_PLANKS = BLOCKS.register("vineyard_planks", 
				() -> new Block(Block.Properties.from(Blocks.OAK_PLANKS).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(3.0f, 2.0f).sound(SoundType.WOOD)));
		public static final RegistryObject<Block> VINEYARD_SLAB = BLOCKS.register("vineyard_slab", 
				() -> new SlabBlock(Block.Properties.from(Blocks.OAK_PLANKS).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(3.0f, 2.0f).sound(SoundType.WOOD)));
		public static final RegistryObject<Block> VINEYARD_STAIRS = BLOCKS.register("vineyard_stairs", 
				() -> new StairsBlock(Blocks.OAK_PLANKS::getDefaultState, Block.Properties.from(Blocks.OAK_PLANKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 2.0f)));
		public static final RegistryObject<Block> VINEYARD_FENCE = BLOCKS.register("vineyard_fence", 
				() -> new FenceBlock(Block.Properties.from(Blocks.OAK_PLANKS).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(3.0f, 2.0f).sound(SoundType.WOOD)));
		public static final RegistryObject<Block> VINEYARD_FENCE_GATE = BLOCKS.register("vineyard_fence_gate", 
				() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_PLANKS).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(3.0f, 2.0f).sound(SoundType.WOOD)));
		public static final RegistryObject<Block> VINEYARD_BUTTON = BLOCKS.register("vineyard_button",
				() -> new WoodenButtonBlock(Block.Properties.create(Material.ROCK)));
		public static final RegistryObject<Block> VINEYARD_PRESSURE_PLATE = BLOCKS.register("vineyard_pressure_plate",
				() -> new PressureButtonBlock(Sensitivity.EVERYTHING,
						Block.Properties.create(Material.WOOD)));
		public static final RegistryObject<Block> VINEYARD_DOOR = BLOCKS.register("vineyard_door", 
				() -> new DoorBlock(Block.Properties.from(Blocks.OAK_PLANKS).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(3.0f, 2.0f).sound(SoundType.WOOD)));
		public static final RegistryObject<Block> VINEYARD_TRAPDOOR = BLOCKS.register("vineyard_trapdoor", 
				() -> new TrapDoorBlock(Block.Properties.from(Blocks.OAK_PLANKS).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(3.0f, 2.0f).sound(SoundType.WOOD)));

		
		//Minipalm
		
		public static final RegistryObject<Block> PALM_BOT = BLOCKS.register("palm_bot",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> PALM_MID = BLOCKS.register("palm_mid",
				() -> new WallBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> PALM_TOP = BLOCKS.register("palm_top",
				() -> new SlabBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		//Flowers
		public static final RegistryObject<Block> ROSE = BLOCKS.register("rose",
				() -> new FlowerBlock(Effects.SATURATION, 0, AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));
		public static final RegistryObject<Block> BOUGAINVILLEA = BLOCKS.register("bougainvillea",
				() -> new TallFlowerBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));
		
		
		//Cotton
		public static final RegistryObject<Block> COTTON_CROP = BLOCKS.register("cotton_crop",
				() -> new FACropBlock(Block.Properties.from(Blocks.POTATOES)));
		
		public static final RegistryObject<Block> WHITE_COTTON_BLOCK = BLOCKS.register("white_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> BLACK_COTTON_BLOCK = BLOCKS.register("black_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> BLUE_COTTON_BLOCK = BLOCKS.register("blue_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> BROWN_COTTON_BLOCK = BLOCKS.register("brown_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> CYAN_COTTON_BLOCK = BLOCKS.register("cyan_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> GREEN_COTTON_BLOCK = BLOCKS.register("green_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> GREY_COTTON_BLOCK = BLOCKS.register("grey_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> LIGHT_BLUE_COTTON_BLOCK = BLOCKS.register("light_blue_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> LIGHT_GRAY_COTTON_BLOCK = BLOCKS.register("light_gray_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> LIME_COTTON_BLOCK = BLOCKS.register("lime_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> MAGENTA_COTTON_BLOCK = BLOCKS.register("magenta_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> ORANGE_COTTON_BLOCK = BLOCKS.register("orange_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> PINK_COTTON_BLOCK = BLOCKS.register("pink_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> PURPLE_COTTON_BLOCK = BLOCKS.register("purple_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> RED_COTTON_BLOCK = BLOCKS.register("red_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		public static final RegistryObject<Block> YELLOW_COTTON_BLOCK = BLOCKS.register("yellow_cotton_block",
				() -> new Block(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).harvestLevel(0).hardnessAndResistance(1.0f, 1.0f)));
		
		//Crates
		
		public static final RegistryObject<Block> CRATE = BLOCKS.register("empty_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		   //Apple
		
		public static final RegistryObject<Block> LOW_APPLE_CRATE = BLOCKS.register("low_apple_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_APPLE_CRATE = BLOCKS.register("medium_apple_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_APPLE_CRATE = BLOCKS.register("full_apple_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Carrot
		
		public static final RegistryObject<Block> LOW_CARROT_CRATE = BLOCKS.register("low_carrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_CARROT_CRATE = BLOCKS.register("medium_carrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_CARROT_CRATE = BLOCKS.register("full_carrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));

		   //Potato
		
		public static final RegistryObject<Block> LOW_POTATO_CRATE = BLOCKS.register("low_potato_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_POTATO_CRATE = BLOCKS.register("medium_potato_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_POTATO_CRATE = BLOCKS.register("full_potato_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Beetrot
		
		public static final RegistryObject<Block> LOW_BEETROT_CRATE = BLOCKS.register("low_beetrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_BEETROT_CRATE = BLOCKS.register("medium_beetrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_BEETROT_CRATE = BLOCKS.register("full_beetrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Sweet Berries
		
		public static final RegistryObject<Block> LOW_BERRIES_CRATE = BLOCKS.register("low_berries_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_BERRIES_CRATE = BLOCKS.register("medium_berries_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_BERRIES_CRATE = BLOCKS.register("full_berries_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Chorus Fruit
		
		public static final RegistryObject<Block> LOW_CHORUS_CRATE = BLOCKS.register("low_chorus_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_CHORUS_CRATE = BLOCKS.register("medium_chorus_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_CHORUS_CRATE = BLOCKS.register("full_chorus_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Cocoa
		
		public static final RegistryObject<Block> LOW_COCOA_CRATE = BLOCKS.register("low_cocoa_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_COCOA_CRATE = BLOCKS.register("medium_cocoa_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_COCOA_CRATE = BLOCKS.register("full_cocoa_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Golden Apple
		
		public static final RegistryObject<Block> LOW_GOLDEN_APPLE_CRATE = BLOCKS.register("low_golden_apple_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_GOLDEN_APPLE_CRATE = BLOCKS.register("medium_golden_apple_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_GOLDEN_APPLE_CRATE = BLOCKS.register("full_golden_apple_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Golden Carrot
		
		public static final RegistryObject<Block> LOW_GOLDEN_CARROT_CRATE = BLOCKS.register("low_golden_carrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_GOLDEN_CARROT_CRATE = BLOCKS.register("medium_golden_carrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_GOLDEN_CARROT_CRATE = BLOCKS.register("full_golden_carrot_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Kelp
		
		public static final RegistryObject<Block> LOW_KELP_CRATE = BLOCKS.register("low_kelp_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_KELP_CRATE = BLOCKS.register("medium_kelp_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_KELP_CRATE = BLOCKS.register("full_kelp_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Wart
		
		public static final RegistryObject<Block> LOW_WART_CRATE = BLOCKS.register("low_wart_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_WART_CRATE = BLOCKS.register("medium_wart_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_WART_CRATE = BLOCKS.register("full_wart_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		
		   //Pear
		
		public static final RegistryObject<Block> LOW_PEAR_CRATE = BLOCKS.register("low_pear_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_PEAR_CRATE = BLOCKS.register("medium_pear_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_PEAR_CRATE = BLOCKS.register("full_pear_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		   
		   //Grapes
		
		public static final RegistryObject<Block> LOW_GRAPES_CRATE = BLOCKS.register("low_grapes_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_GRAPES_CRATE = BLOCKS.register("medium_grapes_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_GRAPES_CRATE = BLOCKS.register("full_grapes_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));	
		
		   //Cactus
		
		public static final RegistryObject<Block> LOW_CACTUS_CRATE = BLOCKS.register("low_cactus_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_CACTUS_CRATE = BLOCKS.register("medium_cactus_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_CACTUS_CRATE = BLOCKS.register("full_cactus_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));	
		   //Molten Berries
		
		public static final RegistryObject<Block> LOW_MOLTEN_BERRIES_CRATE = BLOCKS.register("low_molten_berries_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_MOLTEN_BERRIES_CRATE = BLOCKS.register("medium_molten_berries_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_MOLTEN_BERRIES_CRATE = BLOCKS.register("full_molten_berries_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));	
		
		//Cactus
		
				
		//Galimea Enderlands
		
		   //Blocks
		public static final RegistryObject<Block> GALIMEA_MOSS = BLOCKS.register("galimea_moss",
				() -> new NyliumBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.WARPED_NYLIUM).setRequiresTool().hardnessAndResistance(0.4F).sound(SoundType.NYLIUM).tickRandomly()));
		
		public static final RegistryObject<Block> GALIAMUS = BLOCKS.register("galiamus",
				() -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> GALIAMUS_LEAVES = BLOCKS.register("galiamus_leaves", 
				() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES).harvestLevel(0).harvestTool(ToolType.HOE).hardnessAndResistance(0.0f, 0.0f)));
		public static final RegistryObject<Block> GALIAMUS_LEAVES_MOLTEN_FRUIT = BLOCKS.register("galiamus_leaves_molten_fruit", 
				() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES).harvestLevel(0).harvestTool(ToolType.HOE).hardnessAndResistance(0.0f, 0.0f)));
		
		
		   //Vegetation - Light Fauna
		
		public static final RegistryObject<Block> TALL_GALIMEA = BLOCKS.register("tall_galimea", 
				() -> new GalimeaTallGrass(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));
		public static final RegistryObject<Block> GALIMEA_SPROUTS = BLOCKS.register("galimea_sprouts", 
				() -> new GalimeaBush(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));
		public static final RegistryObject<Block> GLOW_WORMS = BLOCKS.register("glow_worms", 
				() -> new GlowWorms(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT).setLightLevel(value -> 7)));
		public static final RegistryObject<Block> STARDROP = BLOCKS.register("stardrop", 
				() -> new GalimeaFlower(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT).setLightLevel(value -> 12)));
		public static final RegistryObject<Block> TALL_STARDROP = BLOCKS.register("tall_stardrop", 
				() -> new GalimeaTallGrass(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT).setLightLevel(value -> 15)));

		//Opuntia Cactus
		public static final RegistryObject<Block> OPUNTIA_CACTUS = BLOCKS.register("opuntia_cactus", 
				() -> new OpuntiaCactus(Block.Properties.from(Blocks.CACTUS).harvestLevel(0).harvestTool(ToolType.HOE).hardnessAndResistance(2.0f, 0.4f).sound(SoundType.PLANT)));
		
		public static final RegistryObject<Block> LOW_OPUNTIA_CRATE = BLOCKS.register("low_opuntia_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> MEDIUM_OPUNTIA_CRATE = BLOCKS.register("medium_opuntia_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		public static final RegistryObject<Block> FULL_OPUNTIA_CRATE = BLOCKS.register("full_opuntia_crate",
				() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));	
		//Cross-content
		   
		   //Crates
		   
		      //Atmospheric
		
		      public static final RegistryObject<Block> FULL_ALOE_CRATE = BLOCKS.register("full_aloe_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_PASSIONFRUIT_CRATE = BLOCKS.register("full_passionfruit_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_SHIMMERING_PASSIONFRUIT_CRATE = BLOCKS.register("full_shimmering_passionfruit_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_YUCCA_CRATE = BLOCKS.register("full_yucca_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_BARREL_CACTUS_CRATE = BLOCKS.register("full_barrel_cactus_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));

		      //Autumnity
		      
		      public static final RegistryObject<Block> FULL_FOUL_BERRIES_CRATE = BLOCKS.register("full_foul_berries_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));

		      //Bayou Blues
		      
		      public static final RegistryObject<Block> FULL_GOOSEBERRIES_CRATE = BLOCKS.register("full_gooseberries_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Enchanced Mushrooms
		      
		      public static final RegistryObject<Block> FULL_BROWN_MUSHROOM_CRATE = BLOCKS.register("full_brown_mushroom_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_RED_MUSHROOM_CRATE = BLOCKS.register("full_red_mushroom_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Endergetic
		      
		      public static final RegistryObject<Block> FULL_BOLLOOM_FRUIT_CRATE = BLOCKS.register("full_bolloom_fruit_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Enviromental
		      
		      public static final RegistryObject<Block> FULL_CHERRIES_CRATE = BLOCKS.register("full_cherries_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Frozen Up
		      
		      public static final RegistryObject<Block> FULL_TRUFFLE_CRATE = BLOCKS.register("full_truffle_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_FROZEN_TRUFFLE_CRATE = BLOCKS.register("full_frozen_truffle_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Neapolitan
		      
		      public static final RegistryObject<Block> FULL_ADZUKI_CRATE = BLOCKS.register("full_adzuki_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_BANANA_CRATE = BLOCKS.register("full_banana_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_MINT_CRATE = BLOCKS.register("full_mint_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_STRAWBERRIES_CRATE = BLOCKS.register("full_strawberries_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_WHITE_STRAWBERRIES_CRATE = BLOCKS.register("full_white_strawberries_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_VANILLA_CRATE = BLOCKS.register("full_vanilla_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Nether Extension
		      
		      public static final RegistryObject<Block> FULL_CRIMSON_FUNGUS_CRATE = BLOCKS.register("full_crimson_fungus_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_WARPED_FUNGUS_CRATE = BLOCKS.register("full_warped_fungus_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_SHROOMFRUIT_CRATE = BLOCKS.register("full_shroomfruit_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_TWISTED_SHROOMFRUIT_CRATE = BLOCKS.register("full_twisted_shroomfruit_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Outer End
		      
		      public static final RegistryObject<Block> FULL_AZURE_BERRIES_CRATE = BLOCKS.register("full_azure_berries_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Quark
		      
		      public static final RegistryObject<Block> FULL_ROOT_CRATE = BLOCKS.register("full_root_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_GLOWSHROOM_CRATE = BLOCKS.register("full_glowshroom_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      //Upgrade Aquatic
		      
		      public static final RegistryObject<Block> FULL_BLUE_PICKERELWEED_CRATE = BLOCKS.register("full_blue_pickerelweed_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_PURPLE_PICKERELWEED_CRATE = BLOCKS.register("full_purple_pickerelweed_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_MULBERRY_CRATE = BLOCKS.register("full_mulberry_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_OCHRE_KELP_CRATE = BLOCKS.register("full_ochre_kelp_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_POLAR_KELP_CRATE = BLOCKS.register("full_polar_kelp_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_THORNY_KELP_CRATE = BLOCKS.register("full_thorny_kelp_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      public static final RegistryObject<Block> FULL_TONGUE_KELP_CRATE = BLOCKS.register("full_tongue_kelp_crate",
				      () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 2.0f)));
		      
		      
		 //Flower Pots
		      public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose",
				      () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ROSE, getProperties(Blocks.POTTED_CORNFLOWER)));
		      
		      

		      public static AbstractBlock.Properties getProperties(Block block) {
		  		return AbstractBlock.Properties.from(block);
		  	}
}
	


