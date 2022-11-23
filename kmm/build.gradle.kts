plugins {
    kotlin("multiplatform") version "1.8.0-Beta"
}

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    linuxArm64()

    macosX64 {
        binaries {
            executable {
                entryPoint = "com.github.shalva97.main"
            }
        }
    }
    sourceSets {
        val commonMain by getting
    }
}

dependencies {
    commonMainImplementation("com.ionspin.kotlin:bignum:0.3.7")
}