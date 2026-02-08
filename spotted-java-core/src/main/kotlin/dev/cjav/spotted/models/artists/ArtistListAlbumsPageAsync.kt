// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.artists

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.services.async.ArtistServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ArtistServiceAsync.listAlbums */
@Deprecated("deprecated")
class ArtistListAlbumsPageAsync
private constructor(
    private val service: ArtistServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ArtistListAlbumsParams,
    private val response: ArtistListAlbumsPageResponse,
) : PageAsync<ArtistListAlbumsResponse> {

    /**
     * Delegates to [ArtistListAlbumsPageResponse], but gracefully handles missing data.
     *
     * @see ArtistListAlbumsPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [ArtistListAlbumsPageResponse], but gracefully handles missing data.
     *
     * @see ArtistListAlbumsPageResponse.items
     */
    override fun items(): List<ArtistListAlbumsResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ArtistListAlbumsParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<ArtistListAlbumsPageAsync> =
        service.listAlbums(nextPageParams())

    fun autoPager(): AutoPagerAsync<ArtistListAlbumsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ArtistListAlbumsParams = params

    /** The response that this page was parsed from. */
    fun response(): ArtistListAlbumsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ArtistListAlbumsPageAsync].
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

    /** A builder for [ArtistListAlbumsPageAsync]. */
    class Builder internal constructor() {

        private var service: ArtistServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ArtistListAlbumsParams? = null
        private var response: ArtistListAlbumsPageResponse? = null

        @JvmSynthetic
        internal fun from(artistListAlbumsPageAsync: ArtistListAlbumsPageAsync) = apply {
            service = artistListAlbumsPageAsync.service
            streamHandlerExecutor = artistListAlbumsPageAsync.streamHandlerExecutor
            params = artistListAlbumsPageAsync.params
            response = artistListAlbumsPageAsync.response
        }

        fun service(service: ArtistServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ArtistListAlbumsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ArtistListAlbumsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ArtistListAlbumsPageAsync].
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
        fun build(): ArtistListAlbumsPageAsync =
            ArtistListAlbumsPageAsync(
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

        return other is ArtistListAlbumsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ArtistListAlbumsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
