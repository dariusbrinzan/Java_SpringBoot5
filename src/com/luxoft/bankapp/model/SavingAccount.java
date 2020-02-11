package com.luxoft.bankapp.model;

import com.luxoft.bankapp.exceptions.NotEnoughFundsException;

import java.util.Map;

public class SavingAccount extends AbstractAccount
{

    public SavingAccount(float initialBalance)
    {
        super(AccountType.SAVING);

        if (initialBalance >= 0)
        {
            setBalance(initialBalance);
        }
    }

    @Override
    public void withdraw(double amount)
    {
        if (getBalance() < amount)
        {
            throw new NotEnoughFundsException(amount);
        }

        System.out.println("Successful withdrawal from Saving account");
    }

    // TODO feed
    @Override
    public void parseFeed(Map<String, String> map)
    {
        super.parseFeed(map);
    }
}
