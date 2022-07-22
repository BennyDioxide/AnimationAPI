package io.github.bennydioxide.animationapi.fabric;

import io.github.bennydioxide.animationapi.AnimationApi;
import net.fabricmc.api.ModInitializer;

public class AnimationApiFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AnimationApi.init();
    }
}