package com.decfenn.pokemon_battle_companion.controllers;

import com.decfenn.pokemon_battle_companion.models.Pokemon;
import com.decfenn.pokemon_battle_companion.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping
    public List<Pokemon> list() {
        return pokemonRepository.findAll();
    }

    @GetMapping
    @RequestMapping("/{pokemon_id}")
    public Pokemon get(@PathVariable("pokemon_id") long pokemonId) {
        return pokemonRepository.getOne(pokemonId);
    }

    @GetMapping
    @RequestMapping("/pokedex/{pokedex_number}")
    public Pokemon getByPokedexNumber(@PathVariable("pokedex_number") String pokedexNumber){
        return pokemonRepository.getByPokedexNumber(pokedexNumber);
    }

    @GetMapping
    @RequestMapping("/pokemon/{pokemon_name}")
    public List<Pokemon> getByPokemonName(@PathVariable("pokemon_name") String pokemonName){
        return pokemonRepository.getByName(pokemonName);
    }

    @GetMapping
    @RequestMapping("/pokemon/type/{pokemon_type}")
    public List<Pokemon> getByPokemonType(@PathVariable("pokemon_type") String pokemonType){
        return pokemonRepository.getByType(pokemonType);
    }
}
