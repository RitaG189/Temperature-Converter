public class ConvertFromF {

    private int tempFinal;



    public int FtoC(int temp1) {

        tempFinal = (int) ((temp1 - 32) / 1.8000);

        return tempFinal;

    }

    public void FtoK(int temp1) {

        tempFinal = (int)(((temp1 * 5) / 9) + 273.15);
    }

    public void FtoR(int temp1) {

        tempFinal = (int) (temp1 + 459.67);
     }

    public void FtoD(int temp1) {

        tempFinal = (212 - temp1) * (5/6);
    }

    public void FtoN(int temp1) {

        tempFinal = (temp1 - 32) * (11/60);
    }

    public void FtoRe(int temp1) {
        tempFinal = (int) ((temp1 - 32) / 2.25);

    }

    public void FtoRo(int temp1) {

        tempFinal = (int) ((temp1 - 32) * (7/24) + 7.5);

    }
}
