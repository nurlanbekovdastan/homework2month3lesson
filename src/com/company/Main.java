package com.company;

import static java.lang.System.out;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true) {
            try{
                out.println("_________");
                out.println("Счет:" + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            }catch (LimitException e){

                out.println(e.getMessage());

                try{

                    bankAccount.withDraw((int) bankAccount.getAmount());
                    out.println("_________");
                    out.println("Оставшиеся счет:" + bankAccount.getAmount());

                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                break;
            }
            Thread.sleep(1000);
        }
    }
}
//        while (true) {
//            try {
//                System.out.println("________");
//                System.out.println("Счет:" + bankAccount.getAmount());
//                bankAccount.withDraw(6000);
//            } catch (LimitException e) {
//                System.out.println(e.getRemainingAmount());
//            }
//            try {
//                bankAccount.withDraw((int) bankAccount.getAmount());
//                System.out.println("________");
//                System.out.println("Оставшиеся счет:" + bankAccount.getAmount());
//
//            } catch (LimitException limitException) {
//                limitException.printStackTrace();
//            }
//            break;
//
//
//        }
//        Thread.sleep(1000);
//
//    }
//}
