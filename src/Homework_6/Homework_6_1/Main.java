package Homework_6.Homework_6_1;

/*
Создать программу для имитации работы клиники. Пусть в клинике будет три
врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
«План лечения» и полем «Доктор». Создать объект класса «Пациент» и
добавить пациенту план лечения. У терапевта создать метод, который будет
назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод
лечить.
 */
public class Main {

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Pacient pacient = new Pacient();

        pacient.setPlanLeceniya("1"); // план лечения с кодом 1
        clinic.naznachitVracha(pacient); // Назначение врача и лечение

        // Можно попробовать с другими планами
        pacient.setPlanLeceniya("2");
        clinic.naznachitVracha(pacient);

        pacient.setPlanLeceniya("3");
        clinic.naznachitVracha(pacient);

        pacient.setPlanLeceniya("77");
        clinic.naznachitVracha(pacient);

        pacient.setPlanLeceniya("F");
        clinic.naznachitVracha(pacient);
    }
}
