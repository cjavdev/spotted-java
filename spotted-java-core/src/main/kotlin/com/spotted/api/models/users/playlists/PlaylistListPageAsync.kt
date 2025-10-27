// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.users.playlists

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.models.PagingPlaylistObject
import com.spotted.api.models.SimplifiedPlaylistObject
import com.spotted.api.services.async.users.PlaylistServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlaylistServiceAsync.list */
class PlaylistListPageAsync
private constructor(
    private val service: PlaylistServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlaylistListParams,
    private val response: PagingPlaylistObject,
) : PageAsync<SimplifiedPlaylistObject> {

    /**
     * Delegates to [PagingPlaylistObject], but gracefully handles missing data.
     *
     * @see PagingPlaylistObject.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [PagingPlaylistObject], but gracefully handles missing data.
     *
     * @see PagingPlaylistObject.items
     */
    override fun items(): List<SimplifiedPlaylistObject> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PlaylistListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<PlaylistListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplifiedPlaylistObject> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlaylistListParams = params

    /** The response that this page was parsed from. */
    fun response(): PagingPlaylistObject = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlaylistListPageAsync].
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

    /** A builder for [PlaylistListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlaylistServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlaylistListParams? = null
        private var response: PagingPlaylistObject? = null

        @JvmSynthetic
        internal fun from(playlistListPageAsync: PlaylistListPageAsync) = apply {
            service = playlistListPageAsync.service
            streamHandlerExecutor = playlistListPageAsync.streamHandlerExecutor
            params = playlistListPageAsync.params
            response = playlistListPageAsync.response
        }

        fun service(service: PlaylistServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlaylistListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PagingPlaylistObject) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlaylistListPageAsync].
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
        fun build(): PlaylistListPageAsync =
            PlaylistListPageAsync(
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

        return other is PlaylistListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlaylistListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
