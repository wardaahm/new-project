/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
    
public class Electronic_Product extends product {
  private  String brand;
  private  int warrentyperiod;
    
    public Electronic_Product(int id, String name, float price,int warrentyperiod ,String brand){
            super(id, name, price);
            this.warrentyperiod=warrentyperiod;
            this.brand=brand;

    }
    public void set_brand(String brand){
    this.brand=brand;}
    public void set_warrentyperiod(int warrentyperiod){this.warrentyperiod=Math.abs(warrentyperiod);}
   public String get_brand(){return brand;} 
     public int get_warrentyperiod(){return warrentyperiod;} 
  
}    