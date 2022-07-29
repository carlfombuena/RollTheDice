package com.example.rollthedice

import android.os.Parcel
import android.os.Parcelable

class dice() : Parcelable {
    val diceRange=1..6;
    val randomizer=diceRange.random();

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<dice> {
        override fun createFromParcel(parcel: Parcel): dice {
            return dice(parcel)
        }

        override fun newArray(size: Int): Array<dice?> {
            return arrayOfNulls(size)
        }
    }
}