package com.carstoremanagement.entity;

import com.carstoremanagement.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Users extends AbstractEntity<Long> implements Serializable {
    @Column(name = "Username", nullable = false, unique = true)
    private String username;
    @Column(name = "Email", nullable = false, unique = true)
    private String email;
    @Column(name = "Password", nullable = false)
    private String password;
    @Column(name = "Phone", nullable = false, unique = true)
    private String phone;
    @Column(name = "Avatar_URL")
    private String avatar_url;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "Is_Active", nullable = false)
    private boolean isActive;
    @Column(name = "Email_Verified", nullable = false)
    private boolean emailVerified;
}
