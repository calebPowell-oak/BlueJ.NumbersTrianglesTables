 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String out = "";
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                out += String.format("%3d |",j*i);
            }
            out += "\n";
        }
        return out;
    }

    public static String getLargeMultiplicationTable() {
        String out = "";
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                out += String.format("%3d |",j*i);
            }
            out += "\n";
        }
        return out;
    }

    public static String getMultiplicationTable(int tableSize) {
        String out = "";
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                out += String.format("%3d |",j*i);
            }
            out += "\n";
        }
        return out;
    }
}
