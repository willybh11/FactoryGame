public class Main {

        public static void main(String[] args) {
            LinkedList LL = new LinkedList();
            LL.append(1);
            LL.append(2);
            LL.append(3);
            LL.prepend(4);
            LL.printAll();
            LL.deleteWithValue(4);
            System.out.println("just deleted with value");
            LL.printAll();
        }
}
