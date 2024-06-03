package dev.sarvesh.Splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "SPLITWISE_GROUP")
@Getter
@Setter
public class Group extends BaseModel{
    private String groupName;
    @ManyToOne
    private User createdBy;
    private LocalDateTime creationDate;
    @ManyToMany
    private List<User> members;
    @OneToMany
    private List<Expense> expenses;
    private double totalAmount;
    @OneToMany
    private List<Transaction> settlementTransactions;
}
