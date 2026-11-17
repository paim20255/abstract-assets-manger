public class Asset {
    private String description;
    private String dateAcquired;

    public Asset(String description, String dateAcquired) {
        this.description = description;
        this.dateAcquired = dateAcquired;
    }

    public void getValue() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
}
