
package net.mcreator.alexwonderland.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.alexwonderland.entity.LavaPetEntity;

public class LavaPetRenderer extends MobRenderer<LavaPetEntity, SlimeModel<LavaPetEntity>> {
	public LavaPetRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LavaPetEntity entity) {
		return new ResourceLocation("alex_wonderland:textures/entities/lavapet.png");
	}
}
