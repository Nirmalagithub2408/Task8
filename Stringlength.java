public class Stringlength {

    
    public static void main(String [] arg){

        String str1 = "Guvi Geek";
        System.out.println("The lenght of the str1 "+ str1.length());
       char []char_arrr = str1.toCharArray();

        for (char c : char_arrr) {
            System.out.print(c+ "");
        }
    }
    
}
    

