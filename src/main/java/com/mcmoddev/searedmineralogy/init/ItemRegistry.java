package com.mcmoddev.searedmineralogy.init;

import com.mcmoddev.searedmineralogy.SearedMineralogy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = SearedMineralogy.MOD_ID)
public class ItemRegistry {

	/**
	 * @param event
	 */
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(

		);
	}

	/**
	 * @param block The block being registered usually called from it's object holder class
	 * @return
	 * e.g. nameBlockItem(BlockObjectHolderExample.BIRCH_PLANKS)
	 */
	public static ItemBlock nameBlockItem(Block block) {
		ItemBlock item = new ItemBlock(block);
		ResourceLocation name = block.getRegistryName();
		item.setRegistryName(name);
		return item;
	}

	/**
	 * @param item The item being registered.
	 * @param name The name of the item in string form. e.g. "example_block" (Must be the lower case form of it's object holder entry!)
	 * @return
	 * e.g. nameItem(new ItemExample(), "example_item")
	 */
	public static Item nameItem(Item item, String name) {
		item
			.setRegistryName(name)
			.setTranslationKey(SearedMineralogy.MOD_ID + "." + name)
			.setCreativeTab(SearedMineralogy.CREATIVE_TAB);
		return item;
	}
}
