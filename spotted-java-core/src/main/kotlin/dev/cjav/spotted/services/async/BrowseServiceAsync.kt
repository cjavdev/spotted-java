// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.browse.BrowseGetFeaturedPlaylistsParams
import dev.cjav.spotted.models.browse.BrowseGetFeaturedPlaylistsResponse
import dev.cjav.spotted.models.browse.BrowseGetNewReleasesParams
import dev.cjav.spotted.models.browse.BrowseGetNewReleasesResponse
import dev.cjav.spotted.services.async.browse.CategoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrowseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowseServiceAsync

    fun categories(): CategoryServiceAsync

    /**
     * Get a list of Spotify featured playlists (shown, for example, on a Spotify player's 'Browse'
     * tab).
     */
    @Deprecated("deprecated")
    fun getFeaturedPlaylists(): CompletableFuture<BrowseGetFeaturedPlaylistsResponse> =
        getFeaturedPlaylists(BrowseGetFeaturedPlaylistsParams.none())

    /** @see getFeaturedPlaylists */
    @Deprecated("deprecated")
    fun getFeaturedPlaylists(
        params: BrowseGetFeaturedPlaylistsParams = BrowseGetFeaturedPlaylistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowseGetFeaturedPlaylistsResponse>

    /** @see getFeaturedPlaylists */
    @Deprecated("deprecated")
    fun getFeaturedPlaylists(
        params: BrowseGetFeaturedPlaylistsParams = BrowseGetFeaturedPlaylistsParams.none()
    ): CompletableFuture<BrowseGetFeaturedPlaylistsResponse> =
        getFeaturedPlaylists(params, RequestOptions.none())

    /** @see getFeaturedPlaylists */
    @Deprecated("deprecated")
    fun getFeaturedPlaylists(
        requestOptions: RequestOptions
    ): CompletableFuture<BrowseGetFeaturedPlaylistsResponse> =
        getFeaturedPlaylists(BrowseGetFeaturedPlaylistsParams.none(), requestOptions)

    /**
     * Get a list of new album releases featured in Spotify (shown, for example, on a Spotify
     * player’s “Browse” tab).
     */
    fun getNewReleases(): CompletableFuture<BrowseGetNewReleasesResponse> =
        getNewReleases(BrowseGetNewReleasesParams.none())

    /** @see getNewReleases */
    fun getNewReleases(
        params: BrowseGetNewReleasesParams = BrowseGetNewReleasesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowseGetNewReleasesResponse>

    /** @see getNewReleases */
    fun getNewReleases(
        params: BrowseGetNewReleasesParams = BrowseGetNewReleasesParams.none()
    ): CompletableFuture<BrowseGetNewReleasesResponse> =
        getNewReleases(params, RequestOptions.none())

    /** @see getNewReleases */
    fun getNewReleases(
        requestOptions: RequestOptions
    ): CompletableFuture<BrowseGetNewReleasesResponse> =
        getNewReleases(BrowseGetNewReleasesParams.none(), requestOptions)

    /**
     * A view of [BrowseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowseServiceAsync.WithRawResponse

        fun categories(): CategoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /browse/featured-playlists`, but is otherwise the
         * same as [BrowseServiceAsync.getFeaturedPlaylists].
         */
        @Deprecated("deprecated")
        fun getFeaturedPlaylists():
            CompletableFuture<HttpResponseFor<BrowseGetFeaturedPlaylistsResponse>> =
            getFeaturedPlaylists(BrowseGetFeaturedPlaylistsParams.none())

        /** @see getFeaturedPlaylists */
        @Deprecated("deprecated")
        fun getFeaturedPlaylists(
            params: BrowseGetFeaturedPlaylistsParams = BrowseGetFeaturedPlaylistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowseGetFeaturedPlaylistsResponse>>

        /** @see getFeaturedPlaylists */
        @Deprecated("deprecated")
        fun getFeaturedPlaylists(
            params: BrowseGetFeaturedPlaylistsParams = BrowseGetFeaturedPlaylistsParams.none()
        ): CompletableFuture<HttpResponseFor<BrowseGetFeaturedPlaylistsResponse>> =
            getFeaturedPlaylists(params, RequestOptions.none())

        /** @see getFeaturedPlaylists */
        @Deprecated("deprecated")
        fun getFeaturedPlaylists(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrowseGetFeaturedPlaylistsResponse>> =
            getFeaturedPlaylists(BrowseGetFeaturedPlaylistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browse/new-releases`, but is otherwise the same as
         * [BrowseServiceAsync.getNewReleases].
         */
        fun getNewReleases(): CompletableFuture<HttpResponseFor<BrowseGetNewReleasesResponse>> =
            getNewReleases(BrowseGetNewReleasesParams.none())

        /** @see getNewReleases */
        fun getNewReleases(
            params: BrowseGetNewReleasesParams = BrowseGetNewReleasesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowseGetNewReleasesResponse>>

        /** @see getNewReleases */
        fun getNewReleases(
            params: BrowseGetNewReleasesParams = BrowseGetNewReleasesParams.none()
        ): CompletableFuture<HttpResponseFor<BrowseGetNewReleasesResponse>> =
            getNewReleases(params, RequestOptions.none())

        /** @see getNewReleases */
        fun getNewReleases(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrowseGetNewReleasesResponse>> =
            getNewReleases(BrowseGetNewReleasesParams.none(), requestOptions)
    }
}
