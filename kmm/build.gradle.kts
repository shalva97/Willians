plugins {
    kotlin("multiplatform") version "1.8.0-Beta"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvm()
    linuxArm64()

    sourceSets {
        val commonMain by getting
    }
}

application {
    mainClass.set("MainKt")
}
