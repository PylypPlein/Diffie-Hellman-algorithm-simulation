import java.util.Random;

public class Numbers_Generator {
    private long p;
    private long g;
    private long firstDegree;
    private long secondDegree;
    Random r = new Random();

    public Numbers_Generator(){

    }

    public long p_generate(){
        p = 0;
        while (p==0) {
            p = r.nextInt(70);
        }
        return p;
    }
    public long g_generate(){
        g = 0;
        while (g==0) {
            g = r.nextInt(50);
        }
        return g;
    }

    public long firstDegree_generate(){
        firstDegree = 0;
        while (firstDegree==0 || firstDegree == 1) {
            firstDegree = r.nextInt(20);
        }
        return firstDegree;
    }

    public long secondDegree_generate(){
        firstDegree = 0;
        while (secondDegree == 0 || secondDegree == 1) {
            secondDegree = r.nextInt(20);
        }
        return secondDegree;
    }


}
