
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.alexwonderland.AlexWonderlandMod;

public class AlexWonderlandModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, AlexWonderlandMod.MODID);
	public static final DeferredHolder<Potion, Potion> A_POTION = REGISTRY.register("a_potion", () -> new Potion(new MobEffectInstance(AlexWonderlandModMobEffects.A, 72000, 10, true, true)));
}
