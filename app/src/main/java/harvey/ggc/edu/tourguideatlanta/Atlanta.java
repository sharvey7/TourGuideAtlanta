package harvey.ggc.edu.tourguideatlanta;

public class Atlanta {

    private String mName;
    private String mLocation;
    private int mImageDrawable = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mExplain;


    public Atlanta( String name, String location) {
       mName = name;
       mLocation = location;
    }

    public Atlanta(String name, String location, int imageDrawable ){
      mName = name;
      mLocation = location;
      mImageDrawable = imageDrawable;
    }

    public Atlanta(String name, String location, int imageDrawable, String explain){
        mName = name;
        mLocation = location;
        mImageDrawable = imageDrawable;
        mExplain = explain;
    }


public String getName(){
        return mName;
}
 public String getLocation(){
        return mLocation;
 }

 public int getImageDrawable(){
        return mImageDrawable;
    }


    public String getExplain(){
        return mExplain;
    }

    public boolean hasImage(){
        return mImageDrawable != NO_IMAGE_PROVIDED;
    }
}