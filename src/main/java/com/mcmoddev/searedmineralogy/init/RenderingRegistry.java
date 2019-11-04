package com.mcmoddev.searedmineralogy.init;

import com.mcmoddev.searedmineralogy.SearedMineralogy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = SearedMineralogy.MOD_ID, value = Side.CLIENT)
public class RenderingRegistry {

	/**
	 * @param event
	 */
	@SubscribeEvent
	public void registerRenders(ModelRegistryEvent event) {

	}

	/**
	 * @param item The item being rendered.
	 * @param meta The metadata of the item. (In case others wish to use metadata but I do not)
	 * e.g. registerItemModel(Item.getItemFromBlock(BlockObjectHolderExamples.EXAMPLE_BLOCK), 0);
	 */
	public static void registerItemModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
