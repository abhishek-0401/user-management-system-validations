package com.geekster.usermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;
    @Column(name="user_name")
    @NotBlank(message = "Name is mandatory")
    private String userName;
    @Column(name="dob")
    @NotNull(message = "Date of birth is mandatory")
    private String dob;
    @Column(name="email")
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email is not valid")
    private String email;
    @Column(name="phone_number")
    @Size(min=12,max=12,message = "phone number with 12 digits is required")
    @Pattern(regexp = "^\\+?[1-9][0-9]{7,14}$")
    private String phoneNumber;
    @Column(name="date")
    @NotNull(message = "date must be filled")
    @Pattern(regexp ="^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$",message = "date not valid")
    private String date;
    @Column(name="time")
    @NotEmpty(message = "time must be filled")
    private String time;
}
