package com.apps.pokemon.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.apps.pokemon.model.Pokemon;

@Database(entities = Pokemon.class, version = 1, exportSchema = false)
public abstract class PokemonDB extends RoomDatabase {
    public abstract PokemonDao pokemonDao();
}
