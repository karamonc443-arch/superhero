package educa.iesam.superhero.feature.superhero.presentation

import educa.iesam.superhero.feature.superhero.domain.uses.GetSuperheroUseCase

class SuperheroListViewModel(private val getSuperheroUseCase: GetSuperheroUseCase) {
    fun superheroListViewModel() = getSuperheroUseCase.invoke()
}