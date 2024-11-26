
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.alexwonderland.fluid.types.AlexLavaFluidType;
import net.mcreator.alexwonderland.AlexWonderlandMod;

public class AlexWonderlandModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, AlexWonderlandMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ALEX_LAVA_TYPE = REGISTRY.register("alex_lava", () -> new AlexLavaFluidType());
}
