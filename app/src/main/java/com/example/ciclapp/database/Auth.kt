package com.example.ciclapp.database

import com.example.ciclapp.models.Users
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase
import java.util.UUID

class Auth() {

    private val databaseReference: String = "Usuarios"
    private val database: DatabaseReference = FirebaseDatabase.getInstance().getReference(databaseReference)

    fun insertUser(inputData:Users, callback: (Boolean) -> Unit) {

        database.child(inputData.id).setValue(inputData)
            .addOnSuccessListener {
                callback(true)
            }
            .addOnFailureListener {
                callback(false)
            }
    }

    fun getUser(correo: String, callback: (Users?) -> Unit) {

        val consulta = database.orderByChild("correo").equalTo(correo)
        consulta.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    for (childSnapshot in snapshot.children) {
                        val userData = childSnapshot.getValue(Users::class.java)
                        callback(userData)
                    }
                } else {
                    callback(null)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                callback(null)
            }
        })
    }
}