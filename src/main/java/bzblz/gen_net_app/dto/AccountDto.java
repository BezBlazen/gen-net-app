package bzblz.gen_net_app.dto;

import bzblz.gen_net_app.model.Account;
import bzblz.gen_net_app.model.AccountRoleType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "Account DTO type for response")
public class AccountDto {
    @Schema(description = "Username for login",
            example = "JohnSmith")
    private String username;

    @Schema(description = "Account role type")
    private AccountRoleType roleType;

    public AccountDto(Account account) {
        this.username = account.getUsername();
        this.roleType = account.getRoleType();
    }
}
