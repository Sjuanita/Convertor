package com.daniildo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convertor {

    private static void rub(double nSumm) {
        double dol = nSumm / 70.4;
        double kz = nSumm * 5.5;
        System.out.printf("Сумма в долларах будет составлять: %.2f \n",dol);
        System.out.printf("Сумма в тенге будет составлять: %.2f \n",kz);
    }

    private static void dol(double nSumm) {
        double rub = nSumm * 70.4;
        double kz = nSumm * 425.7;
        System.out.printf("Сумма в рублях будет составлять: %.2f \n",rub);
        System.out.printf("Сумма в тенге будет составлять: %.2f \n",kz);
    }

    private static void Kz(double nSumm) {
        double dol = nSumm / 425.7;
        double rub = nSumm / 5.5;
        System.out.printf("Сумма в рублях будет составлять: %.2f \n",rub);
        System.out.printf("Сумма в долларах будет составлять: %.2f \n",dol);
    }

    public static double value() throws IOException {
        double nSumm = 0;
        System.out.println("Введите сумму:");
        boolean bool = false;
        while (!bool) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String summ = br.readLine();
                nSumm = Double.parseDouble(summ);
                bool = true;
            } catch (NumberFormatException e) {
                System.out.println("Введите число");
            }
        }
        return nSumm;
    } //Получение данных

    public static void result(double nSumm) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean bool = false;
        while (!bool) {

            System.out.println("Введите валюту: Rub, Dol, Kz");
            String valute = br.readLine();

            switch (valute) {
                case "Rub", "rub" -> {
                    rub(nSumm);
                    bool = true;
                }
                case "Dol", "dol" -> {
                    dol(nSumm);
                    bool = true;
                }
                case "Kz", "kz" -> {
                    Kz(nSumm);
                    bool = true;
                }
                default -> System.out.println("Вы ввели некоректные данные. Пожалуйста, повторите еще раз");
            }
        }
    }
}
