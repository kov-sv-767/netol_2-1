public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{1, 4, 3, 7, 9});
        salesManager.max();
        System.out.println(salesManager.max());
    }
}
