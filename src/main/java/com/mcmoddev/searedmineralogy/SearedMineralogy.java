package com.mcmoddev.searedmineralogy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	name = SearedMineralogy.NAME,
	modid = SearedMineralogy.MOD_ID,
	version = SearedMineralogy.VERSION,
	updateJSON = "https://raw.githubusercontent.com/MinecraftModDevelopmentMods/Seared-Mineralogy/master/update.json",
	certificateFingerprint = "@FINGERPRINT@",
	acceptedMinecraftVersions = "[1.12, 1.12.2]"
	//TODO Fill in the dependencies list.
	//dependencies = ""
)
public class SearedMineralogy {

	public static final String NAME = "Seared Mineralogy";
	public static final String MOD_ID = "searedmineralogy";
	public static final String VERSION = "1.0.0";
	public static final Logger LOGGER = LogManager.getLogger(NAME);

	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs(MOD_ID) {
		@Override
		public ItemStack createIcon() {
			//TODO Replace with our own block.
			return new ItemStack(Blocks.FURNACE);
		}
	};

	@Mod.EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
		LOGGER.error("Invalid fingerprint detected! The file " + event.getSource().getName() +
			" may have been tampered with. This version will NOT be supported! "
			+ "Please download the mod from CurseForge for a supported and signed version of the mod.");
	}
}
