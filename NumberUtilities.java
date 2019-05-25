


public class NumberUtilities {

    public static String getRange(int stop) {
        String range = "";
            for(int i = 0; i < stop; i++){
                range += i;
            }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(int i = start; i < stop; i++){
            range += i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for(int i = start; i < stop; i+=step){
            range += i;
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String list = "";
        boolean evenSure = false;
        for(int i = start; i < stop;){
            if(evenSure){
                list += i;
                i+=2;
            } else {
                if(i%2==0){
                    evenSure = true;
                    list += i;
                    i+=2;
                } else {
                    i++;
                }
            }
        }
        return list;
    }


    public static String getOddNumbers(int start, int stop) {
        String list = "";
        boolean falseSure = false;
        for(int i = start; i < stop;){
            if(falseSure){
                list += i;
                i+=2;
            } else {
                if(i%2==1){
                    falseSure = true;
                    list += i;
                    i+=2;
                } else {
                    i++;
                }
            }
        }
        return list;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String output = "";
        for(int i = start; i <= stop; i++){
            output += Math.round(Math.pow(i, exponent));
            System.out.println(output);
        }
        return output;
    }
}
