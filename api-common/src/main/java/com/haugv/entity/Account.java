package com.haugv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {
    private int id;
    private int userId;
    private String name;
    private String type;
    private String status;
    private BigDecimal balance;
    private User user;
}
