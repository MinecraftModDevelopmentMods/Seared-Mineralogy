package com.mcmoddev.searedmineralogy.smeltery;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mcmoddev.mineralogy.Mineralogy;
import com.mcmoddev.searedmineralogy.smeltery.item.ItemBlockSearedMeta;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.Logger;
import slimeknights.mantle.block.EnumBlock;
import slimeknights.mantle.block.EnumBlock.IEnumMeta;
import slimeknights.mantle.item.ItemBlockMeta;
import slimeknights.mantle.pulsar.pulse.Pulse;
import slimeknights.tconstruct.common.TinkerPulse;
import slimeknights.tconstruct.library.Util;
import slimeknights.tconstruct.smeltery.block.*;
import slimeknights.tconstruct.smeltery.block.BlockSeared.SearedType;
import slimeknights.tconstruct.smeltery.item.ItemChannel;
import slimeknights.tconstruct.smeltery.item.ItemTank;

import java.util.ArrayList;
import java.util.List;

@Pulse(
	id = "TinkerSmeltery",
	description = "The smeltery and items needed for it"
)
public class TinkerSmeltery extends TinkerPulse {
	public static final String PulseId = "SearedMineralogyTinkerSmeltery";
	public static final Logger log = Util.getLogger("SearedMineralogyTinkerSmeltery");
//	@SidedProxy(
//		clientSide = "slimeknights.tconstruct.smeltery.SmelteryClientProxy",
//		serverSide = "slimeknights.tconstruct.common.CommonProxy"
//	)
	public static List<BlockSeared> searedBlocks = new ArrayList<>();
	public static List<BlockSmelteryController> smelteryControllers = new ArrayList<>();
	public static List<BlockTank> searedTanks = new ArrayList<>();
	public static List<BlockFaucet> faucets = new ArrayList<>();
	public static List<BlockChannel> channels = new ArrayList<>();
	public static List<BlockCasting> castingBlocks = new ArrayList<>();
	public static List<BlockSmelteryIO> smelteryIOs = new ArrayList<>();
	public static List<BlockSearedGlass> searedGlasses = new ArrayList<>();
	public static List<Block> searedFurnaceControllers = new ArrayList<>();
	public static List<Block> tinkerTankControllers = new ArrayList<>();
	public static List<BlockSearedSlab> searedSlabs = new ArrayList<>();
	public static List<BlockSearedSlab2> searedSlab2s = new ArrayList<>();
	public static List<Block> searedStairsStones = new ArrayList<>();
	public static List<Block> searedStairsCobbles = new ArrayList<>();
	public static List<Block> searedStairsPavers = new ArrayList<>();
	public static List<Block> searedStairsBricks = new ArrayList<>();
	public static List<Block> searedStairsBrickCrackeds = new ArrayList<>();
	public static List<Block> searedStairsBrickFancys = new ArrayList<>();
	public static List<Block> searedStairsBrickSquares = new ArrayList<>();
	public static List<Block> searedStairsBrickTriangles = new ArrayList<>();
	public static List<Block> searedStairsBrickSmalls = new ArrayList<>();
	public static List<Block> searedStairsRoads = new ArrayList<>();
	public static List<Block> searedStairsTiles = new ArrayList<>();
	public static List<Block> searedStairsCreepers = new ArrayList<>();
	public static ImmutableSet<Block> validSmelteryBlocks;
	public static ImmutableSet<Block> searedStairsSlabs;
	public static ImmutableSet<Block> validTinkerTankBlocks;
	public static ImmutableSet<Block> validTinkerTankFloorBlocks;

	public TinkerSmeltery() {
	}

