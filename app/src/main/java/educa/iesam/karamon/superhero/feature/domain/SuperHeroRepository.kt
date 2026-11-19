package educa.iesam.karamon.superhero.feature.domain

interface SuperHeroRepository {
    fun obtainListSuperHero(): List<SuperHero>
    fun updateSuperHeroById(id: String, superHero: SuperHero)
    fun findSuperHeroById(id: String): SuperHero?
    fun deleteSuperHeroById(id: String?)
    fun deleteSuperHeroList(superHero: List<SuperHero>?)
}