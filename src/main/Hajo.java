
package main;

public class Hajo {
    private int [] pozíció;

    public String talalat(int poz){
        int i=0;
        while (i<3 && !(pozíció[i]==poz)) {            
            i++;
        }
        
        return i<3 ? "talált":"mellé";
    }

    public Hajo(int[] pozíció) {
        this.pozíció = pozíció;
    }
}