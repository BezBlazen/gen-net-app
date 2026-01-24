package bzblz.gen_net_app.model;

import bzblz.gen_net_app.dto.UriDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;
import java.util.List;
@Schema(description = "Known Name Part Types",
        enumAsRef = true)
public enum NamePartType {
    @Schema(description = "Заказ создан", example = "CREATED")
    @JsonProperty("http://gna.bzblz/Prefix")
    Prefix("http://gna.bzblz/Prefix", "Prefix", "A name prefix."),
    @JsonProperty("http://gna.bzblz/Suffix")
    Suffix("http://gna.bzblz/Suffix", "Suffix", "A name suffix."),
    @JsonProperty("http://gna.bzblz/Given")
    Given("http://gna.bzblz/Given", "Given", "A given name."),
    @JsonProperty("http://gna.bzblz/Surname")
    Surname("http://gna.bzblz/Surname", "Surname", "A surname.");

    private final UriDto uriDto;

    NamePartType(String uri, String title, String description) {
        this.uriDto = new UriDto(uri, title, description);
    }

    public static List<UriDto> toUriDtoArray() {
        return Arrays.stream(values())
                .map(e -> e.uriDto)
                .toList();
    }
}
