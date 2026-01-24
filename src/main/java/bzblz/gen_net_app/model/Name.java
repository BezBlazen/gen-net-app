package bzblz.gen_net_app.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.UUID;

@Data
@Schema(description = "A Name is intended to represent a single variant of a person's name.")
public class Name {
    @Schema(description = "Enumerated value identifying the name type.",
            example = "http://gna.bzblz/BirthName")
    private String type;

    @Schema(description = "The name form(s) that best express this name, usually representations considered proper and well formed in the person's native, historical cultural context.")
    private List<NameForm> nameForms;
}
