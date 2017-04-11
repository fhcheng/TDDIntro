package com.thoughtworks.tddintro.exercises.accountbalance;

import com.thoughtworks.tddintro.exercises.factorial.Factorial;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(100);
        assertThat(account.getAccountBalance(), is(100.00));
        account.deposit(50);
        assertThat(account.getAccountBalance(), is(150.00));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(100);
        account.withdraw(50);
        assertThat(account.getAccountBalance(), is(50.00));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(50);
        account.withdraw(100);
        assertThat(account.getAccountBalance(), is(50.00));
    }
}
