package com.example.project.Class

data class UserData (
    var studentID:String = "",
    var steps_current:Int = 0,
    var steps_total:Int = 0,
    var prev_steps_total:Int = 0,
    var characterIndex:Int = 0,
    var characterList : List<CharacterData>? = listOf(),
    var friendList : List<FriendData>? = listOf()
    )