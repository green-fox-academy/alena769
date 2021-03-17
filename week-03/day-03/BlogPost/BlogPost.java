

public class BlogPost {

        String name;
        String title;
        String text;
        String publicationDate = "MM-dd-yyyy";

    public BlogPost() {

    }
public BlogPost(String name, String title, String text, String publicationDate) {
        this.name = name;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
}

public void displayPosts() {
        System.out.println(title + " titled by " + name + " posted at "+ publicationDate);
        System.out.println(text);
}

}
