// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.ArtistObject
import com.spotted.api.models.artists.ArtistBulkRetrieveParams
import com.spotted.api.models.artists.ArtistBulkRetrieveResponse
import com.spotted.api.models.artists.ArtistListAlbumsPageAsync
import com.spotted.api.models.artists.ArtistListAlbumsParams
import com.spotted.api.models.artists.ArtistListRelatedArtistsParams
import com.spotted.api.models.artists.ArtistListRelatedArtistsResponse
import com.spotted.api.models.artists.ArtistListTopTracksParams
import com.spotted.api.models.artists.ArtistListTopTracksResponse
import com.spotted.api.models.artists.ArtistRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ArtistServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtistServiceAsync

    /**
     * Get Spotify catalog information for a single artist identified by their unique Spotify ID.
     */
    fun retrieve(id: String): CompletableFuture<ArtistObject> =
        retrieve(id, ArtistRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistObject> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
    ): CompletableFuture<ArtistObject> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ArtistRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistObject>

    /** @see retrieve */
    fun retrieve(params: ArtistRetrieveParams): CompletableFuture<ArtistObject> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ArtistObject> =
        retrieve(id, ArtistRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several artists based on their Spotify IDs. */
    fun bulkRetrieve(
        params: ArtistBulkRetrieveParams
    ): CompletableFuture<ArtistBulkRetrieveResponse> = bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    fun bulkRetrieve(
        params: ArtistBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistBulkRetrieveResponse>

    /** Get Spotify catalog information about an artist's albums. */
    fun listAlbums(id: String): CompletableFuture<ArtistListAlbumsPageAsync> =
        listAlbums(id, ArtistListAlbumsParams.none())

    /** @see listAlbums */
    fun listAlbums(
        id: String,
        params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistListAlbumsPageAsync> =
        listAlbums(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAlbums */
    fun listAlbums(
        id: String,
        params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
    ): CompletableFuture<ArtistListAlbumsPageAsync> = listAlbums(id, params, RequestOptions.none())

    /** @see listAlbums */
    fun listAlbums(
        params: ArtistListAlbumsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistListAlbumsPageAsync>

    /** @see listAlbums */
    fun listAlbums(params: ArtistListAlbumsParams): CompletableFuture<ArtistListAlbumsPageAsync> =
        listAlbums(params, RequestOptions.none())

    /** @see listAlbums */
    fun listAlbums(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistListAlbumsPageAsync> =
        listAlbums(id, ArtistListAlbumsParams.none(), requestOptions)

    /**
     * Get Spotify catalog information about artists similar to a given artist. Similarity is based
     * on analysis of the Spotify community's listening history.
     */
    @Deprecated("deprecated")
    fun listRelatedArtists(id: String): CompletableFuture<ArtistListRelatedArtistsResponse> =
        listRelatedArtists(id, ArtistListRelatedArtistsParams.none())

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        id: String,
        params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistListRelatedArtistsResponse> =
        listRelatedArtists(params.toBuilder().id(id).build(), requestOptions)

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        id: String,
        params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
    ): CompletableFuture<ArtistListRelatedArtistsResponse> =
        listRelatedArtists(id, params, RequestOptions.none())

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        params: ArtistListRelatedArtistsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistListRelatedArtistsResponse>

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        params: ArtistListRelatedArtistsParams
    ): CompletableFuture<ArtistListRelatedArtistsResponse> =
        listRelatedArtists(params, RequestOptions.none())

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    fun listRelatedArtists(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistListRelatedArtistsResponse> =
        listRelatedArtists(id, ArtistListRelatedArtistsParams.none(), requestOptions)

    /** Get Spotify catalog information about an artist's top tracks by country. */
    fun listTopTracks(id: String): CompletableFuture<ArtistListTopTracksResponse> =
        listTopTracks(id, ArtistListTopTracksParams.none())

    /** @see listTopTracks */
    fun listTopTracks(
        id: String,
        params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistListTopTracksResponse> =
        listTopTracks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTopTracks */
    fun listTopTracks(
        id: String,
        params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
    ): CompletableFuture<ArtistListTopTracksResponse> =
        listTopTracks(id, params, RequestOptions.none())

    /** @see listTopTracks */
    fun listTopTracks(
        params: ArtistListTopTracksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistListTopTracksResponse>

    /** @see listTopTracks */
    fun listTopTracks(
        params: ArtistListTopTracksParams
    ): CompletableFuture<ArtistListTopTracksResponse> = listTopTracks(params, RequestOptions.none())

    /** @see listTopTracks */
    fun listTopTracks(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistListTopTracksResponse> =
        listTopTracks(id, ArtistListTopTracksParams.none(), requestOptions)

    /**
     * A view of [ArtistServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArtistServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /artists/{id}`, but is otherwise the same as
         * [ArtistServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ArtistObject>> =
            retrieve(id, ArtistRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistObject>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ArtistObject>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ArtistRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistObject>>

        /** @see retrieve */
        fun retrieve(
            params: ArtistRetrieveParams
        ): CompletableFuture<HttpResponseFor<ArtistObject>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistObject>> =
            retrieve(id, ArtistRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists`, but is otherwise the same as
         * [ArtistServiceAsync.bulkRetrieve].
         */
        fun bulkRetrieve(
            params: ArtistBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<ArtistBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        fun bulkRetrieve(
            params: ArtistBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistBulkRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /artists/{id}/albums`, but is otherwise the same as
         * [ArtistServiceAsync.listAlbums].
         */
        fun listAlbums(id: String): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(id, ArtistListAlbumsParams.none())

        /** @see listAlbums */
        fun listAlbums(
            id: String,
            params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAlbums */
        fun listAlbums(
            id: String,
            params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(id, params, RequestOptions.none())

        /** @see listAlbums */
        fun listAlbums(
            params: ArtistListAlbumsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>>

        /** @see listAlbums */
        fun listAlbums(
            params: ArtistListAlbumsParams
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(params, RequestOptions.none())

        /** @see listAlbums */
        fun listAlbums(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(id, ArtistListAlbumsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists/{id}/related-artists`, but is otherwise the
         * same as [ArtistServiceAsync.listRelatedArtists].
         */
        @Deprecated("deprecated")
        fun listRelatedArtists(
            id: String
        ): CompletableFuture<HttpResponseFor<ArtistListRelatedArtistsResponse>> =
            listRelatedArtists(id, ArtistListRelatedArtistsParams.none())

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        fun listRelatedArtists(
            id: String,
            params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListRelatedArtistsResponse>> =
            listRelatedArtists(params.toBuilder().id(id).build(), requestOptions)

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        fun listRelatedArtists(
            id: String,
            params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListRelatedArtistsResponse>> =
            listRelatedArtists(id, params, RequestOptions.none())

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        fun listRelatedArtists(
            params: ArtistListRelatedArtistsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListRelatedArtistsResponse>>

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        fun listRelatedArtists(
            params: ArtistListRelatedArtistsParams
        ): CompletableFuture<HttpResponseFor<ArtistListRelatedArtistsResponse>> =
            listRelatedArtists(params, RequestOptions.none())

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        fun listRelatedArtists(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistListRelatedArtistsResponse>> =
            listRelatedArtists(id, ArtistListRelatedArtistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists/{id}/top-tracks`, but is otherwise the same
         * as [ArtistServiceAsync.listTopTracks].
         */
        fun listTopTracks(
            id: String
        ): CompletableFuture<HttpResponseFor<ArtistListTopTracksResponse>> =
            listTopTracks(id, ArtistListTopTracksParams.none())

        /** @see listTopTracks */
        fun listTopTracks(
            id: String,
            params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListTopTracksResponse>> =
            listTopTracks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTopTracks */
        fun listTopTracks(
            id: String,
            params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListTopTracksResponse>> =
            listTopTracks(id, params, RequestOptions.none())

        /** @see listTopTracks */
        fun listTopTracks(
            params: ArtistListTopTracksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListTopTracksResponse>>

        /** @see listTopTracks */
        fun listTopTracks(
            params: ArtistListTopTracksParams
        ): CompletableFuture<HttpResponseFor<ArtistListTopTracksResponse>> =
            listTopTracks(params, RequestOptions.none())

        /** @see listTopTracks */
        fun listTopTracks(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistListTopTracksResponse>> =
            listTopTracks(id, ArtistListTopTracksParams.none(), requestOptions)
    }
}
