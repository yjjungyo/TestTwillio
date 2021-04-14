
    //AC02170191774650c06810101ccbfe3733
    //5d8ef421c8b24ce6892c18eb2a5cb5f6
    //+15868003710
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

//https://www.twilio.com/

public class TestMain {
    // Find your Account Sid and Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC02170191774650c06810101ccbfe3733";
    public static final String AUTH_TOKEN = "5d8ef421c8b24ce6892c18eb2a5cb5f6";


    public static void main(String[] args) {

        Twilio.destroy();
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+821062350994"), //receiver
                new com.twilio.type.PhoneNumber("+15868003710"),  //sender, twilio phone number
                "Hi there!!!!")
                .create();

        System.out.println(message.getSid());
    }
}