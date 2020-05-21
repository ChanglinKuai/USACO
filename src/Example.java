public class Example {
    int num;
    String name;
    char c;

    Example() {

    }

    Example(int num) {
        this.num = num;
    }

    Example(int num, String name, char c) {
        this.num = num;
        this.name = name;
        this.c = c;
    }

    void myMethod() {
        System.out.println("Hello");
    }

    String getName() {
        return this.name;
    }

    void print(String line) {
        System.out.println(line);
    }

    public static void main(String[] args) {
        Example ex = new Example(123, "Hello", 'a');
        System.out.println(ex.num);
        System.out.println(ex.name);
        System.out.println(ex.c);

        ex.c = 'b';
        System.out.println(ex.c);
    }
}
