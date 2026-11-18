package com.example.dbmigration.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MEMBER_NAME", nullable = false, length = 100)
    private String memberName;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    protected Member() {}

    public Long getId() { return id; }
    public String getMemberName() { return memberName; }
    public String getEmail() { return email; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
