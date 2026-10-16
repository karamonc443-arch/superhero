package educa.iesam.superhero.feature.superhero.presentation

import educa.iesam.superhero.feature.superhero.domain.uses.UpdateSuperheroUseCase

class SuperheroUpdateViewModel(private val superheroUpdateSuperheroUseCase: UpdateSuperheroUseCase) {
    fun superheroUdapteViewModel() = superheroUpdateSuperheroUseCase
}