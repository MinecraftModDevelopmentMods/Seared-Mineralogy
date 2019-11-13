package com.mcmoddev.searedmineralogy.smeltery.item;

import com.mcmoddev.searedmineralogy.smeltery.ISearedObject;
import com.mcmoddev.searedmineralogy.smeltery.block.BlockSeared;
import com.mcmoddev.searedmineralogy.smeltery.block.BlockSearedCasting;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import slimeknights.mantle.item.ItemBlockMeta;

public class ItemBlockSearedCastingMeta extends ItemBlockMeta {
	public ItemBlockSearedCastingMeta(Block block) {
		super(block);
	}

	@Override
	@MethodsReturnNonnullByDefault
	public String getItemStackDisplayName(ItemStack stack) {
		return new TextComponentTranslation(
			"tile.searedmineralogy.seared_casting." + BlockSearedCasting.getCastingType(stack.getMetadata()).toLowerCase() + ".name",
			((ISearedObject)this.getBlock()).getBaseBlock().getLocalizedName()
		).getFormattedText();
	}
}
