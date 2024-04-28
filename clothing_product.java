/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
public class clothing_product extends product {

    private String size;
    private String fabric;

    public clothing_product(int id, String name, float price, String size, String fabric) {
        super(id, name, price);
        this.fabric = fabric;
        this.size = size;
    }

    public void set_size(String size) {
        this.size = size;
    }

    public void set_fabric(String fabric) {
        this.fabric = fabric;
    }

    public String get_size() {
        return size;
    }

    public String get_fabric() {
        return fabric;
    }

}
