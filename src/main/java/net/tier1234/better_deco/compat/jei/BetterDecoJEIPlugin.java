package net.tier1234.better_deco.compat.jei;

/**
 * @author MrCrayfish
 * Using MrCrayfish JEI methods -> are stable and works*/

//@JeiPlugin
public class BetterDecoJEIPlugin
      //  implements IModPlugin
{
 /*   public static final DecimalFormat FORMATTER = new DecimalFormat("0.##s");


    @Override
    public Identifier getPluginUid() {
        return Constants.id("plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();
        registration.addRecipeCategories(new OvenCategory(guiHelper));
        registration.addRecipeCategories(new MicrowaveCategory(guiHelper));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(OvenCategory.TYPE.get(), this.getRecipes(ModRecipes.OVEN_TYPE.get()));
        registration.addRecipes(MicrowaveCategory.TYPE.get(), this.getRecipes(ModRecipes.MICROWAVE_TYPE.get()));
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.OAK_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.SPRUCE_OVEN.get().asItem()));

        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.BIRCH_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.JUNGLE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.ACACIA_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.DARK_OAK_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.MANGROVE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.CHERRY_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.BAMBOO_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.CRIMSON_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.WARPED_OVEN.get().asItem()));
        //Stripped
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_OAK_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_SPRUCE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_BIRCH_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_JUNGLE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_ACACIA_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_DARK_OAK_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_MANGROVE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_CHERRY_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_BAMBOO_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_CRIMSON_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.STRIPPED_WARPED_OVEN.get().asItem()));

        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.RED_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.ORANGE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.YELLOW_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.MAGENTA_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.PINK_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.PURPLE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.GREEN_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.LIME_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.CYAN_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.LIGHT_BLUE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.BLUE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.WHITE_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.BROWN_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.BLACK_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.GRAY_OVEN.get().asItem()));
        registration.addCraftingStation(OvenCategory.TYPE.get(),new ItemStack(ModBlocks.LIGHT_GRAY_OVEN.get().asItem()));



        registration.addCraftingStation(MicrowaveCategory.TYPE.get(),new ItemStack(ModBlocks.LIGHT_MICROWAVE.get().asItem()));
        registration.addCraftingStation(MicrowaveCategory.TYPE.get(),new ItemStack(ModBlocks.DARK_MICROWAVE.get().asItem()));
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(OvenScreen.class, 74, 30, 22, 20,
                OvenCategory.TYPE.get());
    }

    private <C extends RecipeInput, T extends Recipe<C>> List<RecipeHolder<T>> getRecipes(RecipeType<T> type)
    {
        return List.copyOf(SyncedRecipes.getMap().byType(type));
    }

    public static Font getFont()
    {
        return Minecraft.getInstance().font;
    }*/
}