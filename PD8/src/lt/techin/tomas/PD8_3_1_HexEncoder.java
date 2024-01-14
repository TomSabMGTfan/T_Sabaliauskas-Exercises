package lt.techin.tomas;

public class PD8_3_1_HexEncoder {
    public String encodeToHex(String text){
        StringBuilder hexChars = new StringBuilder();
        for (char ch : text.toCharArray()){
            hexChars.append(String.format("%02x", (int) ch));    //"%02x" --> hex
        }
        return hexChars.toString();
    }
}
