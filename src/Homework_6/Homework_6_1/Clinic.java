package Homework_6.Homework_6_1;

public class Clinic {
    private final Terapeft terapeft = new Terapeft();
    private final Hirurg hirurg = new Hirurg();
    private final Dantist dantist = new Dantist();

    // Метод назначения врача согласно плану лечения
    public void naznachitVracha(Pacient pacient) {
        String plan = pacient.getPlanLeceniya();
        int code;
        try { // В этом блоке кода происходит попытка преобразовать строку plan в целое число (int) с помощью метода Integer.parseInt(plan)
            code = Integer.parseInt(plan);
        } catch (NumberFormatException e) {
            // Если план не число, назначаем терапевта по умолчанию code = 0;
            System.out.println("Ошибка: строка не является числом");
            return;
        }

        if (code == 1) {
            pacient.setDoctor(hirurg);
        } else if (code == 2) {
            pacient.setDoctor(dantist);
        } else {
            pacient.setDoctor(terapeft);
        }

        // Вызов метода лечить
        pacient.getDoctor().lechit();
    }
}
