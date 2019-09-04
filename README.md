![Kotlin](https://img.shields.io/badge/kotlin-1.3.31-yellow.svg) ![Gradle](https://img.shields.io/badge/gradle-3.4.1-blue.svg) ![mockito](https://img.shields.io/badge/mockito-2.27.0-orange.svg) ![dagger](https://img.shields.io/badge/dagger-2.20-red.svg) 
# MoviesRappiApp
This is a movie application made by this author using the TMDB Api, and implementing Reactive Clean Architecture with Android Architecture Components as the core of design architecture and patterns.

![](https://github.com/juseni/MoviesRappiApp/blob/master/assets/clean-architecture.png)

This app has 3 main movies categories(Popular, Top rated, Upcoming) and also it has an offline searcher for each category. No matter what flow in app you are in, you always can get the detail of a movie by clicking on it.

![](https://github.com/juseni/MoviesRappiApp/blob/master/assets/screen1.gif)

# Persistence
The application stores local data by using latest technology feature offers by google as Architecture Components with Room, View Model and LiveData.

![](https://github.com/juseni/MoviesRappiApp/blob/master/assets/screen3.gif)

# Threads
This project handle all their threads with ReactiveX on an asynchronous way by using Observable model.  

# Modules
According to Robert Cecil Martin "Uncle Bob" the best way to reach a clean programming is by splitting logic, data, and UI or frameworks in different layers or modules, in that way the developer can understand in a better manner the code and it is easier to aboard future changes. By this in this app I tried to split the flows in 3 independent ones, one for popular, one for Top Rated and one for Upcoming movies.
In this application the modules of layers used are by follow:

# Data Module
According to Clean Architecture, this module only can acces the innermost module (domain) and it is transparent to framework module.
### db: 
Tere are 3 Dao classes that handle all queries into local databases. Also there are entities which models the responses of Api and local databases, Besides it contains the MovieDatabase class that will create the databases and define the models.
### platform:
Contains the connection handler to know if the device has or not internet
### repositories:
This is the one of the most important folders in app due to these classes perform, insert, fetch and transform or map data from local or Api repository to variables in innermost module (domain) according to network handler 
### source:
Contains te Api class where you can find the get (requests) for TMDB Api repository

# Domain Module
According to Clean Architecture this is the innermost and simplest layer in app and it is responsible to coordinate the actions to the repository. This layer is accessible for other modules, but other layers are transparent for it
### executor:
Contains all interfaces to execute threads with RxJava and for being consumed by Framework layer. This directory also contains a class used for test purposes only
### interactor:
Contains all Use cases which are accesibles by framework module, it's kind a bridge between data and framework layer and return the reactive object (Single)
### model:
Contains 2 models, one for movies details, and one for type movie details and it is delivered to framework module
### repositories:
provides all interfaces of Use cases for being accesible by Data module

# Presentation Module
This is the most external layer and contains all Android framework, it provides all UI implementation of the application. Besides this layer doesn't perform any logic on it, but it has access to other layers to perform it instead. The Android architecture used in this application inside this module is **MVVM** 

![](https://github.com/juseni/MoviesRappiApp/blob/master/assets/mvvm-architecture.png)

### di:
Provides the injection to all the dependencies at the start of the app like network, View Models, Use Cases etc. In this application the dependecy injection is performed by **Dagger** and because of that we can accomplish the 5th principle of S.O.L.I.D pattern introduced by Robert Cecil Martin AKA 'Uncle bob'
### executor:
Contains classes to execute threads launched from view models. This threads are provided in ExecutorModule, inside di directory
### model:
Contains the models that this module use to perform any action from view. This models are mapped from models belonged to Domain module
### ui:
This folder contains adapters used to bind movies into reclycrerView components extending of a BaseViewHolder to handle this. It also contains Fragments and activities inside the view folder which extend of a abstract class to make heritance of funcionalities.
### utils:
Provides Ui and date helpers and also the constants used in this module
### view_model:
Contains 3 viewModels, each for one fragment or type of movie and their function is to store and manage UI-related data in a lifecycle conscious way. This folder also contains a BaseViewModel class that uses CompositeDisposable for adding all the observables and removing all them on @OnCleared of the lifecycle.

# Animation
Navation Architecture components are used for implementing transitions between views. Moreover inside the application uses an anim translate for showing a loading more movies

![](https://github.com/juseni/MoviesRappiApp/blob/master/assets/screen4.gif)

# Testing
For this application I used mockito for unit testing in each of 3 different modules the application has

# Application Flow

![](https://github.com/juseni/MoviesRappiApp/blob/master/assets/application-flow.png)

# Single Responsibility
This is the first principle of S.O.L.I.D. pattern introduced by Robert Cecil Martin when you work with OOP. 

The 5 principles are as follow:
 1. S: single Responsibility
 2. O: Open Close Principle
 3. L: Liskov Substitution
 4. I: Interface Segregation
 5. D: Dependency Inversion
 
 The meaning of this principle basically is that every class or method should only perform one action or task.
 
# Clean Code
According to Robert C. Martin AKA 'Uncle Bob' in his book 'Clean Code: A Handbook of Agile Software Craftsmanship ' where he gives us a guide to how to write good code.

For me, a nice clean code is that which try to accomplish the next guidelines:
- The code should be easy to read and understandable
- Using meaningful names for classes, functions and objects, names that represents what it does
- Be consistent and don't try to repeat any functionality in code in same class, Try to use OOP anytime is possible
- Make reviews constantly and make it better and the same time identify future changes if applicable 
- According Clean Architecture, I agree with this architecture that everything has to be splitted and handle in different flows, I think this make a better code and easy to understand
- If possible try to perform Unit Testing of classes or functions to be sure your code is ok

Moreover, there are other ways to get what a cleand code is like DRP (don't repeat yourself), The principle of least Astonishment, The boy scout rule, F.I.R.S.T. and S.O.L.I.D.

## Dependencies
- Retrofit 2 [version: '2.4.0'](https://square.github.io/retrofit/): A type-safe HTTP client for Android and Java.
- OkHttp 3 [version: '3.4.1'](https://square.github.io/okhttp/): An HTTP & HTTP/2 client for Android and Java applications.
- AndroidX [version: '1.0.0'](https://mvnrepository.com/artifact/androidx): AndroidX is the open-source project that the Android team uses to develop, test, package, version and release libraries within Jetpack.
- Arch Lifecycle [version: '2.0.0'](https://developer.android.com/jetpack/androidx/releases/lifecycle): Lifecycle-aware components perform actions in response to a change in the lifecycle status of another component, such as activities and fragments. 
- Mockito [version: '2.27.0'](https://site.mockito.org/): Mockito is a mocking framework used for unit testing
- Material Design: [version:'1.0.0'](https://github.com/material-components): Material Components for Android is a drop-in replacement for Android's Design Support Library.
- Dagger2: [version:'2.20'](https://github.com/google/dagger): Dependency injection framework that is built on the standard javax.inject annotations
- Room: [version:'2.1.0-alpha04'](https://github.com/rom-rb/rom): The Room persistence is a easy way to work with SQLiteDatabase objects in your app
- RxJava2: [version:'2.2.10'](https://github.com/ReactiveX/RxJava): To apply reactive programming and provides Java API for asynchronous programming with observable streams
- Glide: [version:'4.9.0'](https://github.com/bumptech/glide): Image Loader Library


## License
[MIT](https://choosealicense.com/licenses/mit/)






