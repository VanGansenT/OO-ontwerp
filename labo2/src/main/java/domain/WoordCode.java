package domain;

public class WoordCode {

    public char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'};

    public WoordCode(){
    }

    public String caesarCode(String s){
        String lower = s.toLowerCase();
        char[] input = lower.toCharArray();
        String newString = "";
        for (char c:input) {
            if(Character.isLetter(c)){
                int nummer = 1;
                for (char l:letters) {
                    if(l == c){
                        if(nummer >= 3) {
                            newString += letters[nummer - 4];
                        }else{
                            nummer = nummer+22;
                            newString += letters[nummer];;
                        }
                    }else{
                        nummer++;
                    }
                }
            }else{
                newString += c;
            }
        }
        return newString;
    }

    public String omgekeerdeCode(String s){
        int lengte = s.length()-1;
        String newString = "";
        for (int i = lengte; i >= 0 ; i--) {
            newString += s.charAt(i);
        }
        return newString;
    }

    public String decodeOmgekeerdeCode(String s){
        return omgekeerdeCode(s);
    }

    public String decodeCeasarCode(String s){
        char[] input = s.toLowerCase().toCharArray();
        String newString = "";
        for (char c:input) {
            if(Character.isLetter(c)){
                int nummer = 0;
                for (char l:letters) {
                    if(l == c){
                        if(nummer <= 22){
                            newString += letters[nummer+3];
                        }else{
                         nummer = nummer -22;
                         newString += letters[nummer];
                        }
                    }else{
                        nummer++;
                    }
                }
            }else{
                newString += c;
            }
        }
        return newString;
    }
}
