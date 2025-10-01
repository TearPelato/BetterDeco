package net.tier1234.better_deco.event;


import net.minecraft.world.item.crafting.RecipeMap;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RecipesReceivedEvent;
import net.tier1234.better_deco.BetterDeco;

@EventBusSubscriber(modid = BetterDeco.MOD_ID, value = Dist.CLIENT)
public class ModRecipeReceived {
    public static RecipeMap recipeMap = RecipeMap.EMPTY;

    @SubscribeEvent
    public static void onRecipesReceived(RecipesReceivedEvent event) {
        recipeMap = event.getRecipeMap();
    }

}
