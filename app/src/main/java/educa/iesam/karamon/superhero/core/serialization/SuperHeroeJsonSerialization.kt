package educa.iesam.karamon.superhero.core.serialization

interface SuperHeroeJsonSerialization<T> {
    fun toJson(obj: T) : String
    fun fromJson(string: String) : T
}