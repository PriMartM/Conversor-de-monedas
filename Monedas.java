import com.google.gson.annotations.SerializedName;

public class Monedas {
    @SerializedName("conversion_result")
    private String result;

    public Monedas(String result){
        this.result = result;
    }

    @Override
    public String toString() {
        return result;
    }
}
