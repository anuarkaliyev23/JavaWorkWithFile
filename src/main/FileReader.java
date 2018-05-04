package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
        public static void main(String[] args) {
            final String path = "./hello.txt"; //Расположение файла. Точка означает текущую папку (папку проекта)

            /*
            * Конструкция try() {} называется try-with-resources. Она гарантирует, что освободит ресурсы после использования.
            * То есть берет на себя ответственность, за то, что сама закроет все утечки памяти.
            * Иначе Тебе пришлось бы писать в конце что-то вроде File.flush() или File.close()
            * */
            try (Scanner scanner = new Scanner(new File(path))) {
                while (scanner.hasNextLine()) { //Пока в файле есть следующие линии
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) { //Это исключение возникает если по указанному пути файла не существует
                System.out.println("File wasn't found :( ");
            }
        }
}
