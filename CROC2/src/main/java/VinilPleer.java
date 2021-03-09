/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kazaev Vadim
 */
public class VinilPleer extends WriteUstr{

    VinilPleer() {}
    public void Proigr(WriteUstr ustr){
        if(ustr instanceof VinVert) {
            System.out.println("Song: " + ustr.toString() + " Plays on a vinyl turntable.");
        }
        else{
            System.out.println("You can`t play the song on this unit.");
        }
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
