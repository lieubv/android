plugins {
    alias(convention.plugins.mega.android.library)
    alias(convention.plugins.mega.android.test)
    id("kotlin-parcelize")
}

android {
    namespace = "mega.privacy.android.navigation"
}

dependencies {
    implementation(project(":domain"))
    implementation(androidx.appcompat)
    implementation(androidx.navigation.compose)
    //implementation(lib.mega.analytics)
    implementation(files("../shared-release.aar"))
    implementation(files("../analytics-core-release.aar"))
    implementation(files("../analytics-annotations-release.aar"))

    testImplementation(testlib.bundles.ui.test)
    testImplementation(testlib.bundles.unit.test)
    testImplementation(testlib.arch.core.test)
    testImplementation(testlib.test.core.ktx)
    testImplementation(testlib.junit)
    testImplementation(testlib.junit.test.ktx)
}