plugins {
    kotlin("multiplatform") version "1.4.32"
    `maven-publish`
}

group = "com.kiwi.quickseq"
version = "1.0.1"

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinVersion = "1.4.30"
                implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
            }
        }
    }
    jvm()
}

publishing {
    publications {
        create<MavenPublication>("default") {
            artifact(org.gradle.api.internal.artifacts.dsl.LazyPublishArtifact(tasks.sourcesJar))
        }
    }
}
