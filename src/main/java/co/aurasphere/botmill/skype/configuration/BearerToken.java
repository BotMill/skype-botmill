package co.aurasphere.botmill.skype.configuration;

public class BearerToken  {
	private String tokenType;
	private String expiresIn;
	private String extExpiresIn;
	private String accessToken;
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	public String getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getExtExpiresIn() {
		return extExpiresIn;
	}
	public void setExtExpiresIn(String extExpiresIn) {
		this.extExpiresIn = extExpiresIn;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
}
