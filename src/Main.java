import java.util.Scanner;

public class Main {
    public  static int tab[] = new int[6];
    public static int tabtri[] = new int [6];
    public  void saisie()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <6; i++) {
     tab[i]=sc.nextInt();
     }
 }
 public void fusion()
 {
     int i=0 ;
     int j=tab.length/2 ; ;
     int k = 0 ;
     while(j<tab.length && tab.length / 2 > i) {

             if (tab[i] < tab[j]) {
                 tabtri[k] = tab[i];

                 k++;
                 i++; if (i == tab.length/2)
                 {
                     for (int p=j; p <tab.length ; p++) {
                         tabtri[k] = tab[p]; k++ ;
                     }
                 }
             }
             else
             {
                 tabtri[k] = tab[j];
                 k++;
                 j++;if (j == tab.length)
             {
                 for (int p=i; p <tab.length/2 ; p++) {
                     tabtri[k] = tab[p]; k++ ;
                 }
             }
         }

 }}
 public  void affichage()
 {
     for ( int g = 0 ; g < tabtri.length ; g++ )
     System.out.println(g+"="+tabtri[g]);
 }

    public static void main(String[] args) {
     Main m = new Main();

       m.saisie();
        mythread mythread1 = new mythread(0 , tab.length/2);
        mythread mythread2 = new mythread(tab.length/2 ,tab.length);
        mythread1.start();
        mythread2.start();

        try{
            mythread1.join();
            mythread2.join();
        }
        catch(InterruptedException e){}
        m.fusion();
        m.affichage();

    }
}