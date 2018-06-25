// Top-level build file where you can add configuration options common to all sub-projects/modules.
import test.zen.notUsableInBuildscript

buildscript {
    usableInBuildScript()
    // This extension function is not usable in the buildscript block
    `ext`["kotlin_version"] = "1.2.50"
    // This imported function is not usable in the buildscript block
    notUsableInBuildscript()
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.2.0-beta01")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.50")
        classpath("com.github.triplet.gradle:play-publisher:1.2.2")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
`ext`["kotlin_version"] = "1.2.50"
notUsableInBuildscript()
allprojects {
    repositories {
        google()
        jcenter()
    }
}
