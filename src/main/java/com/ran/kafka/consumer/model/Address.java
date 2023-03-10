package com.ran.kafka.consumer.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Address {

    private String street;
    private String aptNumber;
    private String city;
    private String state;
    private int zipCode;
}
