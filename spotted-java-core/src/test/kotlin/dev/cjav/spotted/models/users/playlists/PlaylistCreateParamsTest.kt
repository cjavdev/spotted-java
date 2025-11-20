// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.users.playlists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaylistCreateParamsTest {

    @Test
    fun create() {
        PlaylistCreateParams.builder()
            .userId("smedjan")
            .name("New Playlist")
            .pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(true)
            .collaborative(true)
            .description("New playlist description")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PlaylistCreateParams.builder().userId("smedjan").name("New Playlist").build()

        assertThat(params._pathParam(0)).isEqualTo("smedjan")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlaylistCreateParams.builder()
                .userId("smedjan")
                .name("New Playlist")
                .pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(true)
                .collaborative(true)
                .description("New playlist description")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("New Playlist")
        assertThat(body.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished())
            .contains(true)
        assertThat(body.collaborative()).contains(true)
        assertThat(body.description()).contains("New playlist description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlaylistCreateParams.builder().userId("smedjan").name("New Playlist").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("New Playlist")
    }
}
