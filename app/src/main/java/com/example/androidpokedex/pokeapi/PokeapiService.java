package com.example.androidpokedex.pokeapi;

import com.example.androidpokedex.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();
}
