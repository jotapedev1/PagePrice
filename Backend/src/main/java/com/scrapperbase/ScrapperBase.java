package com.scrapperbase;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

public class ScrapperBase {
    public static void main(String[] args){
        String url = "https://books.toscrape.com/";

        try{
            Document document = Jsoup.connect(url).get();
            ArrayList<Element> books = document.select(".product_pod");

            for(Element book: books){
                String title = book.select("h3 > a").text();
                String price = book.select(".price_color").text().substring(1);

                System.out.println(title + " || " + price);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
