package com.mcmoddev.searedmineralogy.init;

import com.mcmoddev.searedmineralogy.SearedMineralogy;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = SearedMineralogy.MOD_ID)
public class BlockRegistry {

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(

		);
	}

	/**
	 * @param block The block being registered.
	 * @param name The name of the block in string form. e.g. "example_block" (Must be the lower case form of it's object holder entry!)
	 * @return
	 * e.g. nameBlock(new ExampleBlock(), "example_block")
	 */
	public static Block nameBlock(Block block, String name) {
		block
			.setRegistryName(name)
			.setTranslationKey(SearedMineralogy.MOD_ID + "." + name)
			.setCreativeTab(SearedMineralogy.CREATIVE_TAB);
		return block;
	}
}
