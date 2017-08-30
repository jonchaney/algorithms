public class Main 
{
  public static void main(Sting[] args) 
  {
    int N = StdIn.readInt();
    UF uf = new UF(N);
    
    while (!StdIn.isEmpty())
    {
      int p = StdIn.readInt();
      int q = StdIn.readInt();
      if (!uf.connected(p, q))
      {
        uf.union(p, q);
        Std.out.printLn(p + ' ' + q);
      }
    }
  }
}