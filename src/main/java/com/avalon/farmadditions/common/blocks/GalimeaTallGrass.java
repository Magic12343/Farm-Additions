package com.avalon.farmadditions.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

import com.avalon.farmadditions.client.util.FATags;
import com.avalon.farmadditions.core.init.BlockInit;

public class GalimeaTallGrass extends DoublePlantBlock {
	public GalimeaTallGrass(Properties properties) {
		super(properties);
	}
	
	public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
	      return worldIn.getBlockState(pos.up()).isAir();
	   }
	
	public AbstractBlock.OffsetType getOffsetType() {
	      return AbstractBlock.OffsetType.XZ;
	   }
	
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block.isIn(FATags.Blocks.GALIMEA_PLANTABLE);
	}
}
