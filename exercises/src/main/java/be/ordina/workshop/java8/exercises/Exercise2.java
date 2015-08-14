package be.ordina.workshop.java8.exercises;

import be.ordina.workshop.java8.exercises.tweeter.model.Tweet;
import be.ordina.workshop.java8.exercises.tweeter.service.TweetService;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercises on Java 7 syntax.
 *
 * @author Ken Coenen
 */
public class Exercise2 {
	private static TweetService tweetService = TweetService.getInstance();

	public static Map<String, Integer> getTweetCountJeremyClarksonAndBBCTopGear() {
		// TODO In this exercise we want to count the amount of tweets of @JeremyClarkson and @BBC_TopGear
		// Create a HashMap with as key the username of the tweeter and value the amount of tweets
        // Be sure to utilise the diamond operator when initialising the HashMap and use a switch statement on the
        // username while iterating over the tweets.

		HashMap<String, Integer> tweetMap = new HashMap<>();

		for(Tweet tw: tweetService.findTweets()){
			switch (tw.getUsername()){

				case "@BBC_TopGear":
				case "@JeremyClarkson":
					increaseCounter(tweetMap, tw.getUsername());

			}


		}
        return tweetMap;
	}

	private static void increaseCounter(Map<String, Integer> map, String username) {
		Integer count = map.get(username) != null ? map.get(username) : 0;
		map.put(username, ++count);
	}
}
