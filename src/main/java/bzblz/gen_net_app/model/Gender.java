package bzblz.gen_net_app.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "The Gender data type defines a gender of a person.")
public class Gender extends Conclusion {
    @Schema(description = "Enumerated value identifying the gender.",
            example = "http://gna.bzblz/Male")
    private String type;
}
