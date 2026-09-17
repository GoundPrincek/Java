public class types {
    public static void main(String[] args) {
        // Types
        // Primitive data Types : Byte-1 ,short-2 , int-4 , long - 8 , float -4 ,double-8
        //char-2,a,b,c,d   , boolean -1 true/false

        byte age = 30;
        int number = 1234657890;
        long number2 = 12345678910L;
        float pi = 3.15F;
        char letter = '@';
        boolean isAddult = true;

//       ## Non primitive datatypes
//       #String , array , objects ,class , Interface
        String name = new String("Prince");
        System.out.println(name.length());

//         Strings
//     #concatenate(+)
        String name1 = "Gound";
        String name2 = "Prince";
        String name3 = name1 + name2;
        System.out.println(name3);

//      #CharAt  => positions of the character we can know from this
        String name0 = "Gound";
        String name4 = "Prince";
        System.out.println(name0.charAt(2));

//     #replace
//        String newname= name0.replace(oldChar:'G' , newChar:"B");
//        System.out.println(newname);


//       #Substring

        System.out.println(name.substring(0,4));
    }
}



