import java.util.ArrayList;
import java.util.Scanner;


public class FileAdder {
    private static Scanner in;
    private static Integer index1;


    public static ArrayList<String> recentfile = new ArrayList<String>();
    public static ArrayList<String> recentfile2 = new ArrayList<String>();
    public void moveRight(){

    }


    public static void addRecent(String file) {



        if (recentfile.contains(file)){
         index1 = recentfile.indexOf(file);
         //asigna el valor del indice del elemento repetido
        if (index1 == 0){

            }else {
            recentfile.remove(file);
            recentfile.add(0, file);
            /*
            for (int i = 14; i >= 1; i = i - 1) {
                    recentfile.set(i, recentfile.get(i-1));
                    System.out.println(recentfile);

                }
                recentfile.set(0, file);
                return file;
            }

             */
            }
        }

         else{
            for(int i = 14; i >= 1; i = i - 1){
                recentfile.set(i,recentfile.get(i-1));
            }
            recentfile.set(0,file);
        }


    }



}
