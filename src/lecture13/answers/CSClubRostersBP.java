package lecture13.answers;

import java.util.ArrayList;
import java.util.List;

public class CSClubRostersBP extends ClubRostersBP implements ClubManagable {

    List<String> csClubs;
    public CSClubRostersBP(List<String> csClubs){
        super();
        this.csClubs = csClubs;
    }

    @Override
    public void clean(){
        List<String> cleanedData = new ArrayList<>();
        for(int i = 0; i < this.intakeData.size(); i+=2){
            if(this.csClubs.contains(this.intakeData.get(i+1))){
                cleanedData.add(this.intakeData.get(i));
                cleanedData.add(this.intakeData.get(i+1));
            }
        }
        this.intakeData = cleanedData;
        super.clean();
    }
}
