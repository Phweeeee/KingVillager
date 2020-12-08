package softcat.kingvillager.Profession;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.datafix.fixes.VillagerProfessionFix;
import net.minecraft.village.PointOfInterestType;
import softcat.kingvillager.KingVillagerMod;
import softcat.kingvillager.Registration.BlockRegistration;
import softcat.kingvillager.Registration.ProfessionRegistration;

import javax.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class KingProfession extends VillagerProfession  {


    public KingProfession( PointOfInterestType poiType) {
        super("king", poiType, ImmutableSet.of(Items.GOLD_NUGGET), ImmutableSet.of(BlockRegistration.throne), SoundEvents.BLOCK_METAL_PLACE);
    }


    /*
     private final String name;
    private final PointOfInterestType pointOfInterest;
    private final ImmutableSet<Item> specificItems;
    private final ImmutableSet<Block> relatedWorldBlocks;
    @Nullable
    private final SoundEvent sound;
     */

}
