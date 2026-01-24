package bzblz.gen_net_app.model;

import bzblz.gen_net_app.dto.UriDto;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;
import java.util.List;

@Schema(description = "Known Name Types")
public enum NameType {
    BirthName("http://gna.bzblz/BirthName", "Birth Name", "Name given at birth"),
    DeathName("http://gna.bzblz/DeathName", "Death Name", "Name used at the time of death"),
    MarriedName("http://gna.bzblz/MarriedName", "Married Name", "Name accepted at marriage"),
    AlsoKnownAs("http://gna.bzblz/AlsoKnownAs", "AlsoKnownAs Name", "\"Also known as\" name"),
    Nickname("http://gna.bzblz/Nickname", "Nickname", "Nickname"),
    AdoptiveName("http://gna.bzblz/AdoptiveName", "Adoptive Name", "Name given at adoption"),
    FormalName("http://gna.bzblz/FormalName", "Formal Name", "A formal name, usually given to distinguish it from a name more commonly used"),
    ReligiousName("http://gna.bzblz/ReligiousName", "Religious Name", "A name given at a religious rite or ceremony");

    private final UriDto uriDto;

    NameType(String uri, String title, String description) {
        this.uriDto = new UriDto(uri, title, description);
    }

    public static List<UriDto> toUriDtoArray() {
        return Arrays.stream(values())
                .map(e -> e.uriDto)
                .toList();
    }
}
