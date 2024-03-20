package ar.edu.unlp.info.oo2.proyecto_ejemplo;
import java.util.ArrayList;
import java.util.List;
public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	private List<ReTweet> reTweets;
	
	
	public Usuario(String screenName) {
		super();
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
		this.reTweets = new ArrayList<ReTweet>();
	}
	
	public boolean realizarTweet(String texto) {
		if (verificarCaracteres(texto)) {
			Tweet tweet = new Tweet(texto);
			this.tweets.add(tweet);
			return true;
		}
		else return false;
	}
	
	public void eliminarTweets() {
		this.tweets.stream().forEach(t -> t.eliminar());
		this.tweets.clear();
		this.reTweets.clear();
	}
	
	public ReTweet reTweetear(Tweet tweet) {
		ReTweet retweet = new ReTweet(tweet);
		this.reTweets.add(retweet);
		return retweet;
	}
	
	private boolean verificarCaracteres(String texto) {
		return texto.length() <= 280;
	}

	public String getScreenName() {
		return screenName;
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public List<ReTweet> getReTweets() {
		return reTweets;
	}
	
	
	
}
