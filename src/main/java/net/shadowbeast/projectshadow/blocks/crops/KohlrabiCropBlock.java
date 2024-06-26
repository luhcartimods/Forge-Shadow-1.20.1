package net.shadowbeast.projectshadow.blocks.crops;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.shadowbeast.projectshadow.items.ModItems;
import org.jetbrains.annotations.NotNull;

//Credits for Kohlrabi textures to Kaupenjoe, in future custom texture will be added
public class KohlrabiCropBlock extends CropBlock {
    public static final int MAX_AGE = 6;
    private static final VoxelShape[] SHAPE_BY_AGE;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);
    public KohlrabiCropBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE_BY_AGE[this.getAge(pState)];
    }
    @Override
    protected @NotNull ItemLike getBaseSeedId() {
        return ModItems.KOHLRABI_SEEDS.get();
    }
    @Override
    public @NotNull IntegerProperty getAgeProperty() {
        return AGE;
    }
    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }
    @Override
    protected void createBlockStateDefinition(@NotNull StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
    static{
        SHAPE_BY_AGE = new VoxelShape[]{
                Block.box(5.0, 0.0, 5.0, 11.0, 2.0, 11.0),
                Block.box(4.0, 0.0, 4.0, 12.0, 4.0, 12.0),
                Block.box(3.0, 0.0, 3.0, 13.0, 7.0, 13.0),
                Block.box(3.0, 0.0, 3.0, 13.0, 9.0, 13.0),
                Block.box(2.0, 0.0, 2.0, 14.0, 11.0, 14.0),
                Block.box(1.0, 0.0, 1.0, 15.0, 13.0, 15.0),
                Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
        };
    }
}
