package se.lexicon.mark;

import se.lexicon.mark.App.*;

public enum Currency {

    En(1), Två(2), Fem(5), Tio(10), Tjugo(20),
    Femtio(50), Hundra(100), TvåHundra(200), FemHundra(500),
    EttTusen(1000);

        private int denomination;
        private Currency(int denomination){
            this.denomination = denomination;
        }
        public int getDenomination(){
            System.out.println(denomination);
            return denomination;
        }
}
