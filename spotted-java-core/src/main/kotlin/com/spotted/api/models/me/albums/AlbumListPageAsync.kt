// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.albums

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.services.async.me.AlbumServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AlbumServiceAsync.list */
class AlbumListPageAsync
private constructor(
    private val service: AlbumServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AlbumListParams,
    private val response: AlbumListPageResponse,
) : PageAsync<AlbumListResponse> {

    /**
     * Delegates to [AlbumListPageResponse], but gracefully handles missing data.
     *
     * @see AlbumListPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [AlbumListPageResponse], but gracefully handles missing data.
     *
     * @see AlbumListPageResponse.items
     */
    override fun items(): List<AlbumListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AlbumListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<AlbumListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AlbumListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AlbumListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlbumListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlbumListPageAsync].
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

    /** A builder for [AlbumListPageAsync]. */
    class Builder internal constructor() {

        private var service: AlbumServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AlbumListParams? = null
        private var response: AlbumListPageResponse? = null

        @JvmSynthetic
        internal fun from(albumListPageAsync: AlbumListPageAsync) = apply {
            service = albumListPageAsync.service
            streamHandlerExecutor = albumListPageAsync.streamHandlerExecutor
            params = albumListPageAsync.params
            response = albumListPageAsync.response
        }

        fun service(service: AlbumServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AlbumListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlbumListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlbumListPageAsync].
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
        fun build(): AlbumListPageAsync =
            AlbumListPageAsync(
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

        return other is AlbumListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AlbumListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
