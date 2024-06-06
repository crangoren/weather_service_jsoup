package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URL;

public class Parser {
    private static Document getPage() throws IOException {
        String url = "https://www.accuweather.com/en/gr/thessaloniki/186405/weather-forecast/186405";
        Document page = Jsoup.parse(new URL(url), 4000);
        return page;
    }
    public static void main(String[] args) throws IOException {
        Document page = getPage();
        Element weather = page.selectFirst("div[class=temp]");
        System.out.println(getPage());
    }
}