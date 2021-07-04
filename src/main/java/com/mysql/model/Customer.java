package com.mysql.model;


import lombok.*;

import javax.persistence.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CUSTOMER")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MOBILE")
    private Long mobileNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ZIPCODE")
    private String zipcode;
}
