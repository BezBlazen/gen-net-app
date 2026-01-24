package bzblz.gen_net_app.model;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.UUID;

@Data
@Document(collection = "projects")
@Schema(description = "The Project data type.")
public class Project {

    @Schema(description = "Project UUID.",
            example = "de9727cb-54f1-455b-adeb-2546240170d5")
    @Id
    @GeneratedUUID
    private UUID id;

    @Schema(description = "Project data version.",
            example = "1")
    @Version
    private Integer version;

    @Schema(description = "Project creation date.")
    @CreatedDate
    private Date createdAt;

    @Schema(description = "Project owner account UUID.",
            example = "d531dcd2-c206-439c-a7f3-213becee8520")
    @Indexed
    private UUID accountId;

    @Schema(description = "Project title",
            example = "Smith")
    @NotEmpty(message = "Title should not be empty")
    private String title;

    public Project(String title, UUID accountId) {
        this.title = title;
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", accountId=" + accountId +
                '}';
    }
}
