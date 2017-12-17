package com.shirtec.playground;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    private GenderCode gender;
    private Integer income;
    private Currency currency;

    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, GenderCode.M, 0, Currency.US_DOLLAR);
    }

    public Customer(String firstName, String lastName, GenderCode gender, Integer income, Currency currency) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.currency = currency;
        this.gender = gender;
    }
}
