package net.aepherastudios.createfiberglass.item;

import net.aepherastudios.createfiberglass.CreateFiberglass;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateFiberglass.MOD_ID);

    public static final RegistryObject<Item> MULCH = ITEMS.register("mulch", () -> new Item(new Item.Properties().food(ModFoods.MULCH)));
    public static final RegistryObject<Item> FIBERGLASS_INSULATION = ITEMS.register("fiberglass_insulation", () -> new Item(new Item.Properties().food(ModFoods.FIBERGLASS_INSULATION)));
    public static final RegistryObject<Item> FIBEROPTIC_CABLE = ITEMS.register("fiberoptic_cable", () -> new Item(new Item.Properties().food(ModFoods.FIBEROPTIC_CABLE)));
    public static final RegistryObject<Item> GLASS_SHARDS = ITEMS.register("glass_shards", () -> new Item(new Item.Properties().food(ModFoods.GLASS_SHARDS)));
    public static final RegistryObject<Item> WOOD_CHIPS = ITEMS.register("wood_chips", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLASS_ROD = ITEMS.register("glass_rod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYNTHETIC_PLASTIC = ITEMS.register("synthetic_plastic", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));

    public static final RegistryObject<Item> ASBESTOS = ITEMS.register("asbestos", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> STEEL_WOOL = ITEMS.register("steel_wool", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> COKE = ITEMS.register("coke", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> COKE_DUST = ITEMS.register("coke_dust", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> SLAG = ITEMS.register("slag", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> DRYWALL = ITEMS.register("drywall", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> QUARTZ_DUST = ITEMS.register("quartz_dust", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> QUARTZ_PASTE = ITEMS.register("quartz_paste", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> UNBAKED_DRYWALL = ITEMS.register("unbaked_drywall", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));
    public static final RegistryObject<Item> INCOMPLETE_DRYWALL = ITEMS.register("incomplete_drywall", () -> new Item(new Item.Properties().food(ModFoods.SYNTHETIC_PLASTIC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
