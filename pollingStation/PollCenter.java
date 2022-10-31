public class PollCenter extends PoliticalParty {
    private String myCandidate;
    private String yourCandidate;
    private int myCandidateVotes;
    private int yourCandidateVotes;
    public PollCenter(Candidate myCandidate, Candidate yourCandidate) {
        super(myCandidate.getPartyName());
        this.myCandidate = myCandidate.getName();
        this.yourCandidate = yourCandidate.getName();
    }
    public void voteForMyCandidate() {
        myCandidateVotes++;
        
    }
    public void voteForYourCandidate() {
        yourCandidateVotes++;
        
    }
    public String getMyCandidate() {
        return myCandidate;
    
    }
    public String getYourCandidate() {
        return yourCandidate;
        
    }   
    public int getMyCandidateVotes() {
        return myCandidateVotes;
        

    }
    public int getYourCandidateVotes() {
        return yourCandidateVotes;

    }
    public String getMyCandidateParty() {
        return getPartyName();
    }
    public String getYourCandidateParty() {
        return getPartyName();
    }
}
