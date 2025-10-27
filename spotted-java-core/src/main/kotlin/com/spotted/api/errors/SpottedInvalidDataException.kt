package com.spotted.api.errors

class SpottedInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : SpottedException(message, cause)
