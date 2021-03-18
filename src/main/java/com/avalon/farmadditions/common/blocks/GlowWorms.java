package com.avalon.farmadditions.common.blocks;

import com.avalon.farmadditions.client.util.FATags;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class GlowWorms extends BushBlock {
	public GlowWorms(Properties properties) {
		super(properties);
	}

	protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D);

	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      Vector3d vector3d = state.getOffset(worldIn, pos);
	      return SHAPE.withOffset(vector3d.x, vector3d.y, vector3d.z);
	   }

	   /**
	    * Get the OffsetType for this Block. Determines if the model is rendered slightly offset.
	    */
	   public AbstractBlock.OffsetType getOffsetType() {
	      return AbstractBlock.OffsetType.XZ;
	   }
	   
	   protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
			Block block = state.getBlock();
			return block.isIn(FATags.Blocks.GALIMEA_PLANTABLE);
		}
	   
	   public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		      entityIn.attackEntityFrom(DamageSource.CACTUS, 3.0F);
		   }


}
