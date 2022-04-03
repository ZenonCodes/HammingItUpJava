package zipcode;

public class Hamming {
    private String s,s1;
    public Hamming(String s, String s1) {
        if (s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {
        int hammingDist = 0;
        int i = 0;
      for(char nuc : s.toCharArray()){
          if(nuc != s1.charAt(i++)){
              hammingDist++;
          }
      }

        return hammingDist;
    }
}
