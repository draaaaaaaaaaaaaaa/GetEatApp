package com.daffa.geteat

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Food(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
) : Parcelable
