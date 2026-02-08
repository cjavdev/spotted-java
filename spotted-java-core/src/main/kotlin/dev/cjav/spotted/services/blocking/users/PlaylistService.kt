// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.users

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.users.playlists.PlaylistCreateParams
import dev.cjav.spotted.models.users.playlists.PlaylistCreateResponse
import dev.cjav.spotted.models.users.playlists.PlaylistListPage
import dev.cjav.spotted.models.users.playlists.PlaylistListParams
import java.util.function.Consumer

interface PlaylistService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaylistService

    /**
     * **Deprecated**: Use [Create Playlist](/documentation/web-api/reference/create-playlist)
     * instead.
     *
     * Create a playlist for a Spotify user. (The playlist will be empty until you
     * [add tracks](/documentation/web-api/reference/add-tracks-to-playlist).) Each user is
     * generally limited to a maximum of 11000 playlists.
     */
    @Deprecated("deprecated")
    fun create(userId: String, params: PlaylistCreateParams): PlaylistCreateResponse =
        create(userId, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        userId: String,
        params: PlaylistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistCreateResponse = create(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: PlaylistCreateParams): PlaylistCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: PlaylistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistCreateResponse

    /** Get a list of the playlists owned or followed by a Spotify user. */
    @Deprecated("deprecated")
    fun list(userId: String): PlaylistListPage = list(userId, PlaylistListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        userId: String,
        params: PlaylistListParams = PlaylistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistListPage = list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        userId: String,
        params: PlaylistListParams = PlaylistListParams.none(),
    ): PlaylistListPage = list(userId, params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: PlaylistListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistListPage

    /** @see list */
    @Deprecated("deprecated")
    fun list(params: PlaylistListParams): PlaylistListPage = list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(userId: String, requestOptions: RequestOptions): PlaylistListPage =
        list(userId, PlaylistListParams.none(), requestOptions)

    /** A view of [PlaylistService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaylistService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /users/{user_id}/playlists`, but is otherwise the
         * same as [PlaylistService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            userId: String,
            params: PlaylistCreateParams,
        ): HttpResponseFor<PlaylistCreateResponse> = create(userId, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            userId: String,
            params: PlaylistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistCreateResponse> =
            create(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: PlaylistCreateParams): HttpResponseFor<PlaylistCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: PlaylistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistCreateResponse>

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/playlists`, but is otherwise the
         * same as [PlaylistService.list].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(userId: String): HttpResponseFor<PlaylistListPage> =
            list(userId, PlaylistListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            userId: String,
            params: PlaylistListParams = PlaylistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistListPage> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            userId: String,
            params: PlaylistListParams = PlaylistListParams.none(),
        ): HttpResponseFor<PlaylistListPage> = list(userId, params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: PlaylistListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistListPage>

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(params: PlaylistListParams): HttpResponseFor<PlaylistListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaylistListPage> =
            list(userId, PlaylistListParams.none(), requestOptions)
    }
}
