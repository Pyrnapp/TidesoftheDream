package com.pyrnapp.tidesofthedream.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Dreamtile extends Block {

    public Dreamtile(){
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(5.0f,20f)
                .lightValue(6)
                .harvestTool(ToolType.PICKAXE)

        );
        setRegistryName("dreamtile");
    }

}
