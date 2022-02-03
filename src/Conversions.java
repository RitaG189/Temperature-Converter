public class Conversions {

    private String scale1, scale2;
    private int text1;


    public Conversions(int text1, String scale1, String scale2) {
        this.text1 = text1;
        this.scale1 = scale1;
        this.scale2 = scale2;
    }

    public int setScale(){

        scale1 = getScale(scale1);
        scale2 = getScale(scale2);

        int finalRes = checkScale(scale1, scale2);
        return finalRes;
    }

    public String getScale(String scale) {

        if(scale.equals("Fahrenheit (°F)")) {
            return "F";
        }

        if(scale.equals("Celsius (°C)")) {
            return "C";
        }

        if(scale.equals("Kelvin (K)")) {
            return "K";
        }

        if(scale.equals("Rankine (°R)")) {
            return "R";
        }

        if(scale.equals("Delisle (°D)")) {
            return "D";
        }

        if(scale.equals("Newton (°N)")) {
            return "N";
        }

        if(scale.equals("Réaumur (°Ré)")) {
            return "Re";
        }

        if(scale.equals("Rømer (°Rø)")) {
            return "Ro";
        }

        return "Err";
    }

    public int checkScale(String scale1, String scale2) {

        if(scale1.equals("F")) {

            var conv = new ConvertFromF();

            switch(scale2) {
                case "C":
                    int finalRes = conv.FtoC(text1);
                    return finalRes;
                    //break;

                case "K":
                    conv.FtoK(text1);
                    break;

                case "R":
                    conv.FtoR(text1);
                    break;

                case "D":
                    conv.FtoD(text1);
                    break;

                case "N":
                    conv.FtoN(text1);
                    break;

                case "Re":
                    conv.FtoRe(text1);
                    break;

                case "Ro":
                    conv.FtoRo(text1);
                    break;

            }
        }
        if(scale1.equals("C")) {

        }
        if(scale1.equals("K")) {

        }
        if(scale1.equals("R")) {

        }
        if(scale1.equals("D")) {

        }
        if(scale1.equals("N")) {

        }
        if(scale1.equals("Re")) {

        }
        if(scale1.equals("Ro")) {

        }

        return 1;
    }


}
