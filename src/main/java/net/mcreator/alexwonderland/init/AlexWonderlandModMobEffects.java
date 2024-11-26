
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import org.checkerframework.checker.units.qual.A;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.alexwonderland.potion.AMobEffect;
import net.mcreator.alexwonderland.AlexWonderlandMod;

public class AlexWonderlandModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, AlexWonderlandMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> A = REGISTRY.register("a", () -> new AMobEffect());
}
