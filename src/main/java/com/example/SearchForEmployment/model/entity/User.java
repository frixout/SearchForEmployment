package com.example.SearchForEmployment.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Pattern(message = "{greeting.register.errors.email_is_invalid}",
            regexp = "^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$")
    @NotNull(message = "{greeting.register.errors.email_is_null}")
    //message = "{greeting.register.errors.email_is_unique}"
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull(message = "{greeting.register.errors.password_is_null}")
    @Size(min=8, message = "{greeting.register.errors.password_size_is_invalid}")
    @Column(name = "password", nullable = false)
    private char[] password;

    @NotNull(message = "{greeting.register.errors.lastName_is_null}")
    @Size(min = 2, max = 255, message = "{greeting.register.errors.lastName_size_is_invalid}")
    @Column(name = "lastName", nullable = false)
    private String lastName;
    private boolean isBanned;

    @NotNull(message = "{greeting.register.errors.name_is_null}")
    @Size(min = 2, max = 255, message = "{greeting.register.errors.name_size_is_invalid}")
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull(message = "{greeting.register.errors.age_is_null}")
    @Min(value = 16, message = "{greeting.register.errors.age_size_is_invalid}")
    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(name = "role", nullable = false)
    private Role role;
    /*@Column(name = "country", nullable = false)
    private String country;*/

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resume_id", foreignKey = @ForeignKey(name = "fk_users_resume_id"))
    private Resume resume;
}
