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
    namespace = "com.githukudenis.tv_shows"
    compileSdk = 33

    defaultConfig {
        minSdk=  24
        targetSdk=  33

        buildConfigField("String", "TMDB_API_KEY", TMDB_API_KEY)


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary=  true
        }
    }

    kotlin {
        sourceSets {
            debug {
                kotlin.srcDir("build/generated/ksp/debug/kotlin")
            }
            release {
                kotlin.srcDir("build/generated/ksp/release/kotlin")
            }
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
                targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":core_data"))
    implementation(project(":core_design"))
    implementation(project(":feature_people"))
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
    implementation(Deps.lifecycle_aware_state)
    implementation(Deps.navigation)
    implementation(Deps.okhttp)
    implementation(Deps.coil)
    implementation(Deps.saved_state)
    implementation(Deps.saved_state_viewmodel)
    implementation(Deps.hilt_navigation_compose)
    implementation(Deps.viewmodel)
    implementation(Deps.compose_viewmodel)
    implementation(Deps.nav_animation)
    implementation(Deps.kotlinx_coroutines)
    implementation(Deps.retrofit)
    implementation(Deps.retrofit_coroutines)
    implementation(Deps.livedata)
    implementation(Deps.gson)
    implementation(Deps.ramcosta_navigation_core)
    implementation(Deps.room_ktx)
    implementation(Deps.room_runtime)
    kapt(Deps.room_compiler)
    implementation(Deps.viewmodel)
    kapt(Deps.dagger_hilt_compiler)
    testImplementation(Deps.junit_testImplementation)
    androidTestImplementation(Deps.junit_androidTestImplementation)
    androidTestImplementation(Deps.espresso_androidTestImplementation)
    androidTestImplementation(Deps.compose_androidTestImplementation)
    debugImplementation(Deps.compose_ui_debugImplementation)
    debugImplementation(Deps.compose_ui_test_debugImplementation)
}
