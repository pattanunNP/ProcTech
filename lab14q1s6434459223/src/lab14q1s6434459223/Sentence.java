package lab14q1s6434459223;

/**
 *
 * @author arm
 */
public class Sentence {

    private String s;

    public Sentence(String s) {
        this.s = s;
    }

    public boolean find(String p) {
        return find(p, 0, 0);
    }

    public boolean find(String p, int sIndex, int pIndex) {

        // Check end of string
        if (sIndex == s.length()) {
            return false;
        }

        // Match check next
        if (s.charAt(sIndex) == p.charAt(pIndex)) {
            if (allMatch(p, sIndex, pIndex)) {
                // All match return true
                return true;
            } else {
                // Not all match move to next
                return find(p, sIndex + 1, pIndex);
            }
        }

        return find(p, sIndex + 1, pIndex);

    }

    public boolean allMatch(String p, int sIndex, int pIndex) {

        // Not Fround and end
        if (sIndex == s.length() && pIndex != p.length()) {
            return false;
        }

        // If pass all char check
        if (pIndex == p.length()) {
            return true;
        }

        // If same check next char
        if (s.charAt(sIndex) == p.charAt(pIndex)) {
            return allMatch(p, sIndex + 1, pIndex + 1);
        }

        return false;
    }
}
