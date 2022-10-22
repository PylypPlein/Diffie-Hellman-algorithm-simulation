import interfaces.AllowNotice;
import interfaces.DeniedNotice;

public class main {
    public static void main(String[] args) {
        long firstKey = 0;
        long secondKey = 1;
        Numbers_Calculation p = new Numbers_Calculation();
        AllowNotice allowNotice = new AllowNotice();
        DeniedNotice deniedNotice = new DeniedNotice();

        while (firstKey != secondKey) {
            p.numbersCalculate();
            firstKey = p.getFirstKey();
            secondKey = p.getSecondKey();

            if (firstKey != secondKey) {
                deniedNotice.notice();
            } else {
                allowNotice.notice();
            }
        }
    }
}
