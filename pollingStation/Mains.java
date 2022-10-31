public class Mains {
    public static void main(String[] args) {
        PoliticalParty party1 = new PoliticalParty("Republican");
        PoliticalParty party2 = new PoliticalParty("Democrat");
        Candidate candidate1 = new Candidate("John", party1);
        Candidate candidate2 = new Candidate("Mary", party2);
        PollCenter pollCenter = new PollCenter(candidate1, candidate2);
        pollCenter.voteForMyCandidate();
        pollCenter.voteForMyCandidate();
        pollCenter.voteForMyCandidate();
        pollCenter.voteForYourCandidate();
        pollCenter.voteForYourCandidate();
        System.out.println("My candidate is " + pollCenter.getMyCandidate() + " from the " + pollCenter.getMyCandidateParty() + " party.");
        System.out.println("My candidate has " + pollCenter.getMyCandidateVotes() + " votes.");
        System.out.println("Your candidate is " + pollCenter.getYourCandidate() + " from the " + pollCenter.getYourCandidateParty() + " party.");
        System.out.println("Your candidate has " + pollCenter.getYourCandidateVotes() + " votes.");
    }

}
