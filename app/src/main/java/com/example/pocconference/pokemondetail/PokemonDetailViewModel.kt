package com.example.pocconference.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.pocconference.repository.PokemonRepository
import com.example.pocconference.util.Resource
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Pokemon
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository : PokemonRepository
): ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}