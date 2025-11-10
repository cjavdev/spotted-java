// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.following.FollowingBulkRetrieveParams
import com.spotted.api.models.me.following.FollowingBulkRetrieveResponse
import com.spotted.api.models.me.following.FollowingCheckParams
import com.spotted.api.models.me.following.FollowingFollowParams
import com.spotted.api.models.me.following.FollowingUnfollowParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FollowingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FollowingServiceAsync

    /** Get the current user's followed artists. */
    fun bulkRetrieve(
        params: FollowingBulkRetrieveParams
    ): CompletableFuture<FollowingBulkRetrieveResponse> =
        bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    fun bulkRetrieve(
        params: FollowingBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FollowingBulkRetrieveResponse>

    /** Check to see if the current user is following one or more artists or other Spotify users. */
    fun check(params: FollowingCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        params: FollowingCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /** Add the current user as a follower of one or more artists or other Spotify users. */
    fun follow(params: FollowingFollowParams): CompletableFuture<Void?> =
        follow(params, RequestOptions.none())

    /** @see follow */
    fun follow(
        params: FollowingFollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Remove the current user as a follower of one or more artists or other Spotify users. */
    fun unfollow(): CompletableFuture<Void?> = unfollow(FollowingUnfollowParams.none())

    /** @see unfollow */
    fun unfollow(
        params: FollowingUnfollowParams = FollowingUnfollowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see unfollow */
    fun unfollow(
        params: FollowingUnfollowParams = FollowingUnfollowParams.none()
    ): CompletableFuture<Void?> = unfollow(params, RequestOptions.none())

    /** @see unfollow */
    fun unfollow(requestOptions: RequestOptions): CompletableFuture<Void?> =
        unfollow(FollowingUnfollowParams.none(), requestOptions)

    /**
     * A view of [FollowingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FollowingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/following`, but is otherwise the same as
         * [FollowingServiceAsync.bulkRetrieve].
         */
        fun bulkRetrieve(
            params: FollowingBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<FollowingBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        fun bulkRetrieve(
            params: FollowingBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FollowingBulkRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /me/following/contains`, but is otherwise the same
         * as [FollowingServiceAsync.check].
         */
        fun check(params: FollowingCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            params: FollowingCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `put /me/following`, but is otherwise the same as
         * [FollowingServiceAsync.follow].
         */
        fun follow(params: FollowingFollowParams): CompletableFuture<HttpResponse> =
            follow(params, RequestOptions.none())

        /** @see follow */
        fun follow(
            params: FollowingFollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /me/following`, but is otherwise the same as
         * [FollowingServiceAsync.unfollow].
         */
        fun unfollow(): CompletableFuture<HttpResponse> = unfollow(FollowingUnfollowParams.none())

        /** @see unfollow */
        fun unfollow(
            params: FollowingUnfollowParams = FollowingUnfollowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see unfollow */
        fun unfollow(
            params: FollowingUnfollowParams = FollowingUnfollowParams.none()
        ): CompletableFuture<HttpResponse> = unfollow(params, RequestOptions.none())

        /** @see unfollow */
        fun unfollow(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            unfollow(FollowingUnfollowParams.none(), requestOptions)
    }
}
