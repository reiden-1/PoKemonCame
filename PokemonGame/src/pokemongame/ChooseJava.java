/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemongame;

/**
 *
 * @author Den Drei Lacsina
 */

public class ChooseJava {
    
    

    private String PlayerPokemon1name = "bulbasor";
    private int PlayerPokemon1HP = 100;
    private int PlayerPokemon1Mana = 50;
//    private String []PlayerPokemon1Attacks ={"Seed Bomb", "Sludge Bomb", "Power Whip"};
    private String PlayerPokemon1Attacks1 = "Seed Bomb";
    private int PlayerPokemon1ManaCost1 = 10;
    private String PlayerPokemon1Attacks2 = "Sludge Bomb";
    private int PlayerPokemon1ManaCost2 = 15;
    private String PlayerPokemon1Attacks3 = "Power Whip";
    private int PlayerPokemon1ManaCost3 = 20;
//    private int [] PlayerPokemon1ManaCost = {10, 15, 20};
    private boolean Status1 = false;
    private String imagePath1 = "C:\\Users\\Den Drei Lacsina\\Desktop\\PokemonGame\\src\\pokemongame\\pokemon1.jpg";

    public String getPlayerPokemon1name(){
    return PlayerPokemon1name;
    }
    public int getPlayerPokemon1HP(){
        return PlayerPokemon1HP;
    }
    public void setPlayerPokemon1HP(int hp){
        this.PlayerPokemon1HP=PlayerPokemon1HP-hp;
    }
    public int getPlayerPokemon1Mana(){
        return PlayerPokemon1Mana;
    }
    public void setPlayerPokemon1Mana(int mana){
        this.PlayerPokemon1Mana = PlayerPokemon1Mana-mana;
    }
    public String getimagePath1(){
        return imagePath1;
    }
    public String getPlayerPokemon1Attacks1(){
        return PlayerPokemon1Attacks1;
    }
    public String getPlayerPokemon1Attacks2(){
        return PlayerPokemon1Attacks2;
    }
    public String getPlayerPokemon1Attacks3(){
        return PlayerPokemon1Attacks3;
    }
    public int getPlayerPokemon1ManaCost1(){
        return PlayerPokemon1ManaCost1;
    }
    public int getPlayerPokemon1ManaCost2(){
        return PlayerPokemon1ManaCost2;
    }
    public int getPlayerPokemon1ManaCost3(){
        return PlayerPokemon1ManaCost3;
    }
    
    
    

    private String PlayerPokemon2name = "Squirtle";
    private int PlayerPokemon2HP = 100;
    private int PlayerPokemon2Mana = 50;
//    private String []PlayerPokemon2Attacks ={"Aqua Jet", "Aqua Tail", "Water Pulse"};
    private String PlayerPokemon2Attacks1 = "Aqua Jet";
    private String PlayerPokemon2Attacks2 = "Aqua Tail";
    private String PlayerPokemon2Attacks3 = "Water Pulse";
    private int PlayerPokemon2ManaCost1 = 10;
    private int PlayerPokemon2ManaCost2 = 15;
    private int PlayerPokemon2ManaCost3 = 20;
//    private int [] PlayerPokemon2ManaCost = {10, 15, 20};
    private boolean Status2 = false;
    private String imagePath2 = "C:\\Users\\Den Drei Lacsina\\Desktop\\PokemonGame\\src\\pokemongame\\pokemon2.jpg";

    public String getPlayerPokemon2name(){
    return PlayerPokemon2name;
    }
    public int getPlayerPokemon2HP(){
        return PlayerPokemon2HP;
    }
    public void setPlayerPokemon2HP(int hp){
        this.PlayerPokemon2HP=PlayerPokemon2HP-hp;
    }
    public int getPlayerPokemon2Mana(){
        return PlayerPokemon2Mana;
    }
    public void setPlayerPokemon2Mana(int mana){
        this.PlayerPokemon2Mana = PlayerPokemon2Mana-mana;
    }
    public String getimagePath2(){
        return imagePath2;
    }
    public String getPlayerPokemon2Attacks1(){
        return PlayerPokemon2Attacks1;
    }
    public String getPlayerPokemon2Attacks2(){
        return PlayerPokemon2Attacks2;
    }
    public String getPlayerPokemon2Attacks3(){
        return PlayerPokemon2Attacks3;
    }
    public int getPlayerPokemon2ManaCost1(){
        return PlayerPokemon2ManaCost1;
    }
    public int getPlayerPokemon2ManaCost2(){
        return PlayerPokemon2ManaCost2;
    }
    public int getPlayerPokemon2ManaCost3(){
        return PlayerPokemon2ManaCost3;
    }
    
