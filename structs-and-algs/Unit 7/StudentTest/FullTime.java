package StudentTest;

public class FullTime extends Student {
    private Boolean loanIssued;

    public FullTime(String name) {
        super(name);
        this.loanIssued = false;
    }

    public String toString() {
        String fullTimeDetails = "";
        fullTimeDetails += super.toString();
        fullTimeDetails += "\tloan issued: " + this.loanIssued.toString();
        return fullTimeDetails;
    }

    public void issueLoan() {
        this.loanIssued = true;
    }
}