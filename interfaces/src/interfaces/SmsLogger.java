package interfaces;

public class SmsLogger implements Logger{ //smsloggerý loggera göre uyarla.

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi : " + message);
		
	} 
}
