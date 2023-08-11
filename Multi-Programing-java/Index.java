class Index {

    public static void main(String[] args) {
        System.out.println("Index.main()");

        HelloWorldPrint task = new HelloWorldPrint();

        Thread thread = new Thread(task);

        thread.start();

    }
}