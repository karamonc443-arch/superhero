package educa.iesam.karamon.superhero.time

interface SuperHeroAppTime {

    fun currentTime(): Long

    class SuperHeroAppLocalTime(): SuperHeroAppTime{
        override fun currentTime(): Long {
            return System.currentTimeMillis()
        }
    }
}