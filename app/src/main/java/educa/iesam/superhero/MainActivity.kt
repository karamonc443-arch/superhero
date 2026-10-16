package educa.iesam.superhero

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import educa.iesam.superhero.feature.superhero.data.local.*
import educa.iesam.superhero.feature.superhero.domain.uses.GetSuperheroUseCase
import educa.iesam.superhero.feature.superhero.presentation.SuperheroListViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listViewModel = SuperheroListViewModel(GetSuperheroUseCase(SuperheroLocalDataRepository(SuperheroMemLocalData())))
        Log.d(TAG,"onCreate: ${listViewModel.superheroListViewModel()}")
    }
    companion object{
        val TAG = MainActivity::class.java.simpleName
    }
}