package bzblz.gen_net_app.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "persons")
@Schema(description = "The Person data type defines a description of a person.",
        allOf = {Subject.class})
public class Person extends Subject {

    @Schema(description = "Person UUID",
            example = "c06efa6e-506a-4bb7-a819-8fd1db6b383d")
    @Id
    @GeneratedUUID
    private UUID id;

    @Schema(description = "Project UUID",
            example = "de9727cb-54f1-455b-adeb-2546240170d5")
    @Indexed
    private UUID projectId;

    @Schema(description = "Project data version.",
            example = "1")
    @Version
    private Integer version;

    @Schema(description = "Project creation date.")
    @CreatedDate
    private Date createdAt;

    @Schema(description = "The sex of the person as assigned at birth.")
    private Gender gender;

    @Schema(description = "The names of the person.")
    private List<Name> names;

    @Schema(description = "The facts of the person.")
    private List<Fact> facts;
}
