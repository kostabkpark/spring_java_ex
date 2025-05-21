package test;

public class Main_Post {
  public static void main(String[] args) {
    Post post = new NewPost();
    //PrintPost printPost = new PrintLinePost(post);
    PrintPost printPost = new PrintNoLinePost(post);
    printPost.print();
    printPost.print();

//    PrintLinePost printLinePost = new PrintLinePost();
//    printLinePost.setPost(post);
//    printLinePost.print();
//
//    PrintNoLinePost printNoLinePost = new PrintNoLinePost();
//    printNoLinePost.setNoLinePost(post);
//    printNoLinePost.print();
//    printNoLinePost.println();
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

//@컴포넌트로 생성해줘
class PrintLinePost implements PrintPost {
  private Post post;
  public PrintLinePost() {}
  public PrintLinePost(Post post) {
    this.post = post;
  }

  public void setPost(Post post) {
    this.post = post;
  }

  @Override
  public void print() {
    System.out.println(post.getAllPosts());
  }
}

//@컴포넌트로 생성해줘
class PrintNoLinePost implements PrintPost {
  private Post post;
  public PrintNoLinePost() {}
  public PrintNoLinePost(Post post) {
    this.post = post;
  }

  public void setNoLinePost(Post post) {
    this.post = post;
  }

  @Override
  public void print() {
    System.out.print(post.getAllPosts());
  }

  public void println() {
    System.out.println(post.getAllPosts());
  }
}