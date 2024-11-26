
package net.mcreator.alexwonderland.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.alexwonderland.init.AlexWonderlandModItems;
import net.mcreator.alexwonderland.init.AlexWonderlandModFluids;
import net.mcreator.alexwonderland.init.AlexWonderlandModFluidTypes;
import net.mcreator.alexwonderland.init.AlexWonderlandModBlocks;

public abstract class AlexLavaFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> AlexWonderlandModFluidTypes.ALEX_LAVA_TYPE.get(), () -> AlexWonderlandModFluids.ALEX_LAVA.get(),
			() -> AlexWonderlandModFluids.FLOWING_ALEX_LAVA.get()).explosionResistance(100f).levelDecreasePerBlock(8).slopeFindDistance(16).bucket(() -> AlexWonderlandModItems.ALEX_LAVA_BUCKET.get())
			.block(() -> (LiquidBlock) AlexWonderlandModBlocks.ALEX_LAVA.get());

	private AlexLavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AlexLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AlexLavaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
