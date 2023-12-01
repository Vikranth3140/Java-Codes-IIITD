package Q2;

import java.util.ArrayList;

class Element_finder {
    private final ArrayList<Integer> arrayList;

    public Element_finder(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public boolean find_element(int element) {
        int start = 0;
        int end = arrayList.size();

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arrayList.get(mid) == element) {
                return true;
            } else if (arrayList.get(mid) > element) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        if (arrayList.get(start) == element) {
            return true;
        }
        return false;
    }
}