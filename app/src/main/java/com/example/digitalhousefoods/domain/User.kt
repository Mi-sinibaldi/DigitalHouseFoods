package com.example.digitalhousefoods.domain

import java.io.Serializable

class User constructor(
    val id: Int,
    var userName: String,
    var password: String) : Serializable {

    override fun toString(): String {
        return "User(id=$id, userName='$userName', senha='$password')"
    }
}