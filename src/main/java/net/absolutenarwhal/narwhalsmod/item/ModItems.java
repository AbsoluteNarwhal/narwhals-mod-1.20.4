package net.absolutenarwhal.narwhalsmod.item;

import net.absolutenarwhal.narwhalsmod.NarwhalsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.absolutenarwhal.narwhalsmod.block.ModBlocks.PEAT;

public class ModItems {

    public static final Item SOULMANUSCRIPT = registerItem("soulmanuscript", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(SOULMANUSCRIPT);
    }

    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(PEAT);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(NarwhalsMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        NarwhalsMod.LOGGER.info("Registering Mod Items for " + NarwhalsMod.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
    }

}
