
class EspinaLab13Test
{ 
    public static void main(String[] args) 
    { 
        MyPoint p = new MyPoint (10, 30); 
        MyPoint q = new MyPoint (10, 20); 
        MyPoint r = new MyPoint (10, 20);

        System.out.println("MyPoint p = " + p);
        System.out.println("MyPoint q = " + q);
        System.out.println("MyPoint r = " + r);

         if (p.equals (q))
             System.out.println("p == q");
         else
             System.out.println("p != q");
         if (q.equals (r))
             System.out.println("q == r");
        else
            System.out.println("q != r");
    }
}

