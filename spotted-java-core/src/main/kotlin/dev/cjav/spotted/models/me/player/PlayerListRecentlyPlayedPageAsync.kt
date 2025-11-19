// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.services.async.me.PlayerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlayerServiceAsync.listRecentlyPlayed */
class PlayerListRecentlyPlayedPageAsync
private constructor(
    private val service: PlayerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlayerListRecentlyPlayedParams,
    private val response: PlayerListRecentlyPlayedPageResponse,
) : PageAsync<PlayerListRecentlyPlayedResponse> {

    /**
     * Delegates to [PlayerListRecentlyPlayedPageResponse], but gracefully handles missing data.
     *
     * @see PlayerListRecentlyPlayedPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [PlayerListRecentlyPlayedPageResponse], but gracefully handles missing data.
     *
     * @see PlayerListRecentlyPlayedPageResponse.items
     */
    override fun items(): List<PlayerListRecentlyPlayedResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PlayerListRecentlyPlayedParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<PlayerListRecentlyPlayedPageAsync> =
        service.listRecentlyPlayed(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlayerListRecentlyPlayedResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlayerListRecentlyPlayedParams = params

    /** The response that this page was parsed from. */
    fun response(): PlayerListRecentlyPlayedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PlayerListRecentlyPlayedPageAsync].
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

    /** A builder for [PlayerListRecentlyPlayedPageAsync]. */
    class Builder internal constructor() {

        private var service: PlayerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlayerListRecentlyPlayedParams? = null
        private var response: PlayerListRecentlyPlayedPageResponse? = null

        @JvmSynthetic
        internal fun from(playerListRecentlyPlayedPageAsync: PlayerListRecentlyPlayedPageAsync) =
            apply {
                service = playerListRecentlyPlayedPageAsync.service
                streamHandlerExecutor = playerListRecentlyPlayedPageAsync.streamHandlerExecutor
                params = playerListRecentlyPlayedPageAsync.params
                response = playerListRecentlyPlayedPageAsync.response
            }

        fun service(service: PlayerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlayerListRecentlyPlayedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlayerListRecentlyPlayedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PlayerListRecentlyPlayedPageAsync].
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
        fun build(): PlayerListRecentlyPlayedPageAsync =
            PlayerListRecentlyPlayedPageAsync(
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

        return other is PlayerListRecentlyPlayedPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlayerListRecentlyPlayedPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
