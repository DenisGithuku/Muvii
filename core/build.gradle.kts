plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.devtools.ksp") version "1.7.0-1.0.6"
}

android {
    namespace = "com.githukudenis.muvii"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.githukudenis.muvii"
        minSdk=  24
        targetSdk=  32
        versionCode=  1
        versionName = "1.0"

        buildConfigField("String", "MOVIES_API_KEY", "MOVIES_API_KEY")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary=  true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
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

    implementation(project(":core"))
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
    implementation(Deps.kotlinx_coroutines)
    implementation(Deps.retrofit)
    implementation(Deps.retrofit_coroutines)
    implementation(Deps.livedata)
    implementation(Deps.gson)
    implementation(Deps.viewmodel)
    kapt(Deps.dagger_hilt_compiler)
    testImplementation(Deps.junit_testImplementation)
    androidTestImplementation(Deps.junit_androidTestImplementation)
    androidTestImplementation(Deps.espresso_androidTestImplementation)
    androidTestImplementation(Deps.compose_androidTestImplementation)
    debugImplementation(Deps.compose_ui_debugImplementation)
    debugImplementation(Deps.compose_ui_test_debugImplementation)
}
