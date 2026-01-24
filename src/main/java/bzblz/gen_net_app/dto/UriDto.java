package bzblz.gen_net_app.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Common URI data")
public record UriDto(
        @Schema(description = "URI value"
                ,example = "http://gna.bzblz/Male")
        String uri,
        @Schema(description = "URI title"
                ,example = "Male")
        String title,
        @Schema(description = "URI description"
                ,example = "Male gender.")
        String description
) {
}
