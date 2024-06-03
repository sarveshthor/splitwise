package dev.sarvesh.Splitwise.service.settleUpStrategy;

import dev.sarvesh.Splitwise.entity.Expense;
import dev.sarvesh.Splitwise.entity.Transaction;

import java.util.List;

public interface SettleUpStrategy {

    List<Transaction> getSettlementTransactions(List<Expense> expenses);
}
