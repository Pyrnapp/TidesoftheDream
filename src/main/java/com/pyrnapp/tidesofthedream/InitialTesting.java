package com.pyrnapp.tidesofthedream;

import com.pyrnapp.tidesofthedream.blocks.Blazewood;
import com.pyrnapp.tidesofthedream.blocks.ModBlocks;
import com.pyrnapp.tidesofthedream.setup.ClientProxy;
import com.pyrnapp.tidesofthedream.setup.Iproxy;
import com.pyrnapp.tidesofthedream.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("tidesofthedream")
public class InitialTesting {

    public static Iproxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public InitialTesting() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        //// Register the enqueueIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        //// Register the processIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        //// Register the doClientStuff method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        //MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //// some preinit code
        //LOGGER.info("HELLO FROM PREINIT");
        //LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }

    //private void doClientStuff(final FMLClientSetupEvent event) {
    //    // do something that can only be done on the client
    //    LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    //}

    //private void enqueueIMC(final InterModEnqueueEvent event) {
    //    // some example code to dispatch IMC to another mod
    //    InterModComms.sendTo("examplemod", "helloworld", () -> {
    //        LOGGER.info("Hello world from the MDK");
    //        return "Hello world";
    //    });
    //}

    //private void processIMC(final InterModProcessEvent event) {
    //    // some example code to receive and process InterModComms from other mods
    //    LOGGER.info("Got IMC {}", event.getIMCStream().
    //            map(m -> m.getMessageSupplier().get()).
    //            collect(Collectors.toList()));
    //}

    //// You can use SubscribeEvent and let the Event Bus discover methods to call
    //@SubscribeEvent
    //public void onServerStarting(FMLServerStartingEvent event) {
    //    // do something when the server starts
    //    LOGGER.info("HELLO from server starting");
    //}

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            //Print to console for modloading confirmation
            LOGGER.info("Tides of the Dream begin block loading");

            // register a new block here
            blockRegistryEvent.getRegistry().register(new Blazewood());


        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            //Print to console for modloading confirmation
            LOGGER.info("Tides of the Dream begin item loading");

            // register a new item here
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.BLAZEWOOD, new Item.Properties()).setRegistryName("assets/blazewood"));


        }
    }
}