import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int pope = 0;
		int edward = 0;
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).toLowerCase().equals("pope francis"))
				pope++;
			if(votes.get(i).toLowerCase().equals("edward snowden"))
				edward++;
		}
		if(pope > edward){
			return "pope francis";
		}else if (edward > pope) {
			return "edward Snowden";
		}
		return "TIE";
	}
	
	
	
	
	
		

}
