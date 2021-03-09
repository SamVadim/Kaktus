/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kazaev Vadim
 */
public class Main {
    public static void main(String[] args) {
        Music song1 = new Music("Pesnya1","Avtor1");
        Music song2 = new Music("Pesnya2","Avtor2");
        Music song3 = new Music("Pesnya3","Avtor3");
        
        WriteUstr song_vin = new VinVert(song1);
        WriteUstr song_vin2 = new VinVert(song2);
        WriteUstr song_vin3 = new VinVert(song3);
        
        WriteUstr song_cd1 = new CD(song1);
        WriteUstr song_cd3 = new CD(song3);
        
        WriteUstr song_multi1 = new Multi(song2);
        
        MultiPleer play1 = new MultiPleer();
        VinilPleer play2 = new VinilPleer();
        CDPleer play3 = new CDPleer();
        
        play1.Proigr(song_cd3);
        play3.Proigr(song_cd3);
    }
    
}
