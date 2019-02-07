package wordCount;

public class Main {
  private static String readFile(String path, Charset encoding) throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, encoding);
  }

  private static void countWords() {
    String declaration = readFile("../../declaration.txt", StandardCharsets.UTF_8);
    HashMap<String, Integer> words = new HashMap<String, Integer>();

    declaration = declaration.replaceAll("[^[\\p{Alnum}\\-]]", "");

    System.out.println(declaration);
  }

  public static void main(String[] args) {
    countWords();
  }
}
