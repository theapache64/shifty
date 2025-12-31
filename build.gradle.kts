import io.github.theapache64.korduino.common.Arg

plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.korduino)
}

group = "io.github.theapache64.korduino"
version = "1.0-SNAPSHOT"

korduino {
    platform = Arg.Platform.Target.ARDUINO
    board = Arg.Board.Type.ESP_32_DOIT_DEVKIT_V1
}

dependencies {
    implementation(libs.korduino.core)
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
