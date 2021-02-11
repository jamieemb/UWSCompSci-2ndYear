public class FullTime extends Student {
    private Boolean loanIssued;

    public FullTime(String name) {
        super(name);
        this.loanIssued = false;
    }

    // toString method for outputting if a loan has been issued
    public String toString() {
        String fullTimeDetails = "";
        fullTimeDetails += super.toString();
        fullTimeDetails += String.format("%25s", this.loanIssued.toString());
        return fullTimeDetails;
    }

    // Changes status of loan issue to true
    public void issueLoan() {
        this.loanIssued = true;
    }
}