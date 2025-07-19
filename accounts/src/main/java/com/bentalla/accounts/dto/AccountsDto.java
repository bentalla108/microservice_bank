package com.bentalla.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    @NotBlank(message = "Account number can not be a null or empty")
    @Pattern(regexp = "^[0-9]{10}$" , message = "Number must be 10 digit ")
    @Schema(
            description = "Account Number of Eazy Bank account", example = "3454433243"
    )
    private Long accountNumber;
    @NotBlank(message = "Account type can not be a null or empty")
    @Schema(
            description = "Account Type of  Bank account", example = "Saving"
    )
    private String accountType;
    @NotBlank(message = "Branch address can not be a null or empty")
    @Schema(
            description = "Branch address  Bank account", example = "PA U 5 Rue de developper"
    )
    private String branchAddress;
}
