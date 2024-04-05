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
    private boolean isBanned;
    @Column(name = "name")
    private String name;

    public User(String name) {
        this.name = name;
    }

    /*@Column(name = "lastName")
    private String lastName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "email")
    private String email;
    @Column(name = "role")
    private Role role;
    @Column(name = "login",nullable = false, unique = true)
    private String login;
    @Column(name = "password")
    private char [] password;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resume_id", foreignKey = @ForeignKey(name = "fk_users_resume_id"))
    private Resume resume;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isBanned == user.isBanned && Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(age, user.age) && Objects.equals(email, user.email) && role == user.role && Objects.equals(login, user.login) && Arrays.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, isBanned, firstName, lastName, age, email, role, login);
        result = 31 * result + Arrays.hashCode(password);
        return result;
    }*/
}
