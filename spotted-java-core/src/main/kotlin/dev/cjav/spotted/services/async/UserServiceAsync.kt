// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.users.UserRetrieveProfileParams
import dev.cjav.spotted.models.users.UserRetrieveProfileResponse
import dev.cjav.spotted.services.async.users.PlaylistServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    fun playlists(): PlaylistServiceAsync

    /** Get public profile information about a Spotify user. */
    fun retrieveProfile(userId: String): CompletableFuture<UserRetrieveProfileResponse> =
        retrieveProfile(userId, UserRetrieveProfileParams.none())

    /** @see retrieveProfile */
    fun retrieveProfile(
        userId: String,
        params: UserRetrieveProfileParams = UserRetrieveProfileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRetrieveProfileResponse> =
        retrieveProfile(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieveProfile */
    fun retrieveProfile(
        userId: String,
        params: UserRetrieveProfileParams = UserRetrieveProfileParams.none(),
    ): CompletableFuture<UserRetrieveProfileResponse> =
        retrieveProfile(userId, params, RequestOptions.none())

    /** @see retrieveProfile */
    fun retrieveProfile(
        params: UserRetrieveProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRetrieveProfileResponse>

    /** @see retrieveProfile */
    fun retrieveProfile(
        params: UserRetrieveProfileParams
    ): CompletableFuture<UserRetrieveProfileResponse> =
        retrieveProfile(params, RequestOptions.none())

    /** @see retrieveProfile */
    fun retrieveProfile(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserRetrieveProfileResponse> =
        retrieveProfile(userId, UserRetrieveProfileParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        fun playlists(): PlaylistServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}`, but is otherwise the same as
         * [UserServiceAsync.retrieveProfile].
         */
        fun retrieveProfile(
            userId: String
        ): CompletableFuture<HttpResponseFor<UserRetrieveProfileResponse>> =
            retrieveProfile(userId, UserRetrieveProfileParams.none())

        /** @see retrieveProfile */
        fun retrieveProfile(
            userId: String,
            params: UserRetrieveProfileParams = UserRetrieveProfileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveProfileResponse>> =
            retrieveProfile(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieveProfile */
        fun retrieveProfile(
            userId: String,
            params: UserRetrieveProfileParams = UserRetrieveProfileParams.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveProfileResponse>> =
            retrieveProfile(userId, params, RequestOptions.none())

        /** @see retrieveProfile */
        fun retrieveProfile(
            params: UserRetrieveProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveProfileResponse>>

        /** @see retrieveProfile */
        fun retrieveProfile(
            params: UserRetrieveProfileParams
        ): CompletableFuture<HttpResponseFor<UserRetrieveProfileResponse>> =
            retrieveProfile(params, RequestOptions.none())

        /** @see retrieveProfile */
        fun retrieveProfile(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserRetrieveProfileResponse>> =
            retrieveProfile(userId, UserRetrieveProfileParams.none(), requestOptions)
    }
}
