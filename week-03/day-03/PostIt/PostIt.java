public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(){

    }
    public void displayPosts(){
        System.out.println("Background Color: " + backgroundColor);
        System.out.println("Text color: " + textColor);
        System.out.println("Text: " + text);
    }
}
