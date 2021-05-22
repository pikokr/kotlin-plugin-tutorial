plugins {
    kotlin("jvm") version "1.5.0"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "com.github.pikokr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    compileOnly(kotlin("stdlib"))
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
}

tasks {
    shadowJar {
        archiveClassifier.set("")
        archiveBaseName.set("Tutorial")
        archiveVersion.set("")
    }

    processResources {
        filesMatching("**/*.yml") {
            expand(project.properties)
        }
    }
}
