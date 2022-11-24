import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

val TMDB_API_KEY: String = gradleLocalProperties(rootDir).getProperty("TMDB_API_KEY")

android {
    namespace = "com.denisgithuku.feature_people"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_6
        targetCompatibility = JavaVersion.VERSION_1_6
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":core_data"))
    implementation(project(":core_design"))
    implementation(Deps.core)
    implementation(Deps.lifecycle_runtime)
    implementation(Deps.activity_compose)
    implementation(Deps.compose_ui)
    implementation(Deps.compose_tooling_preview)
    implementation(Deps.compose_material)
    implementation(Deps.dagger_hilt)
    implementation(Deps.moshi)
    implementation(Deps.moshi_kotlin)
    implementation(Deps.datastore)
    implementation(Deps.accompanist)
    implementation(Deps.lifecycle_viewmodel)
    implementation(Deps.navigation)
    implementation(Deps.okhttp)
    implementation(Deps.saved_state)
    implementation(Deps.saved_state_viewmodel)
    implementation(Deps.hilt_navigation_compose)
    implementation(Deps.viewmodel)
    implementation(Deps.compose_viewmodel)
    implementation(Deps.nav_animation)
    implementation(Deps.room_runtime)
    implementation(Deps.room_ktx)
    kapt(Deps.room_compiler)
    implementation(Deps.kotlinx_coroutines)
    implementation(Deps.retrofit)
    implementation(Deps.retrofit_coroutines)
    implementation(Deps.livedata)
    implementation(Deps.gson)
    implementation(Deps.coil)
    implementation(Deps.room_ktx)
    kapt(Deps.room_compiler)
    implementation(Deps.room_runtime)
    implementation(Deps.viewmodel)
    implementation(Deps.lifecycle_aware_state)
    kapt(Deps.dagger_hilt_compiler)
    testImplementation(Deps.junit_testImplementation)
    androidTestImplementation(Deps.junit_androidTestImplementation)
    androidTestImplementation(Deps.espresso_androidTestImplementation)
    androidTestImplementation(Deps.compose_androidTestImplementation)
    debugImplementation(Deps.compose_ui_debugImplementation)
    debugImplementation(Deps.compose_ui_test_debugImplementation)
}