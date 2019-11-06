package com.mcmoddev.searedmineralogy.smeltery.block;

import com.mcmoddev.searedmineralogy.SearedMineralogy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import slimeknights.tconstruct.smeltery.block.BlockEnumSmeltery;

public class BlockSeared extends BlockEnumSmeltery<slimeknights.tconstruct.smeltery.block.BlockSeared.SearedType> {
	private Block baseBlock;

	public static final PropertyEnum<slimeknights.tconstruct.smeltery.block.BlockSeared.SearedType> TYPE = PropertyEnum.create(
		"type",
		slimeknights.tconstruct.smeltery.block.BlockSeared.SearedType.class
	);

	public BlockSeared(Block block) {
		super(Material.ROCK, TYPE, slimeknights.tconstruct.smeltery.block.BlockSeared.SearedType.class);
		this.baseBlock = block;
		this.setCreativeTab(SearedMineralogy.CREATIVE_TAB);
//		this.setHardness(3.0F);
//		this.setResistance(20.0F);
//		this.setSoundType(SoundType.METAL);
		this.setRegistryName("seared" + block.getRegistryName());
		this.setTranslationKey(SearedMineralogy.MOD_ID + "." + this.getRegistryName());
	}

	@Override
	public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos) {
		return (this.baseBlock.getBlockHardness(blockState, worldIn, pos) * 2);
	}

	@Override
	public float getExplosionResistance(Entity exploder) {
		return (this.baseBlock.getExplosionResistance(exploder) * 2 / 3);
	}

	@Override
	public SoundType getSoundType() {
		return this.baseBlock.getSoundType();
	}
}
