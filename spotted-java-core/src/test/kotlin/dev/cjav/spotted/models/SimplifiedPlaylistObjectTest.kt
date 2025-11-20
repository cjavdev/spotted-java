// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplifiedPlaylistObjectTest {

    @Test
    fun create() {
        val simplifiedPlaylistObject =
            SimplifiedPlaylistObject.builder()
                .id("id")
                .collaborative(true)
                .description("description")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .name("name")
                .owner(
                    SimplifiedPlaylistObject.Owner.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .type(PlaylistUserObject.Type.USER)
                        .uri("uri")
                        .displayName("display_name")
                        .build()
                )
                .published(true)
                .snapshotId("snapshot_id")
                .tracks(PlaylistTracksRefObject.builder().href("href").total(0L).build())
                .type("type")
                .uri("uri")
                .build()

        assertThat(simplifiedPlaylistObject.id()).contains("id")
        assertThat(simplifiedPlaylistObject.collaborative()).contains(true)
        assertThat(simplifiedPlaylistObject.description()).contains("description")
        assertThat(simplifiedPlaylistObject.externalUrls())
            .contains(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(simplifiedPlaylistObject.href()).contains("href")
        assertThat(simplifiedPlaylistObject.images().getOrNull())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(simplifiedPlaylistObject.name()).contains("name")
        assertThat(simplifiedPlaylistObject.owner())
            .contains(
                SimplifiedPlaylistObject.Owner.builder()
                    .id("id")
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .type(PlaylistUserObject.Type.USER)
                    .uri("uri")
                    .displayName("display_name")
                    .build()
            )
        assertThat(simplifiedPlaylistObject.published()).contains(true)
        assertThat(simplifiedPlaylistObject.snapshotId()).contains("snapshot_id")
        assertThat(simplifiedPlaylistObject.tracks())
            .contains(PlaylistTracksRefObject.builder().href("href").total(0L).build())
        assertThat(simplifiedPlaylistObject.type()).contains("type")
        assertThat(simplifiedPlaylistObject.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplifiedPlaylistObject =
            SimplifiedPlaylistObject.builder()
                .id("id")
                .collaborative(true)
                .description("description")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .name("name")
                .owner(
                    SimplifiedPlaylistObject.Owner.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .type(PlaylistUserObject.Type.USER)
                        .uri("uri")
                        .displayName("display_name")
                        .build()
                )
                .published(true)
                .snapshotId("snapshot_id")
                .tracks(PlaylistTracksRefObject.builder().href("href").total(0L).build())
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedSimplifiedPlaylistObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplifiedPlaylistObject),
                jacksonTypeRef<SimplifiedPlaylistObject>(),
            )

        assertThat(roundtrippedSimplifiedPlaylistObject).isEqualTo(simplifiedPlaylistObject)
    }
}
