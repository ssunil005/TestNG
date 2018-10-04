package com.qa.pahub;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class BrokenLinks {
	String pageUrl = "http://www.vpl.ca";
	@Test
	public void testBrokenLinks()
	 throws IOException, InterruptedException {
		Document page = getPage(pageUrl);
		  for (Element link : getLinksFromPage(page)) {
		    String url = getHrefValueFromLink(link);
		    if (isUrlValid(url))
		    	 assertTrue(getPageResponseCode(url) < 400);
		  }
		}
	// connects to url, gets the document
	private Document getPage(String url) throws IOException
	{
	  return Jsoup.connect(pageUrl).get();
	}
	// gets A elements from page, returns them Elements collection
	private Elements getLinksFromPage(Document page)
	{
	  return page.select("a");
	}
	 
	// extracts the href attribute from an element
	private String getHrefValueFromLink(Element link)
	{
	  return link.attr("href");
	}
	 
	// checks if the url includes http
	private Boolean isUrlValid(String href)
	{
	  return href.indexOf("http") >= 0;
	}	  
	


/*
returns the page response code by
1. creating an httpConnection
2. connecting to the connection
3. getting the response code for the connection
*/
private int getPageResponseCode(String url) throws IOException
{
  int responseCode = 0;
  try {
   HttpURLConnection httpConnection = createHttpConnection(url);
   httpConnection.connect();
   responseCode = httpConnection.getResponseCode();
  }
  catch (ProtocolException | SSLException exception) {
   System.out.println("could not open " + url);
  }
  return responseCode;
		