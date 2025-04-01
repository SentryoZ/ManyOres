package me.sentryoz.manyOres.registry

import me.sentryoz.manyOres.ManyOres
import xyz.xenondevs.nova.addon.registry.BlockRegistry
import xyz.xenondevs.nova.resources.builder.layout.block.BackingStateCategory
import xyz.xenondevs.nova.world.block.NovaBlock
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.world.block.NovaBlockBuilder
import xyz.xenondevs.nova.world.block.behavior.BlockDrops
import xyz.xenondevs.nova.world.block.behavior.BlockSounds
import xyz.xenondevs.nova.world.block.behavior.Breakable
import xyz.xenondevs.nova.world.block.sound.SoundGroup
import xyz.xenondevs.nova.world.item.tool.VanillaToolCategories
import xyz.xenondevs.nova.world.item.tool.VanillaToolTiers

@Init(stage = InitStage.PRE_PACK)
object Blocks : BlockRegistry by ManyOres.registry {


    private val ORE_TIER_1 = Breakable(3.0, setOf(VanillaToolCategories.PICKAXE), VanillaToolTiers.IRON, true)
    private val ORE_TIER_2 = Breakable(4.0, setOf(VanillaToolCategories.PICKAXE), VanillaToolTiers.DIAMOND, true)
    private val BLOCK_TIER_1 = Breakable(5.0, setOf(VanillaToolCategories.PICKAXE), VanillaToolTiers.IRON, true)
    private val BLOCK_TIER_2 = Breakable(6.0, setOf(VanillaToolCategories.PICKAXE), VanillaToolTiers.DIAMOND, true)

    // Blocks
    val ALUMINUM_BLOCK =
        nonInteractiveBlock("aluminum_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val LEAD_BLOCK =
        nonInteractiveBlock("lead_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val NICKEL_BLOCK =
        nonInteractiveBlock("nickel_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val OSMIUM_BLOCK =
        nonInteractiveBlock("osmium_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val PLATINUM_BLOCK =
        nonInteractiveBlock("platinum_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val SILVER_BLOCK =
        nonInteractiveBlock("silver_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val TIN_BLOCK =
        nonInteractiveBlock("tin_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val URANIUM_BLOCK =
        nonInteractiveBlock("uranium_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ZINC_BLOCK =
        nonInteractiveBlock("zinc_block") { behaviors(BLOCK_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }

    // Ores
    val ORE_ALUMINUM =
        nonInteractiveBlock("ore_aluminum") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ORE_LEAD = nonInteractiveBlock("ore_lead") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ORE_NICKEL =
        nonInteractiveBlock("ore_nickel") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ORE_OSMIUM =
        nonInteractiveBlock("ore_osmium") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ORE_PLATINUM =
        nonInteractiveBlock("ore_platinum") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ORE_SILVER =
        nonInteractiveBlock("ore_silver") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ORE_TIN = nonInteractiveBlock("ore_tin") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ORE_URANIUM =
        nonInteractiveBlock("ore_uranium") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }
    val ORE_ZINC = nonInteractiveBlock("ore_zinc") { behaviors(ORE_TIER_1, BlockSounds(SoundGroup.METAL), BlockDrops) }


    private fun nonInteractiveBlock(
        name: String,
        block: NovaBlockBuilder.() -> Unit
    ): NovaBlock = block(name) {
        block()
        stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
    }

}