dependencies {
    compileTabooLib()
    compileNMS()
    compileCore(12001)
    compileCore(12000)
    compileCore(11903)
    compileCore(11701)
    compileCore(11604, complete = true)

    compileModule("framework-common")
}
