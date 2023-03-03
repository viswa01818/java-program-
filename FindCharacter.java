package JAVAEASYEG;
public class FindCharacter {
    public static void main(String[] args) {
        String line = "This is a sample sentence.";
        char target = 's';
        boolean found = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == target) {
                System.out.println("Found '" + target + "' at index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("'" + target + "' not found in '" + line + "'");
        }
    }
}