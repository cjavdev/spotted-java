// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.ArtistObject
import dev.cjav.spotted.models.artists.ArtistBulkRetrieveParams
import dev.cjav.spotted.models.artists.ArtistBulkRetrieveResponse
import dev.cjav.spotted.models.artists.ArtistListAlbumsPageAsync
import dev.cjav.spotted.models.artists.ArtistListAlbumsParams
import dev.cjav.spotted.models.artists.ArtistListRelatedArtistsParams
import dev.cjav.spotted.models.artists.ArtistListRelatedArtistsResponse
import dev.cjav.spotted.models.artists.ArtistRetrieveParams
import dev.cjav.spotted.models.artists.ArtistTopTracksParams
import dev.cjav.spotted.models.artists.ArtistTopTracksResponse
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
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: ArtistBulkRetrieveParams
    ): CompletableFuture<ArtistBulkRetrieveResponse> = bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: ArtistBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistBulkRetrieveResponse>

    /** Get Spotify catalog information about an artist's albums. */
    @Deprecated("deprecated")
    fun listAlbums(id: String): CompletableFuture<ArtistListAlbumsPageAsync> =
        listAlbums(id, ArtistListAlbumsParams.none())

    /** @see listAlbums */
    @Deprecated("deprecated")
    fun listAlbums(
        id: String,
        params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistListAlbumsPageAsync> =
        listAlbums(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAlbums */
    @Deprecated("deprecated")
    fun listAlbums(
        id: String,
        params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
    ): CompletableFuture<ArtistListAlbumsPageAsync> = listAlbums(id, params, RequestOptions.none())

    /** @see listAlbums */
    @Deprecated("deprecated")
    fun listAlbums(
        params: ArtistListAlbumsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistListAlbumsPageAsync>

    /** @see listAlbums */
    @Deprecated("deprecated")
    fun listAlbums(params: ArtistListAlbumsParams): CompletableFuture<ArtistListAlbumsPageAsync> =
        listAlbums(params, RequestOptions.none())

    /** @see listAlbums */
    @Deprecated("deprecated")
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
    @Deprecated("deprecated")
    fun topTracks(id: String): CompletableFuture<ArtistTopTracksResponse> =
        topTracks(id, ArtistTopTracksParams.none())

    /** @see topTracks */
    @Deprecated("deprecated")
    fun topTracks(
        id: String,
        params: ArtistTopTracksParams = ArtistTopTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistTopTracksResponse> =
        topTracks(params.toBuilder().id(id).build(), requestOptions)

    /** @see topTracks */
    @Deprecated("deprecated")
    fun topTracks(
        id: String,
        params: ArtistTopTracksParams = ArtistTopTracksParams.none(),
    ): CompletableFuture<ArtistTopTracksResponse> = topTracks(id, params, RequestOptions.none())

    /** @see topTracks */
    @Deprecated("deprecated")
    fun topTracks(
        params: ArtistTopTracksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtistTopTracksResponse>

    /** @see topTracks */
    @Deprecated("deprecated")
    fun topTracks(params: ArtistTopTracksParams): CompletableFuture<ArtistTopTracksResponse> =
        topTracks(params, RequestOptions.none())

    /** @see topTracks */
    @Deprecated("deprecated")
    fun topTracks(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistTopTracksResponse> =
        topTracks(id, ArtistTopTracksParams.none(), requestOptions)

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
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: ArtistBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<ArtistBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: ArtistBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistBulkRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /artists/{id}/albums`, but is otherwise the same as
         * [ArtistServiceAsync.listAlbums].
         */
        @Deprecated("deprecated")
        fun listAlbums(id: String): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(id, ArtistListAlbumsParams.none())

        /** @see listAlbums */
        @Deprecated("deprecated")
        fun listAlbums(
            id: String,
            params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAlbums */
        @Deprecated("deprecated")
        fun listAlbums(
            id: String,
            params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(id, params, RequestOptions.none())

        /** @see listAlbums */
        @Deprecated("deprecated")
        fun listAlbums(
            params: ArtistListAlbumsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>>

        /** @see listAlbums */
        @Deprecated("deprecated")
        fun listAlbums(
            params: ArtistListAlbumsParams
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> =
            listAlbums(params, RequestOptions.none())

        /** @see listAlbums */
        @Deprecated("deprecated")
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
         * as [ArtistServiceAsync.topTracks].
         */
        @Deprecated("deprecated")
        fun topTracks(id: String): CompletableFuture<HttpResponseFor<ArtistTopTracksResponse>> =
            topTracks(id, ArtistTopTracksParams.none())

        /** @see topTracks */
        @Deprecated("deprecated")
        fun topTracks(
            id: String,
            params: ArtistTopTracksParams = ArtistTopTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistTopTracksResponse>> =
            topTracks(params.toBuilder().id(id).build(), requestOptions)

        /** @see topTracks */
        @Deprecated("deprecated")
        fun topTracks(
            id: String,
            params: ArtistTopTracksParams = ArtistTopTracksParams.none(),
        ): CompletableFuture<HttpResponseFor<ArtistTopTracksResponse>> =
            topTracks(id, params, RequestOptions.none())

        /** @see topTracks */
        @Deprecated("deprecated")
        fun topTracks(
            params: ArtistTopTracksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtistTopTracksResponse>>

        /** @see topTracks */
        @Deprecated("deprecated")
        fun topTracks(
            params: ArtistTopTracksParams
        ): CompletableFuture<HttpResponseFor<ArtistTopTracksResponse>> =
            topTracks(params, RequestOptions.none())

        /** @see topTracks */
        @Deprecated("deprecated")
        fun topTracks(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistTopTracksResponse>> =
            topTracks(id, ArtistTopTracksParams.none(), requestOptions)
    }
}
