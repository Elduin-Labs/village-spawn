package com.elduin.village_spawn.platform.fabric;

//? fabric {

import com.elduin.village_spawn.VillageSpawn;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ModInitializer;

@Entrypoint("main")
public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		VillageSpawn.onInitialize();
		FabricEventSubscriber.registerEvents();
	}
}
//?}
