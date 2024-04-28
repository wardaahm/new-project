/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
public class customer {
   private int customerID;
   private String name;
    private String address;
            public customer (int customerID ,String name,String address){
            
            this.name=name;
            this.customerID=customerID;
            this.address=address;
            
            }
       public void set_customerID(int customerID){
       this.customerID=Math.abs(customerID);}
    public void set_name(String name){
    this.name=name;}
    public void set_address(String address){this.address=address;}

       public int get_customerID(){return customerID;} 
   public String get_name(){return name;} 
   public String get_address(){return address;} 

}


