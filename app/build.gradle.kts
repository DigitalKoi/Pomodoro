import com.koidev.pomodoro.*

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Build.compileSdk)
    defaultConfig {
        applicationId = Build.appId
        minSdkVersion(Build.minSdk)
        targetSdkVersion(Build.compileSdk)
        versionCode = Build.versionCode
        versionName = Build.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ),
                "proguard-rules.pro"
            )
        }
    }

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.Kotlin.reflect)

    implementation(Libs.AndroidX.Lifecycle.extensions)
    implementation(Libs.AndroidX.Lifecycle.viewmodelKtx)

    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.AndroidX.preference)
    implementation(Libs.AndroidX.Fragment.fragmentKtx)
    implementation(Libs.AndroidX.Navigation.fragment)
    implementation(Libs.AndroidX.Navigation.ui)
    implementation(Libs.AndroidX.constraintlayout)

    implementation(Libs.Google.material)

    implementation(Libs.Coroutines.core)
    implementation(Libs.Coroutines.android)

    implementation(Libs.Koin.scope)
    implementation(Libs.Koin.viewmodel)
    implementation(Libs.Koin.fragment)
    implementation(Libs.Koin.ext)

    implementation(Libs.timber)

    debugImplementation(Libs.leakCanary)

    testImplementation(Libs.junit)
    testImplementation(Libs.robolectric)
    testImplementation(Libs.AndroidX.Test.core)
    testImplementation(Libs.AndroidX.Test.runner)
    testImplementation(Libs.AndroidX.Test.rules)
    testImplementation(Libs.AndroidX.Test.espressoCore)
}