	@SubscribeEvent
	public void registerBlocks(Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		Block.REGISTRY.getKeys()
			.forEach(key -> {
				if (key.getNamespace().equalsIgnoreCase(Mineralogy.MODID)
					&& !key.getPath().contains("_stairs")
					&& !key.getPath().contains("_slab")
					&& !key.getPath().contains("_wall")
					&& !key.getPath().contains("_smooth")
					&& !key.getPath().contains("_relief")
					&& !key.getPath().contains("_furnace")
					&& !key.getPath().contains("_brick")
					&& !key.getPath().contains("_ore")
					&& !key.getPath().contains("drywall_")
					&& !key.getPath().contains("lamp")
				) {
					com.mcmoddev.searedmineralogy.smeltery.block.BlockSeared blockSeared = new com.mcmoddev.searedmineralogy.smeltery.block.BlockSeared(Block.REGISTRY.getObject(key));
					BlockSeared searedBlock = registerBlock(registry, blockSeared, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath());
					searedBlocks.add(searedBlock);
					// TODO implement BlockSearedSmelteryController
//					smelteryController = registerBlock(registry, new BlockSmelteryController(), "smeltery_controller");
					// TODO implement BlockSearedTank
//					searedTank = registerBlock(registry, new BlockTank(), "seared_tank");
					// TODO implement BlockSearedFaucet
//					faucet = registerBlock(registry, new BlockFaucet(), "faucet");
					// TODO implement BlockSearedChannel
//					channel = registerBlock(registry, new BlockChannel(), "channel");
					// TODO implement BlockSearedCasting
//					castingBlock = registerBlock(registry, new BlockCasting(), "casting");
					// TODO implement BlockSearedSmelteryIO
//					smelteryIO = registerBlock(registry, new BlockSmelteryIO(), "smeltery_io");
					// TODO implement BlockSearedSearedGlass
//					searedGlass = registerBlock(registry, new BlockSearedGlass(), "seared_glass");
					// TODO implement BlockSearedSearedFurnaceController
//					searedFurnaceController = registerBlock(registry, new BlockSearedFurnaceController(), "seared_furnace_controller");
					// TODO implement BlockSearedTinkerTankController
//					tinkerTankController = registerBlock(registry, new BlockTinkerTankController(), "tinker_tank_controller");
					// TODO implement BlockSearedSlab
//					searedSlab = registerBlock(registry, new BlockSearedSlab(), "seared_slab");
					// TODO implement BlockSearedSlab2
//					searedSlab2 = registerBlock(registry, new BlockSearedSlab2(), "seared_slab2");
					// TODO implement BlockSearedSearedStairs
//					searedStairsStones.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.STONE, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_stone"));
//					searedStairsCobbles.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.COBBLE, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_cobble"));
//					searedStairsPavers.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.PAVER, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_paver"));
//					searedStairsBricks.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.BRICK, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_brick"));
//					searedStairsBrickCrackeds.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.BRICK_CRACKED, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_brick_cracked"));
//					searedStairsBrickFancys.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.BRICK_FANCY, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_brick_fancy"));
//					searedStairsBrickSquares.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.BRICK_SQUARE, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_brick_square"));
//					searedStairsBrickTriangles.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.BRICK_TRIANGLE, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_brick_triangle"));
//					searedStairsBrickSmalls.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.BRICK_SMALL, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_brick_small"));
//					searedStairsRoads.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.ROAD, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_road"));
//					searedStairsTiles.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.TILE, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_tile"));
//					searedStairsCreepers.add(registerBlockSearedStairsFrom(registry, searedBlock, SearedType.CREEPER, "seared_" + blockSeared.getBaseBlock().getRegistryName().getPath() + "_stairs_creeper"));

					// TODO implement Tile Entity classes
//					registerTE(TileSmeltery.class, "smeltery_controller");
//					registerTE(TileSmelteryComponent.class, "smeltery_component");
//					registerTE(TileTank.class, "tank");
//					registerTE(TileFaucet.class, "faucet");
//					registerTE(TileChannel.class, "channel");
//					registerTE(TileCastingTable.class, "casting_table");
//					registerTE(TileCastingBasin.class, "casting_basin");
//					registerTE(TileDrain.class, "smeltery_drain");
//					registerTE(TileSearedFurnace.class, "seared_furnace");
//					registerTE(TileTinkerTank.class, "tinker_tank");
				}
			});
	}

