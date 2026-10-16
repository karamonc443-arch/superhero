package educa.iesam.superhero.feature.superhero.domain.uses

import educa.iesam.superhero.feature.superhero.domain.model.Superhero
import educa.iesam.superhero.feature.superhero.domain.interfaces.SuperheroRepository

class GetSuperheroUseCase(private val getSuperheroRepository: SuperheroRepository) {
    operator fun invoke(): List<Superhero>{
        return getSuperheroRepository.obtainsSuperheroes()
    }
}