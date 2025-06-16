package com.fos.reporting.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sales")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Sales {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotNull
    private LocalDateTime dateTime;
    @NotNull
    private String productName;
    private String subProduct;
    @NotNull
    private Long employeeId;
    private float openingStock;
    private float closingStock;
    private float testingTotal;
    private float sale;
    private float price;
    private float saleAmount;
}
