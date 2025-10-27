// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.shows

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.models.SimplifiedEpisodeObject
import com.spotted.api.services.async.ShowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ShowServiceAsync.listEpisodes */
class ShowListEpisodesPageAsync
private constructor(
    private val service: ShowServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ShowListEpisodesParams,
    private val response: ShowListEpisodesPageResponse,
) : PageAsync<SimplifiedEpisodeObject> {

    /**
     * Delegates to [ShowListEpisodesPageResponse], but gracefully handles missing data.
     *
     * @see ShowListEpisodesPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [ShowListEpisodesPageResponse], but gracefully handles missing data.
     *
     * @see ShowListEpisodesPageResponse.items
     */
    override fun items(): List<SimplifiedEpisodeObject> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ShowListEpisodesParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<ShowListEpisodesPageAsync> =
        service.listEpisodes(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplifiedEpisodeObject> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ShowListEpisodesParams = params

    /** The response that this page was parsed from. */
    fun response(): ShowListEpisodesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShowListEpisodesPageAsync].
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

    /** A builder for [ShowListEpisodesPageAsync]. */
    class Builder internal constructor() {

        private var service: ShowServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ShowListEpisodesParams? = null
        private var response: ShowListEpisodesPageResponse? = null

        @JvmSynthetic
        internal fun from(showListEpisodesPageAsync: ShowListEpisodesPageAsync) = apply {
            service = showListEpisodesPageAsync.service
            streamHandlerExecutor = showListEpisodesPageAsync.streamHandlerExecutor
            params = showListEpisodesPageAsync.params
            response = showListEpisodesPageAsync.response
        }

        fun service(service: ShowServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ShowListEpisodesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShowListEpisodesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShowListEpisodesPageAsync].
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
        fun build(): ShowListEpisodesPageAsync =
            ShowListEpisodesPageAsync(
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

        return other is ShowListEpisodesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ShowListEpisodesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
