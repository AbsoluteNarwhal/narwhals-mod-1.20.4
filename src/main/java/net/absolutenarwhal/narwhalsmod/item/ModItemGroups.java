package net.absolutenarwhal.narwhalsmod.item;

import net.absolutenarwhal.narwhalsmod.NarwhalsMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{

    public static final ItemGroup NARWHALSMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NarwhalsMod.MOD_ID, "testitem"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.testitem"))
                    .icon(() -> new ItemStack(ModItems.TESTITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TESTITEM);
                    }).build());

    public static void registerItemGroups()
    {
        NarwhalsMod.LOGGER.info("Registering Item Groups for " + NarwhalsMod.MOD_ID);
    }

}
