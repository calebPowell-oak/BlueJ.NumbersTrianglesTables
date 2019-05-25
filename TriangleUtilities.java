 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String out = "";
        for(int i = 0; i < numberOfStars; i++){
            out += "*";
        }
        return out;
    }
    
    public static String getTriangle(int numberOfRows) {
        String out = "";
        for(int i = 0; i < numberOfRows; i++){
            out += getRow(i + 1) + "\n";
        }
        return out;
    }


    public static String getSmallTriangle() {
        String out = "";
        for(int i = 0; i < 4; i++){
            out += getRow(i + 1) + "\n";
        }
        return out;
    }

    public static String getLargeTriangle() {
        String out = "";
        for(int i = 0; i < 9; i++){
            out += getRow(i + 1) + "\n";
        }
        return out;
    }
}
