package ie.atu.budgifyremasted;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @NotNull(message = "User Id cant be blank")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "Username cannot be blank")
    private String username;

    @Email(message = "email cant be blank")
    private String email;

    @PositiveOrZero(message = "age must be greater or equal to 0")
    private int age;

    @Size(max = 24, min = 8, message = "Password cannot be blank, more than 24 characters and less than 8 characters")
    private String password;

    @NotBlank(message = "Country cannot be blank")
    private String country;

    //@Pattern(regexp = "male" + "female", message = "Gender cannot be blank")
    private String gender;

    //@Pattern(regexp = "Student" + "Family" + "Free" + "Solo" + "Duo", message = "Gender cannot be blank")
    private String subscriptionId;

}