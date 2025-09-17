package com.stone2steel.mod;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Špecializovaný register len pre itemy (1.21+)
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Stone2Steel.MODID);

    // ✅ správna registrácia – helper nastaví ID za teba
    // (môžeš použiť aj registerItem(..., Item::new, new Item.Properties()))
    public static final DeferredItem<Item> FLINT_AXE_HEAD =
            ITEMS.registerSimpleItem("flint_axe_head");
}
