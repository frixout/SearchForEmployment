package com.example.SearchForEmployment.model.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "password", nullable = false)
    private char [] password;
    @Column(name = "email", nullable = false)
    private String email;

   @Column(name = "lastName", nullable = false)
    private String lastName;
    private boolean isBanned;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(name = "role", nullable = false)
    private Role role;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resume_id", foreignKey = @ForeignKey(name = "fk_users_resume_id"))
    private Resume resume;
}
