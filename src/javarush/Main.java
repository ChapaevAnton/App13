package javarush;

public class Main {


    public static void main(String[] args) {


        String str = "TESTHGGOTSRERERERK:LRK:LKLK";

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            String duplicateSearch = String.valueOf(str.charAt(i));
            if (stringBuilder.indexOf(duplicateSearch) == -1) {
                stringBuilder.append(duplicateSearch);
            }
        }

        System.out.println(stringBuilder);

    }


}
