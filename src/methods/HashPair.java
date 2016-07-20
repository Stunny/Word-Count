package methods;

/**
 * Created by avoge on 20/07/2016.
 */
public class HashPair {

    private String key;
    private int value;

    public HashPair() {
    }

    public HashPair(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
