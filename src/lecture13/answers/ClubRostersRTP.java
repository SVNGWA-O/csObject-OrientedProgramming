package lecture13.answers;

import java.util.List;

public class ClubRostersRTP extends ClubRostersTemplate implements ClubManagable {

    public void intake(List<String> data){
        super.intake(data);
        super.clean();
        super.parse();
        super.sort();
    }

}
