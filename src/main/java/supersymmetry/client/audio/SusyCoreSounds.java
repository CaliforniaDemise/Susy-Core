package supersymmetry.client.audio;

import gregtechfoodoption.GTFOValues;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import supersymmetry.SuSyValues;
import supersymmetry.Supersymmetry;

public class SusyCoreSounds {
    public static SoundEvent KNAPPING;

    public static void registerSounds() {
        KNAPPING = registerSound("knapping");
    }

    private static SoundEvent registerSound(String soundNameIn) {
        ResourceLocation location = new ResourceLocation(Supersymmetry.MODID, soundNameIn);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(location);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
