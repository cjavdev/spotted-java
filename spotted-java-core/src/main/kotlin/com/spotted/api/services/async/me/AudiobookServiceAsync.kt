// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.audiobooks.AudiobookCheckParams
import com.spotted.api.models.me.audiobooks.AudiobookListPageAsync
import com.spotted.api.models.me.audiobooks.AudiobookListParams
import com.spotted.api.models.me.audiobooks.AudiobookRemoveParams
import com.spotted.api.models.me.audiobooks.AudiobookSaveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AudiobookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudiobookServiceAsync

    /** Get a list of the audiobooks saved in the current Spotify user's 'Your Music' library. */
    fun list(): CompletableFuture<AudiobookListPageAsync> = list(AudiobookListParams.none())

    /** @see list */
    fun list(
        params: AudiobookListParams = AudiobookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudiobookListPageAsync>

    /** @see list */
    fun list(
        params: AudiobookListParams = AudiobookListParams.none()
    ): CompletableFuture<AudiobookListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AudiobookListPageAsync> =
        list(AudiobookListParams.none(), requestOptions)

    /** Check if one or more audiobooks are already saved in the current Spotify user's library. */
    fun check(params: AudiobookCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        params: AudiobookCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /** Remove one or more audiobooks from the Spotify user's library. */
    fun remove(params: AudiobookRemoveParams): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: AudiobookRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Save one or more audiobooks to the current Spotify user's library. */
    fun save(params: AudiobookSaveParams): CompletableFuture<Void?> =
        save(params, RequestOptions.none())

    /** @see save */
    fun save(
        params: AudiobookSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AudiobookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudiobookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AudiobookListPageAsync>> =
            list(AudiobookListParams.none())

        /** @see list */
        fun list(
            params: AudiobookListParams = AudiobookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudiobookListPageAsync>>

        /** @see list */
        fun list(
            params: AudiobookListParams = AudiobookListParams.none()
        ): CompletableFuture<HttpResponseFor<AudiobookListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AudiobookListPageAsync>> =
            list(AudiobookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/audiobooks/contains`, but is otherwise the same
         * as [AudiobookServiceAsync.check].
         */
        fun check(params: AudiobookCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            params: AudiobookCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `delete /me/audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.remove].
         */
        fun remove(params: AudiobookRemoveParams): CompletableFuture<HttpResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: AudiobookRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /me/audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.save].
         */
        fun save(params: AudiobookSaveParams): CompletableFuture<HttpResponse> =
            save(params, RequestOptions.none())

        /** @see save */
        fun save(
            params: AudiobookSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
