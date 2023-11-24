package javaCode.lecture07;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public class Lecture07Main {

    public static void main(String[] args) throws IOException {

        JavaFilePrinter printer = new JavaFilePrinter();
        printer.readFile();
    }

    private int parseIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다", str));
        }
    }

    private Integer parseIntOrThrow2(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
