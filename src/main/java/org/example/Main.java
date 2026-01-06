package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(CompanyNameConfiguration.configureCompanyName("CAF softsol"));;
        System.out.println(CompanyNameConfiguration.configureCompanyName("CAF solution"));;
        System.out.println(CompanyNameConfiguration.configureCompanyName("CAF           SoftSolution India  Pvt          Limited"));;
        System.out.println(CompanyNameConfiguration.configureCompanyName((String) null));
        System.out.println(CompanyNameConfiguration.configureCompanyName("TCS Pvt Ltd."));;
    }
}