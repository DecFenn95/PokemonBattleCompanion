# Pokemon Battle Companion

Pokedex clone with improved battle insights.

## Table of Contents

+ [API](#api)
+ [Potential Future Features](#potential-future-features)
+ [Local Setup](#local-setup)
+ [Connect to Database](#connect-to-database)


## Api

Note: _Content will be returned in a JSON format_

### Operations

> /api

+ Will return a list of all pokemon


> /api/pokemon_id

+ Will return the pokemon with the matching id


> /api/pokedex/{pokemon_number}

+ Will return the pokemon with the matching pokedex number


> /api/pokemon/{pokemon_name}

+ Will return a list of pokemon with the matching pokemon name


> /api/pokemon/type/{pokemon_type}

+ Will return a list of pokemon with the matching pokemon type


### Example Pokemon Payload

```json
  {
    "pokemon_id": 18,
    "pokedex_number": 14,
    "pokemon_name": "Kakuna",
    "pokemon_type": "Bug",
    "other_type": "Poison",
    "total_power": 205,
    "hit_points": 45,
    "attack_strength": 25,
    "defence_strength": 50,
    "special_attack_strength": 25,
    "special_defence_strength": 25,
    "speed": 35,
    "generation_number": 1,
    "is_legendary": false,
    "pokemon_photo_url": "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/014.png"
  }
```

---

## Local Setup


### Create docker container with postgres DB:

```
> docker create --name pokemon-battle-tester -e POSTGRES_PASSWORD=passwordXX -p 5432:5432 postgres:12.2-alpine 
```

### Start/Stop container:
```
> docker start/stop pokemon-battle-tester
```

### DB Connection Info:

```
JDBC URL: 'jdbc:postgresql://localhost:5432/postgres'

Username: 'postgres'

Password: 'passwordXX'
```

---

## Potential Future Features

- Pokemon Type Strength & Weakness Chart
- Best Starter for Battle
- Random Battle Winner Estimator
- Increase Pokemon Collection in Database

---

## Connect to Database


+ Use the universal DB tool DBeaver - https://dbeaver.io/

+ Once downloaded, open DBeaver and setup a Postgres DB connection using the DB connection info above.

NOTE: *Make sure the Docker container is running*

+ Once connected create a new database called: **_pokemon_battle_companion_**

+ Switch to the new database and run the **_pokemon.sql_** script to populate the database.

---
Created by DF (2020).