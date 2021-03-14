// - Create an array variable named `animals`
//   with the following content:
//   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
//     "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"]`
//
// - Add an `"a"` at the end of all elements (use a loop!)

public class AppendA {
    public static void main(String[] args) {
        String[] animals = new String[] {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
                "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"};
        int length = animals.length;
        for (int i = 0; i < length; i++) {
            animals[i] = animals[i] + "a";
        }
        for (String j: animals) {
            String intoString = String.valueOf(j);
            System.out.println(intoString);

        }
    }
}
