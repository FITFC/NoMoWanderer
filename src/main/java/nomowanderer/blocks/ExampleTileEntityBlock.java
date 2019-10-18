package nomowanderer.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import nomowanderer.init.ModTileEntityTypes;

import javax.annotation.Nullable;

/**
 * @author Cadiboo
 */
public class ExampleTileEntityBlock extends Block {

    public ExampleTileEntityBlock(final Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(final BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
        return ModTileEntityTypes.EXAMPLE_TILE_ENTITY.create();
    }

}