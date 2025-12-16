// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audioanalysis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimeIntervalObjectTest {

    @Test
    fun create() {
        val timeIntervalObject =
            TimeIntervalObject.builder()
                .confidence(0.925)
                .duration(2.18749)
                .published(true)
                .start(0.49567)
                .build()

        assertThat(timeIntervalObject.confidence()).contains(0.925)
        assertThat(timeIntervalObject.duration()).contains(2.18749)
        assertThat(timeIntervalObject.published()).contains(true)
        assertThat(timeIntervalObject.start()).contains(0.49567)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timeIntervalObject =
            TimeIntervalObject.builder()
                .confidence(0.925)
                .duration(2.18749)
                .published(true)
                .start(0.49567)
                .build()

        val roundtrippedTimeIntervalObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timeIntervalObject),
                jacksonTypeRef<TimeIntervalObject>(),
            )

        assertThat(roundtrippedTimeIntervalObject).isEqualTo(timeIntervalObject)
    }
}
