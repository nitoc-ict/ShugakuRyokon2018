package com.ict.ryokon.shugakuryokon2018.utils

abstract class Identifier<T>(val value: T) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Identifier<*>) return false
        return value == other.value
    }

    override fun hashCode(): Int {
        return value?.hashCode() ?: 0
    }
}
