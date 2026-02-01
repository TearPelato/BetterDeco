package net.tier1234.better_deco.block.entity.core;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;

@Deprecated(forRemoval = true)
public interface IComparetorOverride {
    public int getComparetorOverride();

    public static int getComparetorOverride(Level worldIn, BlockPos pos) {
        BlockEntity te = worldIn.getBlockEntity(pos);
        if(te != null) {
            if(te instanceof IComparetorOverride) {
                return ((IComparetorOverride)te).getComparetorOverride();
            }
        }
        return 5;
    }
}
