package com.pyrnapp.tidesofthedream.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TileSlurry extends Block {

    public TileSlurry(){
        super(Properties.create(Material.ROCK)
                .sound(SoundType.SAND)
                .hardnessAndResistance(2.0f,20f)
                //.lightValue(1)
                .harvestTool(ToolType.SHOVEL)

        );
        setRegistryName("tileslurry");
    }

}


