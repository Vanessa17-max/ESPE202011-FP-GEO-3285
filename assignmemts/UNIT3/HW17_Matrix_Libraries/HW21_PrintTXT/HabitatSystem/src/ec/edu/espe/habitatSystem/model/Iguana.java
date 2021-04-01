/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.habitatSystem.model;

/**
 *
 * @author FAMILIA TONATO
 */
public class Iguana {

    public static String txt;
   private String SpeciesName; 
   private String Species;  
   private String SkinColor;  
   private int Age;
   private String Feeding;
   private int Weight;
   private String Location;
   private String Moves;

    public Iguana(String Speciesname, String Species, String SkinColor, int Age, String Feeding, int Weight, String Location, String Moves) {
        this.SpeciesName = Speciesname;
        this.Species = Species;
        this.SkinColor = SkinColor;
        this.Age = Age;
        this.Feeding = Feeding;
        this.Weight = Weight;
        this.Location = Location;
        this.Moves = Moves;
    }
       /**
     * @return the Speciesname
     */
    public String getSpeciesname() {
        return SpeciesName;
    }

    /**
     * @param Speciesname the Speciesname to set
     */
    public void setSpeciesname(String Speciesname) {
        this.SpeciesName = Speciesname;
    }

    /**
     * @return the Species
     */
    public String isSpecies() {
        return Species;
    }

    /**
     * @param Species the Species to set
     */
    public void setSpecies(String Species) {
        this.Species = Species;
    }

    /**
     * @return the SkinColor
     */
    public String getSkinColor() {
        return SkinColor;
    }

    /**
     * @param SkinColor the SkinColor to set
     */
    public void setSkinColor(String SkinColor) {
        this.SkinColor = SkinColor;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the Feeding
     */
    public String getFeeding() {
        return Feeding;
    }

    /**
     * @param Feeding the Feeding to set
     */
    public void setFeeding(String Feeding) {
        this.Feeding = Feeding;
    }

    /**
     * @return the Weight
     */
    public int getWeight() {
        return Weight;
    }

    /**
     * @param Weight the Weight to set
     */
    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * @return the Moves
     */
    public String getMoves() {
        return Moves;
    }

    /**
     * @param Moves the Moves to set
     */
    public void setMoves(String Moves) {
        this.Moves = Moves;
    }

   
}
