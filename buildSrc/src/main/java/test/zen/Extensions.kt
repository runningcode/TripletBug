package test.zen

fun notUsableInBuildscript() {
    println("this function cannot be called in the buildscript block, but can be called elsewhere.")
}
