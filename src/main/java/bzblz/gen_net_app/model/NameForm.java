package bzblz.gen_net_app.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "The NameForm data type defines a representation of a name.")
public class NameForm {
    @Schema(description = "A full rendering of the name (or as much of the name as is known).",
            example = "John Smith")
    private String fullText;

    @Schema(description = "Any identified name parts from the name.")
    private List<NamePart> parts;
}
