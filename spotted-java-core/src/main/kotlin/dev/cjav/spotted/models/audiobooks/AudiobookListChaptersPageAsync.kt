// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audiobooks

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.services.async.AudiobookServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AudiobookServiceAsync.listChapters */
class AudiobookListChaptersPageAsync
private constructor(
    private val service: AudiobookServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AudiobookListChaptersParams,
    private val response: AudiobookListChaptersPageResponse,
) : PageAsync<SimplifiedChapterObject> {

    /**
     * Delegates to [AudiobookListChaptersPageResponse], but gracefully handles missing data.
     *
     * @see AudiobookListChaptersPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [AudiobookListChaptersPageResponse], but gracefully handles missing data.
     *
     * @see AudiobookListChaptersPageResponse.items
     */
    override fun items(): List<SimplifiedChapterObject> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AudiobookListChaptersParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<AudiobookListChaptersPageAsync> =
        service.listChapters(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplifiedChapterObject> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AudiobookListChaptersParams = params

    /** The response that this page was parsed from. */
    fun response(): AudiobookListChaptersPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AudiobookListChaptersPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AudiobookListChaptersPageAsync]. */
    class Builder internal constructor() {

        private var service: AudiobookServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AudiobookListChaptersParams? = null
        private var response: AudiobookListChaptersPageResponse? = null

        @JvmSynthetic
        internal fun from(audiobookListChaptersPageAsync: AudiobookListChaptersPageAsync) = apply {
            service = audiobookListChaptersPageAsync.service
            streamHandlerExecutor = audiobookListChaptersPageAsync.streamHandlerExecutor
            params = audiobookListChaptersPageAsync.params
            response = audiobookListChaptersPageAsync.response
        }

        fun service(service: AudiobookServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AudiobookListChaptersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AudiobookListChaptersPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AudiobookListChaptersPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AudiobookListChaptersPageAsync =
            AudiobookListChaptersPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudiobookListChaptersPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AudiobookListChaptersPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
