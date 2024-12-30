package ie.atu.budgifyremasted;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;  // Import LocalDate for date fields

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Username cannot be blank")
    @Column(name = "username")
    private String username;

    @Email(message = "Email must be valid")
    @Column(name = "email")
    private String email;

    @Size(min = 4, max = 24, message = "Password must be between 4 and 24 characters")
    @Column(name = "password")
    private String password;

    @NotBlank(message = "Country cannot be blank")
    @Column(name = "country")
    private String country;

    @Column(name = "gender")
    private String gender;

    @Column(name = "subscription_id")
    private int subscription_id;

    @Column(name = "parental_controls")
    private String parental_controls;

    // Update to LocalDate to match the DATE type in the database
    @Column(name = "date_of_birth")
    private LocalDate date_of_birth;

    // Use Long or String for phone_number (if it includes special characters or leading zeros)
    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "marketing")
    private String marketing;

    // Update to LocalDate to match the DATE type in the database
    @Column(name = "created_date")
    private LocalDate created_date;
}