	@SubscribeEvent
	public void registerItems(Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		searedBlocks.forEach(searedBlock -> registerEnumItemBlock(registry, searedBlock));
		smelteryControllers.forEach(smelteryController -> registerItemBlock(registry, smelteryController));
		searedTanks.forEach(searedTank -> registerItemBlockProp(registry, new ItemTank(searedTank), BlockTank.TYPE));
		faucets.forEach(faucet -> registerItemBlock(registry, faucet));
		channels.forEach(channel -> registerItemBlock(registry, new ItemChannel(channel)));
		castingBlocks.forEach(castingBlock -> registerItemBlockProp(registry, new ItemBlockMeta(castingBlock), BlockCasting.TYPE));
		smelteryIOs.forEach(smelteryIO -> registerEnumItemBlock(registry, smelteryIO));
		searedGlasses.forEach(searedGlass -> registerEnumItemBlock(registry, searedGlass));
		searedFurnaceControllers.forEach(searedFurnaceController -> registerItemBlock(registry, searedFurnaceController));
		tinkerTankControllers.forEach(tinkerTankController -> registerItemBlock(registry, tinkerTankController));
		searedSlabs.forEach(searedSlab -> registerEnumItemBlockSlab(registry, searedSlab));
		searedSlab2s.forEach(searedSlab2 -> registerEnumItemBlockSlab(registry, searedSlab2));
		searedStairsStones.forEach(searedStairsStone -> registerItemBlock(registry, searedStairsStone));
		searedStairsCobbles.forEach(searedStairsCobble -> registerItemBlock(registry, searedStairsCobble));
		searedStairsPavers.forEach(searedStairsPaver -> registerItemBlock(registry, searedStairsPaver));
		searedStairsBricks.forEach(searedStairsBrick -> registerItemBlock(registry, searedStairsBrick));
		searedStairsBrickCrackeds.forEach(searedStairsBrickCracked -> registerItemBlock(registry, searedStairsBrickCracked));
		searedStairsBrickFancys.forEach(searedStairsBrickFancy -> registerItemBlock(registry, searedStairsBrickFancy));
		searedStairsBrickSquares.forEach(searedStairsBrickSquare -> registerItemBlock(registry, searedStairsBrickSquare));
		searedStairsBrickTriangles.forEach(searedStairsBrickTriangle -> registerItemBlock(registry, searedStairsBrickTriangle));
		searedStairsBrickSmalls.forEach(searedStairsBrickSmall -> registerItemBlock(registry, searedStairsBrickSmall));
		searedStairsRoads.forEach(searedStairsRoad -> registerItemBlock(registry, searedStairsRoad));
		searedStairsTiles.forEach(searedStairsTile -> registerItemBlock(registry, searedStairsTile));
		searedStairsCreepers.forEach(searedStairsCreeper -> registerItemBlock(registry, searedStairsCreeper));

		Builder<Block> builder = ImmutableSet.builder();
		builder.addAll(searedBlocks);
		builder.addAll(searedTanks);
		builder.addAll(smelteryIOs);
		builder.addAll(searedGlasses);
		validSmelteryBlocks = builder.build();
		validTinkerTankBlocks = builder.build();

		builder = ImmutableSet.builder();
		builder.addAll(searedBlocks);
		builder.addAll(smelteryIOs);
		builder.addAll(searedGlasses);
		validTinkerTankFloorBlocks = builder.build();

		builder = ImmutableSet.builder();
		builder.addAll(searedBlocks);
		builder.addAll(searedSlabs);
		builder.addAll(searedSlab2s);
		builder.addAll(searedStairsStones);
		builder.addAll(searedStairsCobbles);
		builder.addAll(searedStairsPavers);
		builder.addAll(searedStairsBricks);
		builder.addAll(searedStairsBrickCrackeds);
		builder.addAll(searedStairsBrickFancys);
		builder.addAll(searedStairsBrickSquares);
		builder.addAll(searedStairsBrickTriangles);
		builder.addAll(searedStairsBrickSmalls);
		builder.addAll(searedStairsRoads);
		builder.addAll(searedStairsTiles);
		builder.addAll(searedStairsCreepers);
		searedStairsSlabs = builder.build();
	}

//	@Subscribe
//	public void postInit(FMLPostInitializationEvent event) {
//		this.registerMeltingCasting();
//		Iterator var2 = castCreationFluids.iterator();
//
//		while(var2.hasNext()) {
//			FluidStack fs = (FluidStack)var2.next();
//			TinkerRegistry.registerTableCasting(new ItemStack(cast), ItemStack.EMPTY, fs.getFluid(), fs.amount);
//			TinkerRegistry.registerTableCasting(new CastingRecipe(castGem, RecipeMatch.of("gemEmerald"), fs, true, true));
//			TinkerRegistry.registerTableCasting(new CastingRecipe(castIngot, RecipeMatch.of("ingotBrick"), fs, true, true));
//			TinkerRegistry.registerTableCasting(new CastingRecipe(castIngot, RecipeMatch.of("ingotBrickNether"), fs, true, true));
//			TinkerRegistry.registerTableCasting(new CastingRecipe(castIngot, new slimeknights.mantle.util.RecipeMatch.Item(TinkerCommons.searedBrick, 1), fs, true, true));
//		}
//	}

//	private void registerMeltingCasting() {
//		int bucket = 1000;
//		TinkerRegistry.registerTableCasting(new BucketCastingRecipe(Items.BUCKET));
//		Fluid water = FluidRegistry.WATER;
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of(Blocks.ICE, bucket), water, 305));
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of(Blocks.PACKED_ICE, bucket * 2), water, 310));
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of(Blocks.SNOW, bucket), water, 305));
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of(Items.SNOWBALL, bucket / 8), water, 301));
//		TinkerRegistry.registerMelting(Items.ROTTEN_FLESH, TinkerFluids.blood, 40);
//		if (TinkerCommons.matSlimeBallBlood != null) {
//			TinkerRegistry.registerTableCasting(TinkerCommons.matSlimeBallBlood.copy(), ItemStack.EMPTY, TinkerFluids.blood, 160);
//		}
//
//		TinkerRegistry.registerMelting(TinkerCommons.matSlimeBallPurple, TinkerFluids.purpleSlime, 250);
//		ItemStack slimeblock = new ItemStack(TinkerCommons.blockSlimeCongealed, 1, SlimeType.PURPLE.meta);
//		TinkerRegistry.registerMelting(slimeblock, TinkerFluids.purpleSlime, 1000);
//		slimeblock = new ItemStack(TinkerCommons.blockSlime, 1, SlimeType.PURPLE.meta);
//		TinkerRegistry.registerMelting(slimeblock, TinkerFluids.purpleSlime, 2250);
//		TinkerRegistry.registerMelting(MeltingRecipe.forAmount(RecipeMatch.of("stone", 72), TinkerFluids.searedStone, Material.VALUE_Ore()));
//		TinkerRegistry.registerMelting(MeltingRecipe.forAmount(RecipeMatch.of("cobblestone", 72), TinkerFluids.searedStone, Material.VALUE_Ore()));
//		TinkerRegistry.registerMelting(MeltingRecipe.forAmount(RecipeMatch.of("obsidian", Material.VALUE_Ore()), TinkerFluids.obsidian, Material.VALUE_Ore()));
//		registerToolpartMeltingCasting(TinkerMaterials.obsidian);
//		TinkerRegistry.registerBasinCasting(new ItemStack(Blocks.OBSIDIAN), ItemStack.EMPTY, TinkerFluids.obsidian, Material.VALUE_Ore());
//		TinkerRegistry.registerMelting(Items.IRON_HORSE_ARMOR, TinkerFluids.iron, 576);
//		TinkerRegistry.registerMelting(Items.GOLDEN_HORSE_ARMOR, TinkerFluids.gold, 576);
//		Iterator var4 = TinkerRegistry.getToolParts().iterator();
//
//		ItemStack stack;
//		while(var4.hasNext()) {
//			IToolPart toolPart = (IToolPart)var4.next();
//			if (toolPart.canBeCasted() && toolPart instanceof MaterialItem) {
//				stack = toolPart.getItemstackWithMaterial(TinkerMaterials.stone);
//				TinkerRegistry.registerMelting(stack, TinkerFluids.searedStone, toolPart.getCost() * 72 / 144);
//			}
//		}
//
//		ItemStack blockSeared = new ItemStack(searedBlock);
//		blockSeared.setItemDamage(SearedType.STONE.getMeta());
//		TinkerRegistry.registerTableCasting(TinkerCommons.searedBrick, castIngot, TinkerFluids.searedStone, 72);
//		TinkerRegistry.registerBasinCasting(blockSeared, ItemStack.EMPTY, TinkerFluids.searedStone, 288);
//		ItemStack searedCobble = new ItemStack(searedBlock, 1, SearedType.COBBLE.getMeta());
//		TinkerRegistry.registerBasinCasting(new CastingRecipe(searedCobble, RecipeMatch.of("cobblestone"), TinkerFluids.searedStone, 216, true, false));
//		TinkerRegistry.registerBasinCasting(new CastingRecipe(new ItemStack(searedFurnaceController), RecipeMatch.of(Blocks.FURNACE), new FluidStack(TinkerFluids.searedStone, 576), true, true));
//		TinkerRegistry.registerBasinCasting(new CastingRecipe(new ItemStack(searedGlass, 1, GlassType.GLASS.getMeta()), RecipeMatch.of("blockGlass"), new FluidStack(TinkerFluids.searedStone, 288), true, true));
//		TinkerRegistry.registerMelting(searedBlock, TinkerFluids.searedStone, 288);
//		TinkerRegistry.registerMelting(TinkerCommons.searedBrick, TinkerFluids.searedStone, 72);
//		TinkerRegistry.registerMelting(MeltingRecipe.forAmount(RecipeMatch.of(TinkerCommons.grout, 72), TinkerFluids.searedStone, 24));
//		stack = new ItemStack(Blocks.DIRT, 1, 32767);
//		RecipeMatch rm = new slimeknights.mantle.util.RecipeMatch.Item(stack, 1, 144);
//		TinkerRegistry.registerMelting(MeltingRecipe.forAmount(rm, TinkerFluids.dirt, 576));
//		TinkerRegistry.registerTableCasting(TinkerCommons.mudBrick, castIngot, TinkerFluids.dirt, 144);
//		TinkerRegistry.registerMelting(TinkerCommons.mudBrick, TinkerFluids.dirt, 144);
//		TinkerRegistry.registerMelting(TinkerCommons.mudBrickBlock, TinkerFluids.dirt, 576);
//		TinkerRegistry.registerMelting(Items.CLAY_BALL, TinkerFluids.clay, 144);
//		TinkerRegistry.registerMelting(Blocks.CLAY, TinkerFluids.clay, 576);
//		TinkerRegistry.registerBasinCasting(new ItemStack(Blocks.HARDENED_CLAY), ItemStack.EMPTY, TinkerFluids.clay, 576);
//		TinkerRegistry.registerBasinCasting(new CastingRecipe(new ItemStack(Blocks.HARDENED_CLAY), RecipeMatch.of(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 32767)), new FluidStack(FluidRegistry.WATER, 250), 150, true, false));
//		if (Config.castableBricks) {
//			TinkerRegistry.registerTableCasting(new ItemStack(Items.BRICK), castIngot, TinkerFluids.clay, 144);
//		}
//
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of("gemEmerald", 666), TinkerFluids.emerald));
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of("oreEmerald", (int)(666.0D * Config.oreToIngotRatio)), TinkerFluids.emerald));
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of("blockEmerald", 5994), TinkerFluids.emerald));
//		TinkerRegistry.registerTableCasting(new ItemStack(Items.EMERALD), castGem, TinkerFluids.emerald, 666);
//		TinkerRegistry.registerBasinCasting(new ItemStack(Blocks.EMERALD_BLOCK), ItemStack.EMPTY, TinkerFluids.emerald, 5994);
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of("sand", 1000), TinkerFluids.glass));
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of("blockGlass", 1000), TinkerFluids.glass));
//		TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of("paneGlass", 375), TinkerFluids.glass));
//		TinkerRegistry.registerTableCasting(new CastingRecipe(new ItemStack(Blocks.GLASS_PANE), (RecipeMatch)null, TinkerFluids.glass, 375, 50));
//		TinkerRegistry.registerBasinCasting(new CastingRecipe(new ItemStack(TinkerCommons.blockClearGlass), (RecipeMatch)null, TinkerFluids.glass, 1000, 120));
//		TinkerRegistry.registerBasinCasting(new CastingRecipe(TinkerCommons.lavawood, RecipeMatch.of("plankWood"), new FluidStack(FluidRegistry.LAVA, 250), 100, true, false));
//		TinkerRegistry.registerBasinCasting(new CastingRecipe(new ItemStack(Blocks.SAND, 1, 1), RecipeMatch.of(new ItemStack(Blocks.SAND, 1, 0)), new FluidStack(TinkerFluids.blood, 10), true, false));
//	}

