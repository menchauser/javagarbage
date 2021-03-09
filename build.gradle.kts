plugins {
    java
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

val jacksonVersion = "2.12.2"

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-core:${jacksonVersion}")
    implementation("com.fasterxml.jackson.core:jackson-databind:${jacksonVersion}")
    implementation("com.fasterxml.jackson.core:jackson-annotations:${jacksonVersion}")
}

group = "karanashev"
version = "0.1.0-SNAPSHOT"
description = "javaplayground"
java.sourceCompatibility = JavaVersion.VERSION_15
