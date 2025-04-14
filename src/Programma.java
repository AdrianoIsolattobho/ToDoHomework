
import java.util.ArrayList;
import java.util.Calendar;
public class Programma {
    public static void main(String[] args) {

        //creazione attività
        Attività a1 = new Attività("comprare il latte", false);
        Attività a2 = new Attività("comprare il pane", false);
        Attività a3 = new Attività("comprare le uova", false);




        //creazione checklist
        ArrayList<Attività> SerieAttività = new ArrayList<>();
        SerieAttività.add(a1);
        SerieAttività.add(a2);
        SerieAttività.add(a3);
        Checklist c1 = new Checklist(SerieAttività);

        //creazione ToDo
        Calendar scadenza = Calendar.getInstance();
        scadenza.set(2025, 10, 15);
        ToDo t1 = new ToDo("comprare la spesa", "comprare la spesa al supermercato", "www.supermercato.it", scadenza, false, false, false, null, "sfondo", "immagine", c1);

        ToDo t2 = new ToDo("cucinare", "cucinare le polpette", "www.giallozzafferano.it", scadenza, false, false, false, null, "sfondo", "immagine");

        //creazione bacheca
        ArrayList<ToDo> listaToDo = new ArrayList<>();
        listaToDo.add(t1);
        listaToDo.add(t2);
        Bacheca b1 = new Bacheca(Titolo.TempoLibero, "Bacheca per la spesa", Ordinamento.AZ, listaToDo);

        //creazione utente
        Bacheca bacheche[]= new Bacheca[3];
        bacheche[0] = b1;
        Utente u1= new Utente("giovanni@gmail.com", "3457890", bacheche);

        //stampa attività partendo da utente
        System.out.println("Attività: " + u1.getBacheche()[0].getToDoList().get(0).getChecklist().getAttività().get(0).getNome());


    }
}
