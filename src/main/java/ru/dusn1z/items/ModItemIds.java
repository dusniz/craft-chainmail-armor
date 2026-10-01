package ru.dusn1z.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import ru.dusn1z.CraftChainmailArmor;

public class ModItemIds {
    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, CraftChainmailArmor.id(name));
    }

    public static final ResourceKey<Item> CHAINMESH = create("chainmesh");
}