package bzblz.gen_net_app.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "NamePart data type is used to model a portion of a full name.")
public class NamePart {
    @Schema(description = "Enumerated value identifying the type of the name part.",
            example = "http://gna.bzblz/Surname")
    private String type;

    @Schema(description = "The term(s) from the name that make up this name part.",
            example = "Smith")
    private String value;
}
