// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceObjectTest {

    @Test
    fun create() {
        val deviceObject =
            DeviceObject.builder()
                .id("id")
                .isActive(true)
                .isPrivateSession(true)
                .isRestricted(true)
                .name("Kitchen speaker")
                .published(true)
                .supportsVolume(true)
                .type("computer")
                .volumePercent(59L)
                .build()

        assertThat(deviceObject.id()).contains("id")
        assertThat(deviceObject.isActive()).contains(true)
        assertThat(deviceObject.isPrivateSession()).contains(true)
        assertThat(deviceObject.isRestricted()).contains(true)
        assertThat(deviceObject.name()).contains("Kitchen speaker")
        assertThat(deviceObject.published()).contains(true)
        assertThat(deviceObject.supportsVolume()).contains(true)
        assertThat(deviceObject.type()).contains("computer")
        assertThat(deviceObject.volumePercent()).contains(59L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deviceObject =
            DeviceObject.builder()
                .id("id")
                .isActive(true)
                .isPrivateSession(true)
                .isRestricted(true)
                .name("Kitchen speaker")
                .published(true)
                .supportsVolume(true)
                .type("computer")
                .volumePercent(59L)
                .build()

        val roundtrippedDeviceObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deviceObject),
                jacksonTypeRef<DeviceObject>(),
            )

        assertThat(roundtrippedDeviceObject).isEqualTo(deviceObject)
    }
}
