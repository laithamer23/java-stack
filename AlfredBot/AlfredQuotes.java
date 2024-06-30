import java.util.Date;

public class  AlfredQuotes{

    public String guestGreeting(String name){
        return "Hello,"+name+"Lovely to see you.";
    }

    public String dateAnnouncement(){
      Date  today = new Date();
      return "It is currently"+today;
    }

    public String  respondBeforeAlexis( String conversation){
        if (conversation.contains("Alexis")){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if  (conversation.contains("Alfred")){
            return "At your service. As you wish, naturally.";

        }
        // else   ( ! conversation.contains("Alexis")&&  ! conversation.contains("Alfred") ){
            return "Right. And with that I shall retire";
        // }
        

    }
}

