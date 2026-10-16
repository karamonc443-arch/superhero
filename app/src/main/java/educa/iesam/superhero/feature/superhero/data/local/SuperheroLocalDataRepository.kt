package educa.iesam.superhero.feature.superhero.data.local

import educa.iesam.superhero.feature.superhero.domain.model.Superhero
import educa.iesam.superhero.feature.superhero.domain.interfaces.SuperheroRepository

class SuperheroLocalDataRepository(private val superheroMemLocalData: SuperheroMemLocalData) :
    SuperheroRepository {
    override fun obtainsSuperheroes(): List<Superhero> {
        return superheroMemLocalData.getAllSuperheroes()
    }

    override fun deleteSuperheroe(id: String) {
       superheroMemLocalData.deleteSuperheroById(id)
    }

    override fun updateSuperheroe(id: String, superhero: Superhero) {
       superheroMemLocalData.updateSuperheroById(id, superhero)
    }

    override fun saveSuperheroe(superhero: Superhero) {
       superheroMemLocalData.saveSuperhero().add(superhero)
    }

}