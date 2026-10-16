package educa.iesam.superhero.feature.superhero.domain.uses

import educa.iesam.superhero.feature.superhero.domain.interfaces.SuperheroRepository

class DeleteSuperheroUseCase(val deleteSuperheroRepository: SuperheroRepository) {
    operator fun invoke(id: String){
        deleteSuperheroRepository.deleteSuperheroe(id)
    }
}