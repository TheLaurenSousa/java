import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Greetings " + name + ". Lovely to see you.";
    }

    public String guestGreeting(String name, String dayPeriod){
        return "Good " + dayPeriod + ", " + name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")){
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
}

