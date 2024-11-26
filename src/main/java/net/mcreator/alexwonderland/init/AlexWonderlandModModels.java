
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.alexwonderland.client.model.Modelalexphantom;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AlexWonderlandModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelalexphantom.LAYER_LOCATION, Modelalexphantom::createBodyLayer);
	}
}
