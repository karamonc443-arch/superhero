package educa.iesam.superhero.feature.superhero.data.local

import educa.iesam.superhero.feature.superhero.domain.model.Superhero

class SuperheroMemLocalData {
    val superheroMemLocalData = mutableListOf<Superhero>(
        Superhero("1","Spider-Man","spider-man","https://www.superherodb.com/pictures2/portraits/10/100/133.jpg"),
        Superhero("2","Batman","batman","https://www.superherodb.com/pictures2/portraits/10/100/639.jpg"),
        Superhero("3","Superman","superman","https://www.superherodb.com/pictures2/portraits/10/100/791.jpg"),
        Superhero("4","Iron Man","iron-man","https://www.superherodb.com/pictures2/portraits/10/100/85.jpg"),
        Superhero("5","Wonder Woman","wonder-woman","https://www.superherodb.com/pictures2/portraits/10/100/807.jpg"),
        Superhero("6","Hulk","hulk","https://www.superherodb.com/pictures2/portraits/10/100/83.jpg"),
        Superhero("7","Thor","thor","https://www.superherodb.com/pictures2/portraits/10/100/140.jpg"),
        Superhero("8","Captain America","captain-america","https://www.superherodb.com/pictures2/portraits/10/100/274.jpg"),
        Superhero("9","Black Panther","black-panther","https://www.superherodb.com/pictures2/portraits/10/100/247.jpg"),
        Superhero("10","Deadpool","deadpool","https://www.superherodb.com/pictures2/portraits/10/100/835.jpg")
    )
    fun getAllSuperheroes() = superheroMemLocalData
    fun deleteSuperheroById(id:String) = superheroMemLocalData
    fun updateSuperheroById(id:String, superhero: Superhero) = superheroMemLocalData
    fun saveSuperhero() = superheroMemLocalData
}