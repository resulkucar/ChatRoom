import java.util.Scanner;
public class Main {
    private static String CurrentPerson;
    private static String CurrentMessage;
    private static String CurrentQuestion;
    private static String type;
    private static String question;
    private static String message;

    public static void main(String[] args) {
        while(true) {

            Scanner in = new Scanner(System.in);
            Scanner in1 = new Scanner(System.in);
            System.out.println("Please begin chat!");
            System.out.println("Current People in chat: Eric and Tony\n");
            System.out.println("Sender Name: ");
            String S = in.nextLine();
            if(S.equalsIgnoreCase("end"))
            {
                System.exit(0);
            }
            CurrentPerson = S;
            System.out.println("Receiver Name: ");
            String R = in.nextLine();
            if(R.equalsIgnoreCase("end"))
            {
                System.exit(0);
            }
            System.out.println("Question or Message : ");
            String QorM = in.nextLine();
            if (QorM.equalsIgnoreCase("question")) {
                question = QorM;
                System.out.println("Text: ");
                CurrentQuestion= in1.nextLine();
            } else if (QorM.equalsIgnoreCase("message")) {
                message = QorM;
                System.out.println("Text: ");
                CurrentMessage = in1.nextLine();
            }
            if(QorM.equalsIgnoreCase("end"))
            {
                System.exit(0);
            }
            if(QorM.equalsIgnoreCase("Message")){
                type=" said to ";
            }else if(QorM.equalsIgnoreCase("Question"))
                type=" asked ";

            if (CurrentPerson.equalsIgnoreCase("Eric")&&QorM.equalsIgnoreCase("question")) {
                System.out.println("\n"+CurrentPerson +  type + R + ", '" +CurrentQuestion +"'\n");
            } else if (CurrentPerson.equalsIgnoreCase("Eric")&&QorM.equalsIgnoreCase("message")) {
                System.out.println("\n"+CurrentPerson +  type + R + ", '" +CurrentMessage +"'\n");
            } else if(CurrentPerson.equalsIgnoreCase("Tony")&&QorM.equalsIgnoreCase("question"))
                System.out.println("\n" + CurrentPerson + type + R + ", '" + CurrentQuestion+"'\n");
            else if(CurrentPerson.equalsIgnoreCase("Tony")&&QorM.equalsIgnoreCase("message"))
                System.out.println("\n" + CurrentPerson + type + R + ", '" + CurrentMessage+"'\n");

            //Person p1 = new Person(S,null,null,null);
        }


    }

}
