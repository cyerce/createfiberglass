package net.aepherastudios.createfiberglass.item;

import net.aepherastudios.createfiberglass.CreateFiberglass;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateFiberglass.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATEFIBERGLASS_TAB = CREATIVE_MODE_TABS.register("createfiberglass_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FIBERGLASS_INSULATION.get()))
                    .title(Component.translatable("creativetab.createfiberglass_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MULCH.get());
                        pOutput.accept(ModItems.FIBEROPTIC_CABLE.get());
                        pOutput.accept(ModItems.FIBERGLASS_INSULATION.get());
                        pOutput.accept(ModItems.GLASS_ROD.get());
                        pOutput.accept(ModItems.GLASS_SHARDS.get());
                        pOutput.accept(ModItems.WOOD_CHIPS.get());
                        pOutput.accept(ModItems.SYNTHETIC_PLASTIC.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.STEEL_NUGGET.get());
                        pOutput.accept(ModItems.STEEL_WOOL.get());
                        pOutput.accept(ModItems.STEEL_WOOL.get());
                        pOutput.accept(ModItems.COKE.get());
                        pOutput.accept(ModItems.COKE_DUST.get());
                        pOutput.accept(ModItems.SLAG.get());
                        pOutput.accept(ModItems.DRYWALL.get());
                        pOutput.accept(ModItems.QUARTZ_DUST.get());
                        pOutput.accept(ModItems.QUARTZ_PASTE.get());
                        pOutput.accept(ModItems.ASBESTOS.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}