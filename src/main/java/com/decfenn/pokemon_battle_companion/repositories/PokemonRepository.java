package com.decfenn.pokemon_battle_companion.repositories;

import com.decfenn.pokemon_battle_companion.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    @Query("FROM #{#entityName} p WHERE p.pokedex_number = ?1")
    public List<Pokemon> getByPokedexNumber(@Param("pokedex_number") Integer pokedexNumber);

    @Query("FROM #{#entityName} p WHERE Lower(p.pokemon_name) LIKE Lower(concat('%', ?1,'%'))")
    public List<Pokemon> getByName(@Param("pokemon_name") String pokemonName);

    @Query("FROM #{#entityName} p WHERE Lower(p.pokemon_type) LIKE Lower(concat('%', ?1,'%')) OR Lower(p.other_type) LIKE Lower(concat('%', ?1,'%'))")
    public List<Pokemon> getByType(@Param("pokemon_type") String pokemonType);
}
