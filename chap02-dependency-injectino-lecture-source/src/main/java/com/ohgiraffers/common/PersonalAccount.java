package com.ohgiraffers.common;

public class PersonalAccount implements Account{
    private final int backCode;     // 은행 코드
    private final String accNo;     // 계좌 번호
    private int balance;            // 잔액

    // 필기. 기본생성자 없이, final 필드를 초기화해주도록
    public PersonalAccount(int backCode, String accNo) {
        this.backCode = backCode;
        this.accNo = accNo;
    }

    @Override
    public String getBalance() {
        return this.accNo + "계좌의 현재 잔액은 " + this.balance + "원 입니다. ";
    }



    @Override
    public String deposit(int money) {
        String str = "";

        if(money >= 0){
            this.balance += money;
            str = money + "원이 입금되었습니다.";
        }else{
            str = "금액을 잘못 입력하셨습니다.";
        }
        return str;
    }

    @Override
    public String withDraw(int money) {
        String str = "";
        if(this.balance >= money){
            this.balance -= money;
            str = money + "원이 출금되었습니다.";
        }else{
            str = "잔액이 부족합니다. 잔액을 확인해주세요.";
        }
        return str;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "backCode=" + backCode +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}


/*
    필기.
        간결함을 낮추기 위해? 가운데에 interface 를 두었다?
        PersonalAccount 를 MemberDTO에 "주입"해야 한다 ?
 */
