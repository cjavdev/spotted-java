// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.episodes

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.services.async.me.EpisodeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EpisodeServiceAsync.list */
class EpisodeListPageAsync
private constructor(
    private val service: EpisodeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EpisodeListParams,
    private val response: EpisodeListPageResponse,
) : PageAsync<EpisodeListResponse> {

    /**
     * Delegates to [EpisodeListPageResponse], but gracefully handles missing data.
     *
     * @see EpisodeListPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [EpisodeListPageResponse], but gracefully handles missing data.
     *
     * @see EpisodeListPageResponse.items
     */
    override fun items(): List<EpisodeListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EpisodeListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<EpisodeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EpisodeListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EpisodeListParams = params

    /** The response that this page was parsed from. */
    fun response(): EpisodeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EpisodeListPageAsync].
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

    /** A builder for [EpisodeListPageAsync]. */
    class Builder internal constructor() {

        private var service: EpisodeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EpisodeListParams? = null
        private var response: EpisodeListPageResponse? = null

        @JvmSynthetic
        internal fun from(episodeListPageAsync: EpisodeListPageAsync) = apply {
            service = episodeListPageAsync.service
            streamHandlerExecutor = episodeListPageAsync.streamHandlerExecutor
            params = episodeListPageAsync.params
            response = episodeListPageAsync.response
        }

        fun service(service: EpisodeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EpisodeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EpisodeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EpisodeListPageAsync].
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
        fun build(): EpisodeListPageAsync =
            EpisodeListPageAsync(
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

        return other is EpisodeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EpisodeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
