
class Singleton{

    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){

     if(Singleton.instance == null){
        Singleton.instance = new Singleton();
     }
     Object obj = new Object();
     System.out.println(obj);

     return Singleton.instance;
    }
}