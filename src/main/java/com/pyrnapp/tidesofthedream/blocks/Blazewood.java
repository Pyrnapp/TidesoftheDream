package com.pyrnapp.tidesofthedream.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Blazewood extends Block {

    public Blazewood(){
        super(Properties.create(Material.WOOD)
                .sound(SoundType.SLIME)
                .hardnessAndResistance(2.0f)
                .lightValue(14)
        );
        setRegistryName("assets/blazewood");
    }

}
