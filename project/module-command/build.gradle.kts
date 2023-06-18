dependencies {
    compileTabooLib()
    compileCore(12000)
    framework()
    serialization()

    compileModule("module-common")
    compileModule("module-core")
}
