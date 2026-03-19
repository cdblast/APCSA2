public class TargetedAd {

  public static void main(String[] args)
  {
    DataCollector dc = new DataCollector();
    dc.setData("socialMediaPostsSmall.txt", "targetWords.txt");

    String users = "";

    String post = dc.getNextPost();
    //System.out.println("POST OUTPUT: " + post);

    while (!post.equals("NONE")) {
      //loading the post into the variables
      String username = post.substring(0, post.indexOf(" "));
      String lowerPost = post.toLowerCase();
      String target = dc.getNextTargetWord();
      boolean userAdded = false;
      
      //checking post against target words
      while (!target.equals("NONE")) {
        if (lowerPost.indexOf(target) != -1) {
          userAdded = true;
        }
        target = dc.getNextTargetWord();
      }

      if(userAdded){
        users += username + " ";
      }
      post = dc.getNextPost();
    }

//    System.out.println("The following users were added: " + users);

//generate targetedAds.txt
    dc.prepareAdvertisement(
      "targetedAds.txt",
      users,
      "Your furry friend will love our pet food!"
    );

  }
}