import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlogApp blog = new BlogApp();
        Scanner in = new Scanner(System.in);
        String ss = "y";
        while (!ss.equals("n")) {
            int s = blog.showMenu();
            switch (s) {
                case 1: {
                    System.out.println("Enter title");
                    String title = in.nextLine();
                    System.out.println("Enter user name");
                    String user = in.nextLine();
                    System.out.println("Enter body");
                    String body = in.nextLine();
                    System.out.println("Enter tags");
                    String tags = in.nextLine();
                    blog.newPost(title, user, body, tags);
                    break;
                }
                case 2: {
                    System.out.println("enter title for the entry you wish to remove");
                    String title = in.nextLine();
                    blog.deletePost(title);
                    break;
                }
                case 3: {
                    System.out.println("10 last entries");
                    blog.showRecent();
                    break;
                }
            }
            System.out.println("Wish to continue? y/n");
            ss = in.nextLine();
        }
    }
}
