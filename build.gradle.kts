
buildscript {

    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath(com.koidev.pomodoro.Libs.androidGradlePlugin)
        classpath(com.koidev.pomodoro.Libs.Kotlin.gradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
        mavenCentral()
    }
}

val clean by tasks.creating(Delete::class) {
    delete = setOf(rootProject.buildDir)
}