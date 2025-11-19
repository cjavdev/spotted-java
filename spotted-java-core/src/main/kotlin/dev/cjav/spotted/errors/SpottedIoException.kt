package dev.cjav.spotted.errors

class SpottedIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : SpottedException(message, cause)
