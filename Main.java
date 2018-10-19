public class Main {
    public static void main(final String[] args) {
        System.out.println("Hola amor");
        
        System.out.println(new X());
    }
}

class X {
  @Override
  public String toString() {
    return String.format("hola ... ");
  }
}