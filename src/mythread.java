public class mythread extends Thread {
    private int begin;
    private int end;

    public mythread (int begin , int end)
    {
        this.begin = begin;
        this.end = end;
    }
    @Override
    public void run() {
        int aux ;
for  ( int i=begin; i <= end; i++ )
{
for (int j=i+1 ; j<end ; j++)
    {
        if (Main.tab[i]>Main.tab[j])
        {
        aux=Main.tab[j];
        Main.tab[j]=Main.tab[i];
        Main.tab[i]=aux;
    }}
}
    }
}