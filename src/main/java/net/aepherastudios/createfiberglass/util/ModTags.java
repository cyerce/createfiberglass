package net.aepherastudios.createfiberglass.util;

import net.aepherastudios.createfiberglass.CreateFiberglass;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_GLASS_TOOL = tag("needs_glass_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CreateFiberglass.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(CreateFiberglass.MOD_ID, name));
        }
    }
}