    private String PlayerPokemon3name = "Charmander";
    private int PlayerPokemon3HP = 100;
    private int PlayerPokemon3Mana = 50;
//    private String []PlayerPokemon3Attacks ={"Flamethrower", "Flame Charge", "Flame Burst"};
    private String PlayerPokemon3Attacks1 = "Flamethrower";
    private String PlayerPokemon3Attacks2 = "Flame Charge";
    private String PlayerPokemon3Attacks3 = "Flame Burst";
//    private int [] PlayerPokemon3ManaCost = {10, 15, 20};
    private int PlayerPokemon3ManaCost1 = 10;
    private int PlayerPokemon3ManaCost2 = 15;
    private int PlayerPokemon3ManaCost3 = 20;
    
    private boolean Status3 = false;
    private String imagePath3 = "C:\\Users\\Den Drei Lacsina\\Desktop\\PokemonGame\\src\\pokemongame\\pokemon3.jpg";

    public String getPlayerPokemon3name(){
    return PlayerPokemon3name;
    }
    public int getPlayerPokemon3HP(){
        return PlayerPokemon3HP;
    }
    public void setPlayerPokemon3HP(int hp){
        this.PlayerPokemon3HP=PlayerPokemon3HP-hp;
    }
    public int getPlayerPokemon3Mana(){
        return PlayerPokemon3Mana;
    }
    public void setPlayerPokemon3Mana(int mana){
        this.PlayerPokemon3Mana = PlayerPokemon3Mana-mana;
    }
    public String getimagePath3(){
        return imagePath3;
    }
    public String getPlayerPokemon3Attacks1(){
        return PlayerPokemon3Attacks1;
    }
    public String getPlayerPokemon3Attacks2(){
        return PlayerPokemon3Attacks2;
    }
    public String getPlayerPokemon3Attacks3(){
        return PlayerPokemon3Attacks3;
    }
    public int getPlayerPokemon3ManaCost1(){
        return PlayerPokemon3ManaCost1;
    }
    public int getPlayerPokemon3ManaCost2(){
        return PlayerPokemon3ManaCost2;
    }
    public int getPlayerPokemon3ManaCost3(){
        return PlayerPokemon3ManaCost3;
    }


    //computer pokemons
    private String ComputerPokemon1name = "bulbasor";
    private int ComputerPokemon1HP = 100;
    private int ComputerPokemon1Mana = 50;
//    private String []ComputerPokemon1Attacks ={"Seed Bomb", "Sludge Bomb", "Power Whip"};
    private String ComputerPokemon1Attacks1 = "Seed Bomb";
    private int ComputerPokemon1ManaCost1 = 10;
    private String ComputerPokemon1Attacks2 = "Sludge Bomb";
    private int ComputerPokemon1ManaCost2 = 15;
    private String ComputerPokemon1Attacks3 = "Power Whip";
    private int ComputerPokemon1ManaCost3 = 20;
//    private int [] ComputerPokemon1ManaCost = {10, 15, 20};
    private boolean ComputerStatus1 = false;
    private String ComputerimagePath1 = "C:\\Users\\Den Drei Lacsina\\Desktop\\PokemonGame\\src\\pokemongame\\pokemon1.jpg";

    public String getComputerPokemon1name(){
    return ComputerPokemon1name;
    }
    public int getComputerPokemon1HP(){
        return ComputerPokemon1HP;
    }
    public void setComputerPokemon1HP(int hp){
        this.ComputerPokemon1HP=hp;
    }
    public int ComputerPokemon1Mana(){
        return ComputerPokemon1Mana;
    }
    public void ComputerPokemon1Mana(int mana){
        this.ComputerPokemon1Mana = mana;
    }
    public String getComputerimagePath1(){
        return ComputerimagePath1;
    }
    public String getComputerPokemon1Attacks1(){
        return ComputerPokemon1Attacks1;
    }
    public String getComputerPokemon1Attacks2(){
        return ComputerPokemon1Attacks2;
    }
    public String getComputerPokemon1Attacks3(){
        return ComputerPokemon1Attacks3;
    }
    public int getComputerPokemon1ManaCost1(){
        return ComputerPokemon1ManaCost1;
    }
    public int getComputerPokemon1ManaCost2(){
        return ComputerPokemon1ManaCost2;
    }
    public int getComputerPokemon1ManaCost3(){
        return ComputerPokemon1ManaCost3;
    }
    
    
    

