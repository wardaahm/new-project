/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
public class product {
    
  protected  int productID;
  protected  String name ;
  protected   float price ;
  
  
  public product (int productID ,String name ,float price){
  this.name=name;
  this.productID=productID;
  this.price=price;
  
  }

public void set_productID(int productID){
this.productID = Math.abs(productID);
}
public void set_name(String name){
this.name=name;
}
        public void set_price(float price){
        this.price=Math.abs(price);
        }
             public int get_productID(){return productID ;} 
     public String get_name(){return name;} 
     public float get_price(){return price;} 


}


