package com.avalon.farmadditions.common.blocks;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CrateBlockItem extends BlockItem{
	@Deprecated
	   private final Block block;

	   public CrateBlockItem(Block blockIn, Item.Properties builder) {
	      super(blockIn, builder);
	      this.block = blockIn;
	   }
	@OnlyIn(Dist.CLIENT)
	   public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	      tooltip.add(this.getDescription().mergeStyle(TextFormatting.AQUA));
	   }   
	
	@OnlyIn(Dist.CLIENT)
	   public IFormattableTextComponent getDescription() {
	      return new TranslationTextComponent("crate." + getTranslationKey() + ".desc");
	   }

}
