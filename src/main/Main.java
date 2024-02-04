package main;// імпортування класу Date зі стандартного пакету java.util

import main.lab1.Calculator;
import main.lab1.Printer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] S) {
        run();
    }

    static void run() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        Calculator calculator = new Calculator();
        double f = calculator.calcF(a, b);

        Printer printer = new Printer();
        printer.print("f", f);
    }
}