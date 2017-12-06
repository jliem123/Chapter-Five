
/**
 * Write a description of class Probabitlity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probabitlity implements ProbabilityCalc
{
    private int favorable;
    private int sampleSpace;
    
    public Probability(int fav, int sample) {
        this.favorable = fav;
        this.sampleSpace = sample;
        prob = ((double)favorable)/sampleSpace;
    }
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 AND p2) = p1 * p2
     */
    public double probabilityAND(Probability p2){
        return 0;
    }
   
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 OR p2) = p1 + p2 - (p1 AND p2)  where p1 AND p2 is the "overlap"
     */
    public double probabilityOR(Probability p2, double overlap){
        return 0;
    }
}
