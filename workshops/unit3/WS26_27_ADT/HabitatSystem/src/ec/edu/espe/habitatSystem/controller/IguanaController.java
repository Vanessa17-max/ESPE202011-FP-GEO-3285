/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.habitatSystem.controller;
import ec.edu.espe.habitatSystem.model.Iguana;
import utils.FileManager;
/**
 *
 * @author FAMILIA TONATO
 */
public class IguanaController {
    
    public void save(Iguana Iguana){
       String data = Iguana.getSpeciesname() + ";" + Iguana.isSpecies() + ";" + Iguana.getSkinColor() + ";" + Iguana.getAge() + ";" + Iguana.getFeeding() + ";" + Iguana.getWeight() + ";" + Iguana.getLocation() + ";" + Iguana.getMoves();
       FileManager.save(data, "Iguana");
    }
     public String read (){
        String data;
         data = FileManager.read("Iguana.txt");
        return data;
  }
}
