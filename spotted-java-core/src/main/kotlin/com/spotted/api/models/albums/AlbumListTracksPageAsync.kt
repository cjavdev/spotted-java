// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.albums

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.models.SimplifiedTrackObject
import com.spotted.api.services.async.AlbumServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AlbumServiceAsync.listTracks */
class AlbumListTracksPageAsync
private constructor(
    private val service: AlbumServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AlbumListTracksParams,
    private val response: AlbumListTracksPageResponse,
) : PageAsync<SimplifiedTrackObject> {

    /**
     * Delegates to [AlbumListTracksPageResponse], but gracefully handles missing data.
     *
     * @see AlbumListTracksPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [AlbumListTracksPageResponse], but gracefully handles missing data.
     *
     * @see AlbumListTracksPageResponse.items
     */
    override fun items(): List<SimplifiedTrackObject> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AlbumListTracksParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<AlbumListTracksPageAsync> =
        service.listTracks(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplifiedTrackObject> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AlbumListTracksParams = params

    /** The response that this page was parsed from. */
    fun response(): AlbumListTracksPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlbumListTracksPageAsync].
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

    /** A builder for [AlbumListTracksPageAsync]. */
    class Builder internal constructor() {

        private var service: AlbumServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AlbumListTracksParams? = null
        private var response: AlbumListTracksPageResponse? = null

        @JvmSynthetic
        internal fun from(albumListTracksPageAsync: AlbumListTracksPageAsync) = apply {
            service = albumListTracksPageAsync.service
            streamHandlerExecutor = albumListTracksPageAsync.streamHandlerExecutor
            params = albumListTracksPageAsync.params
            response = albumListTracksPageAsync.response
        }

        fun service(service: AlbumServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AlbumListTracksParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlbumListTracksPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlbumListTracksPageAsync].
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
        fun build(): AlbumListTracksPageAsync =
            AlbumListTracksPageAsync(
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

        return other is AlbumListTracksPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AlbumListTracksPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
