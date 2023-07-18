package fr.wakleg.iroxxy;

import fr.wakleg.iroxxy.block.ModBlocks;
import fr.wakleg.iroxxy.item.ModItemGroups;
import fr.wakleg.iroxxy.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static String MOD_ID = "iroxxy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}