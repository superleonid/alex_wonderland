
package net.mcreator.alexwonderland.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;

import net.mcreator.alexwonderland.procedures.AOnEffectActiveTickProcedure;

public class AMobEffect extends InstantenousMobEffect {
	public AMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -65536);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		AOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
