/*
 * @author Simon Stromberg
 * @version 1.0 20200721
 */
public class main {
    public static void main (String args []) {
       /* RecordSpeicher speicher = new RecordSpeicher();
        try {
            speicher.hinzufuegen(1, "Eins");
            speicher.hinzufuegen(2, "Zwei");
            speicher.hinzufuegen(3, "Drei");
            speicher.loeschen(1);
            speicher.hinzufuegen(4, "Vier");
            speicher.hinzufuegen(2, "Zweia");

        } catch (DoppelterEintragException e) {
            System.out.println(e.toString());
        } catch (ExistiertNichtException e) {
            System.out.println(e.toString());
        } finally {
            String[] strs = speicher.stringArray();
            for (String s : strs) {
                System.out.println(s);
            }
            System.out.println(speicher.anzahlZeichen());
        }

*/ -
        String woerterbuch[] = {"haus", "maus", "klaus", "otto", "informatik", "hinaus", "raus", "objektorientiert", "blamiert"};
        String wort1 = "kapiert";
        String wort2 = "peterkraus";

        int x1 = reim(wort1, woerterbuch);
        System.out.println(x1 + " Treffer\n");

        int x2 = reim(wort2, woerterbuch);
        System.out.println(x2 + " Treffer\n");

    }

    public static int reim(String wort, String pwoerterbuch[]){
        System.out.println("Reim mit \""+wort+"\":");
        if(wort.length() < 3) {
                return 0;
            }
            int count=0;
            for( int i=0; i<pwoerterbuch.length;i++){
                if(     pwoerterbuch[i].charAt(pwoerterbuch[i].length()-1) == wort.charAt(wort.length()-1)          ){
                    if(     pwoerterbuch[i].charAt(pwoerterbuch[i].length()-2) == wort.charAt(wort.length()-2)      ){
                       if(      pwoerterbuch[i].charAt(pwoerterbuch[i].length()-3) == wort.charAt(wort.length()-3)  ){
                           count++;
                           System.out.println(pwoerterbuch[i]);
                       }
                    }
                }
            }
            return count;
    }

}
