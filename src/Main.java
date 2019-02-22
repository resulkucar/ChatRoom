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
            Person p1 = new Person("Eric", "J", "Matson", "003054596");
            Person p2 = new Person("Tony", "K", "Smith", "003076596");
            Scanner in = new Scanner(System.in);
            Scanner in1 = new Scanner(System.in);
            System.out.println("Please begin chat!");
            System.out.println("Current People in chat: Eric and Tony\n");
            System.out.println("Sender Name: ");
            String Sender = in.nextLine();
            if(p1.getFname().equals(Sender)){
                Sender = p1.getFname();}
            if(p2.getFname().equalsIgnoreCase(Sender)) {
                Sender=p2.getFname();
            }
            if(Sender.equalsIgnoreCase("end"))
            {
                System.exit(0);
            }
            CurrentPerson = Sender;
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
                if(p1.getFname().equals("Eric")){
                    p1.setQuestion(CurrentQuestion);}
                if(p2.getFname().equalsIgnoreCase("Tony")) {
                    p2.setQuestion(CurrentQuestion);;
                }
            } else if (QorM.equalsIgnoreCase("message")) {
                message = QorM;
                System.out.println("Text: ");
                CurrentMessage = in1.nextLine();
                p1.setMessage(CurrentMessage);
                if(p1.getFname().equals("Eric")){
                    p1.setMessage(CurrentMessage);}
                if(p2.getFname().equalsIgnoreCase("Tony")) {
                    p2.setMessage(CurrentMessage);;
                }
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
                System.out.println("\n"+Sender +  type + R + ", '" +p1.getQuestion() +"'\n");
            } else if (CurrentPerson.equalsIgnoreCase("Eric")&&QorM.equalsIgnoreCase("message")) {
                System.out.println("\n"+Sender +  type + R + ", '" +p1.getMessage()+"'\n");
            } else if(CurrentPerson.equalsIgnoreCase("Tony")&&QorM.equalsIgnoreCase("question"))
                System.out.println("\n" + Sender + type + R + ", '" + p2.getQuestion()+"'\n");
            else if(CurrentPerson.equalsIgnoreCase("Tony")&&QorM.equalsIgnoreCase("message"))
                System.out.println("\n" + Sender + type + R + ", '" + p2.getMessage()+"'\n");


        }


    }

}
