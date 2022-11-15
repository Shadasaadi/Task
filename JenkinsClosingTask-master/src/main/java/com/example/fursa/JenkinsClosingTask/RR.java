package com.example.fursa.JenkinsClosingTask;


import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class RR {
    private List mylst;
    public RR(){

    }
    public List importData() throws IOException {
        try {
            URL url = new URL("http://www.ynet.co.il/Integration/StoryRss2.xml");
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(url));
            mylst = feed.getEntries();

            return mylst;
        } catch (FeedException e) {
            throw new RuntimeException(e);
        }


    }

}