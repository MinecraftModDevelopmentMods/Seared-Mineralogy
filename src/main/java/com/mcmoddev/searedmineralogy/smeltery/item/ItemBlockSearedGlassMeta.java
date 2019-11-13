package com.mcmoddev.searedmineralogy.smeltery.item;

import com.mcmoddev.searedmineralogy.smeltery.ISearedObject;
import com.mcmoddev.searedmineralogy.smeltery.block.BlockSeared;
import com.mcmoddev.searedmineralogy.smeltery.block.BlockSearedGlass;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import slimeknights.mantle.item.ItemBlockMeta;

public class ItemBlockSearedGlassMeta extends ItemBlockMeta {
	public ItemBlockSearedGlassMeta(Block block) {
		super(block);
	}

	@Override
	@MethodsReturnNonnullByDefault
	public String getItemStackDisplayName(ItemStack stack) {
		return new TextComponentTranslation(
//			"tile.searedmineralogy.seared_glass." + BlockSearedGlass.getGlassType(stack.getMetadata()).toLowerCase() + ".name",
			"tile.searedmineralogy.seared_glass.glass.name",
			((ISearedObject)this.getBlock()).getBaseBlock().getLocalizedName()
		).getFormattedText();
	}
}
