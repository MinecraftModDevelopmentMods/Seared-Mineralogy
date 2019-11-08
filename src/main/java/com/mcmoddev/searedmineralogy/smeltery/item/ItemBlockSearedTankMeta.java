package com.mcmoddev.searedmineralogy.smeltery.item;

import com.mcmoddev.searedmineralogy.smeltery.ISearedObject;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;

public class ItemBlockSearedTankMeta extends ItemBlockSearedMeta {
	public ItemBlockSearedTankMeta(Block block) {
		super(block);
	}

	@Override
	@MethodsReturnNonnullByDefault
	public String getItemStackDisplayName(ItemStack stack) {
		return new TextComponentTranslation(
			"tile.searedmineralogy.seared_tank.name",
			((ISearedObject)this.getBlock()).getBaseBlock().getLocalizedName()
		).getFormattedText();
	}
}
