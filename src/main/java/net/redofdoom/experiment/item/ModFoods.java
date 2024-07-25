package net.redofdoom.experiment.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(3).saturationModifier(0.2F).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 200),1F).build();
}
