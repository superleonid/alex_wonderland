
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.alexwonderland.fluid.AlexLavaFluid;
import net.mcreator.alexwonderland.AlexWonderlandMod;

public class AlexWonderlandModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, AlexWonderlandMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> ALEX_LAVA = REGISTRY.register("alex_lava", () -> new AlexLavaFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ALEX_LAVA = REGISTRY.register("flowing_alex_lava", () -> new AlexLavaFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ALEX_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ALEX_LAVA.get(), RenderType.translucent());
		}
	}
}
