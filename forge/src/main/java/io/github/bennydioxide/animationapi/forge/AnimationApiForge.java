package io.github.bennydioxide.animationapi.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.bennydioxide.animationapi.AnimationApi;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AnimationApi.MOD_ID)
public class AnimationApiForge {
    public AnimationApiForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AnimationApi.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        AnimationApi.init();
    }
}