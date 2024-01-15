package com.example.ciclapp.models

import androidx.annotation.Keep


data class Users(
    val id: String = "",
    val nombre: String = "",
    val apellido: String = "",
    val correo: String = "",
    val nivelEntreno: String = "",
    val experiencia: String = "",
    val edad: String = "",
    val sexo: String = ""
) {
    // Agrega un constructor sin argumentos
    constructor() : this("", "", "", "", "", "", "", "")
}