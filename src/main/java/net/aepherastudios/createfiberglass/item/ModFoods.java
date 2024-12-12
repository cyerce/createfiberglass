package net.aepherastudios.createfiberglass.item;

import net.aepherastudios.createfiberglass.effect.ModEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties MULCH = new FoodProperties.Builder().alwaysEat()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.MULCH.get(), 12000, 1, true, true, true), 1f)
            .build();
    public static final FoodProperties FIBEROPTIC_CABLE = new FoodProperties.Builder().alwaysEat()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.FIBER_OPTIC.get(), 12000, 1, true, true, true), 1f)
            .build();
    public static final FoodProperties FIBERGLASS_INSULATION = new FoodProperties.Builder().alwaysEat()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.INTERNAL_BLEEDING.get(), 12000, 1, true, true, true), 1f)
            .build();
    public static final FoodProperties GLASS_SHARDS = new FoodProperties.Builder().alwaysEat()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.INTERNAL_BLEEDING.get(), 12000, 1, true, true, true), 1f)
            .build();
    public static final FoodProperties SYNTHETIC_PLASTIC = new FoodProperties.Builder().alwaysEat()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.PLASTIC_POISONING.get(), 12000, 1, true, true, true), 1f)
            .build();

}
