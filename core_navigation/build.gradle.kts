plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.githukudenis.core_navigation"
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

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
            isMinifyEnabled = false
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

    implementation(project(":core_data"))
    implementation(project(":feature_movies"))
    implementation(Deps.navigation)
    implementation(Deps.lifecycle_aware_state)
    implementation(Deps.nav_animation)
    implementation(Deps.material)
    implementation(Deps.compose_material)
    implementation(Deps.hilt_navigation_compose)
    implementation(Deps.junit_testImplementation)
    implementation(Deps.compose_androidTestImplementation)
    implementation(Deps.espresso_androidTestImplementation)
    implementation(Deps.junit_testImplementation)
    implementation(Deps.junit_androidTestImplementation)


}