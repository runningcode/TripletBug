
plugins {
    id("com.android.application")
    kotlin("android")
    id("com.github.triplet.play")
}

android {
    compileSdkVersion (28)
    defaultConfig {
        applicationId =  "com.osacky.tripletbug"
        minSdkVersion ( 15)
        targetSdkVersion ( 28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre7:1.2.50")
    implementation("androidx.appcompat:appcompat:1.0.0-alpha1")
    implementation("androidx.constraintlayout:constraintlayout:1.1.0")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.0-alpha3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha3")
}