//	public static void registerAlloys() {
//		if (isSmelteryLoaded()) {
//			if (Config.obsidianAlloy) {
//				TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.obsidian, 36), new FluidStack[]{new FluidStack(FluidRegistry.WATER, 125), new FluidStack(FluidRegistry.LAVA, 125)});
//			}
//
//			TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.clay, 144), new FluidStack[]{new FluidStack(FluidRegistry.WATER, 250), new FluidStack(TinkerFluids.searedStone, 72), new FluidStack(TinkerFluids.dirt, 144)});
//			TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.knightslime, 72), new FluidStack[]{new FluidStack(TinkerFluids.iron, 72), new FluidStack(TinkerFluids.purpleSlime, 125), new FluidStack(TinkerFluids.searedStone, 144)});
//			TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.pigIron, 144), new FluidStack[]{new FluidStack(TinkerFluids.iron, 144), new FluidStack(TinkerFluids.blood, 40), new FluidStack(TinkerFluids.clay, 72)});
//			TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.manyullyn, 2), new FluidStack[]{new FluidStack(TinkerFluids.cobalt, 2), new FluidStack(TinkerFluids.ardite, 2)});
//			if (TinkerIntegration.isIntegrated(TinkerFluids.bronze) && TinkerIntegration.isIntegrated(TinkerFluids.copper) && TinkerIntegration.isIntegrated(TinkerFluids.tin)) {
//				TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.bronze, 4), new FluidStack[]{new FluidStack(TinkerFluids.copper, 3), new FluidStack(TinkerFluids.tin, 1)});
//			}
//
//			if (TinkerIntegration.isIntegrated(TinkerFluids.electrum) && TinkerIntegration.isIntegrated(TinkerFluids.gold) && TinkerIntegration.isIntegrated(TinkerFluids.silver)) {
//				TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.electrum, 2), new FluidStack[]{new FluidStack(TinkerFluids.gold, 1), new FluidStack(TinkerFluids.silver, 1)});
//			}
//
//			if (TinkerIntegration.isIntegrated(TinkerFluids.alubrass) && TinkerIntegration.isIntegrated(TinkerFluids.copper) && TinkerIntegration.isIntegrated(TinkerFluids.aluminum)) {
//				TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.alubrass, 4), new FluidStack[]{new FluidStack(TinkerFluids.copper, 1), new FluidStack(TinkerFluids.aluminum, 3)});
//			}
//
//			if (TinkerIntegration.isIntegrated(TinkerFluids.brass) && TinkerIntegration.isIntegrated(TinkerFluids.copper) && TinkerIntegration.isIntegrated(TinkerFluids.zinc)) {
//				TinkerRegistry.registerAlloy(new FluidStack(TinkerFluids.brass, 3), new FluidStack[]{new FluidStack(TinkerFluids.copper, 2), new FluidStack(TinkerFluids.zinc, 1)});
//			}
//
//		}
//	}

