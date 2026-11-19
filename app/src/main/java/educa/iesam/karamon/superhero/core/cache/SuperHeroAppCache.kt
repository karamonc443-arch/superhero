package educa.iesam.karamon.superhero.core.cache

import android.content.Context
import android.content.SharedPreferences
import educa.iesam.karamon.superhero.R
import educa.iesam.karamon.superhero.time.SuperHeroAppTime

interface SuperHeroAppCache {
    fun updateTime(keyUpdateTime: String)
    fun isExpired(keyIsExpired: String, timeToLive: Long): Boolean


    class SuperHeroXMLocalDataSource(
        private val context: Context,
        private val updateTime: SuperHeroAppTime
    ) : SuperHeroAppCache {
        val sharedPref: SharedPreferences = context.getSharedPreferences(
            context.getString(R.string.app_cache), Context.MODE_PRIVATE
        )

        override fun updateTime(keyUpdateTime: String) {
            sharedPref.edit().apply {
                putLong(keyUpdateTime, updateTime.currentTime())
                apply()
            }
        }

        override fun isExpired(keyIsExpired: String, timeToLive: Long): Boolean {
            val timeSaved = sharedPref.getLong(keyIsExpired, -1)
            return (updateTime.currentTime() - timeSaved) >= timeToLive
        }

    }
}