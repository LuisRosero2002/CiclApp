package com.example.ciclapp.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ciclapp.R
import com.example.ciclapp.models.Training
import com.google.common.reflect.TypeToken
import com.google.gson.Gson

class CustomAdapter( nivelEntreno:String):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    private val entrenoBasico = """
    [
      {
        "titulo": "Paseo Tranquilo",
        "descripcion": "Un paseo tranquilo es un tipo de entrenamiento de ciclismo de nivel básico que se centra en disfrutar del paisaje y mejorar la resistencia. Durante este entrenamiento, mantén una velocidad moderada, concentra tu atención en la técnica de pedaleo y respira profundamente. Es ideal para aquellos que están comenzando en el ciclismo y buscan una introducción relajada al mundo del entrenamiento en bicicleta."
      },
      {
        "titulo": "Intervalos Suaves",
        "descripcion": "Los intervalos suaves son una forma efectiva de mejorar la resistencia cardiovascular y la fuerza en ciclistas principiantes. Consiste en alternar períodos cortos de esfuerzo moderado con períodos de recuperación. Por ejemplo, pedalea a un ritmo moderado durante 2 minutos, seguido de 1 minuto de descanso. Repite este patrón durante tu sesión. Este tipo de entrenamiento ayuda a construir una base sólida para futuras mejoras en el rendimiento en bicicleta."
      },
      {
        "titulo": "Subidas Leves",
        "descripcion": "Las subidas leves son un excelente ejercicio para construir fuerza en las piernas y mejorar la resistencia en ciclistas principiantes. Encuentra una pendiente suave y pedalea hacia arriba a un ritmo constante. Concédele a tus piernas el desafío adicional de enfrentarse a la gravedad. Recuerda mantener una buena postura y utilizar cambios de marcha adecuados. Este tipo de entrenamiento no solo fortalece tus músculos, sino que también te acostumbra a enfrentar terrenos más variados."
      }
    ]
    """.trimIndent()

    private val entrenoMedio = """
        [
          {
            "titulo": "Entrenamiento de Resistencia",
            "descripcion": "Este entrenamiento de nivel medio se centra en mejorar la resistencia y la capacidad cardiovascular. Incluye sesiones de pedaleo constante a una intensidad moderada, con cambios ocasionales de ritmo para desafiar al ciclista."
          },
          {
            "titulo": "Entrenamiento Intervalado",
            "descripcion": "El entrenamiento intervalado de nivel medio implica alternar entre períodos de esfuerzo intenso y períodos de recuperación activa. Esta técnica mejora la capacidad anaeróbica y ayuda a aumentar la velocidad y la fuerza."
          },
          {
            "titulo": "Entrenamiento de Fuerza en Colinas",
            "descripcion": "Este tipo de entrenamiento se enfoca en desarrollar la fuerza en terrenos ondulados o con colinas. Pedalea con intensidad en ascensos y recupérate en descensos. Ayuda a fortalecer las piernas y mejorar la resistencia en terrenos variados."
          },
          {
            "titulo": "Entrenamiento de Velocidad",
            "descripcion": "El entrenamiento de velocidad para ciclistas de nivel medio implica sesiones de sprint y cambios rápidos de ritmo. Este enfoque mejora la capacidad de aceleración y la velocidad máxima, ideal para situaciones de carrera y esprint."
          }
        ]
        
    """.trimIndent()

    private val entrenoAlto = """
        [
          {
            "titulo": "Entrenamiento de Intervalos de Alta Intensidad (HIIT)",
            "descripcion": "El entrenamiento HIIT para bicicleta es una forma eficiente de mejorar la resistencia y la potencia. Consiste en alternar entre ráfagas intensas y períodos de recuperación, maximizando el rendimiento cardiovascular y la quema de calorías. Ideal para ciclistas avanzados que buscan desafíos intensos y resultados rápidos."
          },
          {
            "titulo": "Cuestas y Colinas Extremas",
            "descripcion": "Este entrenamiento se centra en conquistar cuestas y colinas desafiantes. Aumenta la fuerza de las piernas y la resistencia muscular. Las subidas empinadas ofrecen una resistencia natural, mejorando la capacidad cardiovascular. Recomendado para ciclistas experimentados que buscan superar límites."
          },
          {
            "titulo": "Entrenamiento de Fuerza y Potencia",
            "descripcion": "El entrenamiento de fuerza para bicicleta implica el uso de resistencia adicional y cambios de marchas para aumentar la potencia y la masa muscular. Fortalece los músculos clave utilizados en el ciclismo. Perfecto para ciclistas avanzados que desean mejorar su rendimiento general y resistencia."
          },
          {
            "titulo": "Sesiones de Entrenamiento en Intervalos de Montaña",
            "descripcion": "Este entrenamiento simula las condiciones de montaña con cambios de terreno, ofreciendo una experiencia realista. Combina subidas empinadas, descensos rápidos y terrenos variados. Desarrolla habilidades de manejo y mejora la resistencia. Recomendado para ciclistas de montaña experimentados."
          }
        ]
    """.trimIndent()


    private val nivelEntrenoRef = nivelEntreno

    private val json =  when (nivelEntrenoRef) {
        "Basico" -> {
            entrenoBasico
        }
        "Medio" -> {
            entrenoMedio
        }
        "Alto" -> {
            entrenoAlto
        }
        else -> {
            entrenoBasico
        }
    }

    val gson = Gson()
    val itemType = object : TypeToken<List<Training>>() {}.type
    val trainingItems: List<Training> = gson.fromJson(json, itemType)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout,viewGroup, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val currentItem = trainingItems[i]
        viewHolder.itemTitle.text = currentItem.titulo
        viewHolder.itemDetail.text = currentItem.descripcion

    }
    override fun getItemCount(): Int {
        return trainingItems.size
    }


    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemTitle:TextView
        var itemDetail:TextView

        init {
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

        }
    }





}