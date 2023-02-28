package com.aquilams.hrpayroll.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class Worker implements Serializable {
    private Long id;
    private String name;
    private double dailyIncome;
}
