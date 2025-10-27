// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.top.TopListTopArtistsPage
import com.spotted.api.models.me.top.TopListTopArtistsParams
import com.spotted.api.models.me.top.TopListTopTracksPage
import com.spotted.api.models.me.top.TopListTopTracksParams
import java.util.function.Consumer

interface TopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopService

    /** Get the current user's top artists based on calculated affinity. */
    fun listTopArtists(): TopListTopArtistsPage = listTopArtists(TopListTopArtistsParams.none())

    /** @see listTopArtists */
    fun listTopArtists(
        params: TopListTopArtistsParams = TopListTopArtistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopListTopArtistsPage

    /** @see listTopArtists */
    fun listTopArtists(
        params: TopListTopArtistsParams = TopListTopArtistsParams.none()
    ): TopListTopArtistsPage = listTopArtists(params, RequestOptions.none())

    /** @see listTopArtists */
    fun listTopArtists(requestOptions: RequestOptions): TopListTopArtistsPage =
        listTopArtists(TopListTopArtistsParams.none(), requestOptions)

    /** Get the current user's top tracks based on calculated affinity. */
    fun listTopTracks(): TopListTopTracksPage = listTopTracks(TopListTopTracksParams.none())

    /** @see listTopTracks */
    fun listTopTracks(
        params: TopListTopTracksParams = TopListTopTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopListTopTracksPage

    /** @see listTopTracks */
    fun listTopTracks(
        params: TopListTopTracksParams = TopListTopTracksParams.none()
    ): TopListTopTracksPage = listTopTracks(params, RequestOptions.none())

    /** @see listTopTracks */
    fun listTopTracks(requestOptions: RequestOptions): TopListTopTracksPage =
        listTopTracks(TopListTopTracksParams.none(), requestOptions)

    /** A view of [TopService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/top/artists`, but is otherwise the same as
         * [TopService.listTopArtists].
         */
        @MustBeClosed
        fun listTopArtists(): HttpResponseFor<TopListTopArtistsPage> =
            listTopArtists(TopListTopArtistsParams.none())

        /** @see listTopArtists */
        @MustBeClosed
        fun listTopArtists(
            params: TopListTopArtistsParams = TopListTopArtistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopListTopArtistsPage>

        /** @see listTopArtists */
        @MustBeClosed
        fun listTopArtists(
            params: TopListTopArtistsParams = TopListTopArtistsParams.none()
        ): HttpResponseFor<TopListTopArtistsPage> = listTopArtists(params, RequestOptions.none())

        /** @see listTopArtists */
        @MustBeClosed
        fun listTopArtists(requestOptions: RequestOptions): HttpResponseFor<TopListTopArtistsPage> =
            listTopArtists(TopListTopArtistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/top/tracks`, but is otherwise the same as
         * [TopService.listTopTracks].
         */
        @MustBeClosed
        fun listTopTracks(): HttpResponseFor<TopListTopTracksPage> =
            listTopTracks(TopListTopTracksParams.none())

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(
            params: TopListTopTracksParams = TopListTopTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopListTopTracksPage>

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(
            params: TopListTopTracksParams = TopListTopTracksParams.none()
        ): HttpResponseFor<TopListTopTracksPage> = listTopTracks(params, RequestOptions.none())

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(requestOptions: RequestOptions): HttpResponseFor<TopListTopTracksPage> =
            listTopTracks(TopListTopTracksParams.none(), requestOptions)
    }
}
