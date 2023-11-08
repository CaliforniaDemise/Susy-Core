package supersymmetry.client.audio;

import gregtechfoodoption.GTFOValues;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SusyCoreSounds {
    public static SoundEvent KNAPPING;

    public static void registerSounds() {
        KNAPPING = registerSound("microwave.finish");
    }

    private static SoundEvent registerSound(String soundNameIn) {
        ResourceLocation location = new ResourceLocation(GTFOValues.MODID, soundNameIn);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(location);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
