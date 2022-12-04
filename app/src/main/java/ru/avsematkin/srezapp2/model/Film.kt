package ru.avsematkin.srezapp2.model

data class Film(
    val age_limit: Int,
    val description: String,
    val id: Int,
    val image: String,
    val name: String,
    val shots: List<String>
)