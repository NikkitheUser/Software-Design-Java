import java.util.Objects;

public class Bubble {
    private String emote;
    private String fullN;
    private String user;
    private boolean checkmark;
    private String text;
    static int fakeNum;//dropped user
    static int num;//okay user
    private BubbleDate date;

    public Bubble(String aEmote, String aFullN, String aUser, boolean aCheck) {
        emote= aEmote;
        fullN=aFullN;
        user=aUser;
        checkmark=aCheck;
    }

    public void setBText(String text) {


        if (text.length() > 140) {
            text = text.substring(0, 135);
            this.text = text + "...";
        }
        else{
            this.text=text;
        }
    }
public void setDate(BubbleDate date){
        this.date=date;
}
    public String getEmote() {
        return emote;
    }

    public String getFullN() {
        return fullN;
    }

    public String getText() {
        return text;
    }

    public String getUser() {
        return user;
    }

    public boolean isCheck(){
        return checkmark;
    }
public void setCheckmark(boolean checkmark){
        this.checkmark=checkmark;
}

public String toString(){
    num++;
        System.out.print( getEmote()+ " "+ getFullN()+" ");
        if(isCheck()==true){
            System.out.print(" ✓");
            System.out.println(" @"+getUser());

            System.out.println(getText());
            System.out.println(getDate());
            return(" ");
        }
        else{
            System.out.println(" @"+getUser());

            System.out.println(getText());
            System.out.println(getDate());
            return(" ");
        }
}

public BubbleDate getDate(){
        return date;
}
 public boolean equals(Bubble otherBubble){

        if(text.equals(otherBubble.text)){
            return true;
        }else{
            return false;
        }
 }

    public void plagiarismCheck(Bubble otherBubble) {
        if(getText().equals(otherBubble.getText())) {//String uses the Equal() thing
            fakeNum++;
            otherBubble.text=" [Plagiarism detected. Text removed.]";
        }
    }

    public static int getNumBubbles() {//how do we get this? should we count
        num = num- fakeNum;

        return num;
    }

    public static int getNumFakeBubbles() {
        return fakeNum;
    }


}





