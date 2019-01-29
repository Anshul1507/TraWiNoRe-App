package trawinore.codexonic.com.tour;

public class CustomList {
    private String mStateName;
    private int mImageResourceId;

    public CustomList(String stateName, int imageResourceId) {
        mStateName = stateName;
        mImageResourceId = imageResourceId;
    }

    public String getStateName() {
        return mStateName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
