package me.sentryoz.manyOres

import xyz.xenondevs.nova.addon.Addon
import xyz.xenondevs.nova.update.ProjectDistributor

object ManyOres : Addon() {
    val projectDistributor = listOf(ProjectDistributor.github("SentryoZ/ManyOres"))
}