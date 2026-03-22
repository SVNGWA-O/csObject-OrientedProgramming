package lecture04.activity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Examples {

    /* Lecture 4 Learning Objectives. Students will be able to:
       - define a class with fields
       - populate the fields using data passed in to the constructors
       - define multiple constructors for the same class
       - write a method that computes a result using those fields
       - write and test a method that mutates a field
     */

    /* Instructions
       - We will review UML a bit
       - Go through each test 1-by-1 and add features to answers.BankAccount.java to make the tests pass
       -   1. Constructors
       -   2. balance()
       -   3. deposit($)
       -   4. withdraw($)
       -   5. transfer(acc,$) // if time!
       Pro-tip: comment/un-comment is CTRL+/ on windows and linux (possible CMD+/ on Mac??)
     */
//    @Test
//    public void test1ArgConstructor(){
//        BankAccount b = new BankAccount("Bartholomew Simpson");
//        assertEquals(0.0,b.balance(),0.01);
//    }
//
//    @Test
//    public void test2ArgConstructor(){
//        BankAccount b = new BankAccount("Bartholomew Simpson", 50.0);
//        assertEquals(50.0,b.balance(),0.01);
//    }
//
//    @Test
//    public void test2ArgConstructorNegative(){
//        BankAccount b = new BankAccount("Bartholomew Simpson", -50.0);
//        assertEquals(0.0,b.balance(),0.01);
//    }
//
//    @Test
//    public void testDeposit(){
//        BankAccount b = new BankAccount("Bartholomew Simpson", 50.0);
//        b.deposit(75.0);
//        assertEquals(125.0,b.balance(),0.01);
//    }
//
//    @Test
//    public void testWithdraw(){
//        BankAccount b = new BankAccount("Bartholomew Simpson", 50.0);
//        double amountWithdrawn = b.withdraw(10.0);
//        assertEquals(40.0,b.balance(),0.01);
//        assertEquals(10.0, amountWithdrawn, 0.01);
//
//    }
//
//    @Test
//    public void testOverWithdraw(){
//        BankAccount b = new BankAccount("Bartholomew Simpson", 50.0);
//        double amountWithdrawn = b.withdraw(75.0);
//        assertEquals(0.0,b.balance(),0.01);
//        assertEquals(50.0, amountWithdrawn, 0.01);
//    }
//
//    @Test
//    public void testTransfer(){
//        BankAccount b = new BankAccount("Bartholomew Simpson", 50.0);
//        BankAccount l = new BankAccount("Lisa Simpson", 100.0);
//        double amountSent = b.transfer(l,20.0);
//        assertEquals(30.0, b.balance(), 0.01);
//        assertEquals(120.0,l.balance(), 0.01);
//        assertEquals(20.0, amountSent, 0.01);
//    }
//
//    @Test
//    public void testTransferOverdrawn(){
//        BankAccount b = new BankAccount("Bartholomew Simpson", 50.0);
//        BankAccount l = new BankAccount("Lisa Simpson", 100.0);
//        double amountSent = b.transfer(l,75.0);
//        assertEquals(0.0, b.balance(),0.01);
//        assertEquals(150.0,l.balance(), 0.01);
//        assertEquals(50.0, amountSent, 0.01);
//    }
}
