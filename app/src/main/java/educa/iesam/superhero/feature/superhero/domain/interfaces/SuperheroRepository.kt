package educa.iesam.superhero.feature.superhero.domain.interfaces

import educa.iesam.superhero.feature.superhero.domain.model.Superhero

interface SuperheroRepository {
    fun obtainsSuperheroes(): List<Superhero>
    fun deleteSuperheroe(id: String)
    fun updateSuperheroe(id: String,superhero: Superhero)
    fun saveSuperheroe(superhero: Superhero)
}