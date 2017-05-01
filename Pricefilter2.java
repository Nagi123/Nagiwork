package Pricelist2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pricefilter2 {
	WebDriver d;
	By Pricerange=By.xpath(".//*[@id='priceRangeResorts']/legend") ;
	By Pricerange1=By.xpath(".//*[@id='priceRangeResorts']/div/ol/li[1]/label/span[1]");
    By Pricerange2=By.xpath(".//*[@id='priceRangeResorts']/div/ol/li[2]/label/span[1]");
    By Pricerange3=By.xpath(".//*[@id='priceRangeResorts']/div/ol/li[3]/label/span[1]");
    
    //.//*[@id='priceRangeResorts']/legend/span[2]

    
   public Pricefilter2 (WebDriver d){
    	this.d=d;
    }
 public void Pricerange (){
	 d.findElement(Pricerange).click();
	 
 }
 public void Pricerange1(){
	 d.findElement(Pricerange1).click();
 }
public void Pricerange2(){
	d.findElement(Pricerange2).click();
	
}
public void Pricerange3(){
	d.findElement(Pricerange3).click();
}

}
