This app is still in development. Ideas are welcome and contributions are open. 

##### Discover movies
![movies](https://user-images.githubusercontent.com/47632042/197456275-83d9d057-fb30-427e-9d1b-1b8f37763d5d.png)
#### Movie Details
![details](https://user-images.githubusercontent.com/47632042/197456269-67197370-adc7-43c1-96f0-f840c9ce1700.png)


#### Dark mode
![dark_theme](https://user-images.githubusercontent.com/47632042/197456263-6e1c79ab-7388-4751-8a8a-5fc0b4ec8ab9.png)



#Overview
The app is online with an offline first strategy. 

## Use 
Clone the repository and run `./gradlew assembleDebug` to build the debug APK or `./gradlew installDebug` to build and deploy.

## Architecture
The app employs the highly opinionated [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) pattern to achieve abstraction and clear separation of concerns. This makes it easier to scale and maintain as bugs can be clearly followed through.

##### Multi-modular architecture
The app being heavily divided has the following modules:-
*  App - the entry point of the application. Serves as the glue to the other parts of the app.
* :core_design: - takes care of the design system of the whole app i.e. theming, styles, and the overall accent of the app. This follows the material design guidelines to the core.
* :core_navigation:  - handles all navigation related code.
* :core_data: - takes care of data shared in between feature modules.
* :feature_movies: - contains all the code related to movies.
* :feature_shows: - takes care of the implementation of TV shows related code.

## Patterns used
* [Model-View-ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - aims to achieve a clear separation of concerns with each layer not aware of the implementation of the other to achieve a layer agnostic approach. The Model manages the data through repositories and use cases, the View Model manages the business logic and state holding while the View is only concerned with the UI logic implementation.
* [Unidirectional Data Flow](https://developer.android.com/jetpack/compose/architecture) - allows easier management of state. State flows up while events flow down to the View Model.

![](https://developer.android.com/static/images/jetpack/compose/state-unidirectional-flow.png)

## Libraries
* [Jetpack compose](https://developer.android.com/jetpack/compose) - Jetpack Compose is Android’s modern toolkit for building native UI. It simplifies and accelerates UI development on Android.
* [Room](https://developer.android.com/training/data-storage/room) - a persistence library providing an abstraction layer over SQLite to allow for more robust database access.
* [Preferences Datastore](https://developer.android.com/topic/libraries/architecture/datastore) - Store data asynchronously, consistently, and transactionally, overcoming some of the drawbacks of SharedPreferences.
* [Retrofit](https://square.github.io/retrofit/) - REST API library for simplifying network calls in Android.
* [GSON](https://github.com/google/gson) -  allows easier parsing and serializing of JSON into POJOs that Android can understand.
* [Logging Interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor) - for easier logging of HTTP requests and responses during development.
* [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - allows efficient querying of data in pages to minimize user bandwidth and save on system resources.
