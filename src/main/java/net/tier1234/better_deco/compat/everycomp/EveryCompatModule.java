package net.tier1234.better_deco.compat.everycomp;

import net.liukrast.compat.Compat;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;
import net.mehvahdjukaar.every_compat.api.PaletteStrategies;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.SimpleModule;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodTypes;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.minecraft.resources.ResourceLocation;
import net.tier1234.better_deco.Constants;
import net.tier1234.better_deco.block.custom.KitchenCounterBlock;
import net.tier1234.better_deco.init.ModBlocks;

import java.util.function.Supplier;

@Compat("everycomp")
public class EveryCompatModule extends SimpleModule {

   // public final SimpleEntrySet<WoodType, KitchenCounterBlock> kitchenCounter;

    ResourceLocation tabKey = PlatHelper.getPlatform().isForge() ?
            modRes(modId) : modRes("tab");


    public EveryCompatModule() {
        super(Constants.MOD_ID, "bd", Constants.MOD_ID);
        EveryCompatAPI.registerModule(this);
/*





        kitchenCounter = SimpleEntrySet.<WoodType, KitchenCounterBlock>builder(WoodType.class, "kitchen_counter",
                (Supplier<KitchenCounterBlock>) ModBlocks.OAK_KITCHEN_COUNTER.get(), ()-> VanillaWoodTypes.OAK,
                w-> new KitchenCounterBlock(Utils.copyPropertySafe(w.planks)))
                .copyParentDrop()
                .setTabKey(tabKey)
                .defaultRecipe()
                .addTile(getModTile("kitchen_counter"))
                .addTexture(modRes("block/furniture/kitchen_counter/oak_kitchen_counter"), PaletteStrategies.PLANKS_STANDARD)

                .build();

        this.addEntry(kitchenCounter);*/


    }
}
