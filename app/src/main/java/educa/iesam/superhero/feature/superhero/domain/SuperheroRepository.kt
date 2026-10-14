package educa.iesam.superhero.feature.superhero.domain

interface SuperheroRepository {
    //Obtener la lista de los superheroes
    fun obtainsSuperheroes(): List<Superhero>
    //Eliminar un superhero con su id
    fun deleteSuperheroe(superhero: Superhero)
    //Actualizar superhero también con su id
    fun updateSuperheroe(superhero: Superhero)
    //Guardar superhero
    fun saveSuperheroe(superhero: Superhero)
}