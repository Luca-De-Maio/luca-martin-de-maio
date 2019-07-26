import java.util.ArrayList;

public class ArrayListAdder {

    public static ArrayList<String> AddFull() {

        for (int i = 1; i <= 15; i++) {
            FileAdder.recentfile.add("file" + i);
        }
        System.out.println(FileAdder.recentfile);
        return FileAdder.recentfile;
    }
    public static ArrayList<String> AddFull2() {

        for (int i = 1; i <= 15; i++) {
            FileAdder.recentfile2.add("file" + i);
        }
        System.out.println(FileAdder.recentfile2);
        return FileAdder.recentfile2;
    }

    public static void main(String[] args) {

    }
}
