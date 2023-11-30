package Q3b;

import java.util.ArrayList;

class Element_finderThread extends Thread {
    private int start;
    private int end;
    private int toFind;
    private ArrayList<Integer> arrayList;
    private boolean result;

    public boolean getResult() {
        return result;
    }

    public Element_finderThread(int start, int end, int toFind, ArrayList<Integer> arrayList) {
        this.start = start;
        this.end = end;
        this.toFind = toFind;
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        int start = this.start;
        int end = arrayList.size();
        boolean found = false;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arrayList.get(mid) == this.toFind) {
                found = true;
            } else if (arrayList.get(mid) > this.toFind) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        if (found) {
            this.result = true;
        }
        else {
            this.result = false;
        }
    }
}