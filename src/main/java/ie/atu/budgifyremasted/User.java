package ie.atu.budgifyremasted;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "users")
public class User {

    @Id
    @NotNull(message = "User Id cant be blank")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "users_Id")
    private Long user_Id;

    @NotBlank(message = "name cannot be blank")
    @Column(name= "name")
    private String name;

    @NotBlank(message = "Username cannot be blank")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "username")
    private String username;
    
    @Column(name= "email")
    @Email(message = "email cant be blank")
    private String email;

    @PositiveOrZero(message = "age must be greater or equal to 0")
    private int age;

    @Size(max = 24, min = 8, message = "Password cannot be blank, more than 24 characters and less than 8 characters")
    @Column(name= "password")
    private String password;

    @Column(name= "country")
    @NotBlank(message = "Country cannot be blank")
    private String country;

    @Column(name= "gender")
    //@Pattern(regexp = "male" + "female", message = "Gender cannot be blank")
    private String gender;

    @Column(name= "subscriptionId")
    //@Pattern(regexp = "Student" + "Family" + "Free" + "Solo" + "Duo", message = "Gender cannot be blank")
    private String subscriptionId;

    @Column(name= "Parental_controls")
    private String Parental_controls;

}