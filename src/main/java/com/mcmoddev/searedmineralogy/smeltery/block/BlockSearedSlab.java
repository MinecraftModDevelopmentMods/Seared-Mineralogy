package com.mcmoddev.searedmineralogy.smeltery.block;

import com.mcmoddev.searedmineralogy.SearedMineralogy;
import com.mcmoddev.searedmineralogy.smeltery.ISearedObject;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSearedSlab extends slimeknights.tconstruct.smeltery.block.BlockSearedSlab implements ISearedObject {
	private Block baseBlock;

	public BlockSearedSlab(Block block) {
		this.baseBlock = block;
		this.setCreativeTab(SearedMineralogy.CREATIVE_TAB);
	}

	public Block getBaseBlock() {
		return baseBlock;
	}

	@Override
	public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos) {
		return (this.baseBlock.getBlockHardness(blockState, worldIn, pos) * 2);
	}

	@Override
	public float getExplosionResistance(Entity exploder) {
		return (this.baseBlock.getExplosionResistance(exploder) * 2 / 3);
	}

	public static String getSearedType(int meta) {
		return SearedType.values()[meta].name();
	}
}
