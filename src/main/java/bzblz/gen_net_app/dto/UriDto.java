package bzblz.gen_net_app.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Common URI data")
public record UriDto(
        @Schema(description = "URI value"
                ,example = "http://gna.bzblz/NameType/BirthName")
        String uri,
        @Schema(description = "URI title"
                ,example = "Birth Name")
        String title,
        @Schema(description = "URI description"
                ,example = "Name given at birth")
        String description
) {
}
