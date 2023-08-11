public class Singleton {

    private static Student instance = null;

    public static Student getInstance(){

        if(instance==null){
            synchronized(Singleton.class){

                if(instance == null){
                    instance = new Student();
                }

            }
        }

        return instance;
    }
}
