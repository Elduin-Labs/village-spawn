package com.elduin.village_spawn.platform.fabric;

//? fabric {

import com.elduin.village_spawn.VillageSpawn;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ClientModInitializer;

@Entrypoint("client")
public class FabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		VillageSpawn.onInitializeClient();
	}

}
//?}
