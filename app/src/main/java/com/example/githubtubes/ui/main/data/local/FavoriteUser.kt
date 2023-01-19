package com.example.githubtubes.ui.main.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_user")
data class FavoriteUser(
    val login : String,
    @PrimaryKey
    val id : Int
) : java.io.Serializable