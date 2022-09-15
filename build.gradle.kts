import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("com.diffplug.spotless") version "6.10.0"
}

group = "cl.ravenhill"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

spotless {
    kotlin {
        diktat()
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}