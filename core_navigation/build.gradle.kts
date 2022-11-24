plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.githukudenis.core_navigation"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {

    implementation(project(":core_design"))
    implementation(project(":core_data"))
    implementation(project(":feature_movies"))
    implementation(project(":feature_tv_shows"))
    implementation(project(":feature_people"))
    implementation(Deps.navigation)
    implementation(Deps.lifecycle_aware_state)
    implementation(Deps.nav_animation)
    implementation(Deps.room_ktx)
    kapt(Deps.room_runtime)
    implementation(Deps.room_runtime)
    implementation(Deps.compose_material)
    implementation(Deps.hilt_navigation_compose)
    implementation(Deps.junit_testImplementation)
    implementation(Deps.compose_androidTestImplementation)
    implementation(Deps.espresso_androidTestImplementation)
    implementation(Deps.junit_testImplementation)
    implementation(Deps.junit_androidTestImplementation)


}