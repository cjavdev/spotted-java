// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.albums

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumSaveParamsTest {

    @Test
    fun create() {
        AlbumSaveParams.builder().addId("string").published(true).build()
    }

    @Test
    fun body() {
        val params = AlbumSaveParams.builder().addId("string").published(true).build()

        val body = params._body()

        assertThat(body.ids().getOrNull()).containsExactly("string")
        assertThat(body.published()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AlbumSaveParams.builder().build()

        val body = params._body()
    }
}
