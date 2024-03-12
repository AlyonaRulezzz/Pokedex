package com.example.p.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.p.data.remote.responses.Pokemon
import com.example.p.repository.PokemonRepository
import com.example.p.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}