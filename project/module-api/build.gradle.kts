plugins {
    kotlin("plugin.serialization") version "1.7.21"
}

dependencies {
    compileTabooLib()
    compileCore(12000)
    framework()
    serialization()

    compileModule("module-common")
    compileModule("module-core")
}
