package Homework_4;

import java.util.Scanner;

public class Homework_4 {
    private final char[][] board;
    private char currentPlayer;
    public Homework_4() {
        board = new char[3][3];
        currentPlayer = 'X'; // Первый игрок - X
        initializeBoard();
    }

    public static void main(String[] args) {
        Homework_4 game = new Homework_4();
        game.play(); /* Этот вызов запускает метод play() объекта game.
Метод play() содержит основную логику игры, включая цикл,
 в котором игроки по очереди делают ходы, проверяется состояние игры (победа или ничья),
  и выводится текущее состояние игрового поля.*/
    }

    private void initializeBoard() { // Заполнение доски пробелами
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() { //  Вывод доски
        System.out.println("Текущая доска:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() { // Инициализируем доску пустыми местами
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; // Найдена пустая клетка, игра продолжается
                }
            }
        }
        return true; // Все клетки заполнены
    }

    public boolean checkForWin() {
        // Проверка строк и столбцов
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Проверка диагоналей
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);// продолжаем игру
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Смена игрока
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Игрок " + currentPlayer + ", введите координаты (строка и столбец) от 0 до 2:");
            int row = scanner.nextInt(); // Считывает номер строки
            int col = scanner.nextInt(); // Считывает номер столбца
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                System.out.println("Некорректный ход. Попробуйте снова.");
                continue;
            }
            board[row][col] = currentPlayer;

            if (checkForWin()) {
                printBoard();
                System.out.println("Игрок " + currentPlayer + " победил!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("Ничья!");
                break;
            }
            changePlayer();
        }
        scanner.close();
    }
}