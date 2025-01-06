package ie.atu.userservice;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    public Long id;

    @NotBlank(message = "Name cannot be blank")
    @Column(name = "name")
    public String name;

    @NotBlank(message = "Username cannot be blank")
    @Column(name = "username")
    public String username;

    @Email(message = "Email must be valid")
    @Column(name = "email")
    public String email;

    @Size(min = 4, max = 24, message = "Password must be between 4 and 24 characters")
    @Column(name = "password")
    public String password;

    @NotBlank(message = "Country cannot be blank")
    @Column(name = "country")
    public String country;

    @Column(name = "gender")
    public String gender;

    @Column(name = "subscription_id")
    public int subscription_id;

    @Column(name = "parental_controls")
    public String parental_controls;

    @Column(name = "date_of_birth")
    public LocalDate date_of_birth;

    @Column(name = "phone_number")
    public String phone_number;

    @Column(name = "marketing")
    public String marketing;

    @Column(name = "created_date")
    public LocalDate created_date;
}

