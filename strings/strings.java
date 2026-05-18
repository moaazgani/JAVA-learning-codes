public class strings {
    public static void main(String args[]){
        String firstname = "Tony";
        String lastname = "Tony";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname.length());

         System.out.println(fullname.substring(0, 4));

        //print characters one by one
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

        if(firstname.equals(lastname)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //DO NOT USE == to check for string equality
       //Gives correct answer here
       if(firstname == lastname) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //Gives incorrect answer here because "==" sometime gives wrong answers.🙂<-
       if(new String("Tony") == new String("Tony")) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }

    }
}