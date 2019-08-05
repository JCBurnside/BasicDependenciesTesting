package com.digital_light.BasicDependencies

import net.minecraftforge.fml.common.Mod

const val VERSION = "@VERSION@"

@Mod(
    version = VERSION,
    modid = "basic_dependencies",

    modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter"
)
object BasicDependencies {
}