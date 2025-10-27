// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.ArtistObject
import com.spotted.api.models.artists.ArtistListAlbumsPage
import com.spotted.api.models.artists.ArtistListAlbumsParams
import com.spotted.api.models.artists.ArtistListParams
import com.spotted.api.models.artists.ArtistListRelatedArtistsParams
import com.spotted.api.models.artists.ArtistListRelatedArtistsResponse
import com.spotted.api.models.artists.ArtistListResponse
import com.spotted.api.models.artists.ArtistListTopTracksParams
import com.spotted.api.models.artists.ArtistListTopTracksResponse
import com.spotted.api.models.artists.ArtistRetrieveParams
import java.util.function.Consumer

interface ArtistService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtistService

    /**
     * Get Spotify catalog information for a single artist identified by their unique Spotify ID.
     */
    fun retrieve(id: String): ArtistObject = retrieve(id, ArtistRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistObject = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
    ): ArtistObject = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ArtistRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistObject

    /** @see retrieve */
    fun retrieve(params: ArtistRetrieveParams): ArtistObject =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ArtistObject =
        retrieve(id, ArtistRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several artists based on their Spotify IDs. */
    fun list(params: ArtistListParams): ArtistListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ArtistListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListResponse

    /** Get Spotify catalog information about an artist's albums. */
    fun listAlbums(id: String): ArtistListAlbumsPage = listAlbums(id, ArtistListAlbumsParams.none())

    /** @see listAlbums */
    fun listAlbums(
        id: String,
        params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListAlbumsPage = listAlbums(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAlbums */
    fun listAlbums(
        id: String,
        params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
    ): ArtistListAlbumsPage = listAlbums(id, params, RequestOptions.none())

    /** @see listAlbums */
    fun listAlbums(
        params: ArtistListAlbumsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListAlbumsPage

    /** @see listAlbums */
    fun listAlbums(params: ArtistListAlbumsParams): ArtistListAlbumsPage =
        listAlbums(params, RequestOptions.none())

    /** @see listAlbums */
    fun listAlbums(id: String, requestOptions: RequestOptions): ArtistListAlbumsPage =
        listAlbums(id, ArtistListAlbumsParams.none(), requestOptions)

    /**
     * Get Spotify catalog information about artists similar to a given artist. Similarity is based
     * on analysis of the Spotify community's listening history.
     */
    @Deprecated("deprecated")
    fun listRelatedArtists(id: String): ArtistListRelatedArtistsResponse =
        listRelatedArtists(id, ArtistListRelatedArtistsParams.none())

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        id: String,
        params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListRelatedArtistsResponse =
        listRelatedArtists(params.toBuilder().id(id).build(), requestOptions)

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        id: String,
        params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
    ): ArtistListRelatedArtistsResponse = listRelatedArtists(id, params, RequestOptions.none())

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        params: ArtistListRelatedArtistsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListRelatedArtistsResponse

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        params: ArtistListRelatedArtistsParams
    ): ArtistListRelatedArtistsResponse = listRelatedArtists(params, RequestOptions.none())

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        id: String,
        requestOptions: RequestOptions,
    ): ArtistListRelatedArtistsResponse =
        listRelatedArtists(id, ArtistListRelatedArtistsParams.none(), requestOptions)

    /** Get Spotify catalog information about an artist's top tracks by country. */
    fun listTopTracks(id: String): ArtistListTopTracksResponse =
        listTopTracks(id, ArtistListTopTracksParams.none())

    /** @see listTopTracks */
    fun listTopTracks(
        id: String,
        params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListTopTracksResponse =
        listTopTracks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTopTracks */
    fun listTopTracks(
        id: String,
        params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
    ): ArtistListTopTracksResponse = listTopTracks(id, params, RequestOptions.none())

    /** @see listTopTracks */
    fun listTopTracks(
        params: ArtistListTopTracksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListTopTracksResponse

    /** @see listTopTracks */
    fun listTopTracks(params: ArtistListTopTracksParams): ArtistListTopTracksResponse =
        listTopTracks(params, RequestOptions.none())

    /** @see listTopTracks */
    fun listTopTracks(id: String, requestOptions: RequestOptions): ArtistListTopTracksResponse =
        listTopTracks(id, ArtistListTopTracksParams.none(), requestOptions)

    /** A view of [ArtistService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtistService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /artists/{id}`, but is otherwise the same as
         * [ArtistService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ArtistObject> =
            retrieve(id, ArtistRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistObject> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
        ): HttpResponseFor<ArtistObject> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ArtistRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistObject>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ArtistRetrieveParams): HttpResponseFor<ArtistObject> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<ArtistObject> =
            retrieve(id, ArtistRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists`, but is otherwise the same as
         * [ArtistService.list].
         */
        @MustBeClosed
        fun list(params: ArtistListParams): HttpResponseFor<ArtistListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ArtistListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListResponse>

        /**
         * Returns a raw HTTP response for `get /artists/{id}/albums`, but is otherwise the same as
         * [ArtistService.listAlbums].
         */
        @MustBeClosed
        fun listAlbums(id: String): HttpResponseFor<ArtistListAlbumsPage> =
            listAlbums(id, ArtistListAlbumsParams.none())

        /** @see listAlbums */
        @MustBeClosed
        fun listAlbums(
            id: String,
            params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListAlbumsPage> =
            listAlbums(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAlbums */
        @MustBeClosed
        fun listAlbums(
            id: String,
            params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
        ): HttpResponseFor<ArtistListAlbumsPage> = listAlbums(id, params, RequestOptions.none())

        /** @see listAlbums */
        @MustBeClosed
        fun listAlbums(
            params: ArtistListAlbumsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListAlbumsPage>

        /** @see listAlbums */
        @MustBeClosed
        fun listAlbums(params: ArtistListAlbumsParams): HttpResponseFor<ArtistListAlbumsPage> =
            listAlbums(params, RequestOptions.none())

        /** @see listAlbums */
        @MustBeClosed
        fun listAlbums(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListAlbumsPage> =
            listAlbums(id, ArtistListAlbumsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists/{id}/related-artists`, but is otherwise the
         * same as [ArtistService.listRelatedArtists].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listRelatedArtists(id: String): HttpResponseFor<ArtistListRelatedArtistsResponse> =
            listRelatedArtists(id, ArtistListRelatedArtistsParams.none())

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listRelatedArtists(
            id: String,
            params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListRelatedArtistsResponse> =
            listRelatedArtists(params.toBuilder().id(id).build(), requestOptions)

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listRelatedArtists(
            id: String,
            params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
        ): HttpResponseFor<ArtistListRelatedArtistsResponse> =
            listRelatedArtists(id, params, RequestOptions.none())

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listRelatedArtists(
            params: ArtistListRelatedArtistsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListRelatedArtistsResponse>

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listRelatedArtists(
            params: ArtistListRelatedArtistsParams
        ): HttpResponseFor<ArtistListRelatedArtistsResponse> =
            listRelatedArtists(params, RequestOptions.none())

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listRelatedArtists(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListRelatedArtistsResponse> =
            listRelatedArtists(id, ArtistListRelatedArtistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists/{id}/top-tracks`, but is otherwise the same
         * as [ArtistService.listTopTracks].
         */
        @MustBeClosed
        fun listTopTracks(id: String): HttpResponseFor<ArtistListTopTracksResponse> =
            listTopTracks(id, ArtistListTopTracksParams.none())

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(
            id: String,
            params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListTopTracksResponse> =
            listTopTracks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(
            id: String,
            params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
        ): HttpResponseFor<ArtistListTopTracksResponse> =
            listTopTracks(id, params, RequestOptions.none())

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(
            params: ArtistListTopTracksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListTopTracksResponse>

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(
            params: ArtistListTopTracksParams
        ): HttpResponseFor<ArtistListTopTracksResponse> =
            listTopTracks(params, RequestOptions.none())

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListTopTracksResponse> =
            listTopTracks(id, ArtistListTopTracksParams.none(), requestOptions)
    }
}
