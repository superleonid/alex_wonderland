
package net.mcreator.alexwonderland.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.alexwonderland.entity.AlexPhantomEntity;

public class AlexPhantomRenderer extends MobRenderer<AlexPhantomEntity, ChickenModel<AlexPhantomEntity>> {
	public AlexPhantomRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlexPhantomEntity entity) {
		return new ResourceLocation("alex_wonderland:textures/entities/phantom.png");
	}
}
