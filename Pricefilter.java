package Pricelist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pricelist2.Pricefilter2;

public class Pricefilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new FirefoxDriver();
		//get url
		d.get("https://disneyworld.disney.go.com/resorts/");
   Pricefilter2 filter=new Pricefilter2(d);
   filter.Pricerange();
   filter.Pricerange3();
	}

}
