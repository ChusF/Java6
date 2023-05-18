import ru.netology.services.TimetableService;

public class Main {
    public static void main(String[] args) {
        TimetableService service = new TimetableService();
        service.calculate(10_000, 3_000, 20_000);
        System.out.print("Отдыхаю " + service.calculate(10_000, 3_000, 20_000) + "\n");

        service.calculate(100_000, 60_000, 150_000);
        System.out.print("Отдыхаю " + service.calculate(100_000, 60_000, 150_000));
    }
}
