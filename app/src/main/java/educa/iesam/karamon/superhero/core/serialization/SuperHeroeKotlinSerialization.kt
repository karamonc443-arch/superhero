package educa.iesam.karamon.superhero.core.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json

class SuperHeroeKotlinSerialization<T>(private val serialization: KSerializer<T>,
    private val json: Json = Json{ignoreUnknownKeys = true}
): SuperHeroeJsonSerialization<T> {
    override fun toJson(obj: T): String = json.encodeToString(serialization,obj)

    override fun fromJson(string: String): T = json.decodeFromString(serialization,string)
}