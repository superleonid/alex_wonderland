
package net.mcreator.alexwonderland.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.alexwonderland.init.AlexWonderlandModFluids;

public class AlexLavaBlock extends LiquidBlock {
	public AlexLavaBlock() {
		super(AlexWonderlandModFluids.ALEX_LAVA.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
