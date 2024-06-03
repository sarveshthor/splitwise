package dev.sarvesh.Splitwise.service.settleUpStrategy;

import dev.sarvesh.Splitwise.entity.Expense;
import dev.sarvesh.Splitwise.entity.Transaction;
import dev.sarvesh.Splitwise.service.settleUpStrategy.SettleUpStrategy;

import java.util.List;

public class MinimumTransactionSettlementStrategy implements SettleUpStrategy {
    @Override
    public List<Transaction> getSettlementTransactions(List<Expense> expenses) {
        //we will create 2 heaps minheap for borrowers with negative amounts
        //and maxheap for lendors with positive values
        return null;
    }
}
