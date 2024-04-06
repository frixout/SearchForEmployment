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
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private char [] password;
    @Column(name = "email")
    private String email;

   /*@Column(name = "lastName")
    private String lastName;
    private boolean isBanned;
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
    @Column(name = "role")
    private Role role;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resume_id", foreignKey = @ForeignKey(name = "fk_users_resume_id"))
    private Resume resume;*/
}