//	public static void registerOredictMeltingCasting(Fluid fluid, String ore) {
//		Builder<Pair<String, Integer>> builder = ImmutableSet.builder();
//		Pair<String, Integer> nuggetOre = Pair.of("nugget" + ore, 16);
//		Pair<String, Integer> ingotOre = Pair.of("ingot" + ore, 144);
//		Pair<String, Integer> blockOre = Pair.of("block" + ore, 1296);
//		Pair<String, Integer> oreOre = Pair.of("ore" + ore, Material.VALUE_Ore());
//		Pair<String, Integer> oreNetherOre = Pair.of("oreNether" + ore, (int)(288.0D * Config.oreToIngotRatio));
//		Pair<String, Integer> oreDenseOre = Pair.of("denseore" + ore, (int)(432.0D * Config.oreToIngotRatio));
//		Pair<String, Integer> orePoorOre = Pair.of("orePoor" + ore, (int)(48.0D * Config.oreToIngotRatio));
//		Pair<String, Integer> oreNuggetOre = Pair.of("oreNugget" + ore, (int)(16.0D * Config.oreToIngotRatio));
//		Pair<String, Integer> plateOre = Pair.of("plate" + ore, 144);
//		Pair<String, Integer> gearOre = Pair.of("gear" + ore, 576);
//		Pair<String, Integer> dustOre = Pair.of("dust" + ore, 144);
//		builder.add(new Pair[]{nuggetOre, ingotOre, blockOre, oreOre, oreNetherOre, oreDenseOre, orePoorOre, oreNuggetOre, plateOre, gearOre, dustOre});
//		Set<Pair<String, Integer>> knownOres = builder.build();
//		Iterator var15 = knownOres.iterator();
//
//		while(var15.hasNext()) {
//			Pair<String, Integer> pair = (Pair)var15.next();
//			TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of((String)pair.getLeft(), (Integer)pair.getRight()), fluid));
//		}
//
//		TinkerRegistry.registerTableCasting(new PreferenceCastingRecipe((String)ingotOre.getLeft(), RecipeMatch.ofNBT(castIngot), fluid, (Integer)ingotOre.getRight()));
//		TinkerRegistry.registerTableCasting(new PreferenceCastingRecipe((String)nuggetOre.getLeft(), RecipeMatch.ofNBT(castNugget), fluid, (Integer)nuggetOre.getRight()));
//		TinkerRegistry.registerBasinCasting(new PreferenceCastingRecipe((String)blockOre.getLeft(), (RecipeMatch)null, fluid, (Integer)blockOre.getRight()));
//		TinkerRegistry.registerTableCasting(new PreferenceCastingRecipe((String)plateOre.getLeft(), RecipeMatch.ofNBT(castPlate), fluid, (Integer)plateOre.getRight()));
//		TinkerRegistry.registerTableCasting(new PreferenceCastingRecipe((String)gearOre.getLeft(), RecipeMatch.ofNBT(castGear), fluid, (Integer)gearOre.getRight()));
//		var15 = castCreationFluids.iterator();
//
//		while(var15.hasNext()) {
//			FluidStack fs = (FluidStack)var15.next();
//			TinkerRegistry.registerTableCasting(new CastingRecipe(castIngot, RecipeMatch.of((String)ingotOre.getLeft()), fs, true, true));
//			TinkerRegistry.registerTableCasting(new CastingRecipe(castNugget, RecipeMatch.of((String)nuggetOre.getLeft()), fs, true, true));
//			TinkerRegistry.registerTableCasting(new CastingRecipe(castPlate, RecipeMatch.of((String)plateOre.getLeft()), fs, true, true));
//			TinkerRegistry.registerTableCasting(new CastingRecipe(castGear, RecipeMatch.of((String)gearOre.getLeft()), fs, true, true));
//		}
//
//		knownOreFluids.put(fluid, knownOres);
//	}

