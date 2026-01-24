package bzblz.gen_net_app.model;

import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "Account role type",
        enumAsRef = true)
public enum AccountRoleType {
    @Schema(description = "Session account role type, used temporary, while account not created.")
    ROLE_SESSION,
    @Schema(description = "Default account role type")
    ROLE_USER;
}
