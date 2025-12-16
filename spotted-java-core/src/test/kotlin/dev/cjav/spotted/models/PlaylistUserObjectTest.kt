// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaylistUserObjectTest {

    @Test
    fun create() {
        val playlistUserObject =
            PlaylistUserObject.builder()
                .id("id")
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .published(true)
                .type(PlaylistUserObject.Type.USER)
                .uri("uri")
                .build()

        assertThat(playlistUserObject.id()).contains("id")
        assertThat(playlistUserObject.externalUrls())
            .contains(ExternalUrlObject.builder().published(true).spotify("spotify").build())
        assertThat(playlistUserObject.href()).contains("href")
        assertThat(playlistUserObject.published()).contains(true)
        assertThat(playlistUserObject.type()).contains(PlaylistUserObject.Type.USER)
        assertThat(playlistUserObject.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playlistUserObject =
            PlaylistUserObject.builder()
                .id("id")
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .published(true)
                .type(PlaylistUserObject.Type.USER)
                .uri("uri")
                .build()

        val roundtrippedPlaylistUserObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playlistUserObject),
                jacksonTypeRef<PlaylistUserObject>(),
            )

        assertThat(roundtrippedPlaylistUserObject).isEqualTo(playlistUserObject)
    }
}
