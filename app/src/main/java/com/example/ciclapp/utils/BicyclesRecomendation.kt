package com.example.ciclapp.utils

data class RecomendacionBicycle(
    val descripcion: String,
    val mensaje: String
)

class BicyclesRecomendation {
    val recomendacionesBici = listOf(
        RecomendacionBicycle(
            "Tormenta con lluvia ligera",
            "Para la tormenta con lluvia ligera, se recomienda utilizar una bicicleta urbana con guardabarros y luces para mantenerte visible. También, lleva contigo una chaqueta impermeable para mantenerte seco durante tu viaje."
        ),
        RecomendacionBicycle(
            "Tormenta con lluvia",
            "Para la tormenta con lluvia, se recomienda utilizar una bicicleta urbana con guardabarros, luces y neumáticos resistentes al agua. Además, usa ropa impermeable para protegerte de la lluvia constante."
        ),
        RecomendacionBicycle(
            "Tormenta con fuertes lluvias",
            "Para la tormenta con fuertes lluvias, se recomienda una bicicleta de turismo resistente con guardabarros, neumáticos antideslizantes y luces potentes. Utiliza ropa impermeable de alta calidad para mantenerte seco."
        ),
        RecomendacionBicycle(
            "Tormenta ligera",
            "Para la tormenta ligera, una bicicleta urbana con guardabarros y luces será suficiente. Asegúrate de llevar una chaqueta impermeable y ajusta tu velocidad según las condiciones de la carretera."
        ),
        RecomendacionBicycle(
            "Tormenta",
            "Para la tormenta, una bicicleta de turismo con guardabarros, neumáticos resistentes y luces será esencial. Viste ropa impermeable completa y utiliza gafas para proteger tus ojos de la lluvia."
        ),
        RecomendacionBicycle(
            "Fuerte tormenta",
            "Para la fuerte tormenta, considera no salir en bicicleta debido a los riesgos asociados. Si decides hacerlo, utiliza una bicicleta de montaña resistente y equipo de lluvia de alta calidad. Mantén extrema precaución en la carretera."
        ),
        RecomendacionBicycle(
            "Tormenta irregular",
            "Para la tormenta irregular, una bicicleta híbrida con neumáticos versátiles y guardabarros será útil. Mantente alerta a cambios repentinos en el clima y ajusta tu velocidad en consecuencia."
        ),
        RecomendacionBicycle(
            "Tormenta con llovizna ligera",
            "Para la tormenta con llovizna ligera, una bicicleta urbana con guardabarros y luces será adecuada. Lleva contigo una chaqueta impermeable y ajusta tu velocidad según las condiciones de la carretera."
        ),
        RecomendacionBicycle(
            "Tormenta con llovizna",
            "Para la tormenta con llovizna, utiliza una bicicleta de turismo con guardabarros y luces. Ajusta tu velocidad y lleva ropa impermeable para mantenerte seco en condiciones de llovizna constante."
        ),
        RecomendacionBicycle(
            "Tormenta con llovizna intensa",
            "Para la tormenta con llovizna intensa, elige una bicicleta de turismo resistente con guardabarros, neumáticos antideslizantes y luces potentes. Utiliza ropa impermeable de alta calidad para protegerte de la llovizna intensa."
        ),
        RecomendacionBicycle(
            "Llovizna de intensidad ligera",
            "Para la llovizna de intensidad ligera, una bicicleta urbana con guardabarros y luces será adecuada. Utiliza ropa impermeable ligera y ajusta tu velocidad según las condiciones de la carretera."
        ),
        RecomendacionBicycle(
            "Llovizna",
            "Para la llovizna, una bicicleta urbana con guardabarros y luces será útil. Utiliza ropa impermeable y ajusta tu velocidad según la intensidad de la lluvia."
        ),
        RecomendacionBicycle(
            "Llovizna intensa",
            "Para la llovizna intensa, elige una bicicleta de turismo resistente con guardabarros, neumáticos antideslizantes y luces potentes. Utiliza ropa impermeable de alta calidad para protegerte de la llovizna intensa."
        ),
        RecomendacionBicycle(
            "Llovizna de intensidad ligera",
            "Para la llovizna de intensidad ligera, una bicicleta urbana con guardabarros y luces será adecuada. Utiliza ropa impermeable ligera y ajusta tu velocidad según las condiciones de la carretera."
        ),
        RecomendacionBicycle(
            "Llovizna",
            "Para la llovizna, una bicicleta urbana con guardabarros y luces será útil. Utiliza ropa impermeable y ajusta tu velocidad según la intensidad de la lluvia."
        ),
        RecomendacionBicycle(
            "Llovizna de gran intensidad",
            "Para la llovizna de gran intensidad, elige una bicicleta de turismo resistente con guardabarros, neumáticos antideslizantes y luces potentes. Utiliza ropa impermeable de alta calidad para protegerte de la llovizna intensa."
        ),
        RecomendacionBicycle(
            "Lluvia y llovizna",
            "Para la lluvia y llovizna, utiliza una bicicleta de turismo con guardabarros, luces y neumáticos resistentes al agua. Además, usa ropa impermeable para protegerte de la lluvia constante y la llovizna."
        ),
        RecomendacionBicycle(
            "Fuertes lluvias y lloviznas",
            "Para las fuertes lluvias y lloviznas, una bicicleta de turismo resistente con guardabarros, neumáticos antideslizantes y luces será esencial. Utiliza ropa impermeable de alta calidad para mantenerte seco en condiciones de lluvia y llovizna."
        ),
        RecomendacionBicycle(
            "Llovizna de ducha",
            "Para la llovizna de ducha, elige una bicicleta de turismo resistente con guardabarros, neumáticos antideslizantes y luces potentes. Utiliza ropa impermeable de alta calidad para protegerte de la llovizna y ajusta tu velocidad según las condiciones de la carretera."
        ),
        RecomendacionBicycle(
            "Lluvia ligera",
            "Para la lluvia ligera, se recomienda utilizar una bicicleta urbana con guardabarros y luces para mantenerte visible. También, lleva contigo una chaqueta impermeable y ajusta tu velocidad según las condiciones de la carretera."
        ),
        RecomendacionBicycle(
            "Lluvia moderada",
            "Para la lluvia moderada, se aconseja una bicicleta urbana con guardabarros, luces y neumáticos resistentes al agua. Además, utiliza ropa impermeable para protegerte de la lluvia constante."
        ),
        RecomendacionBicycle(
            "Lluvia de gran intensidad",
            "Para la lluvia de gran intensidad, elige una bicicleta de turismo resistente con guardabarros, neumáticos antideslizantes y luces potentes. Utiliza ropa impermeable de alta calidad para mantenerte seco en condiciones de lluvia intensa."
        ),
        RecomendacionBicycle(
            "Lluvias muy intensas",
            "Para lluvias muy intensas, se recomienda evitar andar en bicicleta debido a los riesgos asociados. Si decides hacerlo, utiliza una bicicleta de montaña robusta con guardabarros y equipo de lluvia completo. Mantén extrema precaución en la carretera."
        ),
        RecomendacionBicycle(
            "Lluvia extrema",
            "Para lluvias extremas, se aconseja no salir en bicicleta debido a los riesgos significativos. Si decides hacerlo, utiliza una bicicleta de montaña robusta con guardabarros y equipo de lluvia de alta calidad. Mantén extrema precaución en la carretera."
        ),
        RecomendacionBicycle(
            "Lluvia helada",
            "Para la lluvia helada, utiliza una bicicleta de turismo resistente con guardabarros, neumáticos antideslizantes y luces potentes. Asegúrate de vestir ropa abrigada y impermeable para protegerte del frío y la lluvia helada."
        ),
        RecomendacionBicycle(
            "Lluvia de intensidad de luz",
            "Para la lluvia de intensidad de luz, se recomienda una bicicleta urbana con guardabarros y luces para mantenerte visible. Lleva ropa impermeable ligera y ajusta tu velocidad según las condiciones de la carretera."
        ),
        RecomendacionBicycle(
            "Aguacero",
            "Para un aguacero, elige una bicicleta de turismo robusta con guardabarros, neumáticos antideslizantes y luces potentes. Utiliza ropa impermeable de alta calidad y mantén extrema precaución en la carretera."
        ),
        RecomendacionBicycle(
            "Lluvia intensa y intensa",
            "Para lluvias intensas, se recomienda evitar andar en bicicleta debido a los riesgos asociados. Si decides hacerlo, utiliza una bicicleta de montaña resistente con guardabarros y equipo de lluvia completo. Mantén extrema precaución en la carretera."
        ),
        RecomendacionBicycle(
            "Lluvia irregular",
            "Para lluvias irregulares, se aconseja una bicicleta urbana con guardabarros y luces para mantenerte visible. Ajusta tu velocidad y mantén extrema precaución en la carretera, ya que las condiciones pueden cambiar rápidamente."
        ),
        RecomendacionBicycle(
            "Nieve ligera",
            "Para la nieve ligera, elige una bicicleta de montaña con neumáticos para nieve y frenos resistentes. Asegúrate de vestir ropa abrigada e impermeable para protegerte de las condiciones invernales."
        ),
        RecomendacionBicycle(
            "Nieve",
            "Para la nieve, se recomienda una bicicleta de montaña con neumáticos para nieve, frenos resistentes y guardabarros. Utiliza ropa impermeable y abrigada para mantenerte cómodo y seguro."
        ),
        RecomendacionBicycle(
            "Fuertes nevadas",
            "Para fuertes nevadas, evita andar en bicicleta debido a los riesgos asociados. Si decides hacerlo, utiliza una bicicleta de montaña resistente con neumáticos para nieve y equipo de invierno completo. Mantén extrema precaución en la carretera."
        ),
        RecomendacionBicycle(
            "Aguanieve",
            "Para la aguanieve, elige una bicicleta de montaña con neumáticos para nieve y guardabarros. Utiliza ropa impermeable y abrigada, y ajusta tu velocidad según las condiciones de la carretera."
        ),
        RecomendacionBicycle(
            "Aguanieve ligero",
            "Para el aguanieve ligero, utiliza una bicicleta de montaña con neumáticos para nieve y guardabarros. Ajusta tu velocidad y lleva ropa impermeable ligera para mantenerte cómodo."
        ),
        RecomendacionBicycle(
            "Aguanieve en la ducha",
            "Para la aguanieve en la ducha, elige una bicicleta de montaña con neumáticos para nieve y guardabarros. Utiliza ropa impermeable y abrigada, y ajusta tu velocidad según las condiciones cambiantes de la carretera."
        ),
        RecomendacionBicycle(
            "Lluvia ligera y nieve",
            "Para la lluvia ligera y nieve, utiliza una bicicleta de turismo con guardabarros, neumáticos versátiles y luces. Ajusta tu velocidad y lleva ropa impermeable y abrigada para enfrentar las condiciones mixtas."
        ),
        RecomendacionBicycle(
            "Lluvia y nieve",
            "Para la lluvia y nieve, elige una bicicleta de turismo con guardabarros, neumáticos resistentes y luces. Utiliza ropa impermeable y abrigada para protegerte de las condiciones invernales."
        ),
        RecomendacionBicycle(
            "Lluvia ligera nieve",
            "Para la lluvia ligera y nieve, utiliza una bicicleta de turismo con guardabarros, neumáticos versátiles y luces. Ajusta tu velocidad y lleva ropa impermeable y abrigada para enfrentar las condiciones mixtas."
        ),
        RecomendacionBicycle(
            "Ducha de nieve",
            "Para la ducha de nieve, elige una bicicleta de turismo con guardabarros, neumáticos resistentes y luces. Utiliza ropa impermeable y abrigada, y mantén la precaución en áreas propensas a acumulación de nieve."
        ),
        RecomendacionBicycle(
            "Fuertes lluvias de nieve",
            "Para fuertes lluvias de nieve, evita andar en bicicleta debido a los riesgos significativos. Si decides hacerlo, utiliza una bicicleta de montaña resistente con neumáticos para nieve y equipo de invierno completo. Mantén extrema precaución en la carretera."
        ),
        RecomendacionBicycle(
            "Neblina",
            "Para la neblina, utiliza una bicicleta urbana con luces delanteras y traseras para aumentar la visibilidad. Viste ropa brillante y ajusta tu velocidad según las condiciones de visibilidad."
        ),
        RecomendacionBicycle(
            "Fumar",
            "Para condiciones de humo denso, evita andar en bicicleta en esas áreas debido a los riesgos para la salud. Si es necesario, utiliza una mascarilla y limita la actividad al aire libre."
        ),
        RecomendacionBicycle(
            "Bruma",
            "Para la bruma, utiliza una bicicleta urbana con luces y viste ropa brillante. Ajusta tu velocidad y mantén precaución en la carretera."
        ),
        RecomendacionBicycle(
            "Remolinos de arena/polvo",
            "Evita andar en bicicleta en áreas con remolinos de arena o polvo debido a los riesgos para la salud y la seguridad. Si es necesario, utiliza una mascarilla y busca refugio."
        ),
        RecomendacionBicycle(
            "Niebla",
            "Para la niebla, utiliza una bicicleta urbana con luces delanteras y traseras para aumentar la visibilidad. Viste ropa brillante y ajusta tu velocidad según las condiciones de visibilidad."
        ),
        RecomendacionBicycle(
            "Arena",
            "Evita andar en bicicleta en áreas con fuertes vientos de arena debido a los riesgos para la salud y la seguridad. Si es necesario, utiliza una mascarilla y busca refugio."
        ),
        RecomendacionBicycle(
            "Polvo",
            "Evita andar en bicicleta en áreas con polvo suspendido en el aire debido a los riesgos para la salud y la seguridad. Si es necesario, utiliza una mascarilla y busca refugio."
        ),
        RecomendacionBicycle(
            "Ceniza volcánica",
            "Para la ceniza volcánica, utiliza una bicicleta urbana con luces y viste ropa que cubra completamente tu cuerpo. Utiliza una mascarilla y evita áreas con acumulación de ceniza."
        ),
        RecomendacionBicycle(
            "Chubascos",
            "Para chubascos, utiliza una bicicleta de turismo con guardabarros y luces. Viste ropa impermeable y ajusta tu velocidad según la intensidad de la lluvia."
        ),
        RecomendacionBicycle(
            "Tornado",
            "En caso de tornado, busca refugio inmediato y evita andar en bicicleta en áreas propensas a tornados. Prioriza tu seguridad y sigue las advertencias meteorológicas."
        ),
        RecomendacionBicycle(
            "Cielo claro",
            "Disfruta de tu paseo en bicicleta bajo un cielo despejado. Utiliza protección solar si es necesario para protegerte de la radiación solar directa."
        ),
        RecomendacionBicycle(
            "Pocas nubes",
            "Con pocas nubes, puedes utilizar una bicicleta de turismo con guardabarros y luces. Asegúrate de llevar protección solar y disfruta del clima agradable."
        ),
        RecomendacionBicycle(
            "Nubes dispersas",
            "Para nubes dispersas, una bicicleta urbana con luces será útil. Utiliza protección solar y ajusta tu velocidad según las condiciones de visibilidad."
        ),
        RecomendacionBicycle(
            "Nubes rotas",
            "Aunque hay nubes rotas, puedes utilizar una bicicleta de turismo con guardabarros y luces. Asegúrate de llevar protección solar y disfruta de tu paseo."
        ),
        RecomendacionBicycle(
            "Nubes cubiertas",
            "Con nubes cubiertas, utiliza una bicicleta urbana con luces. Ajusta tu velocidad y lleva ropa adecuada para mantenerte visible y protegerte en caso de lluvia."
        )
    )

    fun obtenerBicicleta(descripcion: String): String {
        val recomendacion = recomendacionesBici.firstOrNull {
            it.descripcion.equals(descripcion, ignoreCase = true)
        }

        return recomendacion?.mensaje ?: "Usa la bicicleta de tu preferencia. 🚲"
    }
}