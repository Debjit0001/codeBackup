package Introduction;

public class InnerClasses { // outside cannot be static

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // regardless of being static, the objects of Test class may have individual indentities because here it is static wrt InnerClass
        // So its not dependent on the objects of InnerClass but the objects of Test may have their individual values internally
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }

}
