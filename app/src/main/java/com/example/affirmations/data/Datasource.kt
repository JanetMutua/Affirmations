package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

// separate class for fetching the data source from the string resources

class Datasource {
    fun loadAffirmations():List<Affirmation>{
//        obtain the data from the string resources
//        list of Affirmations instances that fetches the string resources ID
//        return a list of Affirmations
        return listOf<Affirmation>(
            Affirmation(R.string.affirmations_1),
            Affirmation(R.string.affirmations_2),
            Affirmation(R.string.affirmations_3),
            Affirmation(R.string.affirmations_4),
            Affirmation(R.string.affirmations_5),
            Affirmation(R.string.affirmations_6),
            Affirmation(R.string.affirmations_7),
            Affirmation(R.string.affirmations_8),
            Affirmation(R.string.affirmations_9),
            Affirmation(R.string.affirmations_10)
        )
    }
}