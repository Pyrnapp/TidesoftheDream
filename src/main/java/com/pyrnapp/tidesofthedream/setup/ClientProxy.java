package com.pyrnapp.tidesofthedream.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements Iproxy{

    @Override
    public void init(){

    }


    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
