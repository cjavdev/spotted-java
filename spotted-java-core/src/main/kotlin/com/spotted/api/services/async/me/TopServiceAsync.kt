// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.top.TopListTopArtistsPageAsync
import com.spotted.api.models.me.top.TopListTopArtistsParams
import com.spotted.api.models.me.top.TopListTopTracksPageAsync
import com.spotted.api.models.me.top.TopListTopTracksParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopServiceAsync

    /** Get the current user's top artists based on calculated affinity. */
    fun listTopArtists(): CompletableFuture<TopListTopArtistsPageAsync> =
        listTopArtists(TopListTopArtistsParams.none())

    /** @see listTopArtists */
    fun listTopArtists(
        params: TopListTopArtistsParams = TopListTopArtistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TopListTopArtistsPageAsync>

    /** @see listTopArtists */
    fun listTopArtists(
        params: TopListTopArtistsParams = TopListTopArtistsParams.none()
    ): CompletableFuture<TopListTopArtistsPageAsync> = listTopArtists(params, RequestOptions.none())

    /** @see listTopArtists */
    fun listTopArtists(
        requestOptions: RequestOptions
    ): CompletableFuture<TopListTopArtistsPageAsync> =
        listTopArtists(TopListTopArtistsParams.none(), requestOptions)

    /** Get the current user's top tracks based on calculated affinity. */
    fun listTopTracks(): CompletableFuture<TopListTopTracksPageAsync> =
        listTopTracks(TopListTopTracksParams.none())

    /** @see listTopTracks */
    fun listTopTracks(
        params: TopListTopTracksParams = TopListTopTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TopListTopTracksPageAsync>

    /** @see listTopTracks */
    fun listTopTracks(
        params: TopListTopTracksParams = TopListTopTracksParams.none()
    ): CompletableFuture<TopListTopTracksPageAsync> = listTopTracks(params, RequestOptions.none())

    /** @see listTopTracks */
    fun listTopTracks(
        requestOptions: RequestOptions
    ): CompletableFuture<TopListTopTracksPageAsync> =
        listTopTracks(TopListTopTracksParams.none(), requestOptions)

    /** A view of [TopServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/top/artists`, but is otherwise the same as
         * [TopServiceAsync.listTopArtists].
         */
        fun listTopArtists(): CompletableFuture<HttpResponseFor<TopListTopArtistsPageAsync>> =
            listTopArtists(TopListTopArtistsParams.none())

        /** @see listTopArtists */
        fun listTopArtists(
            params: TopListTopArtistsParams = TopListTopArtistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TopListTopArtistsPageAsync>>

        /** @see listTopArtists */
        fun listTopArtists(
            params: TopListTopArtistsParams = TopListTopArtistsParams.none()
        ): CompletableFuture<HttpResponseFor<TopListTopArtistsPageAsync>> =
            listTopArtists(params, RequestOptions.none())

        /** @see listTopArtists */
        fun listTopArtists(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TopListTopArtistsPageAsync>> =
            listTopArtists(TopListTopArtistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/top/tracks`, but is otherwise the same as
         * [TopServiceAsync.listTopTracks].
         */
        fun listTopTracks(): CompletableFuture<HttpResponseFor<TopListTopTracksPageAsync>> =
            listTopTracks(TopListTopTracksParams.none())

        /** @see listTopTracks */
        fun listTopTracks(
            params: TopListTopTracksParams = TopListTopTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TopListTopTracksPageAsync>>

        /** @see listTopTracks */
        fun listTopTracks(
            params: TopListTopTracksParams = TopListTopTracksParams.none()
        ): CompletableFuture<HttpResponseFor<TopListTopTracksPageAsync>> =
            listTopTracks(params, RequestOptions.none())

        /** @see listTopTracks */
        fun listTopTracks(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TopListTopTracksPageAsync>> =
            listTopTracks(TopListTopTracksParams.none(), requestOptions)
    }
}
