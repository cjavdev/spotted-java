// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.top

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.models.ArtistObject
import com.spotted.api.services.async.me.TopServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TopServiceAsync.listTopArtists */
class TopListTopArtistsPageAsync
private constructor(
    private val service: TopServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TopListTopArtistsParams,
    private val response: TopListTopArtistsPageResponse,
) : PageAsync<ArtistObject> {

    /**
     * Delegates to [TopListTopArtistsPageResponse], but gracefully handles missing data.
     *
     * @see TopListTopArtistsPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [TopListTopArtistsPageResponse], but gracefully handles missing data.
     *
     * @see TopListTopArtistsPageResponse.items
     */
    override fun items(): List<ArtistObject> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TopListTopArtistsParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<TopListTopArtistsPageAsync> =
        service.listTopArtists(nextPageParams())

    fun autoPager(): AutoPagerAsync<ArtistObject> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TopListTopArtistsParams = params

    /** The response that this page was parsed from. */
    fun response(): TopListTopArtistsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopListTopArtistsPageAsync].
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

    /** A builder for [TopListTopArtistsPageAsync]. */
    class Builder internal constructor() {

        private var service: TopServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TopListTopArtistsParams? = null
        private var response: TopListTopArtistsPageResponse? = null

        @JvmSynthetic
        internal fun from(topListTopArtistsPageAsync: TopListTopArtistsPageAsync) = apply {
            service = topListTopArtistsPageAsync.service
            streamHandlerExecutor = topListTopArtistsPageAsync.streamHandlerExecutor
            params = topListTopArtistsPageAsync.params
            response = topListTopArtistsPageAsync.response
        }

        fun service(service: TopServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TopListTopArtistsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TopListTopArtistsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TopListTopArtistsPageAsync].
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
        fun build(): TopListTopArtistsPageAsync =
            TopListTopArtistsPageAsync(
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

        return other is TopListTopArtistsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TopListTopArtistsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
