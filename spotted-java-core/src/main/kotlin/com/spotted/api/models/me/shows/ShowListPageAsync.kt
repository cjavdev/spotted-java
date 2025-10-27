// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.shows

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.services.async.me.ShowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ShowServiceAsync.list */
class ShowListPageAsync
private constructor(
    private val service: ShowServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ShowListParams,
    private val response: ShowListPageResponse,
) : PageAsync<ShowListResponse> {

    /**
     * Delegates to [ShowListPageResponse], but gracefully handles missing data.
     *
     * @see ShowListPageResponse.next
     */
    fun next(): Optional<String> = response._next().getOptional("next")

    /**
     * Delegates to [ShowListPageResponse], but gracefully handles missing data.
     *
     * @see ShowListPageResponse.items
     */
    override fun items(): List<ShowListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ShowListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<ShowListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ShowListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ShowListParams = params

    /** The response that this page was parsed from. */
    fun response(): ShowListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShowListPageAsync].
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

    /** A builder for [ShowListPageAsync]. */
    class Builder internal constructor() {

        private var service: ShowServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ShowListParams? = null
        private var response: ShowListPageResponse? = null

        @JvmSynthetic
        internal fun from(showListPageAsync: ShowListPageAsync) = apply {
            service = showListPageAsync.service
            streamHandlerExecutor = showListPageAsync.streamHandlerExecutor
            params = showListPageAsync.params
            response = showListPageAsync.response
        }

        fun service(service: ShowServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ShowListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShowListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShowListPageAsync].
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
        fun build(): ShowListPageAsync =
            ShowListPageAsync(
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

        return other is ShowListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ShowListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
