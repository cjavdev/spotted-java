// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.playlists

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.ImageObject
import com.spotted.api.models.playlists.images.ImageListParams
import com.spotted.api.models.playlists.images.ImageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ImageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImageServiceAsync

    /** Replace the image used to represent a specific playlist. */
    fun update(playlistId: String, params: ImageUpdateParams): CompletableFuture<Void?> =
        update(playlistId, params, RequestOptions.none())

    /** @see update */
    fun update(
        playlistId: String,
        params: ImageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    fun update(params: ImageUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ImageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get the current image associated with a specific playlist. */
    fun list(playlistId: String): CompletableFuture<List<ImageObject>> =
        list(playlistId, ImageListParams.none())

    /** @see list */
    fun list(
        playlistId: String,
        params: ImageListParams = ImageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ImageObject>> =
        list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see list */
    fun list(
        playlistId: String,
        params: ImageListParams = ImageListParams.none(),
    ): CompletableFuture<List<ImageObject>> = list(playlistId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ImageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ImageObject>>

    /** @see list */
    fun list(params: ImageListParams): CompletableFuture<List<ImageObject>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        playlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ImageObject>> =
        list(playlistId, ImageListParams.none(), requestOptions)

    /** A view of [ImageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ImageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}/images`, but is otherwise
         * the same as [ImageServiceAsync.update].
         */
        fun update(playlistId: String, params: ImageUpdateParams): CompletableFuture<HttpResponse> =
            update(playlistId, params, RequestOptions.none())

        /** @see update */
        fun update(
            playlistId: String,
            params: ImageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        fun update(params: ImageUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ImageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}/images`, but is otherwise
         * the same as [ImageServiceAsync.list].
         */
        fun list(playlistId: String): CompletableFuture<HttpResponseFor<List<ImageObject>>> =
            list(playlistId, ImageListParams.none())

        /** @see list */
        fun list(
            playlistId: String,
            params: ImageListParams = ImageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageObject>>> =
            list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see list */
        fun list(
            playlistId: String,
            params: ImageListParams = ImageListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageObject>>> =
            list(playlistId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ImageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageObject>>>

        /** @see list */
        fun list(params: ImageListParams): CompletableFuture<HttpResponseFor<List<ImageObject>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ImageObject>>> =
            list(playlistId, ImageListParams.none(), requestOptions)
    }
}
