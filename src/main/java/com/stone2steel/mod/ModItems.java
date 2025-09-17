package com.stone2steel.mod;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Stone2Steel.MODID);

    public static final DeferredItem<Item> FLINT_AXE_HEAD =
            ITEMS.register("flint_axe_head", Item::new);
}
