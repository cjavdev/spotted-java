// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.tracks

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.models.PlaylistTrackObject
import dev.cjav.spotted.services.async.playlists.TrackServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TrackServiceAsync.list */
@Deprecated("deprecated")
class TrackListPageAsync
private constructor(
    private val service: TrackServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TrackListParams,
    private val response: TrackListPageResponse,
) : PageAsync<PlaylistTrackObject> {

    /**
     * Delegates to [TrackListPageResponse], but gracefully handles missing data.
     *
     * @see TrackListPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [TrackListPageResponse], but gracefully handles missing data.
     *
     * @see TrackListPageResponse.items
     */
    override fun items(): List<PlaylistTrackObject> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TrackListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<TrackListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlaylistTrackObject> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TrackListParams = params

    /** The response that this page was parsed from. */
    fun response(): TrackListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackListPageAsync].
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

    /** A builder for [TrackListPageAsync]. */
    class Builder internal constructor() {

        private var service: TrackServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TrackListParams? = null
        private var response: TrackListPageResponse? = null

        @JvmSynthetic
        internal fun from(trackListPageAsync: TrackListPageAsync) = apply {
            service = trackListPageAsync.service
            streamHandlerExecutor = trackListPageAsync.streamHandlerExecutor
            params = trackListPageAsync.params
            response = trackListPageAsync.response
        }

        fun service(service: TrackServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TrackListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TrackListPageAsync].
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
        fun build(): TrackListPageAsync =
            TrackListPageAsync(
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

        return other is TrackListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TrackListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
