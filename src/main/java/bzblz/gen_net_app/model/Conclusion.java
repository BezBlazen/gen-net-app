package bzblz.gen_net_app.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Conclusion data type")
public abstract class Conclusion {
    @Schema(description = "Conclusion reference identifier",
            example = "Rid123")
    private String rid;
}
