/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_code;

/**
 *
 * @author verma
 */

public class cars 
{
    String name;
    String brand;
    String fuel;
    String body;
    int security;
    int rentwithdriver;
    int rentwithoutdriver;
    String description;
    String photo;
    public cars(String name, String brand, String fuel, String body, int security, int rentwithdriver, int rentwithoutdriver, String description, String photo) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
        this.body = body;
        this.security = security;
        this.rentwithdriver = rentwithdriver;
        this.rentwithoutdriver = rentwithoutdriver;
        this.description = description;
        this.photo = photo;
    }
}