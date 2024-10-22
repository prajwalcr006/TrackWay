package com.example.trackway.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverters
import java.io.ByteArrayOutputStream

class Converters {

    @TypeConverters
    fun toBitmap(byteArray: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(byteArray,0,byteArray.size)
    }

    @TypeConverters
    fun fromBitmap(bmp: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }
}