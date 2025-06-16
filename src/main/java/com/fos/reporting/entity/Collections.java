package com.fos.reporting.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "collections")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Collections {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dateTime;
    private Long employeeId;
    private float cashReceived;
    private float phonePay;
    private float creditCard;
    private float borrowedAmount;
    private float debtRecovered;
    private String borrower;
    private float badHandling;
    private float expenses;
    private double expectedTotal;
    private double receivedTotal;
    private double difference;
}
