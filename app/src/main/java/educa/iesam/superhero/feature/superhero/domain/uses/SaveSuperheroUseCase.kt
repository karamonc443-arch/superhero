package educa.iesam.superhero.feature.superhero.domain.uses

import educa.iesam.superhero.feature.superhero.domain.model.Superhero
import educa.iesam.superhero.feature.superhero.domain.interfaces.SuperheroRepository

class SaveSuperheroUseCase(val superheroRepository: SuperheroRepository) {
    operator fun invoke(superhero: Superhero){
        superheroRepository.saveSuperheroe(superhero)
    }
}