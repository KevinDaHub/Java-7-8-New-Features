package be.ordina.workshop.java8.exercises;

import be.ordina.workshop.java8.exercises.tweeter.model.Tweet;
import be.ordina.workshop.java8.exercises.tweeter.service.TweetService;
import be.ordina.workshop.java8.exercises.tweeter.util.TweetNotFoundException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Exercises based on Lambdas, Streams and the TweetService.
 *
 * @author Yannick De Turck
 */
public class Exercise3 {
    private static TweetService tweetService = TweetService.getInstance();

    public static void main(String[] args) {
    }

    // TODO Implement this method using streams to return a unique List of tweetusers.
    public static List<String> getTweeters() {

      return   tweetService.findTweets().stream().map(Tweet::getUsername).distinct().collect(Collectors.toList());

       }

    // TODO Implement this method using streams to return the tweetcount for the given username
    public static Long getTweetCount(String username) {

        return  tweetService.findTweets(t->t.getUsername().equals(username)).stream().count();



    }

    // TODO Implement this method using streams and getTweetCount to return a Map containing the
    // tweetcount for each username
    public static Map<String, Integer> listUsersWithTweetCount() {

        Map<String, Integer> map = new HashMap<>();

       tweetService.findTweets().forEach(t-> map.put(t.getUsername(),map.getOrDefault(t.getUsername(),0)+1) );

        return map;

    }

    // TODO Implement this method using streams to lookup the Tweet with the highest retweetamount
    // for a given username.
    public static Optional<Tweet> getTopTweet(String username) {

        return tweetService.findTweets(t -> t.getUsername().equals(username)).stream().max(Comparator.comparing(t->t.getRetweets()));


    }

    // TODO Implement this method using streams to return a sorted list based on the (lambda) comparator
    // passed by the caller
    public static List<Tweet> getSortedTweets(Comparator<Tweet> comparator) {

        return tweetService.findTweets().stream().sorted(comparator).collect(Collectors.toList());
     }

    // TODO Implement this method using the TweetService.findTweet which returns an Optional<Tweet>,
    // if a value exists return the tweettext otherwise throw a TweetNotFoundException
    public static String getTweetText(Long tweetId) throws TweetNotFoundException {





          return   tweetService.findTweet(tweetId).orElseThrow(()->new TweetNotFoundException(tweetId)).getText();





    }


}
