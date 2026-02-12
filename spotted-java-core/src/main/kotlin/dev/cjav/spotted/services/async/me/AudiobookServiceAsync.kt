// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.audiobooks.AudiobookCheckParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookListPageAsync
import dev.cjav.spotted.models.me.audiobooks.AudiobookListParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookRemoveParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookSaveParams
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

    /**
     * Check if one or more audiobooks are already saved in the current Spotify user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Check User's Saved Items](/documentation/web-api/reference/check-library-contains) instead.
     */
    @Deprecated("deprecated")
    fun check(params: AudiobookCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    @Deprecated("deprecated")
    fun check(
        params: AudiobookCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /**
     * Remove one or more audiobooks from the Spotify user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Remove Items from Library](/documentation/web-api/reference/remove-library-items) instead.
     */
    @Deprecated("deprecated")
    fun remove(params: AudiobookRemoveParams): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(
        params: AudiobookRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Save one or more audiobooks to the current Spotify user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Save Items to Library](/documentation/web-api/reference/save-library-items) instead.
     */
    @Deprecated("deprecated")
    fun save(params: AudiobookSaveParams): CompletableFuture<Void?> =
        save(params, RequestOptions.none())

    /** @see save */
    @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        fun check(params: AudiobookCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        @Deprecated("deprecated")
        fun check(
            params: AudiobookCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `delete /me/audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.remove].
         */
        @Deprecated("deprecated")
        fun remove(params: AudiobookRemoveParams): CompletableFuture<HttpResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(
            params: AudiobookRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /me/audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.save].
         */
        @Deprecated("deprecated")
        fun save(params: AudiobookSaveParams): CompletableFuture<HttpResponse> =
            save(params, RequestOptions.none())

        /** @see save */
        @Deprecated("deprecated")
        fun save(
            params: AudiobookSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
