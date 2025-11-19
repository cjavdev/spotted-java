// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.recommendations.RecommendationGetParams
import dev.cjav.spotted.models.recommendations.RecommendationGetResponse
import dev.cjav.spotted.models.recommendations.RecommendationListAvailableGenreSeedsParams
import dev.cjav.spotted.models.recommendations.RecommendationListAvailableGenreSeedsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RecommendationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecommendationServiceAsync

    /**
     * Recommendations are generated based on the available information for a given seed entity and
     * matched against similar artists and tracks. If there is sufficient information about the
     * provided seeds, a list of tracks will be returned together with pool size details.
     *
     * For artists and tracks that are very new or obscure there might not be enough data to
     * generate a list of tracks.
     */
    @Deprecated("deprecated")
    fun get(): CompletableFuture<RecommendationGetResponse> = get(RecommendationGetParams.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        params: RecommendationGetParams = RecommendationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecommendationGetResponse>

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        params: RecommendationGetParams = RecommendationGetParams.none()
    ): CompletableFuture<RecommendationGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(requestOptions: RequestOptions): CompletableFuture<RecommendationGetResponse> =
        get(RecommendationGetParams.none(), requestOptions)

    /**
     * Retrieve a list of available genres seed parameter values for
     * [recommendations](/documentation/web-api/reference/get-recommendations).
     */
    @Deprecated("deprecated")
    fun listAvailableGenreSeeds():
        CompletableFuture<RecommendationListAvailableGenreSeedsResponse> =
        listAvailableGenreSeeds(RecommendationListAvailableGenreSeedsParams.none())

    /** @see listAvailableGenreSeeds */
    @Deprecated("deprecated")
    fun listAvailableGenreSeeds(
        params: RecommendationListAvailableGenreSeedsParams =
            RecommendationListAvailableGenreSeedsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecommendationListAvailableGenreSeedsResponse>

    /** @see listAvailableGenreSeeds */
    @Deprecated("deprecated")
    fun listAvailableGenreSeeds(
        params: RecommendationListAvailableGenreSeedsParams =
            RecommendationListAvailableGenreSeedsParams.none()
    ): CompletableFuture<RecommendationListAvailableGenreSeedsResponse> =
        listAvailableGenreSeeds(params, RequestOptions.none())

    /** @see listAvailableGenreSeeds */
    @Deprecated("deprecated")
    fun listAvailableGenreSeeds(
        requestOptions: RequestOptions
    ): CompletableFuture<RecommendationListAvailableGenreSeedsResponse> =
        listAvailableGenreSeeds(RecommendationListAvailableGenreSeedsParams.none(), requestOptions)

    /**
     * A view of [RecommendationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecommendationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /recommendations`, but is otherwise the same as
         * [RecommendationServiceAsync.get].
         */
        @Deprecated("deprecated")
        fun get(): CompletableFuture<HttpResponseFor<RecommendationGetResponse>> =
            get(RecommendationGetParams.none())

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            params: RecommendationGetParams = RecommendationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecommendationGetResponse>>

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            params: RecommendationGetParams = RecommendationGetParams.none()
        ): CompletableFuture<HttpResponseFor<RecommendationGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RecommendationGetResponse>> =
            get(RecommendationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /recommendations/available-genre-seeds`, but is
         * otherwise the same as [RecommendationServiceAsync.listAvailableGenreSeeds].
         */
        @Deprecated("deprecated")
        fun listAvailableGenreSeeds():
            CompletableFuture<HttpResponseFor<RecommendationListAvailableGenreSeedsResponse>> =
            listAvailableGenreSeeds(RecommendationListAvailableGenreSeedsParams.none())

        /** @see listAvailableGenreSeeds */
        @Deprecated("deprecated")
        fun listAvailableGenreSeeds(
            params: RecommendationListAvailableGenreSeedsParams =
                RecommendationListAvailableGenreSeedsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecommendationListAvailableGenreSeedsResponse>>

        /** @see listAvailableGenreSeeds */
        @Deprecated("deprecated")
        fun listAvailableGenreSeeds(
            params: RecommendationListAvailableGenreSeedsParams =
                RecommendationListAvailableGenreSeedsParams.none()
        ): CompletableFuture<HttpResponseFor<RecommendationListAvailableGenreSeedsResponse>> =
            listAvailableGenreSeeds(params, RequestOptions.none())

        /** @see listAvailableGenreSeeds */
        @Deprecated("deprecated")
        fun listAvailableGenreSeeds(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RecommendationListAvailableGenreSeedsResponse>> =
            listAvailableGenreSeeds(
                RecommendationListAvailableGenreSeedsParams.none(),
                requestOptions,
            )
    }
}
