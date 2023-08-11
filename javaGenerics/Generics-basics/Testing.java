public class Testing {
    
    public static void main(String[] args) {
        Generics<Number> obj= new Generics<Number>();
        obj.setObject(999);
        System.out.println(obj.getObject());
    }
}
