// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.shows.ShowCheckParams
import dev.cjav.spotted.models.me.shows.ShowListPage
import dev.cjav.spotted.models.me.shows.ShowListParams
import dev.cjav.spotted.models.me.shows.ShowRemoveParams
import dev.cjav.spotted.models.me.shows.ShowSaveParams
import java.util.function.Consumer

interface ShowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShowService

    /**
     * Get a list of shows saved in the current Spotify user's library. Optional parameters can be
     * used to limit the number of shows returned.
     */
    fun list(): ShowListPage = list(ShowListParams.none())

    /** @see list */
    fun list(
        params: ShowListParams = ShowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowListPage

    /** @see list */
    fun list(params: ShowListParams = ShowListParams.none()): ShowListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ShowListPage =
        list(ShowListParams.none(), requestOptions)

    /**
     * Check if one or more shows is already saved in the current Spotify user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Check User's Saved Items](/documentation/web-api/reference/check-library-contains) instead.
     */
    @Deprecated("deprecated")
    fun check(params: ShowCheckParams): List<Boolean> = check(params, RequestOptions.none())

    /** @see check */
    @Deprecated("deprecated")
    fun check(
        params: ShowCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /**
     * Delete one or more shows from current Spotify user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Remove Items from Library](/documentation/web-api/reference/remove-library-items) instead.
     */
    @Deprecated("deprecated") fun remove() = remove(ShowRemoveParams.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(
        params: ShowRemoveParams = ShowRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(params: ShowRemoveParams = ShowRemoveParams.none()) =
        remove(params, RequestOptions.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(requestOptions: RequestOptions) = remove(ShowRemoveParams.none(), requestOptions)

    /**
     * Save one or more shows to current Spotify user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Save Items to Library](/documentation/web-api/reference/save-library-items) instead.
     */
    @Deprecated("deprecated") fun save() = save(ShowSaveParams.none())

    /** @see save */
    @Deprecated("deprecated")
    fun save(
        params: ShowSaveParams = ShowSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see save */
    @Deprecated("deprecated")
    fun save(params: ShowSaveParams = ShowSaveParams.none()) = save(params, RequestOptions.none())

    /** @see save */
    @Deprecated("deprecated")
    fun save(requestOptions: RequestOptions) = save(ShowSaveParams.none(), requestOptions)

    /** A view of [ShowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/shows`, but is otherwise the same as
         * [ShowService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ShowListPage> = list(ShowListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ShowListParams = ShowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ShowListParams = ShowListParams.none()): HttpResponseFor<ShowListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ShowListPage> =
            list(ShowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/shows/contains`, but is otherwise the same as
         * [ShowService.check].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun check(params: ShowCheckParams): HttpResponseFor<List<Boolean>> =
            check(params, RequestOptions.none())

        /** @see check */
        @Deprecated("deprecated")
        @MustBeClosed
        fun check(
            params: ShowCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/shows`, but is otherwise the same as
         * [ShowService.remove].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(): HttpResponse = remove(ShowRemoveParams.none())

        /** @see remove */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(
            params: ShowRemoveParams = ShowRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see remove */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(params: ShowRemoveParams = ShowRemoveParams.none()): HttpResponse =
            remove(params, RequestOptions.none())

        /** @see remove */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(requestOptions: RequestOptions): HttpResponse =
            remove(ShowRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/shows`, but is otherwise the same as
         * [ShowService.save].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun save(): HttpResponse = save(ShowSaveParams.none())

        /** @see save */
        @Deprecated("deprecated")
        @MustBeClosed
        fun save(
            params: ShowSaveParams = ShowSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see save */
        @Deprecated("deprecated")
        @MustBeClosed
        fun save(params: ShowSaveParams = ShowSaveParams.none()): HttpResponse =
            save(params, RequestOptions.none())

        /** @see save */
        @Deprecated("deprecated")
        @MustBeClosed
        fun save(requestOptions: RequestOptions): HttpResponse =
            save(ShowSaveParams.none(), requestOptions)
    }
}
