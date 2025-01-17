package seedu.duke;

import java.util.ArrayList;

public class ReviewList {
    protected ArrayList<Media> inputs;

    public ReviewList() {
        this.inputs = new ArrayList<Media>();
    }

    public ReviewList(ArrayList<Media> inputs) {
        this.inputs = inputs;
    }

    public void add(Media media) {
        this.inputs.add(media);
    }

    public void remove(int index) {
        this.inputs.remove(index);
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < inputs.size(); i++) {
            output += (i + 1) + ". " + inputs.get(i).toString();
        }
        return output;
    }

}
