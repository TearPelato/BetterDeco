package net.tier1234.better_deco.compat.everycomp;

import net.liukrast.compat.Compat;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.SimpleModule;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodTypes;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.tier1234.better_deco.Constants;
import net.tier1234.better_deco.block.custom.KitchenCounterBlock;
import net.tier1234.better_deco.init.ModBlocks;

@Compat("everycomp")
public class EveryCompatModule extends SimpleModule {

  //  public final SimpleEntrySet<WoodType, KitchenCounterBlock> kitchenCounter;

    public EveryCompatModule() {
        super(Constants.MOD_ID, "bd", Constants.MOD_ID);

       /* kitchenCounter = SimpleEntrySet.builder(WoodType.class, "kitchen_counter",
                        ModBlocks.OAK_KITCHEN_COUNTER.get(),()-> VanillaWoodTypes.OAK,
                        w-> new KitchenCounterBlock(Utils.copyPropertySafe(w.planks)))


                .build();




        this.kitchenCounter(kitchenCounter);*/
    }
}
