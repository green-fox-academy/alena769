package Exercise6;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaUppercase {
    //Write a Stream Expression to find the uppercase characters in a string!

    public static void main(String[] args) {
        List<String> characterList = "Write a Stream Expression to find the uppercase characters in a string!".chars()
                .filter(chararager -> Character.isUpperCase(chararager)).mapToObj(Character::toString).collect(Collectors.toList());
    }
}
