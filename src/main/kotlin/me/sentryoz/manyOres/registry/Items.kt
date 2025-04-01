package me.sentryoz.manyOres.registry

import me.sentryoz.manyOres.ManyOres
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by ManyOres.registry {

    // Gems
    val CINNABAR = registerItem("cinnabar")
    val RUBY = registerItem("ruby")
    val SAPPHIRE = registerItem("sapphire")
    val FLUORITE = registerItem("fluorite")
    val PERIDOT = registerItem("peridot")
    val SALT = registerItem("salt")
    val SULFUR = registerItem("sulfur")

    // Raws
    val RAW_ALUMINUM = registerItem("raw_aluminum")
    val RAW_IRIDIUM = registerItem("raw_iridium")
    val RAW_LEAD = registerItem("raw_lead")
    val RAW_NICKEL = registerItem("raw_nickel")
    val RAW_OSMIUM = registerItem("raw_osmium")
    val RAW_PLATINUM = registerItem("raw_platinum")
    val RAW_SILVER = registerItem("raw_silver")
    val RAW_TIN = registerItem("raw_tin")
    val RAW_URANIUM = registerItem("raw_uranium")
    val RAW_ZINC = registerItem("raw_zinc")

    // Ingots
    val ALUMINUM_INGOT = registerItem("aluminum_ingot")
    val BRASS_INGOT = registerItem("brass_ingot")
    val BRONZE_INGOT = registerItem("bronze_ingot")
    val INVAR_INGOT = registerItem("invar_ingot")
    val IRIDIUM_INGOT = registerItem("iridium_ingot")
    val LEAD_INGOT = registerItem("lead_ingot")
    val NICKEL_INGOT = registerItem("nickel_ingot")
    val OSMIUM_INGOT = registerItem("osmium_ingot")
    val PLATINUM_INGOT = registerItem("platinum_ingot")
    val SILVER_INGOT = registerItem("silver_ingot")
    val STEEL_INGOT = registerItem("steel_ingot")
    val TIN_INGOT = registerItem("tin_ingot")
    val URANIUM_INGOT = registerItem("uranium_ingot")
    val ZINC_INGOT = registerItem("zinc_ingot")

    // Nuggets
    val ALUMINUM_NUGGET = registerItem("aluminum_nugget")
    val BRASS_NUGGET = registerItem("brass_nugget")
    val BRONZE_NUGGET = registerItem("bronze_nugget")
    val INVAR_NUGGET = registerItem("invar_nugget")
    val IRIDIUM_NUGGET = registerItem("iridium_nugget")
    val LEAD_NUGGET = registerItem("lead_nugget")
    val NICKEL_NUGGET = registerItem("nickel_nugget")
    val OSMIUM_NUGGET = registerItem("osmium_nugget")
    val PLATINUM_NUGGET = registerItem("platinum_nugget")
    val SILVER_NUGGET = registerItem("silver_nugget")
    val STEEL_NUGGET = registerItem("steel_nugget")
    val TIN_NUGGET = registerItem("tin_nugget")
    val URANIUM_NUGGET = registerItem("uranium_nugget")
    val ZINC_NUGGET = registerItem("zinc_nugget")

    // Dusts
    val CINNABAR_DUST = registerItem("cinnabar_dust")
    val RUBY_DUST = registerItem("ruby_dust")
    val SAPPHIRE_DUST = registerItem("sapphire_dust")
    val FLUORITE_DUST = registerItem("fluorite_dust")
    val PERIDOT_DUST = registerItem("peridot_dust")
    val ALUMINUM_DUST = registerItem("aluminum_dust")
    val BRASS_DUST = registerItem("brass_dust")
    val BRONZE_DUST = registerItem("bronze_dust")
    val INVAR_DUST = registerItem("invar_dust")
    val IRIDIUM_DUST = registerItem("iridium_dust")
    val LEAD_DUST = registerItem("lead_dust")
    val NICKEL_DUST = registerItem("nickel_dust")
    val OSMIUM_DUST = registerItem("osmium_dust")
    val PLATINUM_DUST = registerItem("platinum_dust")
    val SILVER_DUST = registerItem("silver_dust")
    val STEEL_DUST = registerItem("steel_dust")
    val TIN_DUST = registerItem("tin_dust")
    val URANIUM_DUST = registerItem("uranium_dust")
    val ZINC_DUST = registerItem("zinc_dust")

    // Blocks
    val ALUMINUM_BLOCK = item(Blocks.ALUMINUM_BLOCK) {}
    val LEAD_BLOCK = item(Blocks.LEAD_BLOCK) {}
    val NICKEL_BLOCK = item(Blocks.NICKEL_BLOCK) {}
    val OSMIUM_BLOCK = item(Blocks.OSMIUM_BLOCK) {}
    val PLATINUM_BLOCK = item(Blocks.PLATINUM_BLOCK) {}
    val SILVER_BLOCK = item(Blocks.SILVER_BLOCK) {}
    val TIN_BLOCK = item(Blocks.TIN_BLOCK) {}
    val URANIUM_BLOCK = item(Blocks.URANIUM_BLOCK) {}
    val ZINC_BLOCK = item(Blocks.ZINC_BLOCK) {}

    // Ores
    val ORE_ALUMINUM = item(Blocks.ORE_ALUMINUM) {}
    val ORE_LEAD = item(Blocks.ORE_LEAD) {}
    val ORE_NICKEL = item(Blocks.ORE_NICKEL) {}
    val ORE_OSMIUM = item(Blocks.ORE_OSMIUM) {}
    val ORE_PLATINUM = item(Blocks.ORE_PLATINUM) {}
    val ORE_SILVER = item(Blocks.ORE_SILVER){}
    val ORE_TIN = item(Blocks.ORE_TIN){}
    val ORE_URANIUM = item(Blocks.ORE_URANIUM){}
    val ORE_ZINC = item(Blocks.ORE_ZINC){}
}