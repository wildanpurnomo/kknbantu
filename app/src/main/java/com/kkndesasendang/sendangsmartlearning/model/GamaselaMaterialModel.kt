package com.kkndesasendang.sendangsmartlearning.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GamaselaMaterialModel(
        val materialName: String? = "",
        val materialText: String? = "",
        val materialDrawable: Int? = 0
) : Parcelable