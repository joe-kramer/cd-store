class CD {

  public String mArtist;
  public String mAlbum;
  public int mYear;
  public int mPrice;

  public CD(String artist, String album, int year, int price) {
    mArtist = artist;
    mAlbum = album;
    mYear = year;
    mPrice = price;
  }
  public boolean lookingFor(int oldestYear){
    return (mYear >= oldestYear);
  }
}
