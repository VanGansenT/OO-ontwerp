package ui;

import domain.WoordCode;

public class test {
    public static void main(String[] args){
        WoordCode code = new WoordCode();
        String input = "dit is zeer geheim!";
        String omgekeerd = code.omgekeerdeCode(input);
        String caesar = code.caesarCode(input);

        System.out.println(omgekeerd);
        System.out.println(code.decodeOmgekeerdeCode(omgekeerd));
        System.out.println(caesar);
        System.out.println(code.decodeCeasarCode(caesar));
    }
}
