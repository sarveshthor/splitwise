package dev.sarvesh.Splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;

@Getter
@Setter
@Entity
public class Transaction extends BaseModel{
    @ManyToOne
    private User lendor;
    @ManyToOne
    private User borrower;
    private double amount;
    private Currency currency;
}
