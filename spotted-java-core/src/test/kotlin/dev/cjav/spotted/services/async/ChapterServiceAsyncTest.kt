// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChapterServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val chapterServiceAsync = client.chapters()

        val chapterFuture =
            chapterServiceAsync.retrieve(
                ChapterRetrieveParams.builder().id("0D5wENdkdwbqlrHoaJ9g29").market("ES").build()
            )

        val chapter = chapterFuture.get()
        chapter.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val chapterServiceAsync = client.chapters()

        val responseFuture =
            chapterServiceAsync.bulkRetrieve(
                ChapterBulkRetrieveParams.builder()
                    .ids("0IsXVP0JmcB2adSE338GkK,3ZXb8FKZGU0EHALYX6uCzU,0D5wENdkdwbqlrHoaJ9g29")
                    .market("ES")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
