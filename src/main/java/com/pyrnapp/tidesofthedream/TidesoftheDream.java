package com.pyrnapp.tidesofthedream;

//Imports
import com.pyrnapp.tidesofthedream.common.blocks.Blazewood;
import com.pyrnapp.tidesofthedream.common.blocks.ModBlocks;
import com.pyrnapp.tidesofthedream.setup.ClientProxy;
import com.pyrnapp.tidesofthedream.setup.Iproxy;
import com.pyrnapp.tidesofthedream.setup.ModSetup;
import com.pyrnapp.tidesofthedream.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.*;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Designates the entry point of the Mod. This is the central class. Fill with modid
//@Mod(modid = "tidesofthedream", name = "Tides of the Dream", version = "1.0.0", dependencies = "", useMetadata = true)
@Mod(TidesoftheDream.MODID)

public class TidesoftheDream {
    //MODID and VERSION
    public static final String MODID = "tidesofthedream";
    //Semantic Versioning
    public static final String VERSION = "1.0.0";

    //Proxy. Still don't understand it.
    public static Iproxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    //Mod setup class
    public static ModSetup setup = new ModSetup();

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public TidesoftheDream(){
        LOGGER.debug("Hello from TotD!");

        // Register the setup method for modloading. Copied from examplemod, purpose unknown.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        setup.init();
        proxy.init();
        LOGGER.info("HELLO FROM PREINIT");

    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events
    //Copied from examplemod, purpose unknown
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents{
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            //Print to console for modloading confirmation
            LOGGER.info("Tides of the Dream begin block loading");

            // register a new block here
            event.getRegistry().register(new Blazewood());


        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            //Print to console for modloading confirmation
            LOGGER.info("Tides of the Dream begin item loading");

            //Creating group for Creative
            Item.Properties properties = new Item.Properties()
                    .group(setup.itemGroup);

            // register a new item here
            event.getRegistry().register(new BlockItem(ModBlocks.BLAZEWOOD, properties).setRegistryName("blazewood"));


        }

    }

}
