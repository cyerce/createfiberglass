package net.aepherastudios.createfiberglass.effect;

import net.aepherastudios.createfiberglass.CreateFiberglass;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CreateFiberglass.MOD_ID);

    public static final RegistryObject<MobEffect> FIBER_OPTIC = MOB_EFFECTS.register("fiber_optic",
            () -> new FiberOpticEffect(MobEffectCategory.HARMFUL, 25518819));

    public static final RegistryObject<MobEffect> INTERNAL_BLEEDING = MOB_EFFECTS.register("internal_bleeding",
            () -> new InternalBleedingEffect(MobEffectCategory.HARMFUL, 25518819));

    public static final RegistryObject<MobEffect> MULCH = MOB_EFFECTS.register("mulch",
            () -> new MulchEffect(MobEffectCategory.HARMFUL, 25518819));

    public static final RegistryObject<MobEffect> PLASTIC_POISONING = MOB_EFFECTS.register("plastic_poisoning",
            () -> new PlasticPoisoningEffect(MobEffectCategory.HARMFUL, 25518819));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
