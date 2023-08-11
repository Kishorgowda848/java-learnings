public class Client {

    public static void main(String args[]){
        Student s = Student.getBuilder().setPhoneNumber("898326737").build();
        System.out.println(s.getPhoneNumber());
    }
}
