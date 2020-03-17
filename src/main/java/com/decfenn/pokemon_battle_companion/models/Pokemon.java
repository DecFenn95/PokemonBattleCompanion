package com.decfenn.pokemon_battle_companion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity(name="pokemons")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pokemon_id;
    private Integer pokedex_number;
    private String pokemon_name;
    private String pokemon_type;
    private String other_type;
    private Integer total_power;
    private Integer hit_points;
    private Integer attack_strength;
    private Integer defence_strength;
    private Integer special_attack_strength;
    private Integer special_defence_strength;
    private Integer speed;
    private Integer generation_number;
    private boolean is_legendary;
    private String pokemon_photo_url;

    public Pokemon() {
    }

    public String getPokemon_photo_url() {
        return pokemon_photo_url;
    }

    public void setPokemon_photo_url(String pokemon_photo_url) {
        this.pokemon_photo_url = pokemon_photo_url;
    }

    public Long getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(Long pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public Integer getPokedex_number() {
        return pokedex_number;
    }

    public void setPokedex_number(Integer pokedex_number) {
        this.pokedex_number = pokedex_number;
    }

    public String getPokemon_name() {
        return pokemon_name;
    }

    public void setPokemon_name(String pokemon_name) {
        this.pokemon_name = pokemon_name;
    }

    public String getPokemon_type() {
        return pokemon_type;
    }

    public void setPokemon_type(String pokemon_type) {
        this.pokemon_type = pokemon_type;
    }

    public String getOther_type() {
        return other_type;
    }

    public void setOther_type(String other_type) {
        this.other_type = other_type;
    }

    public Integer getTotal_power() {
        return total_power;
    }

    public void setTotal_power(Integer total_power) {
        this.total_power = total_power;
    }

    public Integer getHit_points() {
        return hit_points;
    }

    public void setHit_points(Integer hit_points) {
        this.hit_points = hit_points;
    }

    public Integer getAttack_strength() {
        return attack_strength;
    }

    public void setAttack_strength(Integer attack_strength) {
        this.attack_strength = attack_strength;
    }

    public Integer getDefence_strength() {
        return defence_strength;
    }

    public void setDefence_strength(Integer defence_strength) {
        this.defence_strength = defence_strength;
    }

    public Integer getSpecial_attack_strength() {
        return special_attack_strength;
    }

    public void setSpecial_attack_strength(Integer special_attack_strength) {
        this.special_attack_strength = special_attack_strength;
    }

    public Integer getSpecial_defence_strength() {
        return special_defence_strength;
    }

    public void setSpecial_defence_strength(Integer special_defence_strength) {
        this.special_defence_strength = special_defence_strength;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getGeneration_number() {
        return generation_number;
    }

    public void setGeneration_number(Integer generation_number) {
        this.generation_number = generation_number;
    }

    public boolean isIs_legendary() {
        return is_legendary;
    }

    public void setIs_legendary(boolean is_legendary) {
        this.is_legendary = is_legendary;
    }
}
