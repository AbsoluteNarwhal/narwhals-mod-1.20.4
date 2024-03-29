package net.absolutenarwhal.narwhalsmod;

import net.absolutenarwhal.narwhalsmod.block.ModBlocks;
import net.absolutenarwhal.narwhalsmod.item.ModItemGroups;
import net.absolutenarwhal.narwhalsmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NarwhalsMod implements ModInitializer {

	public static final String MOD_ID = "narwhalsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModBlocks.PEAT, 400);
	}
}