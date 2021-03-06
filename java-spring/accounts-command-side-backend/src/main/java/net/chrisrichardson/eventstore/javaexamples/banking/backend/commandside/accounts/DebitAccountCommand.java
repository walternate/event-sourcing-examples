package net.chrisrichardson.eventstore.javaexamples.banking.backend.commandside.accounts;

import net.chrisrichardson.eventstore.Aggregate;
import net.chrisrichardson.eventstore.EntityIdentifier;

import java.math.BigDecimal;

public class DebitAccountCommand implements AccountCommand {
  private final BigDecimal amount;
  private final EntityIdentifier transactionId;

  public DebitAccountCommand(BigDecimal amount, EntityIdentifier transactionId) {

    this.amount = amount;
    this.transactionId = transactionId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public EntityIdentifier getTransactionId() {
    return transactionId;
  }
}

