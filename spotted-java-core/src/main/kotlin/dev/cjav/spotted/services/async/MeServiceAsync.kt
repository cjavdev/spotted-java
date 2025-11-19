// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.MeRetrieveParams
import dev.cjav.spotted.models.me.MeRetrieveResponse
import dev.cjav.spotted.services.async.me.AlbumServiceAsync
import dev.cjav.spotted.services.async.me.AudiobookServiceAsync
import dev.cjav.spotted.services.async.me.EpisodeServiceAsync
import dev.cjav.spotted.services.async.me.FollowingServiceAsync
import dev.cjav.spotted.services.async.me.PlayerServiceAsync
import dev.cjav.spotted.services.async.me.PlaylistServiceAsync
import dev.cjav.spotted.services.async.me.ShowServiceAsync
import dev.cjav.spotted.services.async.me.TopServiceAsync
import dev.cjav.spotted.services.async.me.TrackServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync

    fun audiobooks(): AudiobookServiceAsync

    fun playlists(): PlaylistServiceAsync

    fun top(): TopServiceAsync

    fun albums(): AlbumServiceAsync

    fun tracks(): TrackServiceAsync

    fun episodes(): EpisodeServiceAsync

    fun shows(): ShowServiceAsync

    fun following(): FollowingServiceAsync

    fun player(): PlayerServiceAsync

    /**
     * Get detailed profile information about the current user (including the current user's
     * username).
     */
    fun retrieve(): CompletableFuture<MeRetrieveResponse> = retrieve(MeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none()
    ): CompletableFuture<MeRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<MeRetrieveResponse> =
        retrieve(MeRetrieveParams.none(), requestOptions)

    /** A view of [MeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync.WithRawResponse

        fun audiobooks(): AudiobookServiceAsync.WithRawResponse

        fun playlists(): PlaylistServiceAsync.WithRawResponse

        fun top(): TopServiceAsync.WithRawResponse

        fun albums(): AlbumServiceAsync.WithRawResponse

        fun tracks(): TrackServiceAsync.WithRawResponse

        fun episodes(): EpisodeServiceAsync.WithRawResponse

        fun shows(): ShowServiceAsync.WithRawResponse

        fun following(): FollowingServiceAsync.WithRawResponse

        fun player(): PlayerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me`, but is otherwise the same as
         * [MeServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(MeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(MeRetrieveParams.none(), requestOptions)
    }
}
