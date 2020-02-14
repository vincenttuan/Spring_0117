package com.solid.lod.sol;

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
    public int getPayment(int payment) {
        if (wallet == null) {
            throw new RuntimeException("錢包不見了");
        }
        if (wallet.getTotalMoney() >= payment) {
            wallet.substractMoney(payment);
            return payment;
        }
        throw new RuntimeException("錢不夠");
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
            try {
                int paidAmount = customer.getPayment(payment);
                System.out.printf("Customer 付錢 $ %d\n", paidAmount);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}

public class LOD {
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
