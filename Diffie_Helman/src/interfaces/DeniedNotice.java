package interfaces;

public class DeniedNotice implements ConnectionNotice{
    public void notice(){
        System.out.println("*ACCES DENIED*");
    }
}
