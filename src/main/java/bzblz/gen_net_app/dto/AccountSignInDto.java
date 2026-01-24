package bzblz.gen_net_app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Account DTO type for sign in.")
public class AccountSignInDto {
    @Schema(description = "Username for login",
            example = "JohnSmith")
    private String username;

    @Schema(description = "Password")
    private String password;
}
