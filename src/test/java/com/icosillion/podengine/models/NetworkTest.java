package com.icosillion.podengine.models;

import com.icosillion.podengine.exceptions.InvalidFeedException;
import com.icosillion.podengine.exceptions.MalformedFeedException;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Podcast unit test class.
 */
public class NetworkTest {

    @Test
    public void testRelayFeed() {
        try {
            Podcast podcast = new Podcast(new URL("https://www.relay.fm/master/feed"));
            assertEquals("Relay FM Master Feed", podcast.getTitle());
        } catch (InvalidFeedException | MalformedURLException | MalformedFeedException e) {
            fail(e.getMessage());
        }
    }

}
