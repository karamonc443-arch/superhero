package educa.iesam.superhero.feature.superhero.domain.uses

import educa.iesam.superhero.feature.superhero.domain.model.Superhero
import educa.iesam.superhero.feature.superhero.domain.interfaces.SuperheroRepository

class UpdateSuperheroUseCase(val updateSuperheroRepository: SuperheroRepository){
    operator fun invoke(id: String, superhero: Superhero){
        updateSuperheroRepository.updateSuperheroe(id,superhero)
    }
}