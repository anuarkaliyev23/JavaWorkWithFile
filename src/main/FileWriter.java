package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public static void main(String[] args) {
        final String path = "./hello.txt"; //Путь по которому мы ищем файл. (Если не существует - то он его по умолчанию создаст)
        String text = "Some Text\nfirst\nsecond\nthird";

        try {
            //Эта функция открывает Файл и пишет в него байты из стринга. По умолчанию он считает его в UTF-8 кодировке
            //Если ты когда-нибудь будешь записывать что-то и увидишь, что в файл записывается что-то странное - на 90% проблема в кодировке
            //В таком случае ты просто конкретизируешь кодировку. Например: text.getBytes(StandardCharsets.UTF_8)
            Files.write(Paths.get(path), text.getBytes());
        } catch (IOException e) {
            System.out.println("Something went wrong :( ");
        }
    }
}
