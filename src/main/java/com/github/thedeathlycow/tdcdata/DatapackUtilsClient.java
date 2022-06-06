package com.github.thedeathlycow.tdcdata;

import com.github.thedeathlycow.tdcdata.client.UnobtainableItemGroup;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.item.ItemGroup;

public class DatapackUtilsClient implements ClientModInitializer {

    public static final ItemGroup UNOBTAINABLES = UnobtainableItemGroup.create();

    @Override
    public void onInitializeClient() {
        DatapackUtils.LOGGER.info("Datapack Utilities client initialized!");
    }
}
