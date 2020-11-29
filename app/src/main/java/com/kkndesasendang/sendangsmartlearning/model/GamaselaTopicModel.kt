package com.kkndesasendang.sendangsmartlearning.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GamaselaTopicModel(
        val topicName: String? = "",
        val materialContents: ArrayList<GamaselaMaterialModel>? = arrayListOf()
): Parcelable