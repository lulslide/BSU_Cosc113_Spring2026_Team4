public abstract class LibraryItem {
    private String id;
    private String title;
    private boolean isCheckedOut;

    public LibraryItem(String id, String title, boolean isCheckedOut) {
        this.id = id;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCheckedOut() { return isCheckedOut; }
    public void setCheckedOut(boolean status) { this.isCheckedOut = status; }

    public abstract double calculateLateFee(int daysLate);

    @Override
    public String toString() {
        return "[" + id + "] " + title + (isCheckedOut ? " (Checked Out)" : " (Available)");
    }
}

class Book extends LibraryItem {
    public Book(String id, String title, boolean isCheckedOut) { super(id, title, isCheckedOut); }
    @Override
    public double calculateLateFee(int daysLate) { return daysLate * 0.50; }
}

class DVD extends LibraryItem {
    public DVD(String id, String title, boolean isCheckedOut) { super(id, title, isCheckedOut); }
    @Override
    public double calculateLateFee(int daysLate) { return daysLate * 2.00; }
}
