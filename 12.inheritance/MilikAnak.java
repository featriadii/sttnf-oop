package pewarisan;

public class MilikAnak extends DariOrtu{
    private String sepeda;
    public MilikAnak(){
        sepeda = "Pacific";
    }
    
    public void info(){
        System.out.println("uang : " + uang);
        System.out.println("mobil : " + mobil);
        System.out.println("sepeda : " + sepeda);
    }
}
