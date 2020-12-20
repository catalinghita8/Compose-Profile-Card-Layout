package com.codingtroops.profilecardlayout

data class UserProfile constructor(val name: String, val status: Boolean, val drawableId: Int)

val userProfileList = arrayListOf(
    UserProfile(name = "John Doe", status = true, R.drawable.profile_picture),
    UserProfile(name = "Anna Joans", status = false, R.drawable.profile_picture2),
)