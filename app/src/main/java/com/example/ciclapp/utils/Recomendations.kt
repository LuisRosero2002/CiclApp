package com.example.ciclapp.utils

data class Recomendacion(
    val descripcion: String,
    val temperaturaMinima: Double,
    val mensaje: String
)

class RecomendacionesBicicleta {

    val recomendaciones = listOf(
        Recomendacion(
            "Tormenta con lluvia ligera",
            20.0,
            "Tormenta con lluvia ligera: \n\nConsidera llevar un impermeable y vestir capas."
        ),
        Recomendacion(
            "Tormenta con lluvia",
            20.0,
            "Tormenta con lluvia: \n\nUtiliza un impermeable resistente y guarda objetos importantes en bolsas impermeables."
        ),
        Recomendacion(
            "Tormenta con fuertes lluvias",
            20.0,
            "Tormenta con fuertes lluvias: \n\nOpta por ropa impermeable de alta calidad, asegúrate de tener guardabarros y utiliza neumáticos con buen agarre."
        ),
        Recomendacion(
            "Tormenta ligera",
            20.0,
            "Tormenta ligera: \n\nLleva contigo una capa impermeable ligera y mantén la precaución en la carretera."
        ),
        Recomendacion(
            "Tormenta",
            20.0,
            "Tormenta con lluvia: \n\nViste ropa impermeable completa, utiliza gafas y asegúrate de tener luces en tu bicicleta."
        ),
        Recomendacion(
            "Fuerte tormenta",
            20.0,
            "Fuerte tormenta: \n\nEvalúa la posibilidad de no salir y, si decides hacerlo, utiliza equipo de lluvia de alta calidad y extrema precaución."
        ),
        Recomendacion(
            "Tormenta irregular",
            20.0,
            "Tormenta irregular: \n\nMantente alerta a cambios repentinos en el clima, ajusta tu velocidad y ten acceso a un mapa o aplicación para verificar la ruta."
        ),
        Recomendacion(
            "Tormenta con llovizna ligera",
            20.0,
            "Tormenta con llovizna ligera: \n\nConsidera llevar un impermeable ligero y mantener la visibilidad con luces en tu bicicleta."
        ),
        Recomendacion(
            "Tormenta con llovizna",
            20.0,
            "Tormenta con llovizna: \n\nUtiliza un impermeable resistente y ajusta tu velocidad según las condiciones de la carretera."
        ),
        Recomendacion(
            "Tormenta con llovizna intensa",
            20.0,
            "Tormenta con llovizna intensa: \n\nUtiliza equipo impermeable completo, ajusta tu velocidad y ten precaución en áreas propensas a acumulación de agua."
        ),
        Recomendacion(
            "Llovizna de intensidad ligera",
            20.0,
            "Llovizna de intensidad ligera: \n\nUtiliza ropa impermeable ligera y mantiene la precaución en la carretera."
        ),
        Recomendacion(
            "Llovizna",
            20.0,
            "Llovizna: \n\nUtiliza un impermeable resistente y ajusta tu velocidad según las condiciones de la carretera."
        ),
        Recomendacion(
            "Llovizna intensa",
            20.0,
            "Llovizna intensa: \n\nUtiliza equipo impermeable completo, ajusta tu velocidad y ten precaución en áreas propensas a acumulación de agua."
        ),
        Recomendacion(
            "Llovizna de intensidad ligera",
            20.0,
            "Llovizna de intensidad ligera: \n\nUtiliza ropa impermeable ligera y mantiene la precaución en la carretera."
        ),
        Recomendacion(
            "Llovizna",
            20.0,
            "Llovizna: \n\nUtiliza un impermeable resistente y ajusta tu velocidad según las condiciones de la carretera."
        ),
        Recomendacion(
            "Llovizna de gran intensidad",
            20.0,
            "Llovizna de gran intensidad: \n\nOpta por ropa impermeable de alta calidad y extrema precaución en la carretera."
        ),
        Recomendacion(
            "Lluvia y llovizna",
            20.0,
            "Lluvia y llovizna: \n\nUtiliza ropa impermeable completa, ajusta tu velocidad y guarda objetos importantes en bolsas impermeables."
        ),
        Recomendacion(
            "Fuertes lluvias y lloviznas",
            20.0,
            "Fuertes lluvias y lloviznas: \n\nOpta por ropa impermeable de alta calidad, utiliza gafas y asegúrate de tener luces en tu bicicleta."
        ),
        Recomendacion(
            "Llovizna de ducha",
            20.0,
            "Llovizna de ducha: \n\nUtiliza equipo impermeable completo, ajusta tu velocidad y ten precaución en áreas propensas a acumulación de agua."
        ),
        Recomendacion(
            "Lluvia ligera",
            20.0,
            "Lluvia ligera: \n\nConsidera llevar un impermeable y vestir capas."
        ),
        Recomendacion(
            "Lluvia moderada",
            20.0,
            "Lluvia moderada: \n\nUtiliza un impermeable resistente y ajusta tu velocidad según las condiciones de la carretera."
        ),
        Recomendacion(
            "Lluvia de gran intensidad",
            20.0,
            "Lluvia de gran intensidad: \n\nOpta por ropa impermeable de alta calidad, utiliza gafas y asegúrate de tener luces en tu bicicleta."
        ),
        Recomendacion(
            "Lluvias muy intensas",
            20.0,
            "Lluvias muy intensas: \n\nUtiliza equipo impermeable completo, ajusta tu velocidad y ten precaución en áreas propensas a acumulación de agua."
        ),
        Recomendacion(
            "Lluvia extrema",
            20.0,
            "Lluvia extrema: \n\nEvalúa la posibilidad de no salir y, si decides hacerlo, utiliza equipo de lluvia de alta calidad y extrema precaución."
        ),
        Recomendacion(
            "Lluvia helada",
            20.0,
            "Lluvia helada: \n\nExtrema precaución en superficies resbaladizas. Utiliza ropa impermeable y mantén la velocidad baja."
        ),
        Recomendacion(
            "Lluvia de intensidad de luz",
            20.0,
            "Lluvia de intensidad de luz: \n\nUtiliza un impermeable ligero y mantiene la precaución en la carretera."
        ),
        Recomendacion(
            "Aguacero",
            20.0,
            "Aguacero: \n\nOpta por ropa impermeable de alta calidad, utiliza gafas y asegúrate de tener luces en tu bicicleta."
        ),
        Recomendacion(
            "Lluvia intensa y intensa",
            20.0,
            "Lluvia intensa y intensa: \n\nUtiliza equipo impermeable completo, ajusta tu velocidad y ten precaución en áreas propensas a acumulación de agua."
        ),
        Recomendacion(
            "Lluvia irregular",
            20.0,
            "Lluvia irregular: \n\nMantente alerta a cambios repentinos en el clima, ajusta tu velocidad y ten acceso a un mapa o aplicación para verificar la ruta."
        ),
        Recomendacion(
            "Nieve ligera",
            -2.0,
            "Nieve ligera: \n\nUtiliza ropa abrigada e impermeable, y ten cuidado con las superficies resbaladizas."
        ),
        Recomendacion(
            "Nieve",
            -5.0,
            "Nieve: \n\nOpta por ropa abrigada e impermeable, y asegúrate de tener neumáticos para nieve en tu bicicleta."
        ),
        Recomendacion(
            "Fuertes nevadas",
            -10.0,
            "Fuertes nevadas: \n\nEvita andar en bicicleta en condiciones de fuertes nevadas debido a los riesgos asociados."
        ),
        Recomendacion(
            "Aguanieve",
            -1.0,
            "Aguanieve: \n\nUtiliza ropa impermeable y abrigada, y ten cuidado con las superficies resbaladizas."
        ),
        Recomendacion(
            "Aguanieve ligero",
            -3.0,
            "Aguanieve ligero: \n\nUtiliza ropa impermeable y abrigada, y mantén la precaución en la carretera."
        ),
        Recomendacion(
            "Aguanieve en la ducha",
            -4.0,
            "Aguanieve en la ducha: \n\nUtiliza equipo impermeable completo y ajusta tu velocidad. Ten precaución en áreas propensas a acumulación de nieve."
        ),
        Recomendacion(
            "Lluvia ligera y nieve",
            1.0,
            "Lluvia ligera y nieve: \n\nUtiliza equipo impermeable y abrigado. Ajusta tu velocidad y ten precaución en superficies resbaladizas."
        ),
        Recomendacion(
            "Lluvia y nieve",
            -2.0,
            "Lluvia y nieve: \n\nOpta por ropa impermeable y abrigada, y asegúrate de tener neumáticos para nieve en tu bicicleta."
        ),
        Recomendacion(
            "Lluvia ligera nieve",
            0.0,
            "Lluvia ligera y nieve: \n\nUtiliza equipo impermeable y abrigado. Ajusta tu velocidad y ten precaución en superficies resbaladizas."
        ),
        Recomendacion(
            "Ducha de nieve",
            -6.0,
            "Ducha de nieve: \n\nUtiliza equipo impermeable completo y ajusta tu velocidad. Ten precaución en áreas propensas a acumulación de nieve."
        ),
        Recomendacion(
            "Fuertes lluvias de nieve",
            -8.0,
            "Fuertes lluvias de nieve: \n\nEvita andar en bicicleta en condiciones de fuertes lluvias de nieve debido a los riesgos asociados."
        ),
        Recomendacion(
            "Neblina",
            15.0,
            "Neblina: \n\nUtiliza luces en tu bicicleta para mejorar la visibilidad. Conduce a una velocidad segura y mantén una distancia adecuada."
        ),
        Recomendacion(
            "Fumar",
            25.0,
            "Fumar: \n\nUtiliza una mascarilla para protegerte del humo y limita la actividad al aire libre en áreas con humo denso."
        ),
        Recomendacion(
            "Bruma",
            20.0,
            "Bruma: \n\nMantén la precaución en la carretera y utiliza luces en tu bicicleta para mejorar la visibilidad."
        ),
        Recomendacion(
            "Remolinos de arena/polvo",
            30.0,
            "Remolinos de arena/polvo: \n\nEvita andar en bicicleta en áreas con remolinos de arena o polvo debido a los riesgos para la salud y la seguridad."
        ),
        Recomendacion(
            "Niebla",
            15.0,
            "Niebla: \n\nUtiliza luces en tu bicicleta, viste ropa brillante y conduce a una velocidad reducida."
        ),
        Recomendacion(
            "Arena",
            25.0,
            "Arena: \n\nEvita andar en bicicleta en áreas con fuertes vientos de arena debido a los riesgos para la salud y la seguridad."
        ),
        Recomendacion(
            "Polvo",
            25.0,
            "Polvo: \n\nEvita andar en bicicleta en áreas con polvo suspendido en el aire debido a los riesgos para la salud y la seguridad."
        ),
        Recomendacion(
            "Ceniza volcánica",
            20.0,
            "Ceniza volcánica: \n\nUtiliza una mascarilla y protege tus ojos. Evita andar en bicicleta en áreas con acumulación de ceniza."
        ),
        Recomendacion(
            "Chubascos",
            18.0,
            "Chubascos: \n\nUtiliza ropa impermeable y mantén la precaución en la carretera."
        ),
        Recomendacion(
            "Tornado",
            25.0,
            "Tornado: \n\nBusca refugio inmediato y evita andar en bicicleta en áreas propensas a tornados."
        ),
        Recomendacion(
            "Cielo claro",
            25.0,
            "Cielo claro: \n\nDisfruta de tu paseo en bicicleta bajo un cielo despejado. Utiliza protección solar si es necesario."
        ),
        Recomendacion(
            "Pocas nubes",
            22.0,
            "Pocas nubes: \n\nExcelentes condiciones para andar en bicicleta. Asegúrate de tener protección solar y disfruta del clima agradable."
        ),
        Recomendacion(
            "Nubes dispersas",
            20.0,
            "Nubes dispersas: \n\nUtiliza protección solar y disfruta de tu paseo en bicicleta con un clima agradable."
        ),
        Recomendacion(
            "Nubes rotas",
            18.0,
            "Nubes rotas: \n\nAunque hay nubes, el clima es propicio para andar en bicicleta. Utiliza protección solar y disfruta del paseo."
        ),
        Recomendacion(
            "Nubes cubiertas",
            15.0,
            "Nubes cubiertas: \n\nEl cielo está nublado, pero aún puedes andar en bicicleta con precaución. Utiliza ropa adecuada y mantén la visibilidad con luces si es necesario."
        )

    )

    fun obtenerRecomendacion(descripcion: String, temperatura: Double): String {
        val recomendacion = recomendaciones.find {
            it.descripcion.equals(
                descripcion,
                ignoreCase = true
            ) && temperatura < it.temperaturaMinima
        }

        return recomendacion?.mensaje ?: "Condiciones normales: Disfruta tu paseo en bicicleta."
    }
}

