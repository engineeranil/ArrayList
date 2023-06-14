import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("AYIBOGAN RECO24");
        liste.add("YAHYA24");
        liste.add("RESUL24");
        liste.add(0,"ANIL");
        System.out.println(liste.toString());

        System.out.println(liste.contains("ANIL"));

        Iterator<String> ıtr = liste.iterator();

        while (ıtr.hasNext()){
          System.out.println(  ıtr.next());
        }
        Object[] o = liste.toArray(new Object[0]);
        String[] obj = liste.toArray(new String[0]);

        System.out.println(o[2]);


    }
}
