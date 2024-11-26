
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.alexwonderland.entity.LavaPetEntityProjectile;
import net.mcreator.alexwonderland.entity.LavaPetEntity;
import net.mcreator.alexwonderland.entity.AlexPhantomEntity;
import net.mcreator.alexwonderland.AlexWonderlandMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AlexWonderlandModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, AlexWonderlandMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<LavaPetEntity>> LAVA_PET = register("lava_pet",
			EntityType.Builder.<LavaPetEntity>of(LavaPetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LavaPetEntityProjectile>> LAVA_PET_PROJECTILE = register("projectile_lava_pet",
			EntityType.Builder.<LavaPetEntityProjectile>of(LavaPetEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlexPhantomEntity>> ALEX_PHANTOM = register("alex_phantom",
			EntityType.Builder.<AlexPhantomEntity>of(AlexPhantomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.4f, 0.7f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(SpawnPlacementRegisterEvent event) {
		LavaPetEntity.init(event);
		AlexPhantomEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LAVA_PET.get(), LavaPetEntity.createAttributes().build());
		event.put(ALEX_PHANTOM.get(), AlexPhantomEntity.createAttributes().build());
	}
}
