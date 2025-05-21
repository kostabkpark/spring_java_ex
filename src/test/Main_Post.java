package test;

public class Main_Post {
  public static void main(String[] args) {
    Post post = new NewPost();
    PrintPost printPost = new PrintLinePost(post);
    printPost.print();
    printPost.print();
  }
}

interface Post {
  String getAllPosts();
}

class NewPost implements Post {
  @Override
  public String getAllPosts() {
    return "This is all post data sample ";
  }
}

interface PrintPost {
  void print();
}

class PrintLinePost implements PrintPost {
  private Post post;

  public PrintLinePost(Post post) {
    this.post = post;
  }
  @Override
  public void print() {
    System.out.println(post.getAllPosts());
  }
}