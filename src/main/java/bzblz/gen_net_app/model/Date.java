package bzblz.gen_net_app.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

//@Document(collection = "facts")
@Data
@Schema(description = "The Date data type defines a genealogical date.")
public class Date {
    @Schema(description = "The original value of the date as supplied by the contributor.",
            example = "January 1777")
    private String original;
    @Schema(description = "The standardized formal value of the date, formatted according to the GEDCOM X Date Format specification.",
            example = "1492-07-27")

    private String formal;
}
