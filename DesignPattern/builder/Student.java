public class Student{

    private String name;

    private String gender;

    private int age;

    private int psp;

    private Student(Builder b){
        this.name = b.name;
        this.gender = b.gender;
        this.age = b.age;
        this.psp = b.psp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPsp() {
        return this.psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
    
        public Builder(){

        }
        private String name;

        private String gender;
        
        private int age;
        
        private int psp;

    public String getName() {
        return this.name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return this.gender;
    }

    public Builder setGender(String gender) {
        this.gender = gender;

        return this;
    }

    public int getAge() {
        return this.age;
    }

    public Builder setAge(int age) {
        this.age = age;

        return this;
    }

    public int getPsp() {
        return this.psp;
    }

    public Builder setPsp(int psp) {
        this.psp = psp;
        return this;
    }

    public Student build(){
        return new Student(this);
    }

    }
    
}