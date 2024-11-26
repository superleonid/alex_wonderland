
package net.mcreator.alexwonderland.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;

public class HdhdBlock extends FlowerBlock {
	public HdhdBlock() {
		super(MobEffects.MOVEMENT_SPEED, 100,
				BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().lightLevel(s -> 15).noCollission().replaceable().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader world, BlockPos pos, Player player) {
		return new ItemStack(Blocks.PURPLE_CANDLE_CAKE);
	}
}
