package com.pyrnapp.tidesofthedream.common.items;

import com.pyrnapp.tidesofthedream.TidesoftheDream;
import net.minecraft.item.Item;

public class DreamFlute extends Item {

    public DreamFlute() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(TidesoftheDream.setup.itemGroup));
        setRegistryName("dreamflute");
    }
}
