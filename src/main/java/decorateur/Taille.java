package decorateur;

/**
 * Created by Armel on 10/05/2020.
 */
public enum Taille {

    PETIT {
        public double cout() {return 0.2;};
    },
    NORMAL {
        public double cout() {return 0.3;};
    },
    GRAND {
        public double cout() {return 0.4;};
    };

     public abstract double cout();

}
