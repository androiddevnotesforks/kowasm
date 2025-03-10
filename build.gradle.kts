
import org.jetbrains.dokka.gradle.DokkaTaskPartial
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsExec

plugins {
    kotlin("multiplatform") version "2.1.20-RC" apply false
    id("org.jetbrains.dokka") version "2.0.0"
}

description = "Fullstack application development with Kotlin and WebAssembly"

allprojects {
    group = "org.kowasm"
    version = "0.1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

tasks.withType<NodeJsExec> {
    version = "22.13.1"
}

subprojects {
    tasks.withType<DokkaTaskPartial>().configureEach {
        dokkaSourceSets.configureEach {
            includes.from("README.md")
        }
    }
}