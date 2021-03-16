package com.avalon.farmadditions.core.init;

import com.avalon.farmadditions.FarmAdditions;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			FarmAdditions.MOD_ID);

	public static final RegistryObject<Block> GLASS_CHAIN = BLOCKS
			.register("glass_chain",
					() -> new ChainBlock(AbstractBlock.Properties.create(Material.GLASS, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.GLASS).notSolid()));	
	

}
