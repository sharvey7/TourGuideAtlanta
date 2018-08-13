package harvey.ggc.edu.tourguideatlanta;

public class Atlanta {

    private int mImageDrawable;
    private String mName;
    private String mLocation;
    private String mExplain;


    public Atlanta(int mImageDrawable, String mName, String mLocation, String mExplain) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mLocation = mLocation;
        this.mExplain = mExplain;
    }
    public int getImageDrawable(){
        return mImageDrawable;
    }
    public String getName(){
        return mName;
    }
    public String getLocation(){
        return mLocation;
    }
    public String getExplain(){
        return mExplain;
    }
}