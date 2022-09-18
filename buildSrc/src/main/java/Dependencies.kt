object Versions {
    const val core = "1.7.0"
    const val lifecycle_runtime = "2.3.1"
    const val activity_compose = "1.3.1"
    const val compose = "1.2.0"
    const val junit = "4.13.2"
    const val ext_junit = "1.1.3"
    const val espresso = "3.4.0"
    const val dagger_hilt = "2.42"
    const val appcompat = "1.4.2"
    const val material = "1.6.1"
    const val okhttp = "4.10.0"
    const val gson = "2.9.0"
    const val retrofit = "2.6.4"
    const val retrofit_coroutines = "0.9.2"
    const val datastore = "1.0.0"
    const val savedstate = "1.1.0"
    const val accompanist = "0.21.0-beta"
    const val navigation = "2.4.0"
    const val lifecycle_viewmodel = "2.4.0"
    const val moshi = "1.12.0"
    const val raamcosta_compose_navigation_version = "1.6.17-beta"
    const val room_version = "2.4.3"
}

object Deps {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_runtime}"
    const val activity_compose = "androidx.activity:activity-compose:${Versions.activity_compose}"
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val ramcosta_navigation_core = "io.github.raamcosta.compose-destinations:core:${Versions.raamcosta_compose_navigation_version}"
    const val ramcosta_navigation_ksp = "io.github.raamcosta.compose-destinations:ksp:${Versions.raamcosta_compose_navigation_version}"

    const val dagger_hilt = "com.google.dagger:hilt-android:${Versions.dagger_hilt}"
    const val dagger_hilt_compiler = "com.google.dagger:hilt-android-compiler:${Versions.dagger_hilt}"
    const val compose_ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val compose_tooling_preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val compose_material = "androidx.compose.material:material:${Versions.compose}"
    const val junit_testImplementation =  "junit:junit:${Versions.junit}"
    const val junit_androidTestImplementation = "androidx.test.ext:junit:${Versions.ext_junit}"
    const val espresso_androidTestImplementation = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val compose_androidTestImplementation = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val compose_ui_debugImplementation = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val compose_ui_test_debugImplementation = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"
    const val okhttp = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    // Gson Converter
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_coroutines = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofit_coroutines}"

    // Kotlin Coroutines
    const val kotlinx_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.retrofit_coroutines}"
    const val coroutines =  "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.retrofit_coroutines}"

    // Compose dependencies
    const val lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0"
    const val navigation = "androidx.navigation:navigation-compose:2.4.0"
    const val accompanist =  "com.google.accompanist:accompanist-flowlayout:0.17.0"

    // Moshi
    const val moshi =  "com.squareup.moshi:moshi:1.12.0"
    const val moshi_kotlin = "com.squareup.moshi:moshi-kotlin:1.12.0"

    //Dagger - Hilt
    const val hilt_navigation_compose =  "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"

    // saved state
    const val saved_state = "androidx.savedstate:savedstate-ktx:${Versions.savedstate}"

    const val datastore =  "androidx.datastore:datastore-preferences:${Versions.datastore}"
    const val nav_animation = "com.google.accompanist:accompanist-navigation-animation:${Versions.accompanist}"

    // ViewModel
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_viewmodel}"
    // ViewModel utilities for Compose
    const val compose_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle_viewmodel}"
    // LiveData
    const val livedata =  "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_viewmodel}"

    // Saved state module for ViewModel
    const val saved_state_viewmodel =  "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle_viewmodel}"

    //Room
    const val room_compiler = "androidx.room:room-ktx:${Versions.room_version}"
    const val room_runtime = "androidx.room:room-runtime:$${Versions.room_version}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.room_version}"

}


object ConfigVersions {
    const val namespace = "com.denisgithuku.catdogfacts"
    const val applicationId = "com.denisgithuku.catdogfacts"
    const val compileSdk = 32
    const val minSdk = 24
    const val targetSdk = 32
    const val versionCode = 1
    const val versionName = "0.1.0-beta"
    const val jvm = "1.8"
}
