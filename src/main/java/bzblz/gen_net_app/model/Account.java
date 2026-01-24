package bzblz.gen_net_app.model;

import bzblz.gen_net_app.dto.AccountSignInDto;
import bzblz.gen_net_app.dto.AccountSignUpDto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.UUID;

@Data
@Document(collection = "accounts")
@Schema(description = "The Account data type.")
public class Account implements Cloneable {
    @Schema(description = "Account UUID",
            example = "c06efa6e-506a-4bb7-a819-8fd1db6b383d")
    @Id
    @GeneratedUUID
    private UUID id;

    @Schema(description = "Account data version.",
            example = "1")
    @Version
    private Integer version;

    @Schema(description = "Account creation date.")
    @CreatedDate
    private Date createdAt;

    @Schema(description = "Username for login",
            example = "JohnSmith")
    @Size(min = 6, max = 64, message = "Username - Length from 6 to 64")
    @NotBlank(message = "Username required")
    private String username;

    @Schema(description = "Password")
    @Size(min = 6, max = 64, message = "Password - Length from 6 to 64")
    @NotBlank(message = "Password required")
    private String password;

    @Schema(description = "Email.")
    @Email
    private String email;

    @Schema(description = "Account role",
            implementation = AccountRoleType.class,
            enumAsRef = true)
    private AccountRoleType roleType;

    public Account() {
    }
    public Account(@NonNull AccountSignUpDto accountSignUpDto) {
        this.username = accountSignUpDto.getUsername();
        this.password = accountSignUpDto.getPassword();
    }
    public Account(@NonNull AccountSignInDto accountSignInDto) {
        this.username = accountSignInDto.getUsername();
        this.password = accountSignInDto.getPassword();
    }
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Account(String username, String password, AccountRoleType roleType) {
        this.username = username;
        this.password = password;
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return "Account {" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountRole='" + (roleType != null ? roleType.name() : null) + '\'' +
                '}';
    }

    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

