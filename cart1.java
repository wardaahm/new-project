/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
public class cart1 {

    private int customerid;
    private int nproducts;
    private float totalprice = 0;
    private product[] products;

    public cart1(int customerid, int nproduct) {
        this.customerid = customerid;
        this.nproducts = nproducts;
        products = new product[nproducts];

    }

    public cart1(int customerid, int nproduct, String[] products) {
    }

    public void set_customerid(int customerid) {
        this.customerid = Math.abs(customerid);
    }

    public int get_customerid() {
        return customerid;
    }

    public void set_nproduct(int nproducts) {
        this.nproducts = nproducts;
    }

    public int get_nproduct() {
        return nproducts;
    }

    public void set_products(int nproduct) {
        products = new product[nproducts];

    }

    public void addproducts(product p, int i) {

        products[i] = p;
        totalprice += p.get_price();
    }

    public product[] get_products() {
        return products;
    }

    public void removeproduct(int productnum) {
        for (int i = 1; productnum <= nproducts; i++) {
            if (productnum == 1) {
                products[i] = null;
            } else if (productnum == 2) {
                products[i] = null;
            } else if (productnum == 3) {
                products[i] = null;
            } else {
                System.out.println("there isn't more product");
            }
        }
    }

    public float calculatePrice() {

        return totalprice;
    }

}
