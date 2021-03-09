/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kazaev Vadim
 */
public class CDPleer extends WriteUstr {
    CDPleer(){}
    
    public void Proigr(WriteUstr ustr){
        if(ustr instanceof CD) {
            System.out.printf("Song: %S Playable on CD device.", ustr.toString());
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
