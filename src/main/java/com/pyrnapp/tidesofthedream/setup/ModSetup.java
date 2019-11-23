package com.pyrnapp.tidesofthedream.setup;

import com.pyrnapp.tidesofthedream.common.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("tidesofthedream"){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.DREAMTILE);
        }
    };

    public void init(){

    }
}
