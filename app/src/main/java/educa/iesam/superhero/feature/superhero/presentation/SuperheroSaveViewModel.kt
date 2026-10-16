package educa.iesam.superhero.feature.superhero.presentation

import educa.iesam.superhero.feature.superhero.domain.uses.SaveSuperheroUseCase

class SuperheroSaveViewModel(private val superheroSaveSuperheroUseCase: SaveSuperheroUseCase) {
    fun superheroSaveViewModel() = superheroSaveSuperheroUseCase
}