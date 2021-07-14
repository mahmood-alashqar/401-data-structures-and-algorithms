package DuckDuckGoose;

import java.util.ArrayList;

public class DuckDuckGoose<T> {

    public T duckDuckGoose(CircularQueue<T> players, int goose) {

        int len = players.size;
        int diff = 0;
        if(goose > 0) {
            if(goose % len == 0){
players.deQueue();
                return players.peek();
            }
            if(goose > len){
                diff = (goose % len) - 1;
            } else if(goose == 1) {
                diff = 0;
            }
            if(goose < len){
                diff = goose - 1;
            }
            if(goose == len){
                players.deQueue();
                return players.peek();
            }
        }
players.enQueue(diff);
        return players.peek();
    }


    public  ArrayList duckDuckGoose1(ArrayList[] players, int goose) {
        int size = players.length ;
        while (goose > size) {
            goose = goose - size;
        }
        return players[goose-1];
    }


    public ArrayList duckDuckGoose(ArrayList[] players, int goose) {
        int a = players.length;
        int b = goose%a-1;
        if(b<0) b = b+a;
        return players[b];
    }
}
