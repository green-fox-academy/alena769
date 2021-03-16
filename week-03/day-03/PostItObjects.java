public class PostItObjects {
    public static void main(String[] args) {

        PostIt first;
        first = new PostIt();
        first.backgroundColor = "orange";
        first.text = "Idea 1";
        first.textColor = "blue";

        PostIt second;
        second = new PostIt();
        second.backgroundColor = "pink";
        second.text = "Awesome";
        second.textColor = "black";

        PostIt third;
        third = new PostIt();
        third.backgroundColor = "green";
        third.text = "Superb!";
        third.textColor = "Yellow";

        first.displayPosts();
        second.displayPosts();
        third.displayPosts();

    }

}
