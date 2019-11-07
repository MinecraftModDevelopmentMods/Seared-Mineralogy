package com.mcmoddev.searedmineralogy;

import com.mcmoddev.mineralogy.Mineralogy;
import com.mcmoddev.searedmineralogy.smeltery.TinkerSmeltery;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import slimeknights.tconstruct.TConstruct;

@Mod(
	name = SearedMineralogy.NAME,
	modid = SearedMineralogy.MOD_ID,
	version = SearedMineralogy.VERSION,
	updateJSON = "https://raw.githubusercontent.com/MinecraftModDevelopmentMods/Seared-Mineralogy/master/update.json",
	certificateFingerprint = "@FINGERPRINT@",
	acceptedMinecraftVersions = "[1.12, 1.12.2]",
	dependencies = SearedMineralogy.DEPENDENCIES
)
public class SearedMineralogy {
	public static final String NAME = "Seared Mineralogy";
	public static final String MOD_ID = "searedmineralogy";
	public static final String VERSION = "1.0.0";
	public static final Logger LOGGER = LogManager.getLogger(NAME);
	static final String DEPENDENCIES = ""
		+ "required-after:" + TConstruct.modID + "; "
//		+ "required-after:" + ConstructsArmory.MODID + "; "
		+ "required-after:" + Mineralogy.MODID
		;

	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs(MOD_ID) {
		@Override
		public ItemStack createIcon() {
			//TODO Replace with our own block.
			return TinkerSmeltery.searedBlocks.isEmpty() ? new ItemStack(Blocks.FURNACE) : new ItemStack(TinkerSmeltery.searedBlocks.stream().findFirst().get());
		}
	};

//	@Mod.EventHandler
//	public void preInit(FMLPreInitializationEvent event) {
//		TConstruct.pulseManager.registerPulse(new TinkerSmeltery());
//	}

	@Mod.EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
		LOGGER.error("Invalid fingerprint detected! The file " + event.getSource().getName() +
			" may have been tampered with. This version will NOT be supported! "
			+ "Please download the mod from CurseForge for a supported and signed version of the mod.");
	}

	static {
		TConstruct.pulseManager.registerPulse(new TinkerSmeltery());
	}
}
