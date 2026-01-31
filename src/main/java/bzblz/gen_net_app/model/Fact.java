package bzblz.gen_net_app.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "facts")
@Data
@Schema(description = "The Fact data type defines a data item that is presumed to be true about a specific subject, such as a person or relationship.")
public class Fact {
    @Schema(description = "Enumerated value identifying the type of the fact.",
            example = "http://gna.bzblz/PersonFactType/Birth")
    private String type;
    @Schema(description = "The date of applicability of the fact.")
    private Date date;
}
