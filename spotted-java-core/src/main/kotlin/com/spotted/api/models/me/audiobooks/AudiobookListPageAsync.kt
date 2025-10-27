// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.audiobooks

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.services.async.me.AudiobookServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AudiobookServiceAsync.list */
class AudiobookListPageAsync
private constructor(
    private val service: AudiobookServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AudiobookListParams,
    private val response: AudiobookListPageResponse,
) : PageAsync<AudiobookListResponse> {

    /**
     * Delegates to [AudiobookListPageResponse], but gracefully handles missing data.
     *
     * @see AudiobookListPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [AudiobookListPageResponse], but gracefully handles missing data.
     *
     * @see AudiobookListPageResponse.items
     */
    override fun items(): List<AudiobookListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AudiobookListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<AudiobookListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AudiobookListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AudiobookListParams = params

    /** The response that this page was parsed from. */
    fun response(): AudiobookListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AudiobookListPageAsync].
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

    /** A builder for [AudiobookListPageAsync]. */
    class Builder internal constructor() {

        private var service: AudiobookServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AudiobookListParams? = null
        private var response: AudiobookListPageResponse? = null

        @JvmSynthetic
        internal fun from(audiobookListPageAsync: AudiobookListPageAsync) = apply {
            service = audiobookListPageAsync.service
            streamHandlerExecutor = audiobookListPageAsync.streamHandlerExecutor
            params = audiobookListPageAsync.params
            response = audiobookListPageAsync.response
        }

        fun service(service: AudiobookServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AudiobookListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AudiobookListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AudiobookListPageAsync].
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
        fun build(): AudiobookListPageAsync =
            AudiobookListPageAsync(
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

        return other is AudiobookListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AudiobookListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
