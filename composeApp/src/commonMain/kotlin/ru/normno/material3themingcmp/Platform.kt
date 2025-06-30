package ru.normno.material3themingcmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform