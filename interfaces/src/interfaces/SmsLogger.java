package interfaces;

public class SmsLogger implements Logger{ //smslogger� loggera g�re uyarla.

	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi : " + message);
		
	} 
}
