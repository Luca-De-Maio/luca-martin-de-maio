public class Post {
    private String title;
    private String user;
    private String body;
    private String tags;

    public Post(String title, String user, String body, String tags) {
        this.title = title;
        this.user = user;
        this.body = body;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return  "Title: " + title + '\n' +
                "User: " + user + '\n' +
                "Body: " + body + '\n' +
                "Tags: " + tags + '\n'+
                "---------------------";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
