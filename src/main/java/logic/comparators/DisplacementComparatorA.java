package logic.comparators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import logic.Ship;

import java.util.Comparator;

public class DisplacementComparatorA implements Comparator<Ship> {
    @Override
    public int compare(Ship ship1, Ship ship2) {
        if (ship1.getDisplacement() > ship2.getDisplacement()) {
            return -1;
        } else if (ship1.getDisplacement() < ship2.getDisplacement()) {
            return 1;
        } else {
            return 0;
        }

       /* @Deprecated
        public int compareForTest(Ship ship1, Ship ship2) {
            if (ship1.getDisplacement() > ship2.getDisplacement()) {
                return -1;
            } else if (ship1.getDisplacement() < ship2.getDisplacement()) {
                return 1;
            } else {
                return 0;
            }*/
    }

    public void fjfjfj() {
        System.out.println("jkdkdkkd ");
    }

}
