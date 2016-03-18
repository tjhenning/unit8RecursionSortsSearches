import java.util.ArrayList;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(300);
      if (tempList.size() == 0)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            System.out.println(i);
         }
      }
   }
   public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
   {
       ArrayList<Integer> list = ListMethodsRunner.deepClone(tList); 
       ArrayList<Integer> nlist = new ArrayList<Integer>(); 
       if (list.size()<=1)
       {
           return list;
       }
       else
       {
           for(Integer i:list)
           {
               nlist.add(i,0);
            }
       }
       return nlist;
   }
   public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
   {
       ArrayList<Integer> list = new ArrayList<Integer>(); 
       for (Integer i : tList)
       {
           list.add(new Integer(i));
       }
       return list;
   }
}