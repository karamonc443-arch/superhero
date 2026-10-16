package educa.iesam.superhero.feature.superhero.presentation

import educa.iesam.superhero.feature.superhero.domain.uses.DeleteSuperheroUseCase

class SuperheroDeleteViewModel(private val deleteSuperheroUseCase: DeleteSuperheroUseCase) {

    fun superheroDeletViewModel() = deleteSuperheroUseCase

}