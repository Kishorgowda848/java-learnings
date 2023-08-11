public class Client {
    
    public static void main(String[] args) {
        Student student = Student.getBuilder().setAge(23).setGender("MALE").setName("Kishore").setPsp(70).build();
    
        System.out.println( student.getAge());
    }
}
