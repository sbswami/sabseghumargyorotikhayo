package com.sanshy.farmmanagement.loans;

import java.util.Date;

public class LoanPayingDataList {
    String PayId;
    String LoanId;
    Date date;
    double amount;
    double payingInterest;
    String LoanPersonName;

    public LoanPayingDataList(String payId, String loanId, Date date, double amount, double payingInterest, String loanPersonName) {
        PayId = payId;
        LoanId = loanId;
        this.date = date;
        this.amount = amount;
        this.payingInterest = payingInterest;
        LoanPersonName = loanPersonName;
    }

    public double getPayingInterest() {
        return payingInterest;
    }

    public void setPayingInterest(double payingInterest) {
        this.payingInterest = payingInterest;
    }

    public String getLoanPersonName() {
        return LoanPersonName;
    }

    public void setLoanPersonName(String loanPersonName) {
        LoanPersonName = loanPersonName;
    }

    public String getPayId() {
        return PayId;
    }

    public void setPayId(String payId) {
        PayId = payId;
    }

    public String getLoanId() {
        return LoanId;
    }

    public void setLoanId(String loanId) {
        LoanId = loanId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
