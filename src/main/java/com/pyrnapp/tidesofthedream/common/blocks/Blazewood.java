package com.pyrnapp.tidesofthedream.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Blazewood extends Block {

    public Blazewood(){
        super(Properties.create(Material.WOOD)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.0f,20f)
                .lightValue(5)
                .harvestTool(ToolType.AXE)
                
        );
        setRegistryName("blazewood");
    }

}
