package com.company;

import java.util.Objects;

public class Coordinates {
    int x, y;

    Coordinates(int x, int y) throws Exception {

        if((x > 7 || x < 0) || (y > 7 || y < 0) ){
            throw new IllegalAccessException("Invalid value entered!!!");
        }
        else{
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public String toString() {
        return (char)(x+97)+""+(Number)(y+1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) throws Exception{
        if(x > 7 || x < 0 ){
            throw new IllegalAccessException("Invalid value entered!!!");
        }
        else{
            this.x = x;
        }
    }

    public void setY(int y)throws Exception {
        if(y > 7 || y < 0){
            throw new IllegalAccessException("Invalid value entered!!!");
        }
        else{
            this.y = y;
        }
    }
}
