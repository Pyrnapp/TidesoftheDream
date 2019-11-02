package com.pyrnapp.tidesofthedream.setup;

import net.minecraft.world.World;

public class ServerProxy implements Iproxy {

    @Override
    public void init(){

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on client.");
    }
}
