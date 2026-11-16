package lms.model;

public class Member {
    private String memberID;
    private String memberName;
    private int borrowedCount;

    public Member(String memberID,String memberName){
        setMemberID(memberID);
        setMemberName(memberName);
        setBorrowedCount(0);
    }
    public void setMemberID(String memberID){
        if(memberID==null || memberID.isBlank()){
            throw new IllegalArgumentException("Member ID Cannot be blank.");
        }
        this.memberID=memberID;
    }

    public void setMemberName(String memberName) {
        if(memberName==null || memberName.isBlank()){
            throw new IllegalArgumentException("Member Name Cannot be blank.");
        }
        this.memberName = memberName;
    }

    public void setBorrowedCount(int borrowedCount) {
        if(borrowedCount<0){
            throw new IllegalArgumentException("Borrowed count cannot be negative");
        }
        this.borrowedCount = borrowedCount;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }


    public void incrementBorrowedCount() {
        setBorrowedCount(this.borrowedCount + 1);
    }

    public String getMemberID() {
        return memberID;
    }

    public String getMemberName() {
        return memberName;
    }

        @Override
    public String toString() {
        return "Member{id='" + memberID
                + "', name='" + memberName
                + "', borrowedCount=" + borrowedCount + "}";
    }
}
