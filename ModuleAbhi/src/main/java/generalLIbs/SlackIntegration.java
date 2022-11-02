package generalLIbs;

import org.testng.annotations.Test;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

public class SlackIntegration {
	
	//public static String webHookUrl="https://hooks.slack.com/services/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";
	public static String webHookUrl="https://hooks.slack.com/services/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";

	//public static String oAuthToekn="xoxb-4307696229700-4298662741238-V9uQaQobSV795u6HwQmr5i2V";
	public static String oAuthToekn= "xoxb-4307696229700-4330625682320-zhLIqeNQDFNxnePJ17W4jnxk";
	public static String slackChaneel="autodemojosephchaneel";
		
	
	public static void main(String args[])
	{
		//System.out.println("test message");
		sendMessageToSlack("First message to slack via Abhibus failures");
	} 
	
	
	public static void sendMessageToSlack(String message)
	{
	try 
	{
		StringBuilder msgbuilder = new StringBuilder();
		msgbuilder.append(message);
		
		Payload payload = Payload.builder().channel(message).text(msgbuilder.toString()).build();
		
		WebhookResponse wbResp = Slack.getInstance().send(webHookUrl, payload);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}

}
