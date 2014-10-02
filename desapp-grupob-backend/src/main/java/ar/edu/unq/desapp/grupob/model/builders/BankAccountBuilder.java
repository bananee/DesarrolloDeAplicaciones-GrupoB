package ar.edu.unq.desapp.grupob.model.builders;

import java.util.List;

import ar.edu.unq.desapp.grupob.model.BankAccount;
import ar.edu.unq.desapp.grupob.model.Devenger;
import ar.edu.unq.desapp.grupob.model.Operation;

public class BankAccountBuilder {
    
    // Access
    public static BankAccountBuilder aBankAccountBuilder() {
        return new BankAccountBuilder();
    }

    // Instances
    private int consolidationPeriod = 15;
    private Devenger devenger;
    private List<Operation> consolidatedOperations;

    // Constructor method
    public BankAccount build() {
    	BankAccount bank = new BankAccount(consolidationPeriod);
        return bank;
    }
    public BankAccount buildBankWithJUSTADevenger() {
        BankAccount bank = new BankAccount(devenger);
        return bank;
    }

    // Methods
    public BankAccountBuilder withConsolidationPeriod(final int countdown) {
        this.consolidationPeriod = countdown;
        return this;
    }
    public BankAccountBuilder withDevenger(final Devenger devenger) {
        this.devenger = devenger;
        return this;
    }

}