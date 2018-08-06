package lesson_9;

import java.io.*;

public class Lesson9 {

    public static void main(String[] args) throws Exception {

        File f = new File("D:\\Documents\\IdeaProjects\\learning_project\\src\\lesson_9\\test.txt");
        System.out.println(f.exists());
        FileReader reader = new FileReader(f);
        int x = reader.read();
        while(x != -1){
            char y = (char)x;
            System.out.print(y);
            x = reader.read();
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Documents\\IdeaProjects\\learning_project\\src\\lesson_9\\test.txt"));
        String s = bufferedReader.readLine();
        System.out.println(s);

        String s2 = bufferedReader.readLine();
        System.out.println(s2);

        BufferedWriter writer = new BufferedWriter(new FileWriter(f));
        writer.write("new content");
        writer.flush();
    }
}
