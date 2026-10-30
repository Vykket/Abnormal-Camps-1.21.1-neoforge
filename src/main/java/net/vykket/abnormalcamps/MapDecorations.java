package net.vykket.abnormalcamps;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MapDecorations {

    public static final DeferredRegister<MapDecorationType> REGISTRIES =
            DeferredRegister.create(
                    BuiltInRegistries.MAP_DECORATION_TYPE,
                    AbnormalCamps.MODID
            );

    public static final DeferredHolder<MapDecorationType, MapDecorationType> KOUSA_SANCTUM = register("kousa_sanctum");

    public static final DeferredHolder<MapDecorationType, MapDecorationType> ARID_GARDEN = register("arid_garden");

    public static final DeferredHolder<MapDecorationType, MapDecorationType> VILLAGE_SCRUBLAND = register("village_scrubland");

    public static final DeferredHolder<MapDecorationType, MapDecorationType> MAPPLE_HUT = register("maple_hut");

    private static DeferredHolder<MapDecorationType, MapDecorationType> register(
            String name
    ) {
        return REGISTRIES.register(
                name,
                () -> new MapDecorationType(
                        ResourceLocation.fromNamespaceAndPath(
                                AbnormalCamps.MODID,
                                name
                        ),
                        true,
                        -1,
                        true,
                        false
                )
        );
    }
}

