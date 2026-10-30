package net.vykket.abnormalcamps;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(AbnormalCamps.MODID)
public class AbnormalCamps {

    public static final String MODID = "abnormalcamps";

    public AbnormalCamps(IEventBus modEventBus, ModContainer modContainer) {

        MapDecorations.REGISTRIES.register(modEventBus);

    }
}