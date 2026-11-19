package educa.iesam.karamon.superhero.feature.data.local.memory

import educa.iesam.karamon.superhero.R
import educa.iesam.karamon.superhero.feature.domain.SuperHero

class SuperHeroMemoryLocalDataSource {
    private var superHeroList: List<SuperHero> = listOf(
        SuperHero(
            "1",
            "Spider-Man",
            "Peter Parker es un joven que obtiene poderes arácnidos tras ser mordido por una araña radiactiva. Utiliza sus habilidades para proteger Nueva York.",
            "spider-man",
            image = R.drawable.spiderman
        ),
        SuperHero(
            "2",
            "Black Panther",
            "T'Challa es el rey de Wakanda y protector de su nación. Posee habilidades mejoradas y utiliza un traje de vibranium.",
            "black-panther",
            image = R.drawable.black_panther
        ),
        SuperHero(
            "3",
            "Iron Man",
            "Tony Stark es un brillante inventor y empresario que crea una armadura tecnológica avanzada para combatir el crimen.",
            "iron-man",
            image = R.drawable.iron_man
        ),
        SuperHero(
            "4",
            "Thor",
            "Thor es el dios del trueno de Asgard. Posee una fuerza extraordinaria y utiliza su poderoso martillo Mjolnir.",
            "thor",
            image = R.drawable.thor
        ),
        SuperHero(
            "5",
            "Hulk",
            "Bruce Banner es un científico que se transforma en Hulk cuando se enfada. Tiene una fuerza descomunal y una gran resistencia.",
            "hulk",
            image = R.drawable.hulk
        ),
        SuperHero(
            "6",
            "Captain America",
            "Steve Rogers es un supersoldado que lucha por la justicia. Destaca por su fuerza, resistencia y su inseparable escudo.",
            "captain-america",
            image = R.drawable.captain_america
        ),
        SuperHero(
            "7",
            "Superman",
            "Clark Kent es un héroe procedente del planeta Krypton. Tiene super fuerza, capacidad de volar, visión calorífica y gran resistencia.",
            "superman",
            image = R.drawable.superman
        ),
        SuperHero(
            "8",
            "Batman",
            "Bruce Wayne es un millonario que combate el crimen en Gotham City utilizando su inteligencia, entrenamiento y tecnología avanzada.",
            "batman",
            image = R.drawable.batman
        ),
        SuperHero(
            "9",
            "Wonder Woman",
            "Diana Prince es una princesa amazona con fuerza sobrehumana, habilidades de combate y un gran sentido de la justicia.",
            "wonder-woman",
            image = R.drawable.wonder_woman
        ),
        SuperHero(
            "10",
            "Flash",
            "Barry Allen es un superhéroe capaz de correr a velocidades extraordinarias gracias a su conexión con la Fuerza de la Velocidad.",
            "flash",
            image = R.drawable.flash
        )
    )

    // Guardar una lista completa
    fun saveList(superHeroes: List<SuperHero>) {
        superHeroList = superHeroes.toList()
    }

    // Agregar un superhéroe
    fun save(superHero: SuperHero) {
        superHeroList = superHeroList + superHero
    }

    // Recuperar todos
    fun findAll(): List<SuperHero> {
        return superHeroList.toList()
    }

    // Buscar por ID
    fun findById(id: String): SuperHero? {
        return superHeroList.find { it.id == id }
    }

    // Eliminar todos
    fun deleteAll() {
        superHeroList = emptyList()
    }

    // Eliminar por ID
    fun deleteById(id: String) {
        superHeroList = superHeroList.filter { it.id != id }
    }

    // Actualizar
    fun update(superHero: SuperHero) {
        superHeroList = superHeroList.filter { it.id != superHero.id } + superHero
    }

}
