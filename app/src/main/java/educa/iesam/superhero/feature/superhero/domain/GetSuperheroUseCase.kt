package educa.iesam.superhero.feature.superhero.domain

class GetSuperheroUseCase(private val getSuperheroRepository: SuperheroRepository) {
    operator fun invoke(): List<Superhero>{
        return getSuperheroRepository.obtainsSuperheroes()
    }
}