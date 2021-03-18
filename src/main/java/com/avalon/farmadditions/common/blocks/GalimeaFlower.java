package com.avalon.farmadditions.common.blocks;

import com.avalon.farmadditions.client.util.FATags;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class GalimeaFlower extends BushBlock{
	public GalimeaFlower(Properties properties) {
		super(properties);
	}
	
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
	
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
