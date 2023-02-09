public class Frutes {
    private String vitaminOrenge;
    private String vitaminApple;
    private String vitaminBanana;

    public Frutes() {
    }

    public Frutes(String vitaminOrenge, String vitaminApple, String vitaminBanana) {
        this.vitaminOrenge = vitaminOrenge;
        this.vitaminApple = vitaminApple;
        this.vitaminBanana = vitaminBanana;
    }

    @Override
    public String toString() {
        return "Frutes{" +
                "vitaminOrenge='" + vitaminOrenge +
                ", vitaminApple='" + vitaminApple +
                ", vitaminBanana='" + vitaminBanana +
                '}';
    }
}
