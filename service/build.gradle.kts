plugins {
    java
}

group = "ru.netology.learningproject"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":db"))
}
