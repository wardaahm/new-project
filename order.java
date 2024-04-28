/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
public class order {
    
  final  int customerid;
    final int nproduct;
  final product [] products  ;
  final float totalprice; 
 
 public order(int id,int productnum,product [] prod,float totalpric){
   customerid= id;
     nproduct =productnum;
   products= prod ;
  totalprice=totalpric;
 }

public void orderinfo( ){
   System.out.println("order ID :1");
    System.out.println("customer ID"+customerid);
    System.out.println("total price"+totalprice);
    for (int i = 0; i < nproduct; i++) {
        System.out.println(products[i].get_name()+products[i].get_price());

}

}

}
