import java.time.LocalDate;

public class Festmeny {
    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDate legutolsoLicitIdeje;
    private Boolean elkelt;

    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        elkelt = false;
        legmagasabbLicit = 0;
        licitekSzama = 0;
    }

    public String getFesto() {
        return festo;
    }

    public String getStilus() {
        return stilus;
    }

    public int getLicitekSzama() {
        return licitekSzama;
    }

    public int getLegmagasabbLicit() {
        return legmagasabbLicit;
    }

    public LocalDate getLegutolsoLicitIdeje() {
        return legutolsoLicitIdeje;
    }

    public Boolean getElkelt() {
        return elkelt;
    }

    public void setElkelt(Boolean elkelt) {
        this.elkelt = elkelt;
    }


    public void Licit() {
        if (elkelt)
        {
            System.out.println("Elkelt a festménx");
        } else {
            if (licitekSzama == 0) {
                legutolsoLicitIdeje = LocalDate.now();
                legmagasabbLicit = 100;
                licitekSzama++;
            } else {
                Licit(10);
            }
        }
    }

    public void Licit(int mertek) {
        if (mertek > 100 && mertek < 10) {
            System.out.println("Rossz értéket adott meg");
        }else {
            if (elkelt)
            {
                System.out.println("a Festmánxt eladtuk");
            } else {
                if (licitekSzama == 0) {
                    legutolsoLicitIdeje = LocalDate.now();
                    legmagasabbLicit = 100;
                    licitekSzama++;
                } else {
                    legutolsoLicitIdeje = LocalDate.now();
                    legmagasabbLicit = (legmagasabbLicit * (mertek + 100)) / 100;
                    licitekSzama++;
                    legmagasabbLicit = (int)Math.round((double) legmagasabbLicit/100)*100;
                }
            }
        }
    }


}


