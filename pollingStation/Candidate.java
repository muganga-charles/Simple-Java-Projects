public class Candidate {
    String name;
    String partyName;
    private int numberOfVotes;
    public Candidate(String name, PoliticalParty partyName) {
        this.name = name;
        this.partyName = partyName.getPartyName();
        this.numberOfVotes = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void receiveVote(){
        numberOfVotes++;
    }
    public int getNumberOfVotes() {
        return numberOfVotes;
    }
    public String getPartyName() {
        return partyName;
    }

}
