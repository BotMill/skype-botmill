package co.aurasphere.botmill.skype;

import co.aurasphere.botmill.skype.configuration.Authentication;

public class SkypeBotMillContext {
	/** The instance. */
	private static SkypeBotMillContext instance;

	/** The authentication. */
	private Authentication authentication;

	/** The webhook url. */
	private String messageEndpointUrl;
	
	public static SkypeBotMillContext getInstance() {
		if (instance == null) {
			instance = new SkypeBotMillContext();
		}
		return instance;
	}
	
	/**
	 * This is the main setup method. 
	 *
	 * @param username
	 *            the username
	 * @param apiKey
	 *            the api key
	 */
	public void setup(String clientId, String clientSecret) {
		this.authentication = new Authentication();
		this.authentication.setClientId(clientId);
		this.authentication.setClientSecret(clientSecret);
	}
}
