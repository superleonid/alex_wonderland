
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.alexwonderland.client.renderer.LavaPetRenderer;
import net.mcreator.alexwonderland.client.renderer.AlexPhantomRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlexWonderlandModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AlexWonderlandModEntities.LAVA_PET.get(), LavaPetRenderer::new);
		event.registerEntityRenderer(AlexWonderlandModEntities.LAVA_PET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AlexWonderlandModEntities.ALEX_PHANTOM.get(), AlexPhantomRenderer::new);
	}
}
