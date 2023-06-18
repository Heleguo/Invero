dependencies {
    compileTabooLib()
    compileCore(12000)
    framework()
    serialization()

    compileModule("module-common")
    compileModule("module-core")
    compileModule("module-compats")

    compileOnly("com.mojang:datafixerupper:4.0.26")
}
