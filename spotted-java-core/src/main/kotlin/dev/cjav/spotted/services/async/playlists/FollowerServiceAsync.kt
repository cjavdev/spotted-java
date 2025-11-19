// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.playlists.followers.FollowerCheckParams
import dev.cjav.spotted.models.playlists.followers.FollowerFollowParams
import dev.cjav.spotted.models.playlists.followers.FollowerUnfollowParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FollowerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FollowerServiceAsync

    /** Check to see if the current user is following a specified playlist. */
    fun check(playlistId: String): CompletableFuture<List<Boolean>> =
        check(playlistId, FollowerCheckParams.none())

    /** @see check */
    fun check(
        playlistId: String,
        params: FollowerCheckParams = FollowerCheckParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>> =
        check(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see check */
    fun check(
        playlistId: String,
        params: FollowerCheckParams = FollowerCheckParams.none(),
    ): CompletableFuture<List<Boolean>> = check(playlistId, params, RequestOptions.none())

    /** @see check */
    fun check(
        params: FollowerCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /** @see check */
    fun check(params: FollowerCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        playlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Boolean>> =
        check(playlistId, FollowerCheckParams.none(), requestOptions)

    /** Add the current user as a follower of a playlist. */
    fun follow(playlistId: String): CompletableFuture<Void?> =
        follow(playlistId, FollowerFollowParams.none())

    /** @see follow */
    fun follow(
        playlistId: String,
        params: FollowerFollowParams = FollowerFollowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        follow(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see follow */
    fun follow(
        playlistId: String,
        params: FollowerFollowParams = FollowerFollowParams.none(),
    ): CompletableFuture<Void?> = follow(playlistId, params, RequestOptions.none())

    /** @see follow */
    fun follow(
        params: FollowerFollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see follow */
    fun follow(params: FollowerFollowParams): CompletableFuture<Void?> =
        follow(params, RequestOptions.none())

    /** @see follow */
    fun follow(playlistId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        follow(playlistId, FollowerFollowParams.none(), requestOptions)

    /** Remove the current user as a follower of a playlist. */
    fun unfollow(playlistId: String): CompletableFuture<Void?> =
        unfollow(playlistId, FollowerUnfollowParams.none())

    /** @see unfollow */
    fun unfollow(
        playlistId: String,
        params: FollowerUnfollowParams = FollowerUnfollowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unfollow(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see unfollow */
    fun unfollow(
        playlistId: String,
        params: FollowerUnfollowParams = FollowerUnfollowParams.none(),
    ): CompletableFuture<Void?> = unfollow(playlistId, params, RequestOptions.none())

    /** @see unfollow */
    fun unfollow(
        params: FollowerUnfollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see unfollow */
    fun unfollow(params: FollowerUnfollowParams): CompletableFuture<Void?> =
        unfollow(params, RequestOptions.none())

    /** @see unfollow */
    fun unfollow(playlistId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        unfollow(playlistId, FollowerUnfollowParams.none(), requestOptions)

    /**
     * A view of [FollowerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FollowerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}/followers/contains`, but is
         * otherwise the same as [FollowerServiceAsync.check].
         */
        fun check(playlistId: String): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(playlistId, FollowerCheckParams.none())

        /** @see check */
        fun check(
            playlistId: String,
            params: FollowerCheckParams = FollowerCheckParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see check */
        fun check(
            playlistId: String,
            params: FollowerCheckParams = FollowerCheckParams.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(playlistId, params, RequestOptions.none())

        /** @see check */
        fun check(
            params: FollowerCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /** @see check */
        fun check(params: FollowerCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(playlistId, FollowerCheckParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}/followers`, but is
         * otherwise the same as [FollowerServiceAsync.follow].
         */
        fun follow(playlistId: String): CompletableFuture<HttpResponse> =
            follow(playlistId, FollowerFollowParams.none())

        /** @see follow */
        fun follow(
            playlistId: String,
            params: FollowerFollowParams = FollowerFollowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            follow(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see follow */
        fun follow(
            playlistId: String,
            params: FollowerFollowParams = FollowerFollowParams.none(),
        ): CompletableFuture<HttpResponse> = follow(playlistId, params, RequestOptions.none())

        /** @see follow */
        fun follow(
            params: FollowerFollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see follow */
        fun follow(params: FollowerFollowParams): CompletableFuture<HttpResponse> =
            follow(params, RequestOptions.none())

        /** @see follow */
        fun follow(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            follow(playlistId, FollowerFollowParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /playlists/{playlist_id}/followers`, but is
         * otherwise the same as [FollowerServiceAsync.unfollow].
         */
        fun unfollow(playlistId: String): CompletableFuture<HttpResponse> =
            unfollow(playlistId, FollowerUnfollowParams.none())

        /** @see unfollow */
        fun unfollow(
            playlistId: String,
            params: FollowerUnfollowParams = FollowerUnfollowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unfollow(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see unfollow */
        fun unfollow(
            playlistId: String,
            params: FollowerUnfollowParams = FollowerUnfollowParams.none(),
        ): CompletableFuture<HttpResponse> = unfollow(playlistId, params, RequestOptions.none())

        /** @see unfollow */
        fun unfollow(
            params: FollowerUnfollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see unfollow */
        fun unfollow(params: FollowerUnfollowParams): CompletableFuture<HttpResponse> =
            unfollow(params, RequestOptions.none())

        /** @see unfollow */
        fun unfollow(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            unfollow(playlistId, FollowerUnfollowParams.none(), requestOptions)
    }
}
