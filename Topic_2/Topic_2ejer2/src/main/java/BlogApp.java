import java.util.ArrayList;
import java.util.Scanner;

public class BlogApp {
    private ArrayList<Post> posts = new  ArrayList<Post>();

    public BlogApp() {

    }

    public void newPost(String title, String user, String body, String tags){
        int index = findPost(title);
        if (index == -1){
            Post p = new Post(title, user, body, tags);
            posts.add(0, p);
        }else {
            System.out.println("That post already exist");
        }

    }
    public void deletePost(String title){
        int index = findPost(title);
        try {
            posts.remove(index);
            System.out.println("Post removed successfully");
        } catch (Exception e){
            System.out.println("That post doesn't exist");
        }


    }

    public void showRecent(){

        for (int i = 0; i < posts.size() && i < 10; i++) {
            System.out.println(posts.get(i));
        }
    }

    public int findPost(String title){
        int index = -1;
        for (Post p: posts) {
            if(title.equalsIgnoreCase(p.getTitle())){
                index = posts.indexOf(p);
                break;
            }
        }
        return index;
    }

    public int showMenu(){
        Scanner sc = new Scanner(System.in);
        int selection;

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("                                        Super Blog");

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("1. New Post \n" +
                "2. Delete Post \n" +
                "3. Show last 10 Posts ");

        selection = sc.nextInt();

        return selection;

    }
}
