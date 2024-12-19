package ie.atu.budgifyremasted;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "users")
public class User {

    @Id
    @NotNull(message = "User Id cant be blank")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "users_id")
    private Long id;

    @NotBlank(message = "name cannot be blank")
    @Column(name= "name")
    private String name;

    @NotBlank(message = "Username cannot be blank")
    @Column(name= "username")
    private String username;
    
    @Column(name= "email")
    @Email(message = "email cant be blank")
    private String email;

    @Size(max = 24, min = 4, message = "Password cannot be blank, more than 24 characters and less than 8 characters")
    @Column(name= "password")
    private String password;

    @Column(name= "country")
    @NotBlank(message = "Country cannot be blank")
    private String country;

    @Column(name= "gender")
    //@Pattern(regexp = "male" + "female", message = "Gender cannot be blank")
    private String gender;

    @Column(name= "subscription_id")
    //@Pattern(regexp = "Student" + "Family" + "Free" + "Solo" + "Duo", message = "Gender cannot be blank")
    private String subscription_id;

    @Column(name= "Parental_controls")
    private String Parental_controls;

    @PositiveOrZero(message= "Wrong")
    @Column(name= "Date_of_birth")
    private int Date_Of_Birth;

    @Column(name= "phone_number")
    private String phone_number;

    @Column(name= "marketing")
    private String marketing;

}