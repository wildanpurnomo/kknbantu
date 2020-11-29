package com.kkndesasendang.sendangsmartlearning.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kkndesasendang.sendangsmartlearning.model.GamaselaMaterialModel
import com.kkndesasendang.sendangsmartlearning.model.GamaselaTopicModel

class SelectTopicViewModel: ViewModel() {
    private val topics: MutableLiveData<ArrayList<GamaselaTopicModel>> by lazy {
        MutableLiveData<ArrayList<GamaselaTopicModel>>()
    }

    fun setTopics() {
        val topicModels = arrayListOf<GamaselaTopicModel>()

        // Grammar
        topicModels.add(GamaselaTopicModel("Grammar", arrayListOf(
                GamaselaMaterialModel("Cara menggunakan as and like", "Begini cara menggunakan as dan like"),
                GamaselaMaterialModel("Cara penggunaan kata enough", "Begini cara penggunaan kata enough")
        )))

        // Reading
        topicModels.add(GamaselaTopicModel("Reading", arrayListOf(
                GamaselaMaterialModel("A Conference Programme", "Ini A Conference Programme"),
                GamaselaMaterialModel("Social Media Influencer", "Ini Social Media Influencer")
        )))

        // Writing
        topicModels.add(GamaselaTopicModel("Writing", arrayListOf(
                GamaselaMaterialModel("A Class Forum", "Ini A Class Forum"),
                GamaselaMaterialModel("A Professional Profile", "Ini A Professional Profile")
        )))

        // Vocab
        topicModels.add(GamaselaTopicModel("Vocab", arrayListOf(
                GamaselaMaterialModel("Bathrooms", "Ini bathrooms"),
                GamaselaMaterialModel("Body parts 1 & 2", "Ini body parts 1 & 2")
        )))

        topics.value = topicModels
    }

    fun getTopics(): LiveData<ArrayList<GamaselaTopicModel>> {
        return topics
    }
}