package com.bentalla.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @NotBlank(message = "Name can not be a null or empty")
    @Size(min = 5 , max = 50, message = "The length of customer name should be between 5 and 50 ")
    @Schema(
            description = "Name of the customer", example = "Ben Talla"
    )
    private String name;

    @NotBlank(message = "Email can not be a null or empty")
    @Email(message = "Email adress should be valide")
    @Schema(
            description = "Email of the customer", example = "bentalla@email.com"
    )
    private String email;

    @NotBlank(message = "Mobile number can not be a null or empty")
    @Pattern(regexp = "^[0-9]{10}$" , message = "Number must be 10 digit ")
    @Schema(
            description = "Mobile number of the customer", example = "1234567890"
    )
    private String mobileNumber;
    private AccountsDto accountsDto;
}
