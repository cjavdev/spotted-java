// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.top

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.models.TrackObject
import dev.cjav.spotted.services.async.me.TopServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TopServiceAsync.listTopTracks */
class TopListTopTracksPageAsync
private constructor(
    private val service: TopServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TopListTopTracksParams,
    private val response: TopListTopTracksPageResponse,
) : PageAsync<TrackObject> {

    /**
     * Delegates to [TopListTopTracksPageResponse], but gracefully handles missing data.
     *
     * @see TopListTopTracksPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [TopListTopTracksPageResponse], but gracefully handles missing data.
     *
     * @see TopListTopTracksPageResponse.items
     */
    override fun items(): List<TrackObject> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TopListTopTracksParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<TopListTopTracksPageAsync> =
        service.listTopTracks(nextPageParams())

    fun autoPager(): AutoPagerAsync<TrackObject> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TopListTopTracksParams = params

    /** The response that this page was parsed from. */
    fun response(): TopListTopTracksPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopListTopTracksPageAsync].
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

    /** A builder for [TopListTopTracksPageAsync]. */
    class Builder internal constructor() {

        private var service: TopServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TopListTopTracksParams? = null
        private var response: TopListTopTracksPageResponse? = null

        @JvmSynthetic
        internal fun from(topListTopTracksPageAsync: TopListTopTracksPageAsync) = apply {
            service = topListTopTracksPageAsync.service
            streamHandlerExecutor = topListTopTracksPageAsync.streamHandlerExecutor
            params = topListTopTracksPageAsync.params
            response = topListTopTracksPageAsync.response
        }

        fun service(service: TopServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TopListTopTracksParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TopListTopTracksPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TopListTopTracksPageAsync].
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
        fun build(): TopListTopTracksPageAsync =
            TopListTopTracksPageAsync(
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

        return other is TopListTopTracksPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TopListTopTracksPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
