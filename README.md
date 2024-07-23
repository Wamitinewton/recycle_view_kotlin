## Android RecyclerView in Kotlin

A RecyclerView is an advanced version of ListView with improved performance. 

When you have a long list of items to show you can use RecyclerView. 
It has the ability to reuse its views. 
In RecyclerView when the View goes out of the screen or not visible to the user it won’t destroy it, it will reuse these views. 
This feature helps in reducing power consumption and providing more responsiveness to the application. 

### Add the Dependencies
Go to app < Gradle Scripts < gradle.build(Module: app) and add the following dependencies.

```gradle
dependencies{
  // for adding recyclerview
  implementation("androidx.recyclerview:recyclerview:1.3.2")
  
  // for adding cardview
  implementation("androidx.cardview:cardview:1.0.0")
}
```
You can now build the project and see the output

