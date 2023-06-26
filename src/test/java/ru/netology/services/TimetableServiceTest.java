package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.TimetableService;

public class TimetableServiceTest {
    @Test
    public void relax1() {
        TimetableService service = new TimetableService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        Assertions.assertEquals(income, expenses, threshold);
    }

    @Test
    public void relax2() {
        TimetableService service = new TimetableService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        Assertions.assertEquals(income, expenses, threshold);
    }
}
