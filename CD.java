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

  public boolean sortByYear(int oldestYear){
    return (mYear >= oldestYear);
  }

  public boolean sortByPrice(int price) {
    return (mPrice <= price);
  }

  public boolean sortByArtist(String name) {
    return (name.equals(mArtist));
  }
}
