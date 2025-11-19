package dev.cjav.spotted.errors

open class SpottedException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
