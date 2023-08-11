public class Student {
    
    private String name;

    private String phoneNumber;

    private int age;
    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    private Student(Builder builder){
      this.name = builder.getName();
      this.phoneNumber = builder.getPhoneNumber();
    }

    public static Builder getBuilder(){
        return new Builder();
    }   
    
    
    public static class Builder {
        private String name;
    
        private String phoneNumber;
    
        private int age;
    
        public String getName() {
            return this.name;
        }
    
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
    
        public String getPhoneNumber() {
            return this.phoneNumber;
        }
    
        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    
        public int getAge() {
            return this.age;
        }
    
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
    
        public  Student build(){
            return new Student(this);
        }
    
    }
    
}
