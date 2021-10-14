/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;

/**
 *
 * @author Mariroco
 */
public class hotel {
   ArrayList<habitacion> hotel = new ArrayList<habitacion>();

    public ArrayList<habitacion> getHotel() {
        return this.hotel;
    }

    public void setHotel(ArrayList<habitacion> hotel) {
        this.hotel = hotel;
    }
   
   public hotel(){
        for(int i = 0; i<10; i++){
            habitacion temp = new habitacion(i+1,true);
            hotel.add(temp);
        }
   }
   
   public habitacion getHabitacion(int n){
       return hotel.get(n);
    }
}
