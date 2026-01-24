package bzblz.gen_net_app.model;

import bzblz.gen_net_app.dto.UriDto;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;
import java.util.List;

@Schema(description = "Known Gender Types")
public enum GenderType {
    Male("http://gna.bzblz/Male", "Male", "Male gender."),
    Female("http://gna.bzblz/Female", "Female", "Female gender."),
    Unknown("http://gna.bzblz/Unknown", "Unknown", "Unknown gender.");

    private final UriDto uriDto;

    GenderType(String uri, String title, String description) {
        this.uriDto = new UriDto(uri, title, description);
    }

    public static List<UriDto> toUriDtoArray() {
        return Arrays.stream(values())
                .map(e -> e.uriDto)
                .toList();
    }
}
