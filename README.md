
# Muvii - Android app showing an aggregate list of trending and latest movies and TV shows
## ⚠️ Disclaimer This app is still in development. 👷🏾‍♀ Ideas are welcome and contributions are open. 

### Screenshots
##### Discover movies
<img src = "https://user-images.githubusercontent.com/47632042/210357626-a9f5ff7c-fc31-4050-8e81-b577e76f41da.png" width = "50%" height = "50%">

#### Movie Details
![Muvii_details_google-pixel4-clearlywhite-portrait](https://user-images.githubusercontent.com/47632042/210357651-f7787b18-2b48-48f3-9b70-4fd8462f2c7c.png)

#### Dark mode
![dark_mode_google-pixel4-clearlywhite-portrait](https://user-images.githubusercontent.com/47632042/210357666-9b4a7f1e-50d6-4aa0-b28a-9cecbebcc18a.png)

#### Similar movies
![similar_movies_google-pixel4-clearlywhite-portrait](https://user-images.githubusercontent.com/47632042/210357682-c47eaa63-48ac-4951-b1a6-027aafe96bf2.png)

## Overview
The app is online with an offline first strategy. 

## Usage
Clone the repository and run `./gradlew assembleDebug` to build the debug APK or `./gradlew installDebug` to build and deploy.

## Architecture
The app employs the highly opinionated [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) pattern to achieve abstraction and clear separation of concerns. This makes it easier to scale and maintain as bugs can be clearly followed through.

##### Multi-modular architecture
The app being heavily divided has the following modules:-
*  App - the entry point of the application. Serves as the glue to the other parts of the app.
* :buildSrc - manages all the dependencies from a central point
* :core_design: - takes care of the design system of the whole app i.e. theming, styles, and the overall accent of the app. This follows the material design guidelines to the core.
* :core_navigation:  - handles all navigation related code.
* :core_data: - takes care of data shared in between feature modules.
* :feature_movies: - contains all the code related to movies.
* :feature_shows: - takes care of the implementation of TV shows related code.

## Patterns used
* [Model-View-ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - aims to achieve a clear separation of concerns with each layer not aware of the implementation of the other to achieve a layer agnostic approach. The Model manages the data through repositories and use cases, the View Model manages the business logic and state holding while the View is only concerned with the UI logic implementation.
* [Unidirectional Data Flow](https://developer.android.com/jetpack/compose/architecture) - allows easier management of state. State flows up while events flow down to the View Model.
* Concurrency design - Offloading heavy tasks to a background thread
* [SOLID](https://en.wikipedia.org/wiki/SOLID) principles - to achieve a clear abstraction among modules, segregation, single responsibility and Dependecy inversion

![](https://developer.android.com/static/images/jetpack/compose/state-unidirectional-flow.png)

## Libraries
* [Jetpack compose](https://developer.android.com/jetpack/compose) - Jetpack Compose is Android’s modern toolkit for building native UI. It simplifies and accelerates UI development on Android.
* [Room](https://developer.android.com/training/data-storage/room) - a persistence library providing an abstraction layer over SQLite to allow for more robust database access.
* [Preferences Datastore](https://developer.android.com/topic/libraries/architecture/datastore) - Store data asynchronously, consistently, and transactionally, overcoming some of the drawbacks of SharedPreferences.
* [Retrofit](https://square.github.io/retrofit/) - REST API library for simplifying network calls in Android.
* [GSON](https://github.com/google/gson) -  allows easier parsing and serializing of JSON into POJOs that Android can understand.
* [OkHttp Logging Interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor) - for easier logging of HTTP requests and responses during development.
* [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - allows efficient querying of data in pages to minimize user bandwidth and save on system resources.
* [Kotlin Coroutines](https://developer.android.com/kotlin/coroutines) - Concurrency design pattern in Android to simplify asynchronous code execution
* [Flows](https://developer.android.com/kotlin/flow) - synchronous data stream functionality built on top of coroutines
* [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - dependency injection that reduces the need for manual dependency injection
