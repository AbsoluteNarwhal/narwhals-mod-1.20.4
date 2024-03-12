package net.absolutenarwhal.narwhalsmod.item;

import net.absolutenarwhal.narwhalsmod.NarwhalsMod;
import net.absolutenarwhal.narwhalsmod.block.ModBlocks;
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
            new Identifier(NarwhalsMod.MOD_ID, "narwhalsmodgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.narwhalsmodgroup"))
                    .icon(() -> new ItemStack(ModItems.SOUL_MANUSCRIPT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SOUL_MANUSCRIPT);
                        entries.add(ModBlocks.PEAT);
                    }).build());

    public static void registerItemGroups()
    {
        NarwhalsMod.LOGGER.info("Registering Item Groups for " + NarwhalsMod.MOD_ID);
    }

}