    private String ComputerPokemon2name = "Squirtle";
    private int ComputerPokemon2HP = 100;
    private int ComputerPokemon2Mana = 50;
//    private String []ComputerPokemon2Attacks ={"Aqua Jet", "Aqua Tail", "Water Pulse"};
    private String ComputerPokemon2Attacks1 = "Aqua Jet";
    private String ComputerPokemon2Attacks2 = "Aqua Tail";
    private String ComputerPokemon2Attacks3 = "Water Pulse";
    private int ComputerPokemon2ManaCost1 = 10;
    private int ComputerPokemon2ManaCost2 = 15;
    private int ComputerPokemon2ManaCost3 = 20;
//    private int [] ComputerPokemon2ManaCost = {10, 15, 20};
    private boolean ComputerStatus2 = false;
    private String ComputerimagePath2 = "C:\\Users\\Den Drei Lacsina\\Desktop\\PokemonGame\\src\\pokemongame\\pokemon2.jpg";

    public String getComputerPokemon2name(){
    return ComputerPokemon2name;
    }
    public int getComputerPokemon2HP(){
        return ComputerPokemon2HP;
    }
    public void setComputerPokemon2HP(int hp){
        this.ComputerPokemon2HP=hp;
    }
    public int ComputerPokemon2Mana(){
        return ComputerPokemon2Mana;
    }
    public void ComputerPokemon2Mana(int mana){
        this.ComputerPokemon2Mana = mana;
    }
    public String getComputerimagePath2(){
        return ComputerimagePath2;
    }
    public String getComputerPokemon2Attacks1(){
        return ComputerPokemon2Attacks1;
    }
    public String getComputerPokemon2Attacks2(){
        return ComputerPokemon2Attacks2;
    }
    public String getComputerPokemon2Attacks3(){
        return ComputerPokemon2Attacks3;
    }
    public int getComputerPokemon2ManaCost1(){
        return ComputerPokemon2ManaCost1;
    }
    public int getComputerPokemon2ManaCost2(){
        return ComputerPokemon2ManaCost2;
    }
    public int getComputerPokemon2ManaCost3(){
        return ComputerPokemon2ManaCost3;
    }
    
    private String ComputerPokemon3name = "Charmander";
    private int ComputerPokemon3HP = 100;
    private int ComputerPokemon3Mana = 50;
//    private String []ComputerPokemon3Attacks ={"Flamethrower", "Flame Charge", "Flame Burst"};
    private String ComputerPokemon3Attacks1 = "Flamethrower";
    private String ComputerPokemon3Attacks2 = "Flame Charge";
    private String ComputerPokemon3Attacks3 = "Flame Burst";
//    private int [] ComputerPokemon3ManaCost = {10, 15, 20};
    private int ComputerPokemon3ManaCost1 = 10;
    private int ComputerPokemon3ManaCost2 = 15;
    private int ComputerPokemon3ManaCost3 = 20;
    
    private boolean ComputerStatus3 = false;
    private String ComputerimagePath3 = "C:\\Users\\Den Drei Lacsina\\Desktop\\PokemonGame\\src\\pokemongame\\pokemon3.jpg";

    public String getComputerPokemon3name(){
    return ComputerPokemon3name;
    }
    public int getComputerPokemon3HP(){
        return ComputerPokemon3HP;
    }
    public void setComputerPokemon3HP(int hp){
        this.ComputerPokemon3HP=hp;
    }
    public int ComputerPokemon3Mana(){
        return ComputerPokemon3Mana;
    }
    public void ComputerPokemon3Mana(int mana){
        this.ComputerPokemon3Mana = mana;
    }
    public String getComputerimagePath3(){
        return ComputerimagePath3;
    }
    public String getComputerPokemon3Attacks1(){
        return ComputerPokemon3Attacks1;
    }
    public String getComputerPokemon3Attacks2(){
        return ComputerPokemon3Attacks2;
    }
    public String getComputerPokemon3Attacks3(){
        return ComputerPokemon3Attacks3;
    }
    public int getComputerPokemon3ManaCost1(){
        return ComputerPokemon3ManaCost1;
    }
    public int getComputerPokemon3ManaCost2(){
        return ComputerPokemon3ManaCost2;
    }
    public int getComputerPokemon3ManaCost3(){
        return ComputerPokemon3ManaCost3;
    }


    
    
}
