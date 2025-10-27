// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.episodes.EpisodeCheckParams
import com.spotted.api.models.me.episodes.EpisodeListPageAsync
import com.spotted.api.models.me.episodes.EpisodeListParams
import com.spotted.api.models.me.episodes.EpisodeRemoveParams
import com.spotted.api.models.me.episodes.EpisodeSaveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EpisodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EpisodeServiceAsync

    /**
     * Get a list of the episodes saved in the current Spotify user's library.<br/> This API
     * endpoint is in __beta__ and could change without warning. Please share any feedback that you
     * have, or issues that you discover, in our
     * [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer).
     */
    fun list(): CompletableFuture<EpisodeListPageAsync> = list(EpisodeListParams.none())

    /** @see list */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeListPageAsync>

    /** @see list */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none()
    ): CompletableFuture<EpisodeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EpisodeListPageAsync> =
        list(EpisodeListParams.none(), requestOptions)

    /**
     * Check if one or more episodes is already saved in the current Spotify user's 'Your Episodes'
     * library.<br/> This API endpoint is in __beta__ and could change without warning. Please share
     * any feedback that you have, or issues that you discover, in our
     * [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer)..
     */
    fun check(params: EpisodeCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        params: EpisodeCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /**
     * Remove one or more episodes from the current user's library.<br/> This API endpoint is in
     * __beta__ and could change without warning. Please share any feedback that you have, or issues
     * that you discover, in our
     * [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer).
     */
    fun remove(params: EpisodeRemoveParams): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: EpisodeRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Save one or more episodes to the current user's library.<br/> This API endpoint is in
     * __beta__ and could change without warning. Please share any feedback that you have, or issues
     * that you discover, in our
     * [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer).
     */
    fun save(params: EpisodeSaveParams): CompletableFuture<Void?> =
        save(params, RequestOptions.none())

    /** @see save */
    fun save(
        params: EpisodeSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EpisodeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EpisodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(EpisodeListParams.none())

        /** @see list */
        fun list(
            params: EpisodeListParams = EpisodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>>

        /** @see list */
        fun list(
            params: EpisodeListParams = EpisodeListParams.none()
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(EpisodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/episodes/contains`, but is otherwise the same as
         * [EpisodeServiceAsync.check].
         */
        fun check(params: EpisodeCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            params: EpisodeCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `delete /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.remove].
         */
        fun remove(params: EpisodeRemoveParams): CompletableFuture<HttpResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: EpisodeRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.save].
         */
        fun save(params: EpisodeSaveParams): CompletableFuture<HttpResponse> =
            save(params, RequestOptions.none())

        /** @see save */
        fun save(
            params: EpisodeSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
