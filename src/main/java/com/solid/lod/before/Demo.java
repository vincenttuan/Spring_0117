package com.solid.lod.before;

import java.util.Arrays;
import java.util.List;

class Wallet {
    private int money;
    public Wallet(int money) {
        this.money = money;
    }
    public int getTotalMoney() {
        return money;
    }
    public void substractMoney(int debit) {
        money -= debit;
    }
    @Override
    public String toString() {
        return "Wallet [money=" + money + "]";
    }
}

class Customer {
    private Wallet wallet;
    Customer(Wallet wallet) {
        this.wallet = wallet;
    }
    public Wallet getWallet() {
        return wallet;
    }
    @Override
    public String toString() {
        return "Customer [wallet=" + wallet + "]";
    }
}

class Paperboy {
    public List<Customer> customers;
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public void collectMoney() {
        for (Customer customer : customers) {
            int payment = 100;
            // Paperboy 拿 Customer's Wallet(錢包) ?
            Wallet wallet = customer.getWallet();
            if (wallet == null) {
                System.out.println("錢包不見了");
                return;
            }
            if (wallet.getTotalMoney() >= payment) {
                wallet.substractMoney(payment);
                System.out.printf("Customer 付錢 $ %d\n", payment);
            } else {
                System.out.println("錢不夠");
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(new Customer(new Wallet(1000)), new Customer(new Wallet(200)));
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Paperboy paperboy = new Paperboy();
        paperboy.setCustomers(customers);
        paperboy.collectMoney();

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
