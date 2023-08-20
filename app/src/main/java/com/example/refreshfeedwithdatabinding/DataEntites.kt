package com.example.refreshfeedwithdatabinding

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataEntites(
    @PrimaryKey(autoGenerate = true)
    var id:Int
)
