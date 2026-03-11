package io.kestra.plugin.slack.app.models;

import io.kestra.core.models.annotations.PluginProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@Schema(
    title = "Canvas output"
)
public class CanvasOutput implements io.kestra.core.models.tasks.Output {
    @Schema(title = "Canvas ID")
    @NotNull
    @PluginProperty
    String canvasId;

    public static CanvasOutput of(String canvasId) {
        return CanvasOutput.builder()
            .canvasId(canvasId)
            .build();
    }
}
