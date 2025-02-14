package com.ani.sri.traini8.training_center.Model;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    @NotBlank(message = "Detailed Address is required")
    private String detailedAddress;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @Pattern(regexp = "^\\d{6}$", message = "PinCode must be a 6-digit number")
    private String pincode;
}
