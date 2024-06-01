package com.example.project.Class


sealed class Routes (val route: String) {
    object Home : Routes("Home")
    object Contacts : Routes("Contacts")
    object Favorites : Routes("Favorites")
    object Login : Routes("Login")
    object Register : Routes("Register")
    object Welcome : Routes("Welcome")
    object Main : Routes("Main")
    object Menu : Routes("Menu")
    object Map : Routes("Map")
    object Kupet : Routes("Kupet")
    object Friend : Routes("Friend")
    object FriendDetail : Routes("FriendDetail")
    object Quiz : Routes("Quiz")
    object CorrectAns : Routes("CorrectAns")
    object WrongAns : Routes("WrongAns")
}