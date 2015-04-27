/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02.Classes;

import static at.ac.fh_kufstein.uebung_02.Classes.Color.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Michael
 */
public class Auto extends Fahrzeug implements Comparable<Auto>{
    
    private boolean Klimaanlage;
    private short Airbags;

    public Auto(short Airbags, short Reifen, Color Farbe, short PS, short Tueren) {
        super(Reifen, Farbe, PS, Tueren);
        this.Klimaanlage = false;
        this.Airbags = Airbags;
    }

    public static void main(String[] args)
    {
        Auto bmw = new Auto((short)4, (short)4, black, (short)250, (short) 5);
        Auto audi = new Auto((short)8, (short)4, red, (short)80, (short) 5);
        Auto bmw2 = new Auto((short)4, (short)4, black, (short)220, (short) 5);
        Auto audi2 = new Auto((short)8, (short)4, silver, (short)180, (short) 5);
        Auto bmw3 = new Auto((short)4, (short)4, red, (short)320, (short) 5);
        
        
        List<Auto> liste = new ArrayList<>();
        liste.add(bmw);
        liste.add(audi);
        liste.add(bmw2);
        liste.add(audi2);
        liste.add(bmw3);
        
        System.out.println("Unsortiert:");
        System.out.println("-----------");
        for(Auto a : liste)
        {
            System.out.println(a);
        }
        Collections.sort(liste);
        System.out.println("Sortiert");
        System.out.println("--------");
        for(Auto a: liste)
        {
            System.out.println(a);
        }
        
        
    }
    
    
    @Override
    public int compareTo(Auto o) {
        Auto a = (Auto) o;
        if(this.getPS()==a.getPS()) return 0;
        
        if(this.getPS()>a.getPS()){
            return -1;
        }else{
            return 1;
        }
        
    }
    
    public void klimaanlageAn()
    {
        if(Klimaanlage == false)
        {
            Klimaanlage = true;
        } else
        {
            System.out.println("Klimaanlage läuft bereits!");
        }
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + getPS() + " PS und fährt mit " + getGeschwindigkeit() + " km/h und die Farbe: " + getFarbe(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void klimaanlageAus()
    {
        if(Klimaanlage == true)
        {
            Klimaanlage = false;
        } else
        {
            System.out.println("Klimaanlage bereits aus!");
        }
    }

    public boolean isKlimaanlage() {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }

    public short getAirbags() {
        return Airbags;
    }

    public void setAirbags(short Airbags) {
        this.Airbags = Airbags;
    }
}
