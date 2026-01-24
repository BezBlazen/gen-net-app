package bzblz.gen_net_app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Account DTO type for sign up.")
public class AccountSignUpDto {
    @Schema(description = "Username for login",
            example = "JohnSmith")
    private String username;

    @Schema(description = "Password")
    private String password;
}