public class Numbers_Calculation {
    private long p;
    private long g;
    private long firstDegree;
    private long secondDegree;

    private long firstNumAfterRaise;
    private long secondNumAfterRaise;

    private long firstNumAfterModulo;
    private long secondNumAfterModulo;

    private long firstNumAfterSecondRaise;
    private long secondNumAfterSecondRaise;

    private long firstKey;
    private long secondKey;

    Numbers_Generator numbersGenerator = new Numbers_Generator();

    public Numbers_Calculation(){

    }

    public void numbersCalculate(){
        numbersCompare();
        raiseToDegree();

        System.out.println(" ");
        System.out.println(firstNumAfterRaise);
        System.out.println(secondNumAfterRaise);

        moduloDivision();
        secondRaiseToDegree();
        secondModuloDivision();

        System.out.println(p);
        System.out.println(g);
        System.out.println(" ");
        System.out.println(firstDegree);
        System.out.println(secondDegree);
    }

    private void numbersCompare(){
        p = numbersGenerator.p_generate();
        g = numbersGenerator.g_generate();
        firstDegree = numbersGenerator.firstDegree_generate();
        secondDegree = numbersGenerator.secondDegree_generate();
        //raiseToDegree();

        //moduloDivision();
    }

    private void raiseToDegree(){
        firstNumAfterRaise = p;
        secondNumAfterRaise = p;
        for (int i = 0 ; i<firstDegree-1;i++){
            firstNumAfterRaise = firstNumAfterRaise * p;
        }
        for (int j = 0 ; j<secondDegree-1;j++){
            secondNumAfterRaise = secondNumAfterRaise * p;
        }

    }

    private void moduloDivision(){
        firstNumAfterModulo = firstNumAfterRaise % g;
        secondNumAfterModulo = secondNumAfterRaise % g;
    }

    private void secondRaiseToDegree(){
        firstNumAfterSecondRaise = firstNumAfterModulo;
        secondNumAfterSecondRaise = secondNumAfterModulo;

        for (int i = 0; i<firstDegree-1; i++){
            secondNumAfterSecondRaise = secondNumAfterSecondRaise * secondNumAfterModulo;
        }
        for (int j = 0; j<secondDegree-1; j++){
            firstNumAfterSecondRaise = firstNumAfterSecondRaise * firstNumAfterModulo;
        }
    }
    private void secondModuloDivision(){
        firstKey = secondNumAfterSecondRaise % g;
        secondKey = firstNumAfterSecondRaise % g;
        System.out.println("key : " + firstKey + "=" +secondKey);
    }

    public long getFirstKey(){
        return firstKey;
    }

    public long getSecondKey(){
        return secondKey;
    }

}
