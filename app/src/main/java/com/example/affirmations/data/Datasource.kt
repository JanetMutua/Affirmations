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
            Affirmation(R.string.affirmations_1, R.drawable.image1),
            Affirmation(R.string.affirmations_2, R.drawable.image2),
            Affirmation(R.string.affirmations_3, R.drawable.image3),
            Affirmation(R.string.affirmations_4,R.drawable.image4),
            Affirmation(R.string.affirmations_5, R.drawable.image5),
            Affirmation(R.string.affirmations_6, R.drawable.image6),
            Affirmation(R.string.affirmations_7, R.drawable.image7),
            Affirmation(R.string.affirmations_8, R.drawable.image8),
            Affirmation(R.string.affirmations_9, R.drawable.image9),
            Affirmation(R.string.affirmations_10, R.drawable.image10)
        )
    }
}