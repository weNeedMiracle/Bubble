import java.util.Random;

public class Bubble {
    int[] b;
    int s;
    public Bubble(int t){
        b = new int[t];
        this.s = t;
        Random rd = new Random();
        for(int s : b){
            s = rd.nextInt();
        }
    }
    public void Sort(){
        for(int i = s-1; i>=0; i--){
            for(int j = 0; j<i; j++){
                if(b[j]> b[j+1]){
                    int t = b[j];
                    b[j] = b[j+1];
                    b[j+1] = t;
                }
            }
        }
    }
}
