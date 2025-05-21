package com.manyan.belajargrammar.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.manyan.belajargrammar.data.local.entity.FavoriteGrammar
import com.manyan.belajargrammar.data.local.entity.FavoriteTenses
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteDao {

    // Favorite Grammar
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavoriteGrammar(item: FavoriteGrammar)

    @Query("DELETE FROM favorite_grammar WHERE id = :id")
    suspend fun deleteFavoriteGrammarById(id: String)

    @Query("SELECT EXISTS(SELECT 1 FROM favorite_grammar WHERE id = :id)")
    suspend fun isGrammarFavorite(id: String): Boolean

    @Query("SELECT * FROM favorite_grammar")
    fun getFavoriteGrammarList(): Flow<List<FavoriteGrammar>>

    // Favorite Tenses
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavoriteTense(item: FavoriteTenses)

    @Query("DELETE FROM favorite_tenses WHERE id = :id")
    suspend fun deleteFavoriteTenseById(id: String)

    @Query("SELECT EXISTS(SELECT 1 FROM favorite_tenses WHERE id = :id)")
    suspend fun isTenseFavorite(id: String): Boolean

    @Query("SELECT * FROM favorite_tenses")
    fun getFavoriteTenseList(): Flow<List<FavoriteTenses>>
}