//	public static void registerRecipeOredictMelting() {
//		if (isSmelteryLoaded()) {
//			Iterator var0 = CraftingManager.REGISTRY.iterator();
//
//			while(true) {
//				IRecipe irecipe;
//				boolean blacklisted;
//				do {
//					do {
//						if (!var0.hasNext()) {
//							return;
//						}
//
//						irecipe = (IRecipe)var0.next();
//						blacklisted = false;
//						Iterator var3 = meltingBlacklist.iterator();
//
//						while(var3.hasNext()) {
//							ItemStack blacklistItem = (ItemStack)var3.next();
//							if (OreDictionary.itemMatches(blacklistItem, irecipe.getRecipeOutput(), false)) {
//								blacklisted = true;
//								break;
//							}
//						}
//					} while(blacklisted);
//				} while(TinkerRegistry.getMelting(irecipe.getRecipeOutput()) != null);
//
//				NonNullList<Ingredient> inputs = irecipe.getIngredients();
//				Map<Fluid, Integer> known = Maps.newHashMap();
//				Iterator var5 = inputs.iterator();
//
//				label97:
//				while(true) {
//					Ingredient ingredient;
//					do {
//						if (!var5.hasNext()) {
//							break label97;
//						}
//
//						ingredient = (Ingredient)var5.next();
//					} while(ingredient.getMatchingStacks().length == 0);
//
//					boolean found = false;
//					Iterator var8 = knownOreFluids.entrySet().iterator();
//
//					while(var8.hasNext()) {
//						Entry<Fluid, Set<Pair<String, Integer>>> entry = (Entry)var8.next();
//						Iterator var10 = ((Set)entry.getValue()).iterator();
//
//						while(var10.hasNext()) {
//							Pair<String, Integer> pair = (Pair)var10.next();
//							Iterator var12 = OreDictionary.getOres((String)pair.getLeft(), false).iterator();
//
//							while(var12.hasNext()) {
//								ItemStack itemStack = (ItemStack)var12.next();
//								if (ingredient.apply(itemStack)) {
//									Integer amount = (Integer)known.get(entry.getKey());
//									if (amount == null) {
//										amount = 0;
//									}
//
//									amount = amount + (Integer)pair.getRight();
//									known.put(entry.getKey(), amount);
//									found = true;
//									break;
//								}
//							}
//
//							if (found) {
//								break;
//							}
//						}
//
//						if (found) {
//							break;
//						}
//					}
//
//					if (!found) {
//						known.clear();
//						break;
//					}
//				}
//
//				if (known.keySet().size() == 1) {
//					Fluid fluid = (Fluid)known.keySet().iterator().next();
//					ItemStack output = irecipe.getRecipeOutput().copy();
//					if (!output.isEmpty()) {
//						int amount = (Integer)known.get(fluid) / output.getCount();
//						output.setCount(1);
//						TinkerRegistry.registerMelting(new MeltingRecipe(RecipeMatch.of(output, amount), fluid));
//						log.trace("Added automatic melting recipe for {} ({} {})", irecipe.getRecipeOutput().toString(), amount, fluid.getName());
//					}
//				}
//			}
//		}
//	}

	protected static <E extends Enum<E> & IEnumMeta & IStringSerializable> BlockSearedStairs registerBlockSearedStairsFrom(IForgeRegistry<Block> registry, EnumBlock<E> block, E value, String name) {
		return registerBlock(registry, new BlockSearedStairs(block.getDefaultState().withProperty(block.prop, value)), name);
	}

	protected static <T extends EnumBlock<?>> T registerEnumItemBlock(IForgeRegistry<Item> registry, T block) {
		ItemBlock itemBlock = new ItemBlockSearedMeta((com.mcmoddev.searedmineralogy.smeltery.block.BlockSeared) block);
		itemBlock.setTranslationKey(block.getTranslationKey());
		register(registry, itemBlock, block.getRegistryName());
		ItemBlockMeta.setMappingProperty(block, block.prop);
		return block;
	}

	protected static <T extends Block> T registerItemBlock(IForgeRegistry<Item> registry, T block) {
		ItemBlock itemBlock = new ItemBlockSearedMeta((com.mcmoddev.searedmineralogy.smeltery.block.BlockSeared) block);
		itemBlock.setTranslationKey(block.getTranslationKey());
		register(registry, itemBlock, block.getRegistryName());
		return block;
	}

	// TODO implement ItemBlockSearedProp
//	protected static <T extends Block> T registerItemBlockProp(IForgeRegistry<Item> registry, ItemBlock itemBlock, IProperty<?> property) {
//		itemBlock.setTranslationKey(itemBlock.getBlock().getTranslationKey());
//		register(registry, itemBlock, (ResourceLocation)itemBlock.getBlock().getRegistryName());
//		ItemBlockMeta.setMappingProperty(itemBlock.getBlock(), property);
//		return (T)itemBlock.getBlock();
//	}

	// TODO implement ItemBlockSearedSlab
//	protected static <T extends EnumBlockSlab<?>> T registerEnumItemBlockSlab(IForgeRegistry<Item> registry, T block) {
//		ItemBlock itemBlock = new ItemBlockSlab(block);
//		itemBlock.setTranslationKey(block.getTranslationKey());
//		register(registry, itemBlock, (ResourceLocation)block.getRegistryName());
//		ItemBlockMeta.setMappingProperty(block, block.prop);
//		return block;
//	}
}
