package ru.netology.services;

public class TimetableService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int relax = 0; // месяцы отдыха
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                money = (money - expenses) / 3;
                relax = relax + 1;
            } else {
                money = money + income - expenses;
            }
        }
        return relax;
    }
}

