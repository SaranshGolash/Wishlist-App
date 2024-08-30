package eu.tutorials.wishlistapp

import android.app.Application

class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this) // this wishlist app is the context in which you should do the whole database class.
    // This application is the location where the database is to be setup
    }